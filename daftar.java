import java.util.Scanner;

public class daftar {

    public void daftarUser() {
         prosesJson pn = new prosesJson();
       try(Scanner sr  = new Scanner(System.in)){



        
          System.out.println("Anda memilih menu Daftar User");
        System.out.println("Masukkan nama anda:"); 
        System.out.print(": ");
String dataNama = sr.nextLine();




  System.out.println("\n");
        System.out.println("Masukkan Password anda:"); 
        System.out.print(": ");
        String dataPw = sr.nextLine();





pn.nulis(dataNama, dataPw);



       }catch (Exception e){
        e.printStackTrace();
       }
    }

}
