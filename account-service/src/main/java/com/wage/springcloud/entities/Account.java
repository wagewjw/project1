package com.wage.springcloud.entities;


import java.util.Date;
import java.util.List;

/**
 * @author wage
 * @version 1.0
 */

public class Account {
    private String name;
    private Date lastCheck;
    private List<Item> income;
    private List<Item> expense;
    private Saving saving;
    private String note;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLastCheck() {
        return lastCheck;
    }

    public void setLastCheck(Date lastCheck) {
        this.lastCheck = lastCheck;
    }

    public List<Item> getIncome() {
        return income;
    }

    public void setIncome(List<Item> income) {
        this.income = income;
    }

    public List<Item> getExpense() {
        return expense;
    }

    public void setExpense(List<Item> expense) {
        this.expense = expense;
    }

    public Saving getSaving() {
        return saving;
    }

    public void setSaving(Saving saving) {
        this.saving = saving;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
