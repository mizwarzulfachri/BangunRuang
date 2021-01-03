                                                               
/**
 * Write a description of class Balok here.
 *
 * @author Toyly Ashyyev
 * @version (a version number or a date)
 */
public class Balok extends BangunRuang
{
    private int lebar, panjang, tinggi ;
    
    public Balok(int lebar, int panjang, int tinggi)
    {
        super();
        this.lebar = lebar;
        this.panjang = panjang;
        this.tinggi = tinggi;
    }
    
    @Override
    public void luasPermukaan() 
    {
        luasPermukaan = lebar * panjang;
    }
    
    @Override
    public void volume()
    {
        volume = getLuasPermukaan() * tinggi; 
    }     
}