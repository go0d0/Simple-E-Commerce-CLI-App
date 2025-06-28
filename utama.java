// import library yg digunakan
import java.util.Scanner;



public class utama{
 public static void main(String[] args) {
   //Buat objek untuk input dari pengguna
Scanner input = new Scanner(System.in);
daftar dt = new daftar();  //Buat objek input data
    try{
    

    while(true){
  System.out.println("~~selamat datang di E-Commerce CLI App~~"); 

//informasi yg perlu diketahui user
   System.out.println("\n");
   System.out.println("NOTE:")
  System.out.println("--Untuk masuk ke toko, anda perlu login");
  System.out.println("--Jika anda tidak punya akun, silakan buat terlebih dahulu");
  System.out.println("\n");

  
  // Menu yg tersedia dalam program cli
    System.out.println("Silahkan pilih menu yang tersedia:");   
    System.out.println("1. Daftar User");
    System.out.println("2. Login");
    System.out.println("3. Keluar");
    System.out.print(": ");
    int pilihan = input.nextInt(); // input tipe int
    input.nextLine();
      
// pengecekan pilihan yg di input pengguna, untuk operasi yg sesuai
    switch (pilihan){
        case 1:  
dt.daftarUser(); 
break;
 case 2: 
// jika opsi 2, akan memanggil objek daftar untuk validasi user
dt.validasiUser();
 break; //keluar dari switch

//keluar progra, looping berhenti
case 3:
System.exit(0); //keluar dari program

//kondisi jika user input pilihan tidak valid (diluar tipe int)
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