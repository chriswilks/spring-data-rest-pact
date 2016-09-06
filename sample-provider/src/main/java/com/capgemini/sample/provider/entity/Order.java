package com.capgemini.sample.provider.entity;

import org.hibernate.annotations.NaturalId;
import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Currency;

/**
 * Created by chrisw on 13/06/2016.
 */
@Entity
@Table(name = "orders")
public class Order implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String description;

    @Column
    private BigDecimal total;

    // Customer hasMany Orders
    @ManyToOne(optional = false)
    @NaturalId
    private Customer customer;

    protected Order(){
    }

    public Order(Customer customer, String description, BigDecimal total) {
        this.description = description;
        this.total = total;
        this.customer = customer;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public String getDescription() {
        return description;
    }

    public Customer getCustomer() {
        return customer;
    }
}
