import java.io.FileWriter; // untuk menulis ke file
import java.io.IOException; // handling  potensi error saat input
import java.io.BufferedReader; // untuk membaca file
import java.io.FileReader; // untuk membaca file
import java.io.File; // untuk membaca file

public class prosesJson {
    littleShop lp = new littleShop(); // objek toko

    public void nulis(String data1, String data2){
        StringBuilder sb = new StringBuilder(); // manipulasi string 
      //membuat format buatan untuk disimpan ke .json
      //
      //hasil:
      // {
      //"nama user": "data1",
      //"password pengguna": "data2"
      //}
String isi ="{\n" + " \"nama user\": \"" + data1 +"\",\n"+ " \"password pengguna\":\""  + data2 + "\"\n" +"}";

try{
  
// membaca file User.json sebagai tempat penyimpanan data dan diproses oleh BufferedReader dalam variabel br
File fe = new File("User.json");
BufferedReader br = new BufferedReader(new FileReader(fe));



String baris; // nyimpan sementara
if(fe.exists()){ // mengecek apakah file ada

while((baris = br.readLine()) != null){ // baca informasi file 
sb.append(baris); // simpan ke sb(StringBuilder)

}

br.close(); //tutup baca file
}


String newJson;

if(sb.length () == 0){ // cek jika isi file kosong
newJson = "[" + isi + "]"; // kondisi unuk data pertama

}else{

    String dataLama = sb.toString(); // ubah menjadi String
    dataLama = dataLama.substring(0, sb.length() -1); // buang index akhir
    
    // variabel dataLama dipakai lagi dan ditambah beberapa data tambahan dab disimpan ke variabel newJson
    newJson = dataLama + "," + isi + "]";

}

FileWriter fw = new FileWriter("User.json"); //nulis ke file
fw.write(newJson); //isi file dari variabel newJson
fw.close(); // tutup operasi tulis



}catch(IOException e){
    e.printStackTrace();
}
    }




// ====================================== BATAS 2 METHOD ====================================== 





// method untuk validasi user, bisa diisi dengan logika untuk mengecek apakah user sudah terdaftar atau tidak
    public void validasiUser(String data1, String data2){

StringBuilder sb = new StringBuilder(); // manipulasi string
try{
// buat objek untuk baca file User.json
File fe = new File("User.json");
BufferedReader br = new BufferedReader(new FileReader(fe));



String baris; // variabel sementara
while((baris =br.readLine()) != null ){ // jalan terus jika != null
sb.append(baris); // simpan ke stringbuilder
}
br.close(); // tutup baca fike


String ubahKeJson = sb.toString(); // ubah ke string

// membuat format yg sama persis seperti saat input agar bisa di validasi
boolean valid  = ubahKeJson.contains(" \"nama user\": \"" + data1 +"\"") && ubahKeJson.contains(" \"password pengguna\":\"" + data2 + "\"");



if(valid){ // jika true

System.out.println("\n Berhasil login \n");    
lp.toko(); // pindah ke toko



}else{

    System.out.println("\n Terdapat Kesalahan pada nama atau password \n");
    
}



}catch(IOException e){
    e.printStackTrace();

}
    }
}
