/* Zaimplementowac trzy (cztery, piec, ...) procesów, z których jeden pelni
funkcje producenta umieszczajacego pobrane z stdin dane w kolejce
komunikatów. Pozostale pelnia funkcje konsumentów – czytaja dane
przeslane przez producenta. Producent adresuje komunikaty do konkretnego
konsumenta umieszczajac PID odbiorcy w polu typu komunikatu. */
#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/ipc.h>
#include <sys/msg.h>
#include <errno.h>

struct mymsgbuf {
	long    mtype;          /* typ wiadomosci */
	int     request;        /* numer zadania danego dzialania */
	int		i;
} msg;

struct mymsgbuf buf;

int open_queue( key_t keyval ) {
	int     qid;
          
	if((qid = msgget( keyval, IPC_CREAT | 0660 )) == -1)
		return(-1);
          
	return(qid);
}

int send_message( int qid, struct mymsgbuf *qbuf ){
	int result, length;
  
	/* lenght jest rozmiarem struktury minus sizeof(mtype) */
	length = sizeof(struct mymsgbuf) - sizeof(long);        
  
	if((result = msgsnd( qid, qbuf, length, 0)) == -1)
          return(-1);
          
	return(result);
}

int remove_queue( int qid ){
	if( msgctl( qid, IPC_RMID, 0) == -1)
		return(-1);
          
	return(0);
}

int read_message( int qid, long type, struct mymsgbuf *qbuf ){
	int     result, length;
  
    /* lenght jest rozmiarem struktury minus sizeof(mtype) */
	length = sizeof(struct mymsgbuf) - sizeof(long);        
  
	if((result = msgrcv( qid, qbuf, length, type,  0)) == -1)
		return(-1);
          
	return(result);
}

int main(void){
	int    qid;
	key_t  msgkey;
	
	int ile = 0, i;
	printf ("ile procesów konsumenckich ma zostac utworzonych?");
	scanf ("%d", &ile);
	/* tworzymy wartosc klucza IPC */
	msgkey = ftok(".", 'm');
  
	/* otwieramy/tworzymy kolejke */
	if(( qid = open_queue( msgkey)) == -1) {
		perror("Otwieranie_kolejki");
		exit(1);
	}
	for(i=0; i<ile; i++){
		if(fork()==0)
			{
				printf("proces %d PID: %d, PPID: %d\n", i, getpid(), getppid());
				sleep(6);				
				while(1){
					read_message(qid, buf.mtype, &buf);
					if (buf.mtype == getpid()){
						printf("Proces o PID: %ld \nZawartosc: %d\n", buf.mtype, buf.i);
					}
					sleep(10);
				}
				if ( getpid() == 0)
					break;
				return 0;
			}
	}		
	int wartosc;
	long nr;
	while(1){
		printf ("Podaj wartosc do przeslania");
		scanf ("%d", &wartosc);
		msg.i = wartosc;
		printf ("Podaj numer konsumenta PID");
		scanf ("%ld", &nr);
		msg.mtype = nr;
		msg.request = 1;
		if((send_message( qid, &msg )) == -1) {
			printf("Wysylanie do konsumenta o PID %ld", msg.mtype);
			exit(1);
		}
		sleep(10);
	}
	remove_queue(qid);
	
	return 0;
}
