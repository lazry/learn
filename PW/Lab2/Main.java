public class Test {

    public static void main(String[] args) {

        Thread[] w = new Thread[5];
        // 1 to synchronicznie, 0 niesynchronicznie
        int x = 1;
        for (int i = 0; i < 5; i++) {
            w[i] = new Lamport(i, x);
        }
        for (int i = 0; i < 5; i++) {
            w[i].start();
        }
    }

}
