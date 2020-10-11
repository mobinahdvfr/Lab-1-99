package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int a;
        int b;
        int tmp;
        String aa = JOptionPane.showInputDialog("enter first number");
        a = Integer.parseInt(aa);
        String bb = JOptionPane.showInputDialog("enter second number");
        b = Integer.parseInt(bb);

        if (a < b){
            tmp = a;
            a = b;
            b = tmp;
        }

        while (b != 0){
            tmp = b;
            b = a % b;
            a = tmp;
        }

        System.out.println((a == 1) ? "nesbat be ham avval hastan" : "nesbat be ham avval nistan");
    }
}
