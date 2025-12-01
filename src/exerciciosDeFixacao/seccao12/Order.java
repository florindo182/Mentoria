/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosDeFixacao.seccao12;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author flori
 */
public class Order {
    private Date moment;
    private OrderStatus status;
    private ArrayList<OrderItem> orderItem;
    private ClientF client;

    public Order(Date moment, OrderStatus status, ClientF client) {
        this.moment = moment;
        this.status = status;
        this.orderItem = new ArrayList<>();
        this.client = client;
    }
    
    
    
    public void addItem(OrderItem order){
        orderItem.add(order);
    }
    public void removeItem(OrderItem order){
        orderItem.remove(order);
    }
    
    public double total(){
        double soma = 0.0;
        for(OrderItem e: orderItem){
            soma += e.subTotal();
        }
        return soma;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }


    public ArrayList<OrderItem> getOrderItem() {
        return orderItem;
    }

    public ClientF getClient() {
        return client;
    }

    @Override
    public String toString(){
        return "ORDER SUMMARY: "  + "\n" +
                "Order moment: " + getMoment() + "\n" +
                "Order status: " + getStatus() + "\n" +
                "Client: " + getClient() + "\n" +
                "Order items: " + "\n" + getOrderItem() + "\n" +
                "Total price : $" + total();
    }
    
}
