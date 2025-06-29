import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

public class admin {
    public void cekAsli(){
      
        Scanner sr = new Scanner(System.in);
System.out.println("masukkan nama admin: ");
System.out.print(": ");
String nama = sr.nextLine();
System.out.println("\n");


System.out.println("masukkan passowrd admin: ");
System.out.print(": ");
String pw = sr.nextLine();
System.out.println("\n");

if(nama.equals("admin") && pw.equals("admin123")){
    proses();
}else{
    System.out.println("nama atau passowrd tidak dikenali sebagai admin");
    System.exit(0);
}
 

    }



    public void proses(){
try{

StringBuilder ser = new StringBuilder();
File fe = new File("Produk.json");
BufferedReader br = new BufferedReader(new FileReader(fe));


String baris;
if (fe.exists()){
    while((baris = br.readLine()) != null){
ser.append(baris);
    }
}






Scanner sr = new Scanner(System.in);
System.out.println("masukkan nama produk");
System.out.print(": ");
String namaP = sr.nextLine();



System.out.println("masukkan harga produk");
System.out.print(": ");
String hargaP = sr.nextLine();



System.out.println("stok yang tersedia");
System.out.print(": ");
String stokP = sr.nextLine();


// pusing

String isi = "{\n" + "\"nama produk\" :\"" + namaP +"\",\n" + "\"harga produk\" :\"" + hargaP +"\",\n" + "\"stok produk\" :\"" +stokP +"\"\n" + "}";
System.out.println(isi);


String hasi = ser.toString();
boolean valid =hasil.contains() && hasil.contains();
if(valid){

}else{
    
}

// pusing

}catch(IOException e){
    e.printStackTrace();
}


    }
}
