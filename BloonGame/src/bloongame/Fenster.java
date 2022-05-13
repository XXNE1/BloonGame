package bloongame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Fenster extends JFrame{
    
    private JPanel statistikpanel = new JPanel();
    private JPanel gamepanel = new JPanel();
    private JLabel lblEingabe = new JLabel();
    private JButton buttonst = new JButton();
    private Timer t;
    
    
    
     public Fenster() {
         
        this.setLayout(null);
        this.setSize(800,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Bloongame");
        this.getContentPane().setBackground(Color.WHITE);
        this.add(statistikpanel);
        this.setVisible(true);
        
    //Startbutton
        buttonst.setLocation(10, 330);
        buttonst.setSize(150, 60);
        buttonst.setText("Start");
        this.add(buttonst);
        
        buttonst.addActionListener((ActionEvent ae) -> {  
            System.out.print("Start" + "\n");
            //this.StarteSpiel();
            });

}
}