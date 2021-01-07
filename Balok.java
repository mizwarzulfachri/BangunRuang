                                                               
/**
 * Write a description of class Balok here.
 *
 * @author Toyly Ashyyev
 * @version (a version number or a date)
 */
public class Balok extends BangunRuang
{
    private int lebar, panjang, tinggi, volume, luasPermukaan;
    
    public Balok()
    {
        
    }
    
    public void luasPermukaan() 
    {
        luasPermukaan = lebar * panjang;
    }
        
    public void volume()
    {
        volume = luasPermukaan * tinggi; 
    }     
    
    @Override
    public double getLuasPermukaan() 
    {
        return luasPermukaan;
    }
    
    @Override
    public double getVolume()
    {
        return volume; 
    }     
}