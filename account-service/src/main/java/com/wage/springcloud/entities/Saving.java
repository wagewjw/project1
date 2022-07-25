package com.wage.springcloud.entities;


import java.math.BigDecimal;

/**
 * @author wage
 * @version 1.0
 */

public class Saving {
    private BigDecimal amount;
    private Currency currency;
    private BigDecimal interest;
    private boolean deposit;
    private boolean capitalization;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public boolean isDeposit() {
        return deposit;
    }

    public void setDeposit(boolean deposit) {
        this.deposit = deposit;
    }

    public boolean isCapitalization() {
        return capitalization;
    }

    public void setCapitalization(boolean capitalization) {
        this.capitalization = capitalization;
    }
}
