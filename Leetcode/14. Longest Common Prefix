public class Main
{
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length==1)return strs[0];
        String s= strs[0];
        String resultString = "";
        int min=Integer.MAX_VALUE;
        for (int i=1;i<strs.length;i++){
            int count=0;
            String tempString = "";
            for (int j=0;j<strs[i].length() && j<s.length();j++){
                //System.out.println(s.charAt(j)+" "+strs[i].charAt(j));
                if (s.charAt(j)==strs[i].charAt(j)){
                    count++;
                    tempString = tempString+ s.charAt(j);
                }else break;
            }
            //System.out.println(tempString);
            if (min>count){
                min=count;
                resultString = tempString;
            }

        }
        return resultString;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"a"}));
    }
}
