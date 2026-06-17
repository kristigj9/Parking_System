## Class Diagram - Sistemi i Menaxhimit të Parkimit


class Perdorues {
- int idPerdorues
- String emer
- String mbiemer
- String email
- String telefon

    + regjistrohu()
    + login()
}

class Klient {
- int idKlienti
- List~Makine~ makinat

    + paguaj()
    + kerkoRegjistrimHyrje()
    + kerkoRegjistrimDalje()
}

class Roje {
- int idRoja

    + kontrolloPagesen()
    + lexoVendeTeLira()
    + aprovoKerkeseHyrje()
    + regjistroHyrje()
    + regjistroDalje()
}

class Makine {
- String targa
- String marka
}

class Pagesa {
- int idKerkese
- LocalDateTime dataOra
- String statusi

    + bejPagese()
    + leshoKupon()
}

class VendParkimi {
- int idVend
- int numriVendit
- String statusi
}

class Parkim {
- int idParkim
- int kati
- List~VendParkimi~ vendet
- String statusi

    + regjistroHyrje()
    + regjistroDalje()
    + llogaritDisponibilitet()
}