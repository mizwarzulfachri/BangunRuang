/**
 * Write a description of class Bola here.
 *
 * @author Jessy Hanifiah
 * @version Projek Praktikum PBO
 */
public class Bola extends BangunRuang
{
    // instance variables - replace the example below with your own
    private double hasil, r, volume, luasPermukaan;

    /**
     * Constructor for objects of class Bola
     */
    public Bola()
    {
        // initialise instance variables
        
    }

    /**
     * method yang mengubah volume sesuai dengan bangun ruang
     */
    public void volume()
    {
        volume = 4/3 * 3.14 * Math.pow(r,3);
    }
    
    /**
     * 
     */
    public void luasPermukaan()
    {
        luasPermukaan = 4 * 3.14 * Math.pow(r,2);
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