
package Controlador;


import Modelo.Producto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Archivo_Producto {
    String ruta = "archivo_producto.txt";
 
    FileReader fr;  
    BufferedReader br;    
    
 
    FileWriter fw;     
    File f;
    Producto objProd;
    public ArrayList< Producto> lista = new ArrayList();  
    
    
    

    public void insertar( Producto e) throws FileNotFoundException, IOException {
        fw = new FileWriter(ruta, true);
        String cad = e.getIdproducto() + "-" + e.getDescripcion()+ "-" + e.getCantidad()+"-" + e.getPrecio();
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
            objProd = new  Producto ((vec[0]),(vec[1]),Integer.parseInt(vec[2]),Double.parseDouble(vec[3]));
            lista.add(objProd);  
            cad = br.readLine();
        }
        fr.close();
    }
    
    
    public void mantenimiento(ArrayList< Producto> array) throws FileNotFoundException, IOException {
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
        
        for ( Producto e: array) {           
            String cad =  e.getIdproducto() + "-" + e.getDescripcion()+ "-" + e.getCantidad()+"-" + e.getPrecio();
            fw.write(cad);
            fw.write(13); 
        }
       
        fw.close();
        
    }
}
