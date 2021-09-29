package com.geekyscript;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        Scanner scn  = new Scanner(System.in);
        String str = scn.nextLine();

        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch =='(' || ch == '{' || ch=='['){
                st.push(ch);
            } else if(ch==')'){
                boolean val = handleClosing(st, '(');
                if(val==false){
                    System.out.println(val);
                    return;
                }
            } else if(ch == '}'){
                boolean val = handleClosing(st, '{');
                if(val==false){
                    System.out.println(val);
                    return;
                }
            } else if(ch ==']'){
                boolean val = handleClosing(st, '[');
                if(val==false){
                    System.out.println(val);
                    return;
                }
            } else{

            }
        }
        if(st.size()==0){
            System.out.println(false);
        }else{
            System.out.println(false);
        }
    }
    public static boolean handleClosing(Stack<Character> st, char corresopench){
        if(st.size()==0){
            return false;
        } else if(st.peek() != corresopench){
            return false;
        } else{
            st.pop();
            return true;
        }
    }
}
