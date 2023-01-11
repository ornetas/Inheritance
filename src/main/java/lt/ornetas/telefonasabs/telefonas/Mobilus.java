package lt.ornetas.telefonasabs.telefonas;

public class Mobilus extends telefonas {
    private String simNr;
    private int nuotraukuSk = 0;
    public Mobilus(String numeris, String simNr) {
        super(numeris);
        this.simNr = simNr;
    }
    public void fotografuok(){
        this.nuotraukuSk ++;
    }

    public String getSimNr() {
        return simNr;
    }

    public Mobilus(String numeris, int nuotraukuSk) {
        super(numeris);
        this.nuotraukuSk = nuotraukuSk;
    }

    @Override
    public void paskambink(String telefonoNumeris) {
        System.out.println(String.format("Abonementas %s skambina i %s",
        super.getNumeris(),
                telefonoNumeris
                ));

    }

    @Override
    public String toString() {
        return String.format("Mobilus[numeris: %s,sim nr: %s, nuotraukos: %s]",
                super.getNumeris(),
                this.simNr,
                super.getMelodija(),
                this.nuotraukuSk);
    }





}
