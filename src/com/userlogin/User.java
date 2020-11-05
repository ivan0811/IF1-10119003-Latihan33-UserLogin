package com.userlogin;

public class User {
    private final static String username = "ivan";
    private final static String password = "isekai";
    private boolean statusAkun;

    private boolean cekAkun(String parUserName, String parPassword){
        return statusAkun = parUserName.equals(username) && parPassword.equals(password);
    }

    private void hasilLogin(boolean status, String parUserName){
        String hasil = status ? "******HALLO ".concat(parUserName)
                .concat("******\nSelamat Datang di Aplikasi ini")
                : "Ooops, Username atau Password anda salah";
        System.out.println(hasil);
    }

    public void pengecekanLogin(String parUserName, String parPassword){
        cekAkun(parUserName, parPassword);
        hasilLogin(statusAkun, parUserName);
    }
}
