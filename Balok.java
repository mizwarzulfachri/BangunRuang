/**
 * Write a description of class Balok here.
 *
 * @author Toyly Ashyyev
 * @version 
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Balok extends BangunRuang {
    private JFrame frame;
    private double panjang, tinggi, lembar, luasPermukaan, volume;
    private JTextField pan, tin, lem;
    private JButton area, vol, back;
    private JTextArea hasilLuas, hasilVol;

    public Balok(){
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
        frame = new JFrame("Bangun Ruang Balok");
        frame.setSize(340,320);
        frame.setResizable(false);
        
        //Icon program dan warna program                
        ImageIcon image = new ImageIcon("icon.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(78, 179, 255)); 
       
        JPanel panel = (JPanel)frame.getContentPane();
        panel.setBorder(BorderFactory.createLineBorder(Color.blue, 5));
        panel.setLayout(null);
        JLabel labelKet = new JLabel("Variabel yang dibutuhkan :");
        JLabel labelPanjang = new JLabel("Panjang  ");
        JLabel labelLebar = new JLabel("Tinggi ");
        JLabel labelTinggi = new JLabel("Tinggi  ");
        JLabel cm1 = new JLabel("cm");
        JLabel cm2 = new JLabel("cm");
        JLabel cm3 = new JLabel("cm");
        JLabel cm4 = new JLabel("cm^2");
        JLabel cm5 = new JLabel("cm^3");
        
        pan = new JTextField(20);
        tin = new JTextField(20);
        lem = new JTextField(20);
        
        area = new JButton("Luas");
        area.setBackground(new Color(221, 128, 255));
        area.setBorder(BorderFactory.createEtchedBorder());
        vol = new JButton("Volume");
        vol.setBackground(new Color(221, 128, 255));
        vol.setBorder(BorderFactory.createEtchedBorder());
        back = new JButton("Back");
        back.setBorder(BorderFactory.createEtchedBorder());
        
        hasilLuas = new JTextArea(" ");
        hasilVol = new JTextArea(" ");
        
        panel.add(labelKet);
        panel.add(labelPanjang);
        panel.add(labelLebar);
        panel.add(labelTinggi);
        panel.add(pan);
        panel.add(tin);
        panel.add(lem);
        panel.add(cm1);
        panel.add(cm2);
        panel.add(cm3);
        panel.add(cm4);
        panel.add(cm5);
        panel.add(area);
        panel.add(vol);
        panel.add(back);
        panel.add(hasilLuas);
        panel.add(hasilVol);
        
        labelKet.setBounds(20,10,200,20);
        labelPanjang.setBounds(20,40,200,20);
        labelLebar.setBounds(20,70,200,20);
        labelTinggi.setBounds(20,100,200,20);
        tin.setBounds(150,40,120,20);
        pan.setBounds(150,70,120,20);
        lem.setBounds(150,100,120,20);
        cm1.setBounds(280,40,100,20);
        cm2.setBounds(280,70,100,20);
        cm3.setBounds(280,100,100,20);
        cm4.setBounds(110,180,50,20);
        cm5.setBounds(240,180,50,20);
        area.setBounds(40,140,110,30);
        vol.setBounds(170,140,110,30);
        back.setBounds(125,240,70,20);
        hasilLuas.setBounds(55,180,50,30);
        hasilVol.setBounds(185,180,50,30);
    }
    
    public void luasPermukaan()
    {
        luasPermukaan = ((2*((0.5)*this.panjang*this.tinggi))+(3*(this.tinggi*this.lembar)));
    }
    
    public void volume()
    {
        volume = (((0.5)*this.panjang*this.tinggi)*this.lembar);
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
                    tinggi = Double.parseDouble(tin.getText());
                    panjang = Double.parseDouble(pan.getText());
                    lembar = Double.parseDouble(lem.getText());
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
                    tinggi = Double.parseDouble(tin.getText());
                    panjang = Double.parseDouble(pan.getText());
                    lembar = Double.parseDouble(lem.getText());
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
                    frame.setVisible(false);
                }
            }
        );
    }
}