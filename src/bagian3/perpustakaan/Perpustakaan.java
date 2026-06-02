package bagian3.perpustakaan;
import java.util.ArrayList;
public class Perpustakaan {
    private final ArrayList<Buku>koleksi = new ArrayList<>();
    
    public void tambahbuku(Buku buku){
        koleksi.add(buku);
    }
    
    public void tampilkankoleksi(){
        System.out.println("==Koleksi Perpustakaan==");
        for(int i=0;i<koleksi.size(); i++){
            Buku b = koleksi.get(i);
            System.out.println((i+1)+ "."+ b.info());
        }
    }
    
    public void pinjambuku(String judul){
    for (Buku b : koleksi){
        if (b.getJudul().equals(judul)){
            if (b.isDipinjam()){
                System.out.println(judul + " Sedang Dipinjam");
            } else {
                b.setDipinjam(true); 
                System.out.println(judul + " Berhasil Dipinjam");
            }
            return;
        }
    }
    System.out.println("Buku " + judul + " tidak ditemukan.");
}
 
    public void kembalikanBuku(String judul) {
    for (Buku b : koleksi) {
        if (b.getJudul().equals(judul)) {
            if (b.isDipinjam()) {
                b.setDipinjam(false);
                System.out.println(judul + " Berhasil Dikembalikan.");
            } else {
                System.out.println(judul + " sudah berada di perpustakaan (tidak sedang dipinjam).");
            }
            return;
        }
    }
    System.out.println("Buku " + judul + " tidak ditemukan.");
}

public void cariPenulis(String penulis) {
    System.out.println("== Hasil Pencarian Buku Karya: " + penulis + " ==");
    boolean ditemukan = false;
    
    for (Buku b : koleksi) {
        if (b.getPenulis().toLowerCase().contains(penulis.toLowerCase())) {
            System.out.println("- " + b.getJudul() + " (" + b.getTahunTerbit() + ")");
            ditemukan = true;
        }
    }
    
    if (!ditemukan) {
        System.out.println("Tidak ada buku yang ditemukan dari penulis tersebut.");
    }
}

    public int jumlahTersedia(){
        int jumlah = 0;
        for(Buku b: koleksi){
            if(!b.isDipinjam()){
                jumlah++;
            }
        }
        return jumlah;
    }
}
