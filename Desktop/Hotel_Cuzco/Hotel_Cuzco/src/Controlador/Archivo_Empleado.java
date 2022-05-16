
package Controlador;


import Modelo.Empleado;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Archivo_Empleado {
    String ruta = "archivo_empleado.txt";
 
    FileReader fr;  
    BufferedReader br;    
    
 
    FileWriter fw;     
    File f;
    Empleado objEmp;
    public ArrayList< Empleado> lista = new ArrayList();  
    
    
    

    public void insertar( Empleado e) throws FileNotFoundException, IOException {
        fw = new FileWriter(ruta, true);
        String cad = e.getIdempleado() + "-" + e.getNombre()+ "-" + e.getApaterno()+"-" + e.getAmaterno()+"-" + e.getT_documento()+"-" + e.getDocumento()+"-"
                +e.getDireccion()+"-"+e.getTelefono()+"-" +e.getEmail()+"-"+e.getCargo()+"-"+e.getD_trabajados()+"-"+e.getEstado();
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
            objEmp = new  Empleado ((vec[0]),(vec[1]), vec[2],vec[3],vec[4],vec[5],vec[6],vec[7],vec[8],vec[9],Integer.parseInt(vec[10]),vec[11]);
            lista.add(objEmp);  
            cad = br.readLine();
        }
        fr.close();
    }
    
    
    public void mantenimiento(ArrayList< Empleado> array) throws FileNotFoundException, IOException {
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
        
        for ( Empleado e: array) {           
            String cad =  e.getIdempleado() + "-" + e.getNombre()+ "-" + e.getApaterno()+"-" + e.getAmaterno()+"-" + e.getT_documento()+"-" + e.getDocumento()+"-"
                +e.getDireccion()+e.getTelefono()+e.getEmail()+"-"+e.getCargo()+"-"+e.getD_trabajados()+"-"+e.getEstado();
            fw.write(cad);
            fw.write(13); 
        }
       
        fw.close();
        
    }
}
