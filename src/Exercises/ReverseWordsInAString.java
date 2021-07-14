package Exercises;

public class ReverseWordsInAString {

    /*
    * Given an input string s, reverse the order of the words.
    * A word is defined as a sequence of non-space characters.
    * The words in s will be separated by at least one space.
    * Return a string of the words in reverse order concatenated by a single space.
    * Note that s may contain leading or trailing spaces or multiple spaces between two words.
    * The returned string should only have a single space separating the words.
    * Do not include any extra spaces.
    * Example 1:
    * Input: s = "the sky is blue"
    * Output: "blue is sky the"*/

    public static String reverseWords(String s) {

        StringBuffer sb = new StringBuffer(); // more efficient than stringbuilder got a runtime faster
        int i = s.length() -1; // points to the end of the string
        while ( i >= 0){
            if(s.charAt(i) == ' '){ // verify if the char is an space. then move to the left
                i--;
            }else{
                int j=i; // got two pointers
                while (i >= 0 && s.charAt(i) != ' ') { // see if my position is greater and if it is not an space
                    i--;// then move to the left until the loop breaks while pointer j still remains
                }
                if(sb.length() > 0) {
                    sb.append(' ');
                }
                for( int k = i+1; k <= j; k++){ // we add the words
                    sb.append(s.charAt(k));
                }
            }
        }
        return sb.toString();
    }


}
