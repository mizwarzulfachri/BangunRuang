import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
/**
 * Write a description of class Limas here.
 *
 * @author Mizwar Zulfachri
 * @version (a version number or a date)
 */
public class Limas extends BangunRuang {
    private JFrame frame;
    private JTextField txtLebar, txtTinggi;
    private JButton LUAS, VOL, BACK;
    private JTextArea jawabanLuas, jawabanVol;
    private double lebar, tinggi, luasPermukaan, volume; //lebar sebagai alas    

    public Limas() {
        makeFrame();
        frame.setVisible(true);
        aksiReaksi();
    }
       
    public void makeFrame(){
        frame = new JFrame("Bangun Ruang Limas"); //Nama program
        frame.setSize(350, 350); //Panjang, lebar program
        frame.setResizable(false); //Kunci panjang lebar program, AKA hiding any incompetence
        
        //Icon program dan warna program                
        ImageIcon image = new ImageIcon("icon.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(78, 179, 255));        
                
        JPanel panel = (JPanel)frame.getContentPane();
        panel.setBorder(BorderFactory.createLineBorder(Color.blue, 5));//Border untuk program
        panel.setLayout(null);
        
        //Label
        JLabel labelKeterangan = new JLabel("Data yang dibutuhkan :");
        JLabel labelLebar = new JLabel("Alas");
        JLabel labelTinggi = new JLabel("Tinggi");
        JLabel cm = metricSystem();
        JLabel cm2 = metricSystem2();
        JLabel cm3 = metricSystem3();
        JLabel cm4 = metricSystem();
             
        //Text box
        txtLebar = new JTextField(20);
        txtTinggi = new JTextField(20);
        
        panel.add(labelKeterangan);
        panel.add(labelLebar);
        panel.add(labelTinggi);
        panel.add(txtLebar);
        panel.add(txtTinggi);
        
        //Tombol
        LUAS = new JButton("Luas"); 
        VOL = new JButton("Volume");
        BACK = new JButton("Back");
        LUAS.setBackground(new Color(221, 128, 255));//Warna tombol
        VOL.setBackground(new Color(221, 128, 255));
        LUAS.setBorder(BorderFactory.createEtchedBorder());//Border tombol
        VOL.setBorder(BorderFactory.createEtchedBorder());
        LUAS.setFocusable(false);//Menghilangkan kotak fokus
        VOL.setFocusable(false);
        BACK.setFocusable(false);
        panel.add(LUAS);
        panel.add(VOL);
        panel.add(BACK);
        
        //Kotak hasil
        jawabanLuas = new JTextArea(" "); 
        jawabanVol = new JTextArea(" ");
        
        panel.add(jawabanLuas);
        panel.add(jawabanVol);
                
        //Tambah, jika tidak add maka tidak akan muncul d-(・ω<)        
        panel.add(cm);
        panel.add(cm2);
        panel.add(cm3);
        panel.add(cm4);
        
        //Posisi
        labelKeterangan.setBounds(20, 15, 200, 20);//x, y, width, height
        labelLebar.setBounds(20, 45, 200, 20);//koordinat x, y, panjang, tinggi
        labelTinggi.setBounds(20, 75, 200, 20);
        txtLebar.setBounds(150, 45, 120, 20);
        txtTinggi.setBounds(150, 75, 120, 20);
        cm.setBounds(280, 45, 100, 20);
        cm4.setBounds(280, 75, 100, 20);
        cm2.setBounds(110, 180, 50, 20);
        cm3.setBounds(240, 180, 50, 20);
        LUAS.setBounds(40, 140, 110, 30); 
        VOL.setBounds(170, 140, 110, 30);
        BACK.setBounds(125, 240, 70, 20);
        jawabanLuas.setBounds(65, 185, 50, 30); 
        jawabanVol.setBounds(195, 185, 50, 30);
    }
    
    private static JLabel metricSystem(){
        //Mengurangi ketik ulang
        return new JLabel("cm");
    }
    
    private static JLabel metricSystem2(){
        //Mengurangi ketik ulang
        return new JLabel("cm^2");
    }
    
    private static JLabel metricSystem3(){
        //Mengurangi ketik ulang
        return new JLabel("cm^3");
    }
    
    public void aksiReaksi(){
        LUAS.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    lebar = Double.parseDouble(txtLebar.getText());
                    tinggi = Double.parseDouble(txtTinggi.getText());
                    luasPermukaan();
                    jawabanLuas.setText(Double.toString(getLuasPermukaan()));
                }
            }
        );
        
        VOL.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    lebar = Double.parseDouble(txtLebar.getText());
                    tinggi = Double.parseDouble(txtTinggi.getText());
                    volume();
                    jawabanVol.setText(Double.toString(getVolume()));
                }
            }
        );
        
        BACK.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent event){
                    Toolkit.getDefaultToolkit().beep();
                    frame.setVisible(false);
                }
            }
        );
    }
    
    public void setVisible(boolean visible){
        frame.setVisible(visible);
    }
    
    public void luasPermukaan(){
        luasPermukaan = lebar * tinggi * 0.5;
    }
        
    public void volume(){ 
        volume = 1.0/3.0 * (lebar * tinggi * 0.5) * tinggi;    
    }
    
    @Override
    public double getLuasPermukaan(){
        return this.luasPermukaan;
    }
    
    @Override
    public double getVolume(){
        return this.volume;
    }
}
