import java.util.Scanner;

public class daftar {

    public void daftarUser() {
      //Buat objek untuk simpan ke json
         prosesJson pn = new prosesJson();
         
         // scanner akan otomatis di .close() setelah keluar dari try
       try(Scanner sr  = new Scanner(System.in)){



        //memasukkan data nama
          System.out.println("Anda memilih menu Daftar User");
        System.out.println("Masukkan nama anda:"); 
        System.out.print(": ");
String dataNama = sr.nextLine();



// new line
  System.out.println("\n");
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

}
