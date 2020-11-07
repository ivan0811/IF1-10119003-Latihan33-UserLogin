package com.userlogin;

import java.util.Scanner;

/**
 *
 * @author User
 * NAMA         : Ivan Faathirza
 * KELAS        : IF1
 * NIM          : 10119003
 * Deskripsi Program : ini adalah program login untuk mengecek username dan password
 * berdasarkan instansiasi objek dari user
 */

public class Latihan33Login {
    private static String usName;
    private static String passWord;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        User user = new User();
        System.out.print("Masukkan Username = ");
        usName = scan.next();
        System.out.print("Masukkan Password = ");
        passWord = scan.next();
        user.pengecekanLogin(usName, passWord);
    }
}
