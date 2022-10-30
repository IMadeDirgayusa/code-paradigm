package oop2constructor;
//class tanpa constructor
//class polos{
//String datastring;
//int dataintengger;
//}
import java.util.Scanner;

//class dengan constructor
class mahasiswa{
    Scanner in = new Scanner(System.in);
    String nama;
    String nim;
    String jurusan;

    mahasiswa(){
        System.out.print("masukan nama : ");
        nama  = in.nextLine();
        System.out.print("masukan nim : ");
        nim  = in.nextLine();
        System.out.print("masukan jurusan : ");
        jurusan = in.nextLine();

        System.out.println("nama : "+ nama);
        System.out.println("nim  : "+ nim);
        System.out.println("jurusan : "+ jurusan);
        
    }

   
}
public class oop2 {
    public static void main(String[] args) {
       // polos data = new polos();
        //data.datastring = "dirgaganteng87";
        //data.dataintengger = 123;
   mahasiswa data = new mahasiswa();
        
    }
    
}
