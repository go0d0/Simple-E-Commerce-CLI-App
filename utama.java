// import liblary yg digunakan
import java.util.Scanner;



public class utama{
 public static void main(String[] args) {
Scanner input = new Scanner(System.in);
daftar dt = new daftar();  //Buat objek untuk input data user (nama dan password)
    try{//Buat objek untuk input
    

    while(true){
    //Sambutan cli
  System.out.println("~~selamat datang di E-Commerce CLI App~~"); 

   System.out.println("\n");
  System.out.println("--Untuk masuk ke toko, anda perlu login");
  System.out.println("--Jika anda tidak punya akun, silahkan buat terlebih dahulu");
  System.out.println("\n");

  
  //Opsi yg tersedia
    System.out.println("Silahkan pilih menu yang tersedia:");   
    System.out.println("1. Daftar User");
    System.out.println("2. Login");
    System.out.println("3. Keluar");
    System.out.print(": ");
    int pilihan = input.nextInt(); // input diharapkan bertipe int
    input.nextLine();
    
// pengecekan pilihan yg di input pengguna, untuk operasi yg sesuai
    switch (pilihan){
        case 1:  
dt.daftarUser(); 
break;
 case 2: 

dt.validasiUser();
// jika opsi 2, akan memanggil objek daftar untuk validasi user
 break;

case 3:
System.exit(0);

 default:
 System.out.println("Pilihan tidak valid, silahkan coba lagi.");
  break;


    }
    }
  }catch(Exception e){
    e.printStackTrace();
  }
 }
}