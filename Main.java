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
    private JButton bolaButton, kubusButton, balokButton, limasButton, prismaButton;
    private JLabel label;
    private JPanel panel;
    private JTextField textUser;
    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        // initialise instance variables
        buatFrame();
        setVisible(true);
    }

    //menampilkan dan menutup frame
    public void setVisible(boolean visible)
    {
        frame.setVisible(visible);
    }
    
    public void buatFrame()
    {
        frame = new JFrame("BANGUN RUANG");
        frame.setSize(500, 500);
        
        JPanel panel = (JPanel)frame.getContentPane();
        panel.setLayout(new BorderLayout());
        
        JPanel p = new JPanel();
        
        bolaButton = new JButton("BOLA");
        //register action listener
        bolaButton.addActionListener(this);
        p.add(bolaButton);
        
        kubusButton = new JButton("KUBUS");
        //register action listener
        kubusButton.addActionListener(this);
        p.add(kubusButton);
        
        balokButton = new JButton("BALOK");
        //register action listener
        balokButton.addActionListener(this);
        p.add(balokButton);
        
        limasButton = new JButton("LIMAS");
        //register action listener
        limasButton.addActionListener(this);
        p.add(limasButton);
        
        prismaButton = new JButton("PRISMA");
        //register action listener
        prismaButton.addActionListener(this);
        p.add(prismaButton);
        
        panel.add(p, BorderLayout.NORTH);
        
        frame.pack();
    }
    
    public void actionPerformed(ActionEvent event)
    {
        String command = event.getActionCommand();
        
        if(command.equals("BOLA")){
            //cipta objek class bola
        }
        else if(command.equals("KUBUS")){
            //cipta objek class kubus
        }
        else if(command.equals("BALOK")){
            //cipta objek class balok
        }
        else if(command.equals("LIMAS")){
            frameLimas();
        }
        else if(command.equals("PRISMA")){
            //cipta objek class prisma
        }      
    }
    
    public void frameLimas() {
        frame = new JFrame("BANGUN RUANG");
        frame.setSize(500, 500);
        
        JPanel panel = (JPanel)frame.getContentPane();
        panel.setLayout(new BorderLayout());
        
        //Label untuk Panjang
        JLabel label = new JLabel("Panjang");
        label.setBounds(10, 20, 80, 25);
        panel.add(textUser);
            
        //Input dari user
        textUser = new JTextField(20);
        textUser.setBounds(100, 20, 165, 25);
        panel.add(textUser);    
    }
}