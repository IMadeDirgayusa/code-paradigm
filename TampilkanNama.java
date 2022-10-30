package com.belajar;

class nama {
   private String nama;
    nama(String nama){
        this.nama = nama;       
    }
    void display(){
        System.out.println("nama : " + getNama());
    }

    void Setnama(String nama){
        this.nama = nama;
    }
    String getNama(){
        return this.nama;
    }
}
public class main{
    public static void main(String[] args) {
        nama nama1 = new nama("Dirga");
        nama1.display();
    }
}