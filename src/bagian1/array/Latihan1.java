package bagian1.array;

public class Latihan1 {
       public static void main(String[] agrs){
           //cara 1 deklarasi isi  per indeks
           int[] nilai = new int[5];
                   nilai[0] = 80;
                   nilai[1] = 75;
                   nilai[2] = 90;
                   nilai[3] = 60;
                   nilai[4] = 85;
                   nilai[5] = 10;
                   
           //cara 2 langsung diisi saat dibuat
           String[] nama = {"Andi","Budi","Citra"};
           
           System.out.println("Nilai Pertama :" + nilai[0]);
           System.out.println("Nilai Ketiga :" + nilai[2]);
           System.out.println("Mahasiswa ke-2 :" + nilai[1]);
           System.out.println("Jumlah Nilai :" + nilai.length);
           System.out.println("Mahasiswa ke-5 :" + nilai[5]);
       }
}
