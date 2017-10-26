package banco;

import java.util.Scanner;




public class Main {
   
    public static void main(String[] args){
        Bank banco=null;
        String nombre=null;
        EscribirArchivo file = null;
        int id=567432;
        double credit=0.0;
        Scanner in= new Scanner(System.in);
        
        System.out.println("Digite el nombre del banco");
        nombre= in.next();
        banco= new Bank(nombre);
        banco.addClient("David");
        banco.addClient("Daniela");
        banco.addClient("Andrés");
        banco.addClient("Juliana");
        banco.addClient("Carlos");
        banco.addAccount(id,credit);
        banco.addAccount(id,credit);
        banco.addAccount(id,credit);
        banco.addAccount(id,credit);
        banco.addAccount(id,credit);
        banco.addAccount(id,credit);
        banco.addManager("Jefe1");
        file= new EscribirArchivo("prueba.txt");
        file.Escribir(banco);
        file.Leer("prueba.txt");
        
        
       
    }
    
}
