/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generador.de.numeros.aleatorios.umg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class escribirenarchivo {
    public void escribirenarchivo(int numeros[]) throws FileNotFoundException, IOException{
        FileWriter escribir;
        File file = new File("numeros.txt");
        BufferedWriter  linea;
        if(!file.exists()){
            try {
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i  = 0; i <numeros.length;i++){
                String num = String.valueOf(numeros[i]);
                bw.write(num);
		bw.newLine();
            }
		
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        else{
            try {
                escribir = new FileWriter(file,true);
                linea = new  BufferedWriter (escribir);
                for(int i  = 0; i <numeros.length;i++){
                linea.write(numeros[i]);
                linea.newLine();
            }
                    
                linea.close();
                escribir.close();
            }catch (IOException e) {
             //exception handling left as an exercise for the reader
            }
        }  
        
        
    
       
    }
    
}
