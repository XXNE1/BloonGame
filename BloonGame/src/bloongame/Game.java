package bloongame;

import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Random;

public class Game extends JPanel{
    
    ArrayList<Bloon> bloonList = new ArrayList<Bloon>();
    Random rnd = new Random();
    
    public Game(){
        this.setSize(780, 400);
    }
    
    
    public void createBloon(){
        Bloon newBloon = new Bloon(rnd.nextInt(3));
        bloonList.add(newBloon);        
    }
    
    public void bloonBewegen(Bloon a){
        a.setLocation(a.getX() + (a.getRichtungX()), a.getY()+(a.getRichtungY()));
    }
    
    public void deleteBloon(){
        
    }
    
    
    
}
