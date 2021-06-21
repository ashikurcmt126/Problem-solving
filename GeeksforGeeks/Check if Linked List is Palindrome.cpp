/*The structure of the Node is
struct Node
{
    int data;
    struct Node* next;
};*/
/*You are required to complete this method */
bool isPalindrome(Node *head)
{
     Node* temp1=head;
    struct Node* temp2=head;
    int count=0;
    while(temp1!=NULL){
        temp1=temp1->next;
        count++;
    }
    //cout<<count<<endl;
    if(count%2!=0){

        int dcount=count/2;
        int arr[dcount];
        int gcount=dcount-1;
        int fcount=dcount+1;

        int i=0;
        while(dcount--){
            arr[i]=temp2->data;
            temp2=temp2->next;
            i++;
        }
        temp2=temp2->next;
        while(fcount<count){
            fcount++;
            if(temp2->data!=arr[gcount]){
                return false;
            }
            temp2=temp2->next;
            gcount--;
        }

        return true;
    }
    else{

        int dcount=count/2;
        int arr[dcount];
        int gcount=dcount-1;
        int fcount=dcount;
        int i=0;
        while(dcount--){
            arr[i]=temp2->data;
            temp2=temp2->next;
            i++;
        }
        /*
        int i=0;
        while(i<fcount){
            cout<<v[i]<<endl;
            i++;
        }
*/

        while(fcount<count){
            fcount++;
            //cout<<temp2->data<<endl;
            if(temp2->data!=arr[gcount]){

                return false;
            }
            temp2=temp2->next;
            gcount--;
        }

        return true;
    }
}