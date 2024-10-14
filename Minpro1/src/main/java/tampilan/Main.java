package tampilan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import pendataansc.BaseClub;
import pendataansc.SportClub;
import pendataansc.StudyClub;

public class Main {
    private static List<BaseClub> klubList = new ArrayList<>(); 
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        klubList.add(new SportClub("Basket", "Aldino", 20, "Bola Besar"));
        klubList.add(new StudyClub("Desain UI/UX", "Sopi", "UI/UX", 50));
        boolean running = true;

        while (running) {
            tampilkanMenuUtama();
            int opsi = getIntegerInput("Masukkan Pilihan Anda: ");
            
            switch (opsi) {
                case 1:
                    tambahKlubBaru();
                    break;
                case 2:
                    lihatSemuaKlub();
                    break;
                case 3:
                    updateKlubPilihan();
                    break;
                case 4:
                    hapusKlubPilihan();
                    break;
                case 0:
                    running = false;
                    tampilkanPesanSelesai();
                    break;
                default:
                    System.out.println("+=================================+");
                    System.out.println("|      PILIHAN TIDAK VALID!!!     |");
                    System.out.println("+=================================+");
            }
        }
    }

    private static void tampilkanMenuUtama() {
        System.out.println("+=================================+");
        System.out.println("|   Study Club Sistem Informasi   |");
        System.out.println("+=================================+");
        System.out.println("| [1] Tambah Club                 |");
        System.out.println("| [2] Lihat Study Club            |");
        System.out.println("| [3] Update Club                 |");
        System.out.println("| [4] Hapus Study Club            |");
        System.out.println("| [0] Keluar                      |");
        System.out.println("+=================================+");
    }

    private static void tambahKlubBaru() {
        System.out.print("Masukkan nama klub: ");
        String namaKlub = scanner.nextLine();
        System.out.print("Masukkan penanggung jawab: ");
        String penanggungjawab = scanner.nextLine();
        int maksAnggota = getIntegerInput("Masukkan maksimal anggota: ");
        int jenisKlub = getIntegerInput("Pilih jenis study club (1. Study Club, 2. Study Club Olahraga): ");
        
        if (jenisKlub == 1) {
            System.out.print("Masukkan nama mata kuliah: ");
            String mataKuliah = scanner.nextLine();
            klubList.add(new StudyClub(namaKlub, penanggungjawab, mataKuliah, maksAnggota));
        } else if (jenisKlub == 2) {
            System.out.print("Masukkan jenis study club olahraga: ");
            String jenisOlahraga = scanner.nextLine();
            klubList.add(new SportClub(namaKlub, penanggungjawab,maksAnggota, jenisOlahraga));
        } else {
            System.out.println("+---------------------------------+");
            System.out.println("| Jenis Study Club Tidak Valid!!! |");
            System.out.println("+---------------------------------+");
        }

        System.out.println("Study Club " + namaKlub + " telah ditambahkan.");
    }

    private static void lihatSemuaKlub() {
        if (klubList.isEmpty()) {
            System.out.println("+------------------------------------------------------+");
            System.out.println("|  Tidak ada klub yang tersedia untuk dilihat!!!       |");
            System.out.println("+------------------------------------------------------+");
            return;
        }
        System.out.println("+====================================+");
        System.out.println("|       DAFTAR STUDY CLUB            |");
        System.out.println("+====================================+");
        for (int i = 0; i < klubList.size(); i++) {
            System.out.println((i + 1) + ". " + klubList.get(i).getNamaKlub() + " (Penanggung jawab: " + klubList.get(i).getPenanggungJawab() + ")");
        }
    }

    private static void updateKlubPilihan() {
        lihatSemuaKlub();
        if (klubList.isEmpty()) {
            return;
        }

        int pilihanKlub = getIntegerInput("Pilih nomor Study Club yang ingin di-update: ");
        if (pilihanKlub < 1 || pilihanKlub > klubList.size()) {
            System.out.println("+---------------------------------+");
            System.out.println("|      Pilihan tidak valid!!!     |");
            System.out.println("+---------------------------------+");
            return;
        }

        BaseClub klubDipilih = klubList.get(pilihanKlub - 1);
        System.out.print("Masukkan Penanggung Jawab baru: ");
        String penanggungJawab = scanner.nextLine();
        klubDipilih.setPenanggungJawab(penanggungJawab);
        System.out.println("Study club " + klubDipilih.getNamaKlub() + " telah diperbarui.");
    }

    private static void hapusKlubPilihan() {
        lihatSemuaKlub();
        if (klubList.isEmpty()) {
            return;
        }

        int pilihanKlub = getIntegerInput("Pilih nomor Study Club yang ingin dihapus: ");
        if (pilihanKlub < 1 || pilihanKlub > klubList.size()) {
            System.out.println("+---------------------------------+");
            System.out.println("|      Pilihan tidak valid!!!     |");
            System.out.println("+---------------------------------+");
            return;
        }

        klubList.remove(pilihanKlub - 1);
        System.out.println("+---------------------------------+");
        System.out.println("|    Study Club Berhasil Dihapus  |");
        System.out.println("+---------------------------------+");
    }

    private static int getIntegerInput(String prompt) {
        int input = -1;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print(prompt);
                input = scanner.nextInt();
                scanner.nextLine(); // Mengonsumsi newline
                valid = true;
            } catch (Exception e) {
                System.out.println("Input tidak valid, masukkan angka!");
                scanner.nextLine(); // Clear input buffer
            }
        }
        return input;
    }

    private static void tampilkanPesanSelesai() {
        System.out.println("✦======================================================================✦");
        System.out.println("|                        PROGRAM TELAH SELESAI                         |");
        System.out.println("✦======================================================================✦");
        System.out.println("|           TERIMAKASIH TELAH MENGGUNAKAN PROGRAM SEDERHANA            |");
        System.out.println("|              YANG DISUSUN OLEH ADINDA SALSABILLA NAURA               |");
        System.out.println("|                         SISTEM INFORMASI A'23                        |");
        System.out.println("|                                  |||                                 |");
        System.out.println("|                         UNIVERSITAS MULAWARMAN                       |");
        System.out.println("✦======================================================================✦");
    }
}
