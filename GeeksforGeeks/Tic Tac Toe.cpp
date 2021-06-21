using namespace std;

int win[8][3] = {{0, 1, 2}, // Check first row.
                {3, 4, 5}, // Check second Row
                {6, 7, 8}, // Check third Row
                {0, 3, 6}, // Check first column
                {1, 4, 7}, // Check second Column
                {2, 5, 8}, // Check third Column
                {0, 4, 8}, // Check first Diagonal
                {2, 4, 6}}; // Check second Diagonal


bool isCWin(char *board, char c)
{

    for (int i=0; i<8; i++)
        if (board[win[i][0]] == c &&
            board[win[i][1]] == c &&
            board[win[i][2]] == c )
            return true;
    return false;
}

bool isValid(char board[9])
{

    int xCount=0, oCount=0;
    for (int i=0; i<9; i++)
    {
       if (board[i]=='X') xCount++;
       if (board[i]=='O') oCount++;
    }
    if (xCount==oCount || xCount==oCount+1)
    {

        if (isCWin(board, 'O'))
        {

            if (isCWin(board, 'X'))
                 return false;
            return (xCount == oCount);
        }

        if (isCWin(board, 'X') && xCount != oCount + 1)
        return false;
        return true;
    }
    return false;
}
int main()
{
    int t;cin>>t;
    while(t-->0){
        char ch[9];
    int x_c=0,o_c=0;
    for(int i=0;i<9;i++){
        cin>>ch[i];
    }
    if(isValid(ch)){
        cout<<"Valid"<<endl;
    }else
    cout<<"Invalid"<<endl;
    }

}