package com.lambdaschool.orders.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "orders")
public class Orders
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long ordnum;
    private double ordamount;
    private double advanceamount;
    private String orderdescription;

    @Column(nullable = false)
    @ManyToOne
    @JoinColumn(name = "custcode")
    private Customers customers;

    @ManyToMany()
    @JoinTable(name = "orderspayments",
    joinColumns = @JoinColumn(name="ordnum"),
    inverseJoinColumns = @JoinColumn(name="paymentid"))
    private Set<Payments> payments = new HashSet<>();


    public Orders()
    {
        // for JPA
    }

    public Orders(double ordamount, double advanceamount, String orderdescription)
    {
        this.ordamount = ordamount;
        this.advanceamount = advanceamount;
        this.orderdescription = orderdescription;
    }

    public long getOrdnum() {
        return ordnum;
    }

    public void setOrdnum(long ordnum) {
        this.ordnum = ordnum;
    }

    public double getOrdamount() {
        return ordamount;
    }

    public void setOrdamount(double ordamount) {
        this.ordamount = ordamount;
    }

    public double getAdvanceamount() {
        return advanceamount;
    }

    public void setAdvanceamount(double advanceamount) {
        this.advanceamount = advanceamount;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public String getOrderdescription() {
        return orderdescription;
    }

    public void setOrderdescription(String orderdescription) {
        this.orderdescription = orderdescription;
    }

    public Set<Payments> getPayments() {
        return payments;
    }

    public void setPayments(Set<Payments> payments) {
        this.payments = payments;
    }
}
