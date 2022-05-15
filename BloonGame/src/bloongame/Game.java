package bloongame;

import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.Timer;

// Bloondelte in Lamda vom btn durch bloonList.remove(this);    

public class Game extends JPanel{
    
    private ArrayList<Bloon> bloonList = new ArrayList<Bloon>();
    private Statistik statistik = new Statistik();
    private Random rnd = new Random();
    private Timer t;
    private int time = 0;
    private int leben = 5;
    private int bloonCounter;

    
    public Game(){
        this.setSize(780, 400);  
        statistik.setLocation(this.getWidth()-statistik.getWidth(), 0);                
        
        t = new Timer(50, (ActionEvent ae) -> {
            this.gameLoop();
        });
        
    }
    
    public void startGame(){
        t.start();
        for (int i = 0; i < rnd.nextInt(4)+2; i++) {
            this.createBloon();  
            this.add(bloonList.get(i));  
        }  
    }    
    
    public void gameLoop(){
        for (int i = 0; i < bloonList.size(); i++) {
            this.bloonBewegen(i);
            this.add(bloonList.get(i));            
        }
        statistik.refresh(this.time, this.leben, this.bloonCounter);
        this.time += t.getInitialDelay();
    }    
    
    public void createBloon(){
        Bloon newBloon = new Bloon(rnd.nextInt(3));               
        newBloon.setLocation(rnd.nextInt(this.getWidth() - 60)+30, rnd.nextInt(this.getHeight() - 60)+30);
        
        
        // mögliche Lösung durch list loopen und Objekt getten und dann alles
        newBloon.addActionListener((ActionEvent ae) -> {                        
            this.addBloonCounter();
            this.remove(this); // gibt vielleicht Fehler !!!!!!!!!!!!!!!!!!!!
            bloonList.remove(this);
        }); 
        bloonList.add(newBloon);
    }
    
    public void bloonBewegen(int a){
        Bloon b = bloonList.get(a);
        bloonList.get(a).setLocation(b.getX() + (b.getRichtungX()), b.getY()+(b.getRichtungY()));
    }
    
    public void addBloonCounter() { //vielleicht anderer Name
        this.bloonCounter ++;
    }
    
}
