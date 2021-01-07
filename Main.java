/**
 * Write a description of class Main here.
 *
 * @author Maghfirah Nursiam
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener
{
    // instance variables - replace the example below with your own
    private JFrame frame;
    private JLabel keterangan;
    private JButton bolaButton, kubusButton, balokButton, limasButton, prismaButton;
    
    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        // initialise instance variables
        buatFrame();
        frame.setVisible(true);
    }

    //menampilkan dan menutup frame
    public void setVisible(boolean visible)
    {
        frame.setVisible(visible);
    }
    
    public void buatFrame()
    {
        frame = new JFrame("Bangun Ruang");
        frame.setResizable(false);
        frame.setSize(380, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        
        //Icon program dan warna program
        ImageIcon image = new ImageIcon("icon.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(175,158,220));
        
        JPanel panel = (JPanel)frame.getContentPane();
        panel.setBorder(BorderFactory.createLineBorder(Color.magenta, 5));//Border untuk program
        panel.setLayout(null);
        
        keterangan = new JLabel("Pilih bentuk ruang yang ingin dicari:");
        panel.add(keterangan);
        keterangan.setBounds(86, 10, 500, 40);
        
        
        bolaButton = new JButton("BOLA");
        bolaButton.addActionListener(this); //register action listener        
        panel.add(bolaButton);
        bolaButton.setBorder(BorderFactory.createEtchedBorder());
        bolaButton.setBackground(new Color(174, 178, 231));
        bolaButton.setBounds(35, 45, 85, 35);
        bolaButton.setFocusable(false);
        
        kubusButton = new JButton("KUBUS");        
        kubusButton.addActionListener(this); //register action listener
        panel.add(kubusButton);
        kubusButton.setBorder(BorderFactory.createEtchedBorder());
        kubusButton.setBackground(new Color(174, 178, 231));
        kubusButton.setBounds(35, 125, 85, 35);
        kubusButton.setFocusable(false);
        
        balokButton = new JButton("BALOK");        
        balokButton.addActionListener(this); //register action listener
        panel.add(balokButton);
        balokButton.setBorder(BorderFactory.createEtchedBorder());
        balokButton.setBackground(new Color(174, 178, 231));
        balokButton.setBounds(235, 45, 85, 35);
        balokButton.setFocusable(false);
        
        limasButton = new JButton("LIMAS");        
        limasButton.addActionListener(this); //register action listener
        panel.add(limasButton);
        limasButton.setBorder(BorderFactory.createEtchedBorder());
        limasButton.setBackground(new Color(174, 178, 231));
        limasButton.setBounds(235, 125, 85, 35);
        limasButton.setFocusable(false);
        
        prismaButton = new JButton("PRISMA");        
        prismaButton.addActionListener(this); //register action listener
        panel.add(prismaButton); 
        prismaButton.setBorder(BorderFactory.createEtchedBorder());
        prismaButton.setBackground(new Color(174, 178, 231));
        prismaButton.setBounds(138, 86, 85, 35);
        prismaButton.setFocusable(false);
    }
    
    public void actionPerformed(ActionEvent event)
    {
        String command = event.getActionCommand();
        
        if(command.equals("BOLA")){
            new Bola();
        }
        else if(command.equals("KUBUS")){
            new Kubus();
        }
        else if(command.equals("BALOK")){
            new Balok();
        }
        else if(command.equals("LIMAS")){
            new Limas();
        }
        else if(command.equals("PRISMA")){
            new Prisma();
        }
    }
}
