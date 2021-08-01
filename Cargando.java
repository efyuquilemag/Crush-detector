
package Ventanas;

import javax.swing.JProgressBar;

public class Cargando extends Thread {
    
    JProgressBar Progreso;
    public Cargando (JProgressBar progreso)
    {
        super();
        this.Progreso = progreso;
    }
    
    @Override
    public void run()
    {
        for(int a = 1; a <= 100; a++)
        {
            Progreso.setValue(a);
            pausa(40);
        }
    } 
    
    public void pausa(int mlseg)
    {
        try {
            Thread.sleep(mlseg);
            } catch (Exception e) {
            }
    }
}
