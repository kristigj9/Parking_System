import java.util.ArrayList;

class Parkim {
    int idParkim;
    int kati;
    ArrayList<VendParkimi> vendet;
    String statusi;

    public Parkim(int idParkim, int kati) {
        this.idParkim = idParkim;
        this.kati = kati;
        this.vendet = new ArrayList<>();
        this.statusi = "Ka vende te lira";
    }

    public void shtoVend(VendParkimi vend) {
        vendet.add(vend);
    }

    public int llogaritDisponibilitet() {
        int count = 0;

        for (VendParkimi v : vendet) {
            if (v.statusi.equals("I lire")) {
                count++;
            }
        }

        statusi = (count == 0)
                ? "Te gjitha vendet jane te zena"
                : "Ka vende te lira";

        return count;
    }

    public void regjistroHyrje(Makine makina) {
        if (makina.vendParkimi != null) {
            System.out.println("Makina eshte tashme e regjistruar.");
            return;
        }

        for (VendParkimi v : vendet) {
            if (v.statusi.equals("I lire")) {
                v.statusi = "I zene";
                v.makine = makina;
                makina.vendParkimi = v;

                System.out.println("Makina " + makina.targa +
                        " hyri ne vendin " + v.numriVendit);
                return;
            }
        }

        System.out.println("Nuk ka vende te lira.");
    }

    public void regjistroDalje(Makine makina) {
        if (makina.vendParkimi == null) {
            System.out.println("Makina nuk eshte e regjistruar ne parkim.");
            return;
        }

        VendParkimi v = makina.vendParkimi;

        v.statusi = "I lire";
        v.makine = null;
        makina.vendParkimi = null;

        System.out.println("Makina " + makina.targa +
                " doli nga vendi " + v.numriVendit);
    }
}