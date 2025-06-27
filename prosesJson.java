import java.io.FileWriter;
import java.io.IOException;


public class prosesJson {
    

    public void nulis(String data1, String data2){
String isi ="{\n" + " \"nama user\": \"" + data1 +"\",\n"+ " \"password pengguna\":\""  + data2 + "\"\n" +"}";



try(FileWriter wr = new FileWriter("User.json")){

    
wr.write(isi);


System.out.println("data berhasil dicatat di User.json");





}catch(IOException e){
e.printStackTrace();
}
    }
}
