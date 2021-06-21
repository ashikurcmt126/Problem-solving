/* Below global variable is declared in code for modulo arithmetic
const long long unsigned int MOD = 1000000007; */
/* Link list Node/
struct Node
{
    bool data;   // NOTE data is bool
    Node* next;
}; */
// Should return decimal equivalent modulo 1000000007 of binary linked list 
long long unsigned int decimalValue(Node *head)
{
   struct Node* temp=head;
   string ashik="";
   long long unsigned int deci=0,g=1;
   int i=1;
   while(temp!=NULL){
        char ch=temp->data;
    ashik=ashik+ch;
    temp=temp->next;
   }
   int size=ashik.length();
   int j=1;
   for(int k=size-1;k>=0;k--){
    if(ashik[k]!=0){
       deci=(deci+g)%1000000007;
    }
    g=(g*2)%1000000007;
    j++;
   }

   return deci;
}