
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

    public barrita(JProgressBar barra) {
        this.barra = barra;
    }
    
    @Override
    public void run() {
      while(true){
            
                barra.setValue(barra.getValue()+1);
                if(barra.getValue()==100000000){
                }       
            try {
                Thread.sleep(0);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
