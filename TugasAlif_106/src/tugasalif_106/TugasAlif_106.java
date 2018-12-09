/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasalif_106;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author alif
 */
public class TugasAlif_106 implements Runnable{
    private int a;
    
    public TugasAlif_106(int id){
        this.a=id;
    }
 @Override
    public void run() {
  
      System.out.println("Mengitung bilangan ganjil = "+a);
      
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       
    }
}  
    