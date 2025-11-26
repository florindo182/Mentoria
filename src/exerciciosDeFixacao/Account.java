/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosDeFixacao;

/**
 *
 * @author flori
 */
public class Account {
    private String holder;
    private double balance;
    private final int number;

    public Account(String holder, int number) {
        this.holder = holder;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
    }

    @Override
    public String toString() {
        return "Account Name: " + holder + "\n" +
               "Number: " + number + "\n" +
               "Balance: " + balance;
    }

}
