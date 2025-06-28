// import liblary yang dibutuhkan
import java.util.Scanner;


public class daftar {

    public void daftarUser() {

      Scanner sr = new Scanner(System.in);
      //Buat objek untuk simpan ke json
         prosesJson pn = new prosesJson();
         
        
       try{



        //memasukkan data nama
          System.out.println("Anda memilih menu Daftar User");
        System.out.println("Masukkan nama anda:"); 
        System.out.print(": ");
String dataNama = sr.nextLine();



  System.out.println("\n"); // new line
  
  // memasukkan data password
        System.out.println("Masukkan Password anda:"); 
        System.out.print(": ");
        String dataPw = sr.nextLine();




//manggil method nulis dari objek pn (prosesJson), dengan 2 argumen(dataNama, dataPw)
pn.nulis(dataNama, dataPw);



       }catch (Exception e){
        e.printStackTrace();
        //menampilkan pesan error jika terjadi kesalahan selama proses input nama dan password
       }
    }




// method untuk validasi user, bisa diisi dengan logika untuk mengecek apakah user sudah terdaftar atau tidak
    public void validasiUser() {
      
Scanner sr = new Scanner(System.in);
        // Objek untuk validasi user
        prosesJson pn = new prosesJson();


      try{

       //memasukkan data nama
          System.out.println("Anda memilih menu Validasi User");
        System.out.println("Masukkan nama anda:"); 
        System.out.print(": ");
String dataNama = sr.nextLine();



// new line
  System.out.println("\n");
  // memasukkan data password
        System.out.println("Masukkan Password anda:"); 
        System.out.print(": ");
        String dataPw = sr.nextLine();
        
        // memanggil method validasiUser dari objek pn (prosesJson)
        pn.validasiUser(dataNama, dataPw);
    }catch(Exception e){
e.printStackTrace();
  }
    }

}
