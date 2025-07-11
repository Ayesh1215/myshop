package com.shop.myshop.service;

public class OrderRequest {
    private Long productId;
    private int quantity;
    private Long customerId;
    public OrderRequest(Long productId, int quantity, Long customerId) {
        this.productId = productId;
        this.quantity = quantity;
        this.customerId = customerId;
    }
    public Long getProductId() {
        return productId;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
}
