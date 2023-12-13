public class Test6 {
    public static void main(String[] args) {
        Sepeda sepeda = new Sepeda("Sepeda");
        SepedaMotor sepedaMotor = new SepedaMotor("Sepeda Motor");
        Mobil mobil = new Mobil("Mobil");
        Becak becak = new Becak("Becak");
        
        String namaSepeda = sepeda.getName();
        Integer rodaSepeda = sepeda.getJumlahRoda();
        Boolean tentangSepeda = sepeda.getMemilikiMesinPembakaran() && sepeda.getMemilikiPolusi();
        hasil(namaSepeda, rodaSepeda, tentangSepeda);

        String namaSepedaMotor = sepedaMotor.getName();
        Integer rodaSepedaMotor = sepedaMotor.getJumlahRoda();
        Boolean tentangSepedaMotor = sepedaMotor.getMemilikiMesinPembakaran() && sepedaMotor.getMemilikiPolusi();
        hasil(namaSepedaMotor, rodaSepedaMotor, tentangSepedaMotor);

        String namaMobil = mobil.getName();
        Integer rodaMobil = mobil.getJumlahRoda();
        boolean tentangMobil = mobil.getMemilikiMesinPembakaran() && mobil.getMemilikiPolusi();
        hasil(namaMobil, rodaMobil, tentangMobil);

        String namaBecak = becak.getName();
        Integer rodaBecak = becak.getJumlahRoda();
        boolean tentangBecak = becak.getMemilikiMesinPembakaran() && becak.getMemilikiPolusi();
        hasil(namaBecak, rodaBecak, tentangBecak);
    }


    static void hasil (String nama, Integer roda, Boolean about){
        if (about == true){
            System.out.println(nama + " memiliki " + roda + " roda, mesin pembakaran dan menghasilkan polusi");
        } else {
            System.out.println(nama + " memiliki " + roda + " roda dan tidak memiliki mesin pembakaran juga tidak menghasilkan polusi");
        }
    }
}
