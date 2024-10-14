package pendataansc;

public class SportClub extends BaseClub {
    private final String jenisOlahraga;

    public SportClub(String namaKlub, String penanggungjawab, int maksAnggota, String jenisOlahraga) {
        super(namaKlub, penanggungjawab, maksAnggota);
        this.jenisOlahraga = jenisOlahraga;
    }

    public String getJenisOlahraga() {
        return jenisOlahraga;
    }

    @Override
    public void daftar() {
        System.out.println("+-----------------------------------------------------+");
        System.out.println("  Study Club olahraga " + getNamaKlub() + " terdaftar  ");
        System.out.println("+-----------------------------------------------------+");
    }

    @Override
    public void hapus() {
        System.out.println("+-----------------------------------------------------+");
        System.out.println("   Study Club olahraga " + getNamaKlub() + " dihapus   ");
        System.out.println("+-----------------------------------------------------+");
    }

    @Override
    public void perbarui() {
        System.out.println("+------------------------------------------------------+");
        System.out.println("  Study Club olahraga " + getNamaKlub() + " diperbarui  ");
        System.out.println("+------------------------------------------------------+");
    }
}
