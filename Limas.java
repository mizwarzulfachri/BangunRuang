
/**
 * Write a description of class Limas here.
 *
 * @author Mizwar Zulfachri
 * @version (a version number or a date)
 */
public class Limas extends BangunRuang {
    private double panjang;
    private double lebar;
    private double tinggi;

    public Limas(double panjang, double lebar, double tinggi) {
        super();
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    @Override
    public void luasPermukaan(){
        luasPermukaan = lebar * panjang;
    }
    
    @Override
    public void volume(){        
        volume = (1/3) * luasPermukaan * tinggi;    
    }
}
