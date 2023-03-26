package ru.kisa.lofts;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoftServiceTest {

    private final LoftService loftService = new LoftService();

    @Test
    public void shouldPrintLoftOffers() {
        String loftOffer = loftService.getLoftOffer();
        //печатаем
        System.out.println(loftOffer);
        //проверяем что строка правильная
        assertTrue(loftOffer.startsWith("Выбрать лофт "));
        assertTrue(loftOffer.contains("Телескоп"));
        assertTrue(loftOffer.contains("Банка"));
        assertTrue(loftOffer.endsWith("8000]"));
    }

    @Test
    public void shouldReturnLoftsWithPriceLessOrEqualThenGiven() {
        List<LoftModel> lofts = loftService.getLoftsWithPriceLessThenGiven(4999,12);
        assertEquals(1, lofts.size());
    }

    @Test
    public void shouldReturnLoftsWithAreaGreaterOrEqualThenGiven() {
        List<LoftModel> lofts = loftService.getLoftsWithAreaGreaterOrEqualThanGiven(100);
        assertEquals(3, lofts.size());
    }
    @Test
    public void shouldGetLoftWithName(){
        LoftModel loftModel = loftService.getLoftWithName("Мираж");
        LoftModel example = new LoftModel(new HourPrice(30,
                8000,
                10000), 115, "Мираж");
        assertEquals(example, loftModel);
    }
}