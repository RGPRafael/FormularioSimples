/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SimpleFormUser.EmailFomUser.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author rafael
 */
@Entity(name = "User")
@Table(name = "Usuarios")
public class User {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String nome;
    private String email;
    
    
    public User() {
    // Default constructor
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void  setEmail(String email){
         this.email =  email;
    }
    
    
    
    public String getNome(){
        return this.nome;
    }
    public String getEmail(){
        return this.email;
    }
    
   
    public Long getID(){
        return Id;
    }  
}
