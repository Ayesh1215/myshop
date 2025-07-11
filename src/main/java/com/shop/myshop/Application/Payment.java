package com.shop.myshop.Application;
import java.time.LocalDateTime;

public class Payment {
    private long payement_id;
    private LocalDateTime Data;
    private int order_id;
    public Payment(long payement_id, LocalDateTime data, int order_id) {
        this.payement_id = payement_id;
        Data = data;
        this.order_id = order_id;
    }
    public long getPayement_id() {
        return payement_id;
    }
    public void setPayement_id(long payement_id) {
        this.payement_id = payement_id;
    }
    public LocalDateTime getData() {
        return Data;
    }
    public void setData(LocalDateTime data) {
        Data = data;
    }
    public int getOrder_id() {
        return order_id;
    }
    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
}
