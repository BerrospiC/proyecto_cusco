
package Controlador;


import Modelo.Habitacion;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Archivo_Habitacion {
    String ruta = "archivo_habitacion.txt";
 
    FileReader fr;  
    BufferedReader br;    
    
 
    FileWriter fw;     
    File f;
    Habitacion objHab;
    public ArrayList< Habitacion> lista = new ArrayList();  
    
    
    

    public void insertar( Habitacion e) throws FileNotFoundException, IOException {
        fw = new FileWriter(ruta, true);
        String cad = e.getNhabitacion() + "-" + e.getPiso()+ "-" + e.getTipo()+"-" + e.getDescripcion()+"-" + e.getPrecio()+"-" + e.getEstado();
        fw.write(cad);
        fw.write(13); 
        fw.close();  
    }
    
    
    
    public void leer() throws FileNotFoundException, IOException {
        lista.clear();     
        fr = new FileReader(ruta);
        br = new BufferedReader(fr);
        String cad = br.readLine();
        String[] vec;
        while (cad != null) {
            vec = cad.split("-"); 
            objHab = new  Habitacion ((vec[0]),(vec[1]), vec[2],vec[3],Integer.parseInt(vec[4]),vec[5]);
            lista.add(objHab);  
            cad = br.readLine();
        }
        fr.close();
    }
    
    
    public void mantenimiento(ArrayList< Habitacion> array) throws FileNotFoundException, IOException {
        f = new File(ruta);  
        fw = new FileWriter(ruta, true);       
        fw.close();
        f.delete();
        
        f = new File(ruta);
        if(!f.exists())
            try {
                f.createNewFile();
            } catch (Exception e) {
                e.printStackTrace();
            }
            
           fw = new FileWriter(f, true);   
        
        for ( Habitacion e: array) {           
            String cad =  e.getNhabitacion() + "-" + e.getPiso()+ "-" + e.getTipo()+"-" + e.getDescripcion()+"-" + e.getPrecio()+"-" + e.getEstado();
            fw.write(cad);
            fw.write(13); 
        }
       
        fw.close();
        
    }
}
