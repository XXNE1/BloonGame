package bloongame;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Statistik extends JPanel {

    private JLabel lblTime = new JLabel();
    private JLabel lblLeben = new JLabel();
    private JLabel lblBloonCounter = new JLabel();

    public Statistik() {        
        this.setSize(100, 200);
        this.setBackground(Color.gray);        
        
        lblTime.setSize(80, 20);
        lblTime.setLocation(10, 10);
        lblTime.setBackground(Color.LIGHT_GRAY);
        lblTime.setOpaque(true);
        this.add(lblTime);
        
        lblLeben.setSize(80, 20);
        lblLeben.setLocation(10, 40);
        lblLeben.setBackground(Color.LIGHT_GRAY);
        lblLeben.setOpaque(true);
        this.add(lblLeben);
        
        lblBloonCounter.setSize(80, 20);
        lblBloonCounter.setLocation(10, 70);
        lblBloonCounter.setBackground(Color.LIGHT_GRAY);
        lblBloonCounter.setOpaque(true);
        this.add(lblBloonCounter);
        
    }
    
    public void refresh(int time, int leben, int bloonCounter){
        lblTime.setText(time + "s");
        lblLeben.setText(leben + "");
        lblBloonCounter.setText(bloonCounter + "");
    }
    

}
