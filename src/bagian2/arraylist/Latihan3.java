package bagian2.arraylist;
import java.util.ArrayList;
public class Latihan3 {
    public static void main(String[] agrs){
        //membuat array kosong yang menampung string
        ArrayList<String>mahasiswa = new ArrayList<>();
        
        //add()menambah element di akhir
        mahasiswa.add("wowo");
        mahasiswa.add("joko");
        mahasiswa.add("mbg");
        
        System.out.println("Isi List: "+ mahasiswa);
        System.out.println("jumlah: "+ mahasiswa.size());
        System.out.println("index 1: "+ mahasiswa.get(1));
         
    }
}
