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
public class aplikasi {
    public static void main(String[] args){
        //method newFixedTreadPool digunakan untuk menentukan ukuran tetap thread yang bekerja
        ExecutorService service = Executors.newFixedThreadPool(4);
        
        for (int i=1; i<=100; i++){
            if(i%2==1)
            service.submit(new TugasAlif_106(i));
            
        }
        //mematikan semua service setelah semua task tersubmit
        service.shutdown();

        try{
            service.awaitTermination(1, TimeUnit.DAYS);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
         System.out.println("Mengitung bilangan ganjil dari 1-100 telah selesai bro");
         System.out.println("Alif Pranoto");
         System.out.println("5160311106");
    }
}

