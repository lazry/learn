# include <iostream>
# include <cstdlib>
using namespace std;
struct node
{
    int info;
    struct node *left;
    struct node *right;
}*root;

class BST
{
    public:
        void find(int, node **, node **);
        bool isEmpty() const { return root==NULL; }
        void insert(node *, node *);
        void del(int);
        void case_a(node *,node *);
        void case_b(node *,node *);
        void case_c(node *,node *);
        void preorder(node *);
        void inorder(node *);
        void postorder(node *);
        void display(node *, int);
        void search(int );
        BST()
        {
            root = NULL;
        }
};

void BST::insert(node *tree, node *newnode)
{
    if (root == NULL)
    {
        root = new node;
        root->info = newnode->info;
        root->left = NULL;
        root->right = NULL;
        return;
    }
    if (tree->info == newnode->info)
    {
        cout<<"Element znajduje sie juz w drzewie"<<endl;
        return;
    }
    if (tree->info > newnode->info)
    {
        if (tree->left != NULL)
        {
            insert(tree->left, newnode);
	}
	else
	{
            tree->left = newnode;
            (tree->left)->left = NULL;
            (tree->left)->right = NULL;
          
            return;
        }
    }
    else
    {
        if (tree->right != NULL)
        {
            insert(tree->right, newnode);
        }
        else
        {
            tree->right = newnode;
            (tree->right)->left = NULL;
            (tree->right)->right = NULL;
            
            return;
        }
    }
}

void BST::search(int item)
{
    node *parent, *location;
    if (root == NULL)
    {
        cout<<"drzewo puste"<<endl;
        return;
    }
    find(item, &parent, &location);
    if (location == NULL)
    {
        cout<<"nie ma go w drzewie"<<endl<<endl;
        return;
    }
    else{
        cout<<"Znajduje sie w drzewie"<<endl<<endl;
    }
}




void BST::del(int item)
{
    node *parent, *location;
    if (root == NULL)
    {
        cout<<"drzewo puste";
        return;
    }
    find(item, &parent, &location);
    if (location == NULL)
    {
        cout<<"nie ma go w drzewie";
        return;
    }
    if (location->left == NULL && location->right == NULL)
        case_a(parent, location);
    if (location->left != NULL && location->right == NULL)
        case_b(parent, location);
    if (location->left == NULL && location->right != NULL)
        case_b(parent, location);
    if (location->left != NULL && location->right != NULL)
        case_c(parent, location);
    free(location);
}

void BST::case_a(node *par, node *loc )
{
    if (par == NULL)
    {
        root = NULL;
    }
    else
    {
        if (loc == par->left)
            par->left = NULL;
        else
            par->right = NULL;
    }
}

void BST::case_b(node *par, node *loc)
{
    node *child;
    if (loc->left != NULL)
        child = loc->left;
    else
        child = loc->right;
    if (par == NULL)
    {
        root = child;
    }
    else
    {
        if (loc == par->left)
            par->left = child;
        else
            par->right = child;
    }
}

void BST::case_c(node *par, node *loc)
{
    node *ptr, *ptrsave, *suc, *parsuc;
    ptrsave = loc;
    ptr = loc->right;
    while (ptr->left != NULL)
    {
        ptrsave = ptr;
        ptr = ptr->left;
    }
    suc = ptr;
    parsuc = ptrsave;
    if (suc->left == NULL && suc->right == NULL)
        case_a(parsuc, suc);
    else
        case_b(parsuc, suc);
    if (par == NULL)
    {
        root = suc;
    }
    else
    {
        if (loc == par->left)
            par->left = suc;
        else
            par->right = suc;
    }
    suc->left = loc->left;
    suc->right = loc->right;
}


void BST::preorder(node *ptr)
{
    if (root == NULL)
    {
        cout<<"drzewo puste"<<endl<<endl;
        return;
    }
    if (ptr != NULL)
    {
        cout<<ptr->info<<"  ";
        preorder(ptr->left);
        preorder(ptr->right);
    }
}

void BST::inorder(node *ptr)
{
    if (root == NULL)
    {
        cout<<"drzewo puste"<<endl<<endl;
        return;
    }
    if (ptr != NULL)
    {
        inorder(ptr->left);
        cout<<ptr->info<<"  ";
        inorder(ptr->right);
    }
}


void BST::postorder(node *ptr)
{
    if (root == NULL)
    {
        cout<<"drzewo puste"<<endl<<endl;
        return;
    }
    if (ptr != NULL)
    {
        postorder(ptr->left);
        postorder(ptr->right);
        cout<<ptr->info<<"  ";
    }
}


void BST::display(node *ptr, int level)
{cin.clear();
    int i;
     if (root == NULL)
    {
        cout<<"drzewo puste"<<endl<<endl;
        return;
    }
    if (ptr != NULL)
    {
        display(ptr->right, level+1);
        cout<<endl;
        if (ptr == root)
            ;
        else
        {
            for (i = 0;i < level;i++)
                cout<<"  ";
	}
        cout<<ptr->info;
        display(ptr->left, level+1);
    }
}



int main()
{
    int choice, num;
    BST bst;
    node *temp;
    while (1)
    {
        cout << "podaj zadanie : ";
        cout << "1.dodaj  ; ";
        cout << "2.usun  ; ";
        cout << "3.szukaj  ; ";
        cout << "4.wyswietl  ; ";
        cout << "5.quit"<<endl;
        cin >> choice;
        switch(choice)
        {
        case 1:
            temp = new node;
            cout<<"Podaj wartosc : ";
            cin>>temp->info;
            bst.insert(root, temp);
            cin.clear();
            break;
        case 2:
            if (root == NULL)
            {
                cout<<"puste"<<endl;
                continue;
            }
            cout<<"Podaj wartosc : ";
            cin>>num;
            bst.del(num);
            break;
        case 3:
            if (root == NULL)
            {
                cout<<"puste"<<endl;
                continue;
            }
            cout<<"Podaj wartosc : ";
            cin>>num;
            bst.search(num);
            break;
        case 4:
            cout<<"Wyswietl drzewo:"<<endl;
            bst.display(root,1);
            cout<<endl;
            break;
        case 5:
            exit(1);
        default:
            cout<<"Zly wybor!"<<endl;
        }
    }
}


void BST::find(int item, node **par, node **loc)
{
    node *ptr, *ptrsave;
    if (root == NULL)
    {
        *loc = NULL;
        *par = NULL;
        return;
    }
    if (item == root->info)
    {
        *loc = root;
        *par = NULL;
        return;
    }
    if (item < root->info)
        ptr = root->left;
    else
        ptr = root->right;
    ptrsave = root;
    while (ptr != NULL)
    {
        if (item == ptr->info)
        {
            *loc = ptr;
            *par = ptrsave;
            return;
        }
        ptrsave = ptr;
        if (item < ptr->info)
            ptr = ptr->left;
	else
	    ptr = ptr->right;
    }
    *loc = NULL;
    *par = ptrsave;
}

