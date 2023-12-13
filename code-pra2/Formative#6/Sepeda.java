public class Sepeda {
    private String name;
    protected Integer roda;
    protected Boolean mesinPembakaran;
    protected Boolean polusi;

    public Sepeda(String nama){
        this.name = nama;
        this.roda = 2;
        this.mesinPembakaran = false;
        this.polusi = false;
    }

    public String getName(){
        return name;
    }

    public Integer getJumlahRoda(){
        return roda;
    }
    
    public Boolean getMemilikiMesinPembakaran(){
        return mesinPembakaran;
    }

    public Boolean getMemilikiPolusi(){
        return polusi;
    }
   
}

class SepedaMotor extends Sepeda {
    public SepedaMotor(String nama){
        super(nama);
    }

    @Override
    public Boolean getMemilikiMesinPembakaran(){
        return mesinPembakaran = true;
    }

    @Override
    public Boolean getMemilikiPolusi(){
        return polusi = true;
    }

}

class Mobil extends Sepeda{
    public Mobil(String nama){
        super(nama);
    }

    @Override
    public Integer getJumlahRoda(){
        return roda * 2;
    }

    @Override
    public Boolean getMemilikiMesinPembakaran(){
        return mesinPembakaran = true;
    }

    @Override
    public Boolean getMemilikiPolusi(){
        return polusi = true;
    }
}

class Becak extends Sepeda{
    public Becak(String nama){
        super(nama);
    }

    @Override
    public Integer getJumlahRoda(){
        return roda * 3/2;
    }

    @Override
    public Boolean getMemilikiMesinPembakaran(){
        return mesinPembakaran;
    }

    @Override
    public Boolean getMemilikiPolusi(){
        return polusi;
    }
}
