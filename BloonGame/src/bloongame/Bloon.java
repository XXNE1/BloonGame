package bloongame;

import java.awt.Color;
import java.awt.Image;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Bloon extends JButton{   
   private int richtungX;
   private int richtungY;
   private int spawnTime;
    private int dmg;
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
        try {
        Image img = ImageIO.read(getClass().getResource("BloonGame/src/" + "blueBloon.png"));
        this.setIcon(new ImageIcon(img));
        } catch (Exception ex) {
        System.out.println(ex);
        }
        this.setWerte(8); 
        this.setDmg(1);
    }
    
    private void mBloon(){
        this.setSize(18,18);
        this.setBackground(Color.green);
        this.setWerte(6); 
        this.setDmg(2);
    }
    
    private void lBloon(){
       this.setSize(22,22);
       this.setBackground(Color.red);
       this.setWerte(4); 
       this.setDmg(3);
    }
    
    private void jBloon(){
       this.setSize(50,50);
    }     

     public void setRichtungX(int richtungX) {
        this.richtungX = richtungX;    }
     
    public void setRichtungY(int richtungY) {
        this.richtungY = richtungY;   
    }
    
    public void setSpawnTime(int spawnTime) {
        this.spawnTime = spawnTime;
    }
    
    public void setDmg(int dmg) {
        this.dmg = dmg;
    }
    public int getRichtungX() {
        return richtungX;
    }

    public int getRichtungY() {
        return richtungY;
    }
    
    public int getDmg() {
        return dmg;
    }
    
    public int getSpawnTime() {
        return spawnTime;
    }
   
    // überarbeiten
    
    public void setWerte(int max){        
        this.richtungX = (rnd.nextInt(max)+1)*sign[rnd.nextInt(sign.length)];
        this.richtungY = (rnd.nextInt(max)+1)*sign[rnd.nextInt(sign.length)];        
    }
   
   
}
