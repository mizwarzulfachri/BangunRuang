
/**
 * Write a description of class Kubus here.
 *
 * @author (Asdar Rasyid)
 * @version (a version number or a date)
 */
public class Kubus extends BangunRuang
{
    // instance variables - replace the example below with your own
    private double sisi, volume, luasPermukaan;
    
    public Kubus()
    {
        
    }
        
    public void volume()
    {
        volume = (int) Math.pow(sisi, 3);
    }
       
    public void luasPermukaan()
    {
        luasPermukaan = (int) Math.pow(sisi,2) * 6;
    }   
    
    @Override
    public double getVolume()
    {
        return volume;
    }
    
    @Override    
    public double getLuasPermukaan()
    {
        return luasPermukaan;
    } 
}