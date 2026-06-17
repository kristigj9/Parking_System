public class Main {
    public static void main(String[] args) {

        Makine makina1 = new Makine("AA123BB", "Benz");

        Klient klienti = new Klient(
                1, 101,
                "Ardi", "Hoxha",
                "ardi@email.com", "0690000000",
                makina1
        );

        Roje roja = new Roje(
                2, 201,
                "Bledi", "Kola",
                "bledi@email.com", "0680000000"
        );

        Parkim parkim = new Parkim(1, 0);

        parkim.shtoVend(new VendParkimi(1, 1));
        parkim.shtoVend(new VendParkimi(2, 2));
        parkim.shtoVend(new VendParkimi(3, 3));

        Pagesa pagesa = new Pagesa(1001);

        klienti.regjistrohu();
        klienti.login();

        klienti.kerkoRegjistrimHyrje();

        roja.login();
        roja.lexoVendeTeLira(parkim);
        roja.aprovoKerkeseHyrje();
        roja.regjistroHyrje(parkim, makina1);

        klienti.paguaj(pagesa);
        roja.kontrolloPagesen(pagesa);

        klienti.kerkoRegjistrimDalje();
        roja.regjistroDalje(parkim, makina1);

        roja.lexoVendeTeLira(parkim);
    }
}