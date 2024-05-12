package org.example;

// Klavyeden girilen pozitif tamsayıyı, "BCD kodu (8421 kodu)"na dönüştüren program

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i;
        String s;

        Scanner scanner = new Scanner(System.in);
        System.out.print("\n Lütfen Sayı Giriniz : ");
        s = scanner.nextLine();
        System.out.printf("\nBCD Kodu : ");

        for (i=0; i<s.length(); i++)
            System.out.printf("%04d ", Integer.parseInt(Integer.toBinaryString((int) s.charAt(i)-48)));
        System.out.println();
    }
}