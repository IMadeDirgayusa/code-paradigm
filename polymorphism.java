package com.belajar;
//super  class
class hero{
    public void serangan (){
        System.out.println("hero memiliki jarak serangan");
    }
}
//subclass
class marksman extends hero{
    public void serangan(){
        System.out.println("jarak jauh");
    }
}
//subclass
class fighter extends hero{
    public void serangan(){
        System.out.println("jarak dekat");
    }
}

public class polymorphism{
    public static void main(String[] args) {
        hero hero1 = new hero();
        hero marksman1  = new marksman();
        hero fighter1 = new fighter();
        
        hero1.serangan();
        marksman1.serangan();
        fighter1.serangan();
    }
}