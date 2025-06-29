import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;



// bagian utama toko, sistem toko dimulai disini
public class littleShop {

    public void toko(){
        System.out.println("~~~Daftar produk yang tersedia~~~");
               try{
    StringBuilder ser = new StringBuilder();
    Scanner sr = new Scanner(System.in);
    File fe = new File("Produk.json");
    BufferedReader br = new BufferedReader(new FileReader(fe));
    String baris;
    if(fe.exists()){
while((baris = br.readLine()) != null){
ser.append(baris);
}
br.close();
    }


    String tampil = ser.toString();
    System.out.println(tampil);
    System.out.println("\n");
    System.out.println("\n");
while(true){
System.out.println("Pilih produk dan masukkan ke keranjang/ ketik exit untuk keluar");
System.out.print(": ");
String Ketik  = sr.nextLine();
if(tampil.contains(Ketik)){
    System.out.println("\n\thalo\n");
    
}else if(Ketik.equals("exit")){
System.out.println("\n Terimakasih sudah berbelanja disini. \n");
System.exit(0);
}else{
    System.out.println("\n produk yang dicari tidak ditemukan. \n");
    return;
}
}
}catch(IOException e){
e.printStackTrace();
}
    }
}
