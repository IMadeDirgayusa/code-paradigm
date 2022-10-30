package com.reference;

class buku{
    String judul;
    String penulis;

    buku (String judul , String penulis){
        this.judul = judul;
        this.penulis = penulis;
    }

    void display(){
        System.out.println(" Judul   : " + this.judul);
        System.out.println(" Penulis : " + this.penulis);
        
    }
}

public class reference {
    public static void main(String[] args) {
   buku buku1 = new buku("hasa" ,"haruki muratami");
   buku1.display();

        
    }
}
