#include<bits/stdc++.h>
using namespace std;
struct Node{
    int data;
    struct Node* next;
};
Node *push(int data)
{
    struct  Node* temp=new Node;
    temp->data=data;
    temp->next=NULL;
    return temp;

}
void print(struct Node* head)
{
    Node* temp=head;
    while(temp!=NULL){
        cout<<temp->data<<" ";
        temp=temp->next;
    }
}
struct Node* evenOdd(struct Node* head)
{
    struct Node* temp=head;
    vector<int> v;
    while(temp!=NULL){
        if(temp->data%2==0){
            cout<<temp->data<<" ";
        }
        else{
            v.push_back(temp->data);
        }
        temp=temp->next;
    }
    for(int i=0;i<v.size();i++){
        cout<<v[i]<<" ";
    }
}
int main()
{
    int t;cin>>t;
    while(t-->0){
        int n;cin>>n;
        int a[n];
        struct Node* head=NULL;
        struct Node* temp=head;
        for(int i=0;i<n;i++){
            cin>>a[i];
            if(head==NULL){
                head=temp=push(a[i]);
            }else{
                temp->next=push(a[i]);
                temp=temp->next;
            }
        }
        evenOdd(head);
        cout<<endl;

    }
}