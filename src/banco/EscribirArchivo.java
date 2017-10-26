/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class EscribirArchivo {
    public String name;

    

    public EscribirArchivo(String name) {
    this.name= name;
    
    }
    public void Escribir(Bank banco){
        File file= new File(this.name);
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException ex) {
                System.out.println("No se pudo crear el archivo");         
            }
        }
                   PrintStream output;
            try {
                
                output= new PrintStream(file);
                            
              
                output.println(banco.toString());
                output.flush();
                output.close();
                
            } catch (FileNotFoundException ex) {
                System.out.println("No se encontró el archivo");
            }
    }
    public void Leer(String filename){
        Scanner sc = null;
        try {
            sc= new Scanner(new File(this.name));
        } catch (FileNotFoundException ex) {
            System.out.println("Archivo no encontrado");
        }
        String nbanco=sc.nextLine();
        System.out.println(nbanco);
       sc.close();
    }
}
