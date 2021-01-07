import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
    private JFrame frame;
    private JTextField sisi1, sisi2, sisi3, sisi4;
    private JButton area, vol, back;
    private JTextArea hasilLuas, hasilVol;
    
    public Kubus()
    {
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
        frame = new JFrame("Bangun Ruang Kubus");
        frame.setResizable(false); //Kunci panjang lebar program
        frame.setSize(340,260);
        
        //Icon program dan warna program                
        ImageIcon image = new ImageIcon("icon.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(78, 179, 255));
        
        JPanel panel = (JPanel)frame.getContentPane();
        panel.setBorder(BorderFactory.createLineBorder(Color.blue, 5));//Border untuk program
        panel.setLayout(null);
        
        //Label
        JLabel labelKet = new JLabel("Variabel yang dibutuhkan :");
        JLabel labelSisi1 = new JLabel("Sisi");
        JLabel cm1 = new JLabel("cm");
        JLabel cm5 = new JLabel("cm^2");
        JLabel cm6 = new JLabel("cm^3");
        
        sisi1 = new JTextField(20);
        
        //tombol
        area = new JButton("Luas");
        area.setBackground(new Color(221, 128, 255));
        area.setFocusable(false);
        area.setBorder(BorderFactory.createEtchedBorder());
        vol = new JButton("Volume");
        vol.setBackground(new Color(221, 128, 255));
        vol.setFocusable(false);
        vol.setBorder(BorderFactory.createEtchedBorder());
        back = new JButton("Back");
        back.setFocusable(false);
        
        //Area text
        hasilLuas = new JTextArea(" ");
        hasilVol = new JTextArea(" ");
        
        //tambah
        panel.add(labelKet);
        panel.add(labelSisi1);
        panel.add(sisi1);
        panel.add(cm1);
        panel.add(cm5);
        panel.add(cm6);
        panel.add(area);
        panel.add(vol);
        panel.add(back);
        panel.add(hasilLuas);
        panel.add(hasilVol);
        
        //posisi
        labelKet.setBounds(20,10,200,20);
        labelSisi1.setBounds(20,40,200,20);
        sisi1.setBounds(150,45,120,20);
        cm1.setBounds(280,40,100,20);
        cm5.setBounds(110,120,50,20);
        cm6.setBounds(240,120,50,20);
        area.setBounds(40,80,110,30);
        vol.setBounds(170,80,110,30);
        back.setBounds(125,180,70,20);
        hasilLuas.setBounds(55,120,50,30);
        hasilVol.setBounds(185,120,50,30);
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
    public double getLuasPermukaan()
    {
        return this.luasPermukaan;
    }
    
    @Override
    public double getVolume()
    {        
        return this.volume;    
    }
    
    public void aksiReaksi()
    {
        area.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                {
                    sisi = Double.parseDouble(sisi1.getText());
                    luasPermukaan();
                    hasilLuas.setText(Double.toString(getLuasPermukaan()));
                }
            }
        );
        
        vol.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                { 
                    sisi = Double.parseDouble(sisi1.getText());
                    volume();
                    hasilVol.setText(Double.toString(getVolume()));
                }
            }
        );
        
        back.addActionListener(
            new ActionListener()
            {
                public void actionPerformed(ActionEvent event)
                { 
                    Toolkit.getDefaultToolkit().beep();
                    frame.setVisible(false);
                }
            }
        );
    }
}