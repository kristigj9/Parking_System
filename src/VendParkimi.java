public class VendParkimi {
    int idVend;
    int numriVendit;
    String statusi;

    Makine makine;

    public VendParkimi(int idVend, int numriVendit) {
        this.idVend = idVend;
        this.numriVendit = numriVendit;
        this.statusi = "I lire";
        this.makine = null;
    }
}