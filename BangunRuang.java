/**
 * Write a description of class BangunRuang here.
 *
 * @author Azzahra Geubrina
 * @version (a version number or a date)
 */
public abstract class BangunRuang
{
    // instance variables - replace the example below with your own 
    public double luasPermukaan;
    public double volume;
    
    /**
     * method constructor 
     */    
    public double getLuasPermukaan()
    {
        luasPermukaan();
        return luasPermukaan;
    }
    
    public double getVolume()
    {
        volume();
        return volume;
    }
    
    /**
     * method abstract yang harus di override oleh subclass
     */
    public abstract void luasPermukaan();
     
    /**
     * method abstract yang harus di override oleh subclass
     */
    public abstract void volume();
}