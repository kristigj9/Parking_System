import java.time.LocalDateTime;
import java.util.ArrayList;

class Perdorues {
    int idPerdorues;
    String emer;
    String mbiemer;
    String email;
    String telefon;

    public Perdorues(int idPerdorues, String emer, String mbiemer, String email, String telefon) {
        this.idPerdorues = idPerdorues;
        this.emer = emer;
        this.mbiemer = mbiemer;
        this.email = email;
        this.telefon = telefon;
    }

    public void regjistrohu() {
        System.out.println(emer + " u regjistrua ne sistem.");
    }

    public void login() {
        System.out.println(emer + " hyri ne sistem.");
    }
}