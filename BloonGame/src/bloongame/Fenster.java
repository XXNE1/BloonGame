package bloongame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Fenster extends JFrame{   
   
    
    private JButton buttonst = new JButton();
    private Timer t;
    
    private Game game = new Game();
    
    
    
    public Fenster() {
         
        this.setLayout(null);
        this.setSize(900,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Bloongame");
        this.getContentPane().setBackground(Color.WHITE);        
        this.setVisible(true);
        
        //Startbutton
        buttonst.setLocation(10, 420);
        buttonst.setSize(150, 60);
        buttonst.setText("Start");
        this.add(buttonst);
        
        buttonst.addActionListener((ActionEvent ae) -> {  
            System.out.print("Start" + "\n");
            this.starteSpiel();
        }); 
        
        game.setLocation(10,10);
        this.add(game);
        
    }
    
    public void starteSpiel(){
        buttonst.setEnabled(false);        
        game.startGame();
       
        
    }
     
     
}