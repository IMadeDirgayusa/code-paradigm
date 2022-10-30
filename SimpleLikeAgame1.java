package latihan;

//player
class player{
    int playeran;
    String name;
    double healt;
    int level;
    //object memeber
    weapon weapon;
    armor armor;

        player(int playeran, String name, double healt, int level){
            this.name = name;
            this.healt = healt;
            this.level = level;
            this.playeran = playeran;

        }

    //membuat skema penyerangan
    void attack(player opponent){
        double attackpower = this.weapon.attackpower;
        System.out.println(this.name + " attacking " + opponent.name);
        System.out.print("with attackpower : " + attackpower +" " );
        opponent.deffense(attackpower);
    }
    //membuat skema pertahanan
    void deffense(double attackpower){
        double damage;
        if(this.armor.deffensepower < attackpower){
            damage = attackpower - this.armor.deffensepower; 
        }else {
            damage = 0;
        }
        this.healt -= damage;
        System.out.println(this.name + " gets damage "+ damage);
    }
    //method equip weapon
    void equipWeapon(weapon weapon){
        this.weapon = weapon;
    }
    
    //method equip armor

    void equipArmor(armor armor){
        this.armor = armor;
    }

    void display(){

        System.out.println("\nPlayer " + playeran );
        System.out.println("name   : "+ this.name+ " Lv." + this.level + " HP : "+this.healt );
        this.weapon.display();
        this.armor.display();
    }   

}
//weapon
class weapon{
    double attackpower;
    String nameWeapon;

    weapon(String nameWeapon, double attackpower){
        this.attackpower = attackpower;
        this.nameWeapon = nameWeapon;
    }
    void display(){
        System.out.println("weapon : "+ this.nameWeapon + "  Pw." + attackpower);
    }
}
//armor
class armor{
    double deffensepower;
    String nameDeffense;
    armor(String nameDeffense, double deffensepower){
        this.deffensepower = deffensepower;
        this.nameDeffense = nameDeffense;
    }

    void display(){
        System.out.println("armor  : "+ nameDeffense + ", PwDeff. " + deffensepower );
    }

}

public class latihan{

    public static void main(String[] args){

    //membuat object player
    player player1 = new player(1,"dirga", 2000, 64);
    player player2 = new player(2,"andika", 100, 34);

    //membuat object weapon
    weapon slingshot = new weapon("slingshot",200);
    weapon sword = new weapon("Sword", 50);

    //membuat object armor
    armor doplang = new armor("Doplang",2000000);
    armor steelarmor = new armor ("steel Armor", 40 );

    //equip weapon ke player 1
    player1.equipWeapon(slingshot);
    player1.equipArmor(doplang);
    player1.display();
   
    //player 2
    player2.equipWeapon(sword);
    player2.equipArmor(steelarmor);
    player2.display();

    //pertempuran
    System.out.println("\n Pertempuran! \n");
    System.out.println("\n episode 1 \n");
    player1.attack(player2);
    player1.display();
    player2.display();

    System.out.println("\n episode 2 \n");
    player2.attack(player1);
    player1.display();
    player2.display();


        
    } 
}