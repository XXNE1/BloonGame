package bloongame;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Statistik extends JPanel {

    private JLabel lblTime = new JLabel();
    private JLabel lblLeben = new JLabel();
    private JLabel lblPoints = new JLabel();

    public Statistik() {        
        this.setSize(100, 400);
        this.setBackground(Color.LIGHT_GRAY);        
        
        lblTime.setSize(80, 20);
        lblTime.setLocation(10, 10);
        lblTime.setBackground(Color.LIGHT_GRAY);
        lblTime.setOpaque(true);  
        lblTime.setText("n/a");
        this.add(lblTime);
        
        lblLeben.setSize(80, 20);
        lblLeben.setLocation(10, 40);
        lblLeben.setBackground(Color.LIGHT_GRAY);
        lblLeben.setOpaque(true);  
        lblLeben.setText("n/a");
        this.add(lblLeben);
        
        lblPoints.setSize(80, 20);
        lblPoints.setLocation(10, 70);
        lblPoints.setBackground(Color.LIGHT_GRAY);
        lblPoints.setOpaque(true);
        lblPoints.setText("n/a");
        this.add(lblPoints);
        
    }
    
    public void refresh(int time, int leben, int points){
        lblTime.setText("Zeit : " + (int)time/1000 + "s");
        lblLeben.setText("Leben : " + leben + "");
        lblPoints.setText("Points : " + points + "");
    }
    
}
