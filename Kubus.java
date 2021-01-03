
/**
 * Write a description of class Kubus here.
 *
 * @author (Asdar Rasyid)
 * @version (a version number or a date)
 */
public class Kubus extends BangunRuang
{
    // instance variables - replace the example below with your own
    private int sisi;
    //private int volume;
    //private int luasPermukaan;
    
    public void Kubus(int sisi)
    {
        this.sisi = sisi;
    }
    
    @Override
    public void volume()
    {
        volume = (int) Math.pow(sisi, 3);
    }
    
    @Override    
    public void luasPermukaan()
    {
        luasPermukaan = (int) Math.pow(sisi,2) * 6;
    }    
}