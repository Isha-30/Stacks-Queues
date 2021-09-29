package com.geekyscript;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Character> st = new Stack<>();
        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ')'){
                if(st.peek()=='('){
                    System.out.println(true);
                    return;
                } else{
                    while(st.peek()!='('){
                        st.pop();
                    }
                    st.pop();
                }

            } else{
                st.push(ch);
            }
        }
        System.out.println(false);
    }
}
