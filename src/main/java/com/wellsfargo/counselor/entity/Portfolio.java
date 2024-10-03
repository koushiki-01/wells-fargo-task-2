package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    private Client clientId;

    @Column(nullable = false)
    private String creationDate;

    protected Portfolio(){

    }

    public Portfolio(String creationDate){
        this.creationDate=creationDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Client getClientId() {
        return clientId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}
