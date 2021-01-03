/**
 * Write a description of class Bola here.
 *
 * @author Jessy Hanifiah
 * @version Projek Praktikum PBO
 */
public class Bola extends BangunRuang
{
    // instance variables - replace the example below with your own
    private double hasil;
    private double r;

    /**
     * Constructor for objects of class Bola
     */
    public Bola(double hasil)
    {
        // initialise instance variables
        super();
        this.hasil = hasil;
    }

    /**
     * method yang mengubah volume sesuai dengan bangun ruang
     */
    @Override
    public void volume()
    {
        super.volume = 4/3 * 3.14 * Math.pow(r,3);
    }
    
    /**
     * 
     */
    @Override
    public void luasPermukaan()
    {
        super.luasPermukaan = 4 * 3.14 * Math.pow(r,2);
    }
    
}