/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosDeFixacao.seccao12;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author flori
 */
public class ClientF {
    private String name;
    private String email;
    private LocalDate birthDate;

    public ClientF(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
    

    
    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", email=" + email + ", birthDate=" + birthDate + '}';
    }
    
}
