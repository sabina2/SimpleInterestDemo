package com.Loading;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Your Principal");
        int principal= scanner.nextInt();

        System.out.println("Enter Interest Rate");
        float  Interest=scanner.nextFloat();

        System.out.println("Enter time");
        Byte time=scanner.nextByte();

        float Annual_Interest=( principal*Interest*time)/100;
        String Number=NumberFormat.getCurrencyInstance().format(Annual_Interest);

        System.out.println("Your Annual Interest is "+Number);
    }
}
