import java.io.FileWriter; // untuk menulis ke file
import java.io.IOException; // handling  potensi error saat input


public class prosesJson {
    

    public void nulis(String data1, String data2){
      //membuat format buatan untuk disimpan ke .json
      //
      //hasil:
      // {
      //"nama user": "data1",
      //"password pengguna": "data2"
      //}
String isi ="{\n" + " \"nama user\": \"" + data1 +"\",\n"+ " \"password pengguna\":\""  + data2 + "\"\n" +"}";


//FileWriter akan otomatis di tutup dengan .close() setelah keluar dari try
try(FileWriter wr = new FileWriter("User.json")){

//memasukkan data user ke .json
wr.write(isi);

//pemberitahuan data berhasil di simpan ke .json
System.out.println("data berhasil dicatat di User.json");





}catch(IOException e){
e.printStackTrace();
//menangkap error yg terjadi
}
    }
}
