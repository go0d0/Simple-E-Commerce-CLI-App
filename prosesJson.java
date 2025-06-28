import java.io.FileWriter; // untuk menulis ke file
import java.io.IOException; // handling  potensi error saat input
import java.io.BufferedReader; // untuk membaca file
import java.io.FileReader; // untuk membaca file
import java.io.File; // untuk membaca file

public class prosesJson {
    clonningAws cs = new clonningAws();

    public void nulis(String data1, String data2){
        StringBuilder sb = new StringBuilder();
      //membuat format buatan untuk disimpan ke .json
      //
      //hasil:
      // {
      //"nama user": "data1",
      //"password pengguna": "data2"
      //}
String isi ="{\n" + " \"nama user\": \"" + data1 +"\",\n"+ " \"password pengguna\":\""  + data2 + "\"\n" +"}";

try{
File fe = new File("User.json");
BufferedReader br = new BufferedReader(new FileReader(fe));



String baris;
if(fe.exists()){

while((baris = br.readLine()) != null){
sb.append(baris);

}

br.close();
}


String newJson;

if(sb.length () == 0){
newJson = "[" + isi + "]";

}else{

    String dataLama = sb.toString();
    dataLama = dataLama.substring(0, sb.length() -1);
    newJson = dataLama + "," + isi + "]";

}

FileWriter fw = new FileWriter("User.json");
fw.write(newJson);
fw.close();



}catch(IOException e){
    e.printStackTrace();
}
    }




// ====================================== BATAS 2 METHOD ====================================== 





// method untuk validasi user, bisa diisi dengan logika untuk mengecek apakah user sudah terdaftar atau tidak
    public void validasiUser(String data1, String data2){

StringBuilder sb = new StringBuilder();
try{
File fe = new File("User.json");
BufferedReader br = new BufferedReader(new FileReader(fe));



String baris;
while((baris =br.readLine()) != null ){
sb.append(baris);
}
br.close();


String ubahKeJson = sb.toString();

boolean valid  = ubahKeJson.contains(" \"nama user\": \"" + data1 +"\"") && ubahKeJson.contains(" \"password pengguna\":\"" + data2 + "\"");



if(valid){

System.out.println("\n Berhasil login \n");    
cs.toko();



}else{

    System.out.println("\n Terdapat Kesalahan pada nama atau password \n");
    
}



}catch(IOException e){
    e.printStackTrace();

}
    }
}
