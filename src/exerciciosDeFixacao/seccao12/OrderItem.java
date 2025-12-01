/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosDeFixacao.seccao12;

/**
 *
 * @author flori
 */
public class OrderItem {
    private int quantity;
    private double price;
    private Product product;

    public OrderItem(int quantity, double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
    
    public double subTotal(){
        return getQuantity() * product.getPrice();
    }

    @Override
    public String toString() {
        return product.getName() + " $" + price + ", Quantity: " + quantity + ", Subtotal: " +subTotal();
    }
    
}
