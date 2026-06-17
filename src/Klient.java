class Klient extends Perdorues {
    int idKlienti;
    Makine makina;

    public Klient(int idPerdorues, int idKlienti, String emer, String mbiemer,
                  String email, String telefon, Makine makina) {
        super(idPerdorues, emer, mbiemer, email, telefon);
        this.idKlienti = idKlienti;
        this.makina = makina;
    }

    public void paguaj(Pagesa pagesa) {
        pagesa.bejPagese();
    }

    public void kerkoRegjistrimHyrje() {
        System.out.println(emer + " kerkoi regjistrim hyrje per makinen " + makina.targa);
    }

    public void kerkoRegjistrimDalje() {
        System.out.println(emer + " kerkoi regjistrim dalje per makinen " + makina.targa);
    }
}