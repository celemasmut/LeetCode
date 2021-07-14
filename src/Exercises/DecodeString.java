package Exercises;

import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s) {

        StringBuilder sb = new StringBuilder();
        int n=s.length();
        int i =0;
        while(i<n){
            char c = s.charAt(i);
            if (Character.isDigit(c)){
                int num = c - '0';
                i++;
                c=s.charAt(i);
                if ( c == '[') {
                    i++;
                    StringBuilder repeat = new StringBuilder();
                    while(s.charAt(i) != ']'){
                        repeat.append(s.charAt(i));
                        i++;
                    }
                    for(int x=0; x < num ; x++){
                        sb.append(repeat);
                    }
                }
                i++;
            }
        }
        return sb.toString();
    }

}
