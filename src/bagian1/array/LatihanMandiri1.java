package bagian1.array;

public class LatihanMandiri1 {
           public static void main(String[] agrs){
           //cara 1 deklarasi isi  per indeks
           double[] suhu = new double[6];
                   suhu[0] = 20;
                   suhu[1] = 30;
                   suhu[2] = 15;
                   suhu[3] = 35;
                   suhu[4] = 40;
                   suhu[5] = 25;
                   
                   int total = 0;
                   double max = suhu[0];
                   double min = suhu[0];
                   
                   for(double n: suhu){
                       total+=n;
                       
                       if(n>max){
                           max = n;
                       }
                       if(n<min){
                           min = n;
                       }
                   }
        
                double rata = (double) total/ suhu.length;
                System.out.println("Total   :"+total);
                System.out.println("Rata-Rata   :"+ rata);
                System.out.println("nilai terbesar   :"+ max);
                System.out.println("nilai terkecil   :"+ min);
                System.out.println("------------------------------------------");
                
                String[] hari = {"senin","selasa","rabu","kamis","jumat"};
                for(String n: hari){
                    if(n.length()>5){
                        System.out.println("Huruf lebih dari 5 adalah: "+ n);
                        System.out.println("------------------------------------------");
                    }
                }
                int[] angka = {4,8,15,16,23,42};
                for (int n: angka){
                    if(n %2 == 0){
                        System.out.println("Hasil Banyaknya angka genap: "+ n);   
                    }

                }
                System.out.println("------------------------------------------"); 
           }
           
}
