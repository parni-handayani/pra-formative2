public class Test6 {
    public static void main(String[] args) {
        Sepeda sepeda = new Sepeda("Sepeda");
        SepedaMotor sepedaMotor = new SepedaMotor("Sepeda Motor");
        Mobil mobil = new Mobil("Mobil");
        Becak becak = new Becak("Becak");
        
        System.out.println("Sepeda memiliki: " + sepeda.getJumlahRoda() + " roda");
        System.out.println("Sepeda motor memiliki: " + sepedaMotor.getJumlahRoda() + " roda");
        System.out.println("Mobil memiliki: " + mobil.getJumlahRoda() + " roda");
        System.out.println("Becak memiliki: " + becak.getJumlahRoda() + " roda");

        String namaSepeda = sepeda.getName();
        Boolean tentangSepeda = sepeda.getMemilikiMesinPembakaran() && sepeda.getMemilikiPolusi();
        hasil(namaSepeda, tentangSepeda);

        String namaSepedaMotor = sepedaMotor.getName();
        Boolean tentangSepedaMotor = sepedaMotor.getMemilikiMesinPembakaran() && sepedaMotor.getMemilikiPolusi();
        hasil(namaSepedaMotor, tentangSepedaMotor);

        String namaMobil = mobil.getName();
        boolean tentangMobil = mobil.getMemilikiMesinPembakaran() && mobil.getMemilikiPolusi();
        hasil(namaMobil, tentangMobil);

        String namaBecak = becak.getName();
        boolean tentangBecak = becak.getMemilikiMesinPembakaran() && becak.getMemilikiPolusi();
        hasil(namaBecak, tentangBecak);
    }


    static void hasil (String nama, Boolean about){
        if (about == true){
            System.out.println(nama + " memiliki mesin pembakaran dan menghasilkan polusi");
        } else {
            System.out.println(nama + " tidak memiliki mesin pembakaran dan tidak menghasilkan polusi");
        }
    }
}
