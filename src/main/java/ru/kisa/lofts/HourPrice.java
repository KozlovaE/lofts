package ru.kisa.lofts;

public class HourPrice {
    private final int minimalPricePeopleCount;
    private final int minimalPrice;
    private final int maxPrice;

    public HourPrice(int minimalPricePeopleCount, int minimalPrice, int maxPrice) {
        this.minimalPricePeopleCount = minimalPricePeopleCount;
        this.minimalPrice = minimalPrice;
        this.maxPrice = maxPrice;
    }

    public int getHourPrice(int peopleCount) {
        if (peopleCount <= minimalPricePeopleCount) {
            return minimalPrice;
        } else {
            return maxPrice;
        }
    }

    @Override
    public String toString() {
        return "Цена за час " +
                "от " + minimalPrice ;
    }
}
