package com.wage.springcloud.entities;

/**
 * @author wage
 * @version 1.0
 */

public enum Currency {
    USD, EUR, RUB, CNY;
    public static Currency getDefault(){
        return CNY;
    }
}
