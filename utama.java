import java.util.Scanner;
import java.util.ArrayList;



public class utama{
 public static void main(String[] args) {
daftar dt = new daftar();
    Scanner input = new Scanner(System.in);
  System.out.println("selamat datang di E-Commerce CLI App"); 
  System.out.println("\n");
    System.out.println("Silahkan pilih menu yang tersedia:");   
    System.out.println("1.  Daftar User");
    System.out.println("2. Login");
    System.out.print(": ");
    int pilihan = input.nextInt();

    switch (pilihan){
        case 1:
dt.daftarUser();
 break;
    }
 }
}