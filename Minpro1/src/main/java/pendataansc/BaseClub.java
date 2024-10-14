package pendataansc;

public abstract class BaseClub {
    private final String namaKlub;
    private String penanggungjawab;
    private final int maksAnggota;

    public BaseClub(String namaKlub, String penanggungjawab, int maksAnggota) {
        this.namaKlub = namaKlub;
        this.penanggungjawab = penanggungjawab;
        this.maksAnggota = maksAnggota;
    }

    public String getNamaKlub() {
        return namaKlub;
    }

    public String getPenanggungJawab() {
        return penanggungjawab;
    }

    public void setPenanggungJawab(String penanggungjawab) {
        this.penanggungjawab = penanggungjawab;
    }

    public int getMaksAnggota() {
        return maksAnggota;
    }
    
    public abstract void daftar();

    public abstract void hapus();

    public abstract void perbarui();
}
