package bloongame;

import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;

public class Bloon extends JButton{   
   private int richtungX;
   private int richtungY;
   Random rnd = new Random();
   private int[] sign = {1, -1};
   
   
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
        this.setSize(14,14);
        this.setBackground(Color.yellow); 
        this.setWerte(8);        
    }
    
    private void mBloon(){
        this.setSize(18,18);
        this.setBackground(Color.green);
        this.setWerte(6); 
    }
    
    private void lBloon(){
       this.setSize(22,22);
       this.setBackground(Color.red);
       this.setWerte(4); 
    }
    
    private void jBloon(){
       this.setSize(50,50);
    }     

     public void setRichtungX(int richtungX) {
        this.richtungX = richtungX;    }
     
    public void setRichtungY(int richtungY) {
        this.richtungY = richtungY;   
    }
    
    public int getRichtungX() {
        return richtungX;
    }

    public int getRichtungY() {
        return richtungY;
    }
   
    // überarbeiten
    
    public void setWerte(int max){        
        this.richtungX = (rnd.nextInt(max)+1)*sign[rnd.nextInt(sign.length)];
        this.richtungY = (rnd.nextInt(max)+1)*sign[rnd.nextInt(sign.length)];        
    }
   
   
}
