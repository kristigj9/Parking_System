class Roje extends Perdorues {
    int idRoja;

    public Roje(int idPerdorues, int idRoja, String emer, String mbiemer,
                String email, String telefon) {
        super(idPerdorues, emer, mbiemer, email, telefon);
        this.idRoja = idRoja;
    }

    public void kontrolloPagesen(Pagesa pagesa) {
        System.out.println("Statusi i pageses: " + pagesa.statusi);
    }

    public void lexoVendeTeLira(Parkim parkim) {
        System.out.println("Vende te lira: " + parkim.llogaritDisponibilitet());
    }

    public void aprovoKerkeseHyrje() {
        System.out.println("Roja aprovoi kerkesen per hyrje.");
    }

    public void regjistroHyrje(Parkim parkim, Makine makina) {
        parkim.regjistroHyrje(makina);
    }

    public void regjistroDalje(Parkim parkim, Makine makina) {
        parkim.regjistroDalje(makina);
    }
}