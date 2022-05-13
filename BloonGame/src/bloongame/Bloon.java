package bloongame;

import java.awt.Color;
import javax.swing.JButton;

public class Bloon extends JButton{
   private int speed;
   private int richtungX;
   private int RichtungY;
   
   public Bloon(char typ){
       switch(typ){
            case 's':
                this.sBloon();
                break;
                
            case 'm':
                this.mBloon();
                break;
                
            case 'l':
                this.lBloon();
                break;
                
            case 'j':
                this.jBloon();
                break;            
        }
       
   }
   
    public void sBloon(){
        this.setSize(10,10);
        this.setBackground(Color.yellow);        
    }
    private void mBloon(){
        this.setSize(15,15);
        this.setBackground(Color.green);
    }
    private void lBloon(){
       this.setSize(20,20);
       this.setBackground(Color.red);
    }
    private void jBloon(){
       this.setSize(50,50);
    } 
   
   
   
   
}
