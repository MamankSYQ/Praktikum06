import java.util.Scanner;
public class MahasiswaDemo01 {
    public static void main(String[] args) {
        MahasiswaBerprestasi01 list = new MahasiswaBerprestasi01();
        Scanner sc = new Scanner(System.in);
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++){
            System.out.println("Data Mahasiswa ke-"+(i+1));

            System.out.print("NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Nama  : ");
            String nama = sc.nextLine();

            System.out.print("Kelas : ");
            String kelas = sc.nextLine();

            System.out.print("IPK   : ");
            String ip = sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("-------------------------------");
            list.tambah(new Mahasiswa01(nim, nama, kelas, ipk));
        }
        list.tampil();
        System.out.println("-----------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari: ");
        System.out.print("IPK : ");
        double cari = sc.nextDouble();
        System.out.println("-------------------------------");
        System.out.println("Menggunakan Sequential Searching");
        System.out.println("-------------------------------");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
        System.out.println("-------------------------------");
        System.out.println("Menggunakan Binary Search");
        System.out.println("-------------------------------");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}//m
