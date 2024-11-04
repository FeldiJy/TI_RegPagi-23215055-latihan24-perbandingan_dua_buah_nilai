import java.util.Scanner;

public class perbandingan_dua_buah_nilai {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ulangi;

        do {
            System.out.println("=======Program Perbandingan Nilai=======");
            
            // Meminta input nilai pertama
            System.out.print("Masukkan nilai pertama : ");
            int nilaiPertama = scanner.nextInt();
            
            // Meminta input nilai kedua
            System.out.print("Masukkan nilai kedua : ");
            int nilaiKedua = scanner.nextInt();
            
            // Menampilkan hasil perbandingan
            System.out.print("Hasil : ");
            if (nilaiPertama > nilaiKedua) {
                System.out.println(nilaiPertama + " Lebih besar dari " + nilaiKedua);
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println(nilaiPertama + " Lebih kecil dari " + nilaiKedua);
            } else {
                System.out.println(nilaiPertama + " Sama dengan " + nilaiKedua);
            }

            // Menanyakan apakah ingin mengulang aktivitas
            System.out.print("\nUlangi Aktivitas ? (Ya/Tidak) : ");
            ulangi = scanner.next();

        } while (ulangi.equalsIgnoreCase("Ya"));

        System.out.println("Program selesai.");
    }
}
