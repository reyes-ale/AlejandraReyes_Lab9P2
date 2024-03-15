
import javax.swing.JProgressBar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aleja
 */
public class barrita implements Runnable{
    protected JProgressBar barra;
    protected boolean vida;

    public barrita(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isVida() {
        return vida;
    }

    public void setVida(boolean vida) {
        this.vida = vida;
    }
    
    
    @Override
    public void run() {
      while(vida){
                barra.setValue(barra.getValue()+10);
                if(barra.getValue()==100){
                    vida=false;
                }       
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
