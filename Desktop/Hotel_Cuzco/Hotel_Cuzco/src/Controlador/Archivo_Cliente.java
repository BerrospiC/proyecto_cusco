
package Controlador;

import Modelo.Cliente;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Archivo_Cliente {
    String ruta = "archivo_cliente";
 
    FileReader fr;  
    BufferedReader br;    
    
 
    FileWriter fw;     
    File f;
    Cliente objClie;
    public ArrayList< Cliente> lista = new ArrayList();  
    
    
    

    public void insertar( Cliente e) throws FileNotFoundException, IOException {
        fw = new FileWriter(ruta, true);
        String cad = e.getIdcliente() + "-" + e.getNombre()+ "-" + e.getApaterno()+"-" + e.getAmaterno()+"-" + e.getT_documento()+"-" + e.getDocumento()+"-"
                +e.getDireccion()+"-"+e.getTelefono()+"-" +e.getEmail()+"-"+e.ingreso()+"-"+e.descuento()+"-"+e.pago();
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
            objClie = new  Cliente ((vec[0]),(vec[1]), vec[2],vec[3],vec[4],vec[5],vec[6],vec[7],vec[8]);
            lista.add(objClie);  
            cad = br.readLine();
        }
        fr.close();
    }
    
    
    public void mantenimiento(ArrayList< Cliente> array) throws FileNotFoundException, IOException {
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
        
        for ( Cliente e: array) {           
            String cad =  e.getIdcliente() + "-" + e.getNombre()+ "-" + e.getApaterno()+"-" + e.getAmaterno()+"-" + e.getT_documento()+"-" + e.getDocumento()+"-"
                +e.getDireccion()+e.getTelefono()+e.getEmail()+"-"+e.ingreso()+"-"+e.descuento()+"-"+e.pago();
            fw.write(cad);
            fw.write(13); 
        }
       
        fw.close();
        
    }
}
