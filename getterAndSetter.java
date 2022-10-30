package com.belajar;

class data{
    public int intpublic;
    private int intprivate;
    private double doubleprivate;

    data(){
        this.intpublic = 3;
        this.intprivate =10;
    }

    //getter
    public int getIntprivate(){
        return this.intprivate;
    }

    //setter
    public void setdoubleprivate(double value){
        this.doubleprivate = value;

    }

    
}

class lingkaran {
    private double diameter;
    lingkaran (double diameter){
        this.diameter = diameter;
    }

    //setter 
    public void setjari2(double jari){
        this.diameter = jari * 2;
    }

    //getter
    public double getjari2(){
        return this.diameter/2;
    }

    //getter
    public double luas(){
        return 3.14*diameter*diameter/4;
    }
}

public class main{
    public static void main(String[] args) {

        data object = new data();
       
        //read and write
        object.intpublic += 13;//write
        System.out.println(object.intpublic);//read

        //read only kita bisa menggunakn GETTER
        int angka = object.getIntprivate();
        System.out.println("gagaga : " + object.getIntprivate());
        System.out.println("getter : "+ angka);

        //write only menggunakan setter
        object.setdoubleprivate(15);
        

        //menggabungkan read dan write dengan setter dan getter
        lingkaran bola = new lingkaran(4);
        System.out.println("jari - jari : " + bola.getjari2());
        bola.setjari2(10);
        System.out.println("jari - jaru : "+ bola.getjari2());
        System.out.println("luas : "+ bola.luas());
    }
}