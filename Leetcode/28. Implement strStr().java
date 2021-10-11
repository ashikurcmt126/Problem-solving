/*
    Input: haystack = "hello", needle = "ll"
    Output: 2
*/

public class Leet28 {

    public static int strStr(String haystack, String needle) {
        if (haystack.length() ==0  && needle.length() ==0)return 0;
        int check=0;
        for(int i=0;i<=haystack.length()-needle.length();i++){
            //System.out.println(haystack.substring(i,i+needle.length()));
            if (needle.equals(haystack.substring(i,i+needle.length()))){
                return i;
            }
        }
        if (check==0)return -1;
        return -1;
    }

    public static void main(String args[]){
        System.out.println(strStr("a", "a"));
    }
}
