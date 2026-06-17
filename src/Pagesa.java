
import java.time.LocalDateTime;

class Pagesa {
    int idKerkese;
    LocalDateTime dataOra;
    String statusi;

    public Pagesa(int idKerkese) {
        this.idKerkese = idKerkese;
        this.dataOra = LocalDateTime.now();
        this.statusi = "E papaguar";
    }

    public void bejPagese() {
        statusi = "E paguar";
        System.out.println("Pagesa u krye me sukses.");
        leshoKupon();
    }

    public void leshoKupon() {
        System.out.println("Kuponi tatimor u leshua.");
    }
}
