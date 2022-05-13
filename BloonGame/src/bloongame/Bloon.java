package bloongame;

import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;

public class Bloon extends JButton{   
   private int richtungX;
   private int richtungY;
   Random rnd = new Random();
   
   public Bloon(int typ){
       switch(typ){
            case 0:
                this.sBloon();
                break;
                
            case 1:
                this.mBloon();
                break;
                
            case 2:
                this.lBloon();
                break;
                
            case 3:
                this.jBloon();
                break;            
        }  
       
   }
   
    public void sBloon(){
        this.setSize(10,10);
        this.setBackground(Color.yellow); 
        this.setWerte(6, 6);        
    }
    
    private void mBloon(){
        this.setSize(15,15);
        this.setBackground(Color.green);
        this.setWerte(3, 3); 
    }
    
    private void lBloon(){
       this.setSize(20,20);
       this.setBackground(Color.red);
       this.setWerte(0, 0); 
    }
    
    private void jBloon(){
       this.setSize(50,50);
    }     

    public int getRichtungX() {
        return richtungX;
    }

    public int getRichtungY() {
        return richtungY;
    }
   
    public void setWerte(int minX, int minY){        
        this.richtungX = rnd.nextInt((minX+3)*2)+1 - minX;
        this.richtungY = rnd.nextInt((minY+3)*2)+1 - minY;        
    }
   
   
}
