class Makine {
    String targa;
    String marka;

    Klient klient;              // lidhje 1 me 1 me klientin
    VendParkimi vendParkimi;    // vendi ku eshte parkuar makina

    public Makine(String targa, String marka) {
        this.targa = targa;
        this.marka = marka;
    }

    public void shfaqKlientin() {
        if (klient != null) {
            System.out.println("Makina " + targa + " i perket klientit " + klient.emer);
        } else {
            System.out.println("Makina nuk ka klient.");
        }
    }
}