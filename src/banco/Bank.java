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
public class Bank {
    private ArrayList<Account> accounts;
    private ArrayList<Manager> managers;
    private ArrayList<Client> clients;

    public Bank() {
        this.accounts = new ArrayList<>();
        this.managers = new ArrayList<>();
        this.clients =new ArrayList<>();
    }
    
}
