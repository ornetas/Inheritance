package lt.ornetas.telefonasabs.telefonas;

public abstract class telefonas {

    private String numeris;
    private String melodija;

    public telefonas(String numeris) {
        this.numeris = numeris;
    }

    public abstract void paskambink(String telefonoNumeris);


//    public void paskambink(String telefonoNumeris){
//        System.out.println(String.format("Abonementas %s skambina i %s",
//        this.numeris,
//                telefonoNumeris
//                ));
//    }

    public String getNumeris() {
        return numeris;
    }

    public String getMelodija() {
        return melodija;
    }

    public void setMelodija(String melodija) {
        this.melodija = melodija;
    }

    @Override
    public String toString() {
        return String.format("Telefonas[numeris: %s, melodija: %s]",
        this.numeris,
        this.melodija);
    }
}
