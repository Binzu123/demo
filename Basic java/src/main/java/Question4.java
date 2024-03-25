package main.java;


class Question4 {
    public static void main(String[] args)
    {
        String str []= {"cat","flag","green","test","Athang"};
        String longestWords ="";
        int maxLength = 0;
        for (int i = 0; i < str.length; i++){
            String word = str[i];
            int len = 0;
            for (int k = 0; k<word.length();k++){
                len++;
            }
            if (len>maxLength){
                maxLength=len;
                longestWords = word;
            }
        }
        System.out.println(longestWords);
    }
}
