package com.belajar;

class player {
    String name;//default : bisa dibaca dan ditulis diluar class.
    public int power;//public : bisa dibaca dan ditulis diluar class
    private int health;//private : tidak bisa dibaca dan ditulis diluar class.

    player(String name, int power, int health){
        this.name = name;
        this.power = power;
        this.health = health;
    }



    void display(){
        addpower();
        System.out.println("nama plyayer : " + this.name);
        System.out.println("power        : " + this.power);
        System.out.println("health       : "+ this.health);
    }

    void ubahnama (String ubahnama){
        this.name = ubahnama;
    }

    private void addpower(){//tidak bisa diakses di class lain
        this.power += 300;
    }
} 

public class main{
    public static void main(String[] args) {
        player player1 = new player("dirga", 200, 50);
        player1.display();
        //default
        player1.name = "andika"; // menulis data
        System.out.println(player1.name); //membaca data
        //public
        player1.power += 200; //menulis data
        System.out.println(player1.power);

        //private (tidak bisa dibaca di class ini)
       // player1.health +=200;
        //System.out.println(player1.health);

        //key private bisa diakses pada class ini dengan method
        player1.display();

        player1.ubahnama("yusuf");

        player1.display();
        //tidak bisa diakses pada class ini
        //player1.addpower();


    }
    
}