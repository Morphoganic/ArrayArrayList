package tugas;

public class MainTugas {
    public static void main(String[] args) {
        String[] mataKuliah = {"Pemrograman Berorientasi Objek", "Struktur Data", "Basis Data"};
        System.out.println("Daftar Mata Kuliah:");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }
        System.out.println();

        KelasKuliah kelas = new KelasKuliah();
        kelas.tambahMahasiswa(new Mahasiswa("Mama", "2410010159", 85.5));
        kelas.tambahMahasiswa(new Mahasiswa("Mimi", "2410010160", 58.0));
        kelas.tambahMahasiswa(new Mahasiswa("Momo", "2410010161", 75.0));
        kelas.tambahMahasiswa(new Mahasiswa("Rahmat", "2410010162", 45.5));
        kelas.tambahMahasiswa(new Mahasiswa("Siti", "2410010163", 90.0));

        System.out.println("Daftar Mahasiswa Awal:");
        kelas.tampilkanSemua();

        System.out.printf("Rata-Rata Nilai Kelas : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus: " + kelas.jumlahLulus());
        System.out.println();

        System.out.println("--- Menambahkan 1 Mahasiswa Baru ---");
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "2410010164", 65.0));

        System.out.println("Daftar Mahasiswa Terbaru:");
        kelas.tampilkanSemua();
        System.out.printf("Rata-Rata Nilai Terbaru : %.2f\n", kelas.hitungRataRata());
        System.out.println("Jumlah Mahasiswa Lulus Terbaru: " + kelas.jumlahLulus());
    }
}

