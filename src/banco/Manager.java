/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Manager extends Person {
    private ArrayList<Client> clients;
    
    public Manager(String nombre) {
        super(nombre);
        this.clients= new ArrayList<>();
    }
    
}
