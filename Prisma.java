
/**
 * Write a description of class Prisma here.
 *
 * @author (Anis Mahyatul Fauza)
 * @version (Project lab PBO)
 */
public class Prisma extends BangunRuang
{
    // instance variables - replace the example below with your own
    private double lebar;
    private double panjang;
    private double tinggi;
    
    public Prisma(double lebar, double panjang, double tinggi)
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
        volume = (1/2) * luasPermukaan * tinggi;    
    }
}
