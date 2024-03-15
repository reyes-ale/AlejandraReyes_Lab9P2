
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aleja
 */
public class Hilohorafecha implements Runnable{
    private JLabel hora;
    private JLabel fecha;
    
    public Hilohorafecha(JLabel hora, JLabel fecha) {
        this.hora = hora;
        this.fecha = fecha;
    }    

    @Override
    public void run() {
      while(true){
            Date fechaa =new Date();
            DateFormat df =new SimpleDateFormat("hh:mm:ss");
            DateFormat df2 =new SimpleDateFormat("dd/MM/yyyy");
            hora.setText( df.format(fechaa) );
            fecha.setText(df2.format(fechaa));
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            
        }   
    }
    
}
