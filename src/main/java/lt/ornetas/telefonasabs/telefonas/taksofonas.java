package lt.ornetas.telefonasabs.telefonas;

import java.math.BigDecimal;

public class taksofonas extends telefonas {


    private BigDecimal piniguLikutis;
    private final BigDecimal SKAMBUCIO_KAINA = BigDecimal.valueOf(0.25);

    public taksofonas(Double pinigelis) {
        super("[taksofonas]");
        this.piniguLikutis = new BigDecimal(pinigelis);

    }

    @Override
    public void paskambink(String telefonoNumeris) {
        if (piniguLikutis.compareTo(SKAMBUCIO_KAINA) > -1) {
  //          super.paskambink(telefonoNumeris);
            System.out.println(String.format("Abonementas %s skambina i %s",
                    super.getNumeris(),
                    telefonoNumeris
            ));


            this.piniguLikutis = this.piniguLikutis.subtract(SKAMBUCIO_KAINA);

        } else {
            System.out.println("SKAMBUCIUI NEPAKANKA PINIGU, PRASOME PAPILDYTI SASKAITA");
            System.out.println("PINIGU LIKUTIS YRA" + this.piniguLikutis);
        }


    }

    public BigDecimal getPiniguLikutis() {
        return piniguLikutis;
    }

    public void setPiniguLikutis(BigDecimal piniguLikutis) {
       // this.piniguLikutis = BigDecimal.valueOf(piniguLikutis).add(this.piniguLikutis);

    }
}
