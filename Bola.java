/**
 * Write a description of class Bola here.
 *
 * @author Jessy Hanifiah
 * @version Projek Praktikum PBO
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Bola extends BangunRuang
{
    // instance variables - replace the example below with your own
    private double r, luasPermukaan, volume;
    private JFrame frame;
    private JTextArea hasilLP, hasilV; 
    private JButton area, vol, back;
    private JTextField radius;

    /**
     * Constructor for objects of class Bola
     */
    public Bola()
    {
        // initialise instance variables
        makeFrame();
        frame.setVisible(true);
        aksiReaksi();
    }
    
    public void setVisible(boolean visible)
    {
        frame.setVisible(visible);
    }
    
    private void makeFrame()
    {
        frame = new JFrame("Bangun Ruang BOLA");
        frame.setSize(340,260);
        
        JPanel panel = (JPanel)frame.getContentPane();
        panel.setLayout(null);
        JLabel labelKet = new JLabel("Variabel yang dibutuhkan :");
        JLabel labelRad = new JLabel("jari jari ");
        JLabel cm1 = new JLabel("cm");
        JLabel cm2 = new JLabel("cm^2");
        JLabel cm3 = new JLabel("cm^3");
        
        radius = new JTextField(20);
        
        area = new JButton("Luas");
        vol = new JButton("Volume");
        back = new JButton("Back");
        
        hasilLP = new JTextArea(" ");
        hasilV = new JTextArea(" ");
        
        
        panel.add(labelKet);
        panel.add(labelRad);
        panel.add(radius);
        panel.add(cm1);
        panel.add(cm2);
        panel.add(cm3);
        panel.add(area);
        panel.add(vol);
        panel.add(back);
        panel.add(hasilLP);
        panel.add(hasilV);
        
        labelKet.setBounds(20,10,200,20);
        labelRad.setBounds(20,40,200,20);
        radius.setBounds(150,40,120,20);
        cm1.setBounds(280,40,100,20);
        cm2.setBounds(110,120,50,20);
        cm3.setBounds(240,120,50,20);
        area.setBounds(40,80,110,30);
        vol.setBounds(170,80,110,30);
        back.setBounds(125,180,70,20);
        hasilLP.setBounds(55,120,50,30);
        hasilV.setBounds(185,120,50,30);
    }
    
    public double getVolume()
    {
        return this.volume;
    }
    
    public double getLuasPermukaan()
    { 
        return this.luasPermukaan;
    }
      
    /**
     * method yang mengubah volume sesuai dengan bangun ruang
     */
    public void volume()
    {
        this.volume = 1.3333333333 * 3.14 * Math.pow(this.r,3);
    }
    
    /**
     * 
     */
    public void luasPermukaan()
    {
        this.luasPermukaan = 4 * 3.14 * Math.pow(this.r,2);
    }
    
    public void aksiReaksi()
    {
        area.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    r = Double.parseDouble(radius.getText());
                    luasPermukaan();
                    hasilLP.setText(Double.toString(getLuasPermukaan()));
                }
            }
        );
        
        vol.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                { 
                    r = Double.parseDouble(radius.getText());
                    volume();
                    hasilV.setText(Double.toString(getVolume()));
                }
            }
        );
        
        back.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                { 
                    frame.setVisible(false);
                }
            }
        );
    }
    
}
