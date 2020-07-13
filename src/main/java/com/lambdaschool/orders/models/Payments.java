package com.lambdaschool.orders.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "payments")
public class Payments
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private long paymentid;

    @Column(nullable = false)
    private String type;

    @ManyToMany(mappedBy = "payments")
    private Set<Agents> agents = new HashSet<>();

    public Payments() {
    }

    public Payments(String type)
    {
        this.type = type;
    }

    public long getPaymentid() {
        return paymentid;
    }

    public void setPaymentid(long paymentid) {
        this.paymentid = paymentid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Set<Agents> getAgents() {
        return agents;
    }

    public void setAgents(Set<Agents> agents) {
        this.agents = agents;
    }
}
