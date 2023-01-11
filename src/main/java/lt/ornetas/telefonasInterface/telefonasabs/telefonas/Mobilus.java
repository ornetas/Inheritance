package lt.ornetas.telefonasInterface.telefonasabs.telefonas;

public class Mobilus implements telefonas {
    private String simNr;
    private int nuotraukuSk = 0;
    private String numeris;
    private String melodija;

    public Mobilus(String numeris, String simNr) {
        this.numeris = numeris;
        this.simNr = simNr;
    }

    public void fotografuok() {
        this.nuotraukuSk++;
    }

    public String getSimNr() {
        return simNr;
    }

    public String getMelodija() {
        return melodija;
    }

    public void setMelodija(String melodija) {
        this.melodija = melodija;
    }

    @Override
    public void paskambink(String telefonoNumeris) {
        System.out.println(String.format("Abonementas %s skambina i %s",
                this.numeris,
                telefonoNumeris
        ));

    }

    @Override
    public String toString() {
        return String.format("Mobilus[numeris: %s,sim nr: %s, nuotraukos: %s]",
                this,numeris,
                this.simNr,
               this.melodija,
                this.nuotraukuSk);
    }


}
