package lt.ornetas.telefonasabs.telefonas;

public class mainAbs {
    public static void main(String[] args) {

      //  telefonas telefonas01 = new telefonas("867869231");
        Mobilus mobilus01 = new Mobilus("867869235", "1234-1234-1234-1234");
        taksofonas taksofonas01 = new taksofonas(0.65);


//        telefonas01.setMelodija("lia-lia-lia");
//        System.out.println(telefonas01);

        mobilus01.fotografuok();
        mobilus01.fotografuok();
        mobilus01.fotografuok();
        mobilus01.setMelodija("Jazz melodija");
        System.out.println(mobilus01);
        System.out.println();
        mobilus01.paskambink("+11025458852");
        mobilus01.paskambink("340655412");
     //   telefonas01.paskambink("566454542");


        System.out.println();

        System.out.println(taksofonas01);
        taksofonas01.paskambink("8548555454");
        taksofonas01.paskambink("8548556456512");









    }
}
