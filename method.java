package OOP3;
//class
class mahasiswa{

    String nama;
    String nim;
    //constructor
    mahasiswa(String nama, String nim){
    this.nama= nama;
    this.nim = nim;
    }
    //method tanpa return dan tanpa parameter
    void show(){
        System.out.println("nama : " + this.nama);
        System.out.println("nim  : " + this.nim);
    }
    //method dengan parameter dan dengan return
    void setnama(String nama){
    this.nama = nama;
    }
    //method dengan return tanpa parameter

    String getnama(){
        return this.nama;
    }
    String getnim(){
        return this.nim;
    }
    //method dengan return dan parameter
    String sayhi(String message){
        return message +"halo saya adalah "+ this.nama;
    }
}

public class method{
public static void main(String[] args) {
mahasiswa data = new mahasiswa("dirga", "123");
    System.out.println(data.nama);
    //method
    data.show();
    //method2
    data.setnama("andika");
    data.show();
    //method 3
    System.out.println(data.getnama());
    System.out.println(data.getnim());
    //method 4
    String aku = data.sayhi("ahhahaha ");
    System.out.println(aku);

}
}