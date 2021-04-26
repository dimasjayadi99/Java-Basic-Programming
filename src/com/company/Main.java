package com.company;
/*
Author  : Dimas Jayadi
Date    : April 2021
Program : Java Basic
 */


//import library scanner
import java.util.Scanner;

public class Main {

    //Variabel global
    static String name;
    static int age;
    static int a,b;

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        //panggil method menu dan username disini
        getValues();
        menu();
    }

    // method get username & age
    public static void getValues(){
        System.out.print("\n ++++Program Java++++\n");
        System.out.print("What's your name : ");
        name = scan.nextLine();

        System.out.print("Age : ");
        age = scan.nextInt();
    }

    //method menu
    public static void menu(){
        System.out.print("\n++++Choose Option++++");
        System.out.print("\n1.Penjumlahan\n2.Pengurangan\n3.Perkalian\n4.Pembagian");
        System.out.print("\n\nSelection : ");
        int select = scan.nextInt();

        switch (select){
            case 1:
                // fungsi penjumlahan
                //panggil fungsi
                System.out.print("hi," + name);
                penjumlahan();
                menu();
                break;
            case 2:
                // fungsi pengurangan
                System.out.print("hi," + name);
                pengurangan();
                menu();
                break;
            case 3:
                // fungsi perkalian
                System.out.print("hi," + name);
                perkalian();
                menu();
                break;
            case 4:
                // fungsi pembagian
                System.out.print("hi," + name);
                pembagian();
                menu();
                break;
        }

    }

    // fungsi penjumlahan
    public static void penjumlahan(){
        System.out.print("\nMasukan angka pertama : ");
        a = scan.nextInt();

        System.out.print("\nMasukan angka kedua : ");
        b = scan.nextInt();

        int jumlah = a + b;
        System.out.print("\nHasil dari " + a + " + " + b + " = " + jumlah);
    }

    // fungsi pengurangan
    public static void pengurangan(){
        System.out.print("\nMasukan angka pertama : ");
        a = scan.nextInt();

        System.out.print("\nMasukan angka kedua : ");
        b = scan.nextInt();
        int kurang = a - b;
        System.out.print("\nHasil dari " + a + " - " + b + " = " +kurang);
    }

    // fungsi perkalian
    public static void perkalian(){
        System.out.print("\nMasukan angka pertama : ");
        a = scan.nextInt();

        System.out.print("\nMasukan angka kedua : ");
        b = scan.nextInt();
        int kali = a * b;
        System.out.print("\nHasil dari " + a + " * " + b + " = " + kali);
    }

    // fungsi pembagian
    public static void pembagian(){
        System.out.print("\nMasukan angka pertama : ");
        a = scan.nextInt();

        System.out.print("\nMasukan angka kedua : ");
        b = scan.nextInt();
        int bagi = a / b;
        System.out.print("\nHasil dari " + a + " / " + b + " = " + bagi);
    }

}
