package bagian2.arraylist;
import java.util.ArrayList;
public class LatihanMandiri2 {
    public static void main(String[] agrs){
        ArrayList<String>belanja = new ArrayList<>();
        belanja.add("Desa");
        belanja.add("Tidak");
        belanja.add("Pakai");
        belanja.add("Dollar");
        
        belanja.remove("Tidak");
        
        System.out.println("Jumlah   : " + belanja.size());
        System.out.println("Jumlah   : " + belanja);
        System.out.println("-------------------------------------------");
        
        
        ArrayList<Integer>nilai = new ArrayList<>();
        nilai.add(85);
        nilai.add(75);
        nilai.add(90);
        nilai.add(69);
        nilai.add(67);
        
        int total = 0;
        int max = nilai.get(0);
        for(int n: nilai){
            total+=n;
            if(n>max){
                max = n;
            }
        }
        System.out.println("Terbesar   : " + max);
        System.out.println("-------------------------------------------");
        
        
        ArrayList<String>nama = new ArrayList<>();
        nama.add("Sudirman");
        nama.add("Hermawan");
        nama.add("Ade");
        nama.add("Ratu");
        nama.add("Surati");
        nama.add("Lestari");
        
        for(String n: nama){
            if (n.toLowerCase().startsWith("a")){
                System.out.println("- " + n);
            }
        }
    }
}
