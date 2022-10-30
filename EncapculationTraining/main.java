package com.belajar;

class player {

    private String name;
    private int basehealth;
    private int level;
    private int inchealth;

    private int totaldamage;

    private int baseattack;
    private int incattack;

    private armor armor;
    private weapon weapon;

    private boolean isAlive;

    public player (String name){
        this.name = name;
        this.basehealth = 100;
        this.baseattack = 20;

        this.level = 1;
        this.incattack = 50;
        this.inchealth = 20;
        this.isAlive = true;

        
        
    }

    void display(){
        System.out.println("nama\t : "+ this.name);
        System.out.println("level\t : "+ this.level);
        System.out.println("attack\t : "+ this.getmaxdamage());
        System.out.println("deffense : " + this.armor.getdeffensePower());
        System.out.println("health\t : " + this.gethealth()+"/"+this.maxhealth());
       System.out.println("IsAlvie\t : " + this.isAlive);
        System.out.println("\n");
    }

    public String getname(){
        return this.name;
    }

    public int gethealth(){
        return this.maxhealth() - this.totaldamage;
    }

    public void attack(player opponent){
        int damage = this.getmaxdamage();

        System.out.print(this.name + " attacking "+ opponent.getname());
        System.out.println("with damage : "+ damage) ;
        opponent.deffense(damage);

        this.levelup();

    }

    public void deffense(int damage){
        int deltadamage;
        int deffensePower = this.armor.getdeffensePower();
        if (damage > deffensePower){
            deltadamage = damage - deffensePower;
        }else {
            deltadamage = 0;
        }
        this.totaldamage += deltadamage;

        if (this.gethealth() <= 0){
            this.isAlive = false;
             this.totaldamage = this.maxhealth();
        }
    }

    private int getmaxdamage(){
        return this.baseattack + this.incattack * this.level + this.weapon.getdamage();
    }

    public int maxhealth(){
        return this.basehealth +this.level * this.inchealth +this.armor.gethealth();
    }

    public int levelup(){
        return this.level++;
    }

    public void setarmor (armor armor){
        this.armor = armor;
    }

    public void setweapon(weapon weapon){
        this.weapon = weapon;
    }
}
    
class armor {
    private String name;
    private int strenght;
    private int addhealth;

    public armor(String name, int strenght,int addhealth ){
        this.name = name;
        this.strenght = strenght ;
        this.addhealth = addhealth;
    }

    public int gethealth(){
        return this.strenght + this.addhealth;
    }

    public int getdeffensePower(){
        return this.strenght;
    }

    
}

class weapon {
    private String name;
    private int damage;
    
    public weapon(String name, int damage){
        this.name = name;
        this.damage= damage;
    }

    public int getdamage(){
        return this.damage;
    }
}

public class main{
    public static void main(String[] args) {
        player player1 = new player("Dirga");
        armor armor1 = new armor("baju besi", 200, 20);
        weapon weapon1 = new weapon("ketapel",20);
        player1.setweapon(weapon1);
        player1.setarmor(armor1);
    
        player player2 = new player ("cemplon");
        armor armor2 = new armor ("kelupak debong", 5, 10);
        weapon weapon2 = new weapon ("pedang ",10);
        player2.setarmor(armor2);
        player2.setweapon(weapon2);

        player1.display();
        player2.display();

        player1.attack(player2);
        player1.display();
        player2.display();

        player1.attack(player2);
        player1.display();
        player2.display();




    } 

}
