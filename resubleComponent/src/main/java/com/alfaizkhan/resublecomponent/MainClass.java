package com.alfaizkhan.resublecomponent;

import java.util.Scanner;

class MainClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scan.nextLine();

        StringBuilder sb = new StringBuilder(str);

        StringBuilder reversrSb = reverseStringData(sb);
        String reverseStr = new String(reversrSb);
        System.out.println("Reverse String: "+reverseStr);
    }
    public static StringBuilder reverseStringData(StringBuilder sb){
        StringBuilder rev = new StringBuilder("");
        for(int i=sb.length()-1; i>=0; i--){
            rev.append(sb.charAt(i));
            System.out.println("Address of rev: "+
                System.identityHashCode(rev));
        }
        return rev;
    }
}
