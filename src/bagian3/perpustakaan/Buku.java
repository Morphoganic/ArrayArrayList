
package bagian3.perpustakaan;

public class Buku {
    private String judul;
    private String penulis;
    private boolean dipinjam;
    private int tahunTerbit;
    
    public Buku(String judul,String penulis, int tahunTerbit){
        this.judul = judul;
        this.penulis = penulis;
        this.dipinjam = false;
        this.tahunTerbit = tahunTerbit;
    }
    
    public String getJudul(){
        return judul;
    }
    
    public String getPenulis(){
        return penulis;
    }
    
    public int getTahunTerbit() {
        return tahunTerbit;
    }
    
    public Boolean isDipinjam(){
        return dipinjam;
    }
    
    public void setDipinjam(boolean Dipinjam){
        this.dipinjam = Dipinjam;
    }
    
    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";
        return judul + " (" + tahunTerbit + ") oleh " + penulis + " [" + status + "]";
    }
}

