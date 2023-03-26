package ru.kisa.lofts;

import org.junit.Test;

import static org.junit.Assert.*;

public class HourPriceTest {
    @Test
    public void shouldGetReturnMinimalPrice(){
        HourPrice hourPrice =  new HourPrice(20,4000,5000);
        assertEquals(4000,hourPrice.getHourPrice(18));
    }
    @Test
    public void shouldReturnMaxPrice(){
        HourPrice hourPrice = new HourPrice(20,4000,5000);
        assertEquals(5000,hourPrice.getHourPrice(35));
    }
    @Test
    public void shouldReturnMinPriceEqualCount(){
        HourPrice hourPrice = new HourPrice(30, 6000, 7000);
        assertEquals(6000,hourPrice.getHourPrice(30));
    }
}