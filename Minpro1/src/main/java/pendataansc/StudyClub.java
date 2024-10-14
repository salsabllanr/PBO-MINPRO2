package pendataansc;

public class StudyClub extends BaseClub {
    private final String mataKuliah;

    public StudyClub(String namaKlub, String penanggungjawab, String mataKuliah, int maksAnggota) {
        super(namaKlub, penanggungjawab, maksAnggota);
        this.mataKuliah = mataKuliah;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    @Override
    public void daftar() {
        System.out.println("+--------------------------------------------+");
        System.out.println("  Study Club " + getNamaKlub() + " terdaftar  ");
        System.out.println("+--------------------------------------------+");
    }

    @Override
    public void hapus() {
        System.out.println("+--------------------------------------------+");
        System.out.println("   Study Club " + getNamaKlub() + " dihapus   ");
        System.out.println("+--------------------------------------------+");
    }

    @Override
    public void perbarui() {
        System.out.println("+---------------------------------------------+");
        System.out.println("  Study Club " + getNamaKlub() + " diperbarui  ");
        System.out.println("+---------------------------------------------+");
    }
}