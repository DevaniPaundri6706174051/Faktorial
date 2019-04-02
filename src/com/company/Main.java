package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Angka : ");
        int tingkat = scanner.nextInt();
        int l = 1;
        int n = tingkat;
        for(int i=1;i<=n;i++){
            for(int k=n;k>i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=l;j++){
                System.out.print("*");
            }
            l+=2;

            System.out.println("");
        }
        l -= 4;

        for(int i=(n-1);i>=1;i--){
            for(int k=i;k<=(n-1);k++){
                System.out.print(" ");
            }
            for(int j=l;j>=1;j--){
                System.out.print("*");
            }
            l-=2;

            System.out.println("");
        }
    }
}
