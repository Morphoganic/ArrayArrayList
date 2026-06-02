package bagian3.perpustakaan;

public class MainPerpustakaan {
    public static void main(String[] agrs){
        Perpustakaan perpus = new Perpustakaan();

        perpus.tambahbuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahbuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahbuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));

        perpus.tampilkankoleksi();
        System.out.println();


        perpus.pinjambuku("Bumi Manusia");
        System.out.println("Buku Tersedia: " + perpus.jumlahTersedia());
        System.out.println();

        System.out.println("--- Menguji Fitur Pengembalian Buku ---");
        perpus.kembalikanBuku("Bumi Manusia");
        System.out.println("Buku Tersedia setelah dikembalikan: " + perpus.jumlahTersedia());
        System.out.println();

        System.out.println("--- Menguji Fitur Cari Penulis ---");
        perpus.cariPenulis("Andrea Hirata");
    }
}