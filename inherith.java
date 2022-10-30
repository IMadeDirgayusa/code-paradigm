package com.belajar;

class hewan {
    protected String family = "kucing";
    
    void bunyi (){
        System.out.println("meow");
    }

}

class kucing extends hewan{
    private String jenis = "kecil";
    
    void tampil(){
        System.out.println(this.jenis);
    }

}
public class inherith{
    public static void main(String[] args) {
        kucing kucing1 = new kucing();
        kucing1.bunyi();
       System.out.print(kucing1.family + " " );
       kucing1.tampil();
        
    }
}