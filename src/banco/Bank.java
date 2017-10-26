/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Bank {
    private String name;
    private ArrayList<Account> accounts;
    private ArrayList<Manager> managers;
    private ArrayList<Client> clients;

    public Bank(String name) {
        this.name = name;
        this.accounts= new ArrayList<>();
        this.managers= new ArrayList<>();
        this.clients= new ArrayList<>();
        
    }
    public Account addAccount(int id,double credit){
        Account cuenta= new Account(0,0.0);
        cuenta.setId(id);
        cuenta.setCredit(credit);
        this.accounts.add(cuenta);
        return cuenta;
    }
    public Client addClient(String name){
       Client client=new Client(null);
       client.setNombre(name);
       this.clients.add(client);
        return client; 
    }
    public Manager addManager(String name){
       Manager manager= new Manager(null);
       manager.setNombre(name);
       this.managers.add(manager);
        return manager; 
    }

    public String getName() {
        return name;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public ArrayList<Manager> getManagers() {
        return managers;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    @Override
    public String toString() {
        return name + " accounts= " + accounts + ", managers= " + managers + ", clients= " + clients ;
    }
        
    
}