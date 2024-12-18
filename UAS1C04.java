// Bunga Aulia Sari, 244107060104, 04

import java.util.Scanner;

public class UAS1C04 {
    static int jumlahTim04 = (4 % 3) + 4;
    static String[] namaTim04 = new String[jumlahTim04];
    static int[][] skorTim04 = new int[jumlahTim04][2];
    static Scanner sc04 = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("=== MENU UTAMA ===");
            System.out.println("1. Input Data Skor Tim");
            System.out.println("2. Tampilkan Tabel Skor");
            System.out.println("3. Tentukan Juara");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int menu04 = sc04.nextInt();
            sc04.nextLine();

            switch (menu04) {
                case 1:
                    tambahDataSkorTim04();
                    break;
                case 2:
                    tampilkanDataSkor04();
                    break;
                case 3:
                    menentukanJuara04();
                    break;
                case 4:
                    System.out.println("Program selesai. Terima Kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Masukkan angka antara 1-4!");
            }
        }
    }

    public static void tambahDataSkorTim04() {
        for (int i04 = 0; i04 < jumlahTim04; i04++) {
            System.out.println("Masukkan nama tim ke-" + (i04 + 1) + ": ");
            namaTim04[i04] = sc04.nextLine();

            while (true) {
                System.out.println("Masukkan skor " + namaTim04[i04] + " untuk Level 1: ");
                skorTim04[i04][0] = sc04.nextInt();
                if (skorTim04[i04][0] >= 0) break;
                System.out.println("Skor harus bilangan positif atau 0. Coba lagi.");
            }

            if (skorTim04[i04][0] < 35) {
                skorTim04[i04][0] = 0;
            }

            while (true) {
                System.out.println("Masukkan skor " + namaTim04[i04] + " untuk Level 2: ");
                skorTim04[i04][1] = sc04.nextInt();
                if (skorTim04[i04][1] >= 0) break;
                System.out.println("Skor harus bilangan positif atau 0. Coba lagi.");
            }

            if (skorTim04[i04][1] < 35) {
                skorTim04[i04][1] = 0;
            }

            int totalSkor04 = skorTim04[i04][0] + skorTim04[i04][1];

            sc04.nextLine(); 
        }
    }

    public static void tampilkanDataSkor04() {
        System.out.println("\nTabel Skor Turnamen:");
        System.out.printf("%-20s %-10s %-10s %-15s\n", "Nama Tim", "Level 1", "Level 2", "Total Skor");
        System.out.println("-------------------------------------");

        for (int i04 = 0; i04 < jumlahTim04; i04++) {
            System.out.printf("%-20s %-10d %-10d %-15d\n", namaTim04[i04], skorTim04[i04][0], skorTim04[i04][1], totalSkor04);
        }
    }

    public static void menentukanJuara04(){
        
         

    }
}
