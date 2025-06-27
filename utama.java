// import liblary yg digunakan
import java.util.Scanner;



public class utama{
 public static void main(String[] args) {
daftar dt = new daftar();  //Buat objek untuk input data user (nama dan password)
    Scanner input = new Scanner(System.in); //Buat objek untuk input
    
    //Sambutan cli
  System.out.println("selamat datang di E-Commerce CLI App"); 
  
  System.out.println("\n");
  //Opsi yg tersedia
    System.out.println("Silahkan pilih menu yang tersedia:");   
    System.out.println("1.  Daftar User");
    System.out.println("2. Login");
    System.out.print(": ");
    int pilihan = input.nextInt(); // input diharapkan bertipe int
    
    
// pengecekan pilihan yg di input pengguna, untuk operasi yg sesuai
    switch (pilihan){
        case 1:  
dt.daftarUser(); 
// jika opsi 1, akan memanggil objek daftar untuk user dan menyimpannya dalam bentuk .json
 break;
 
    }
 }
}