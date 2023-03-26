package ru.kisa.lofts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoftService {

    LoftModel[] loftModels;

    public LoftService() {
        LoftModel loft1 = new LoftModel(new HourPrice(20,
                4000,
                5000), 60, "Телескоп");
        LoftModel loft2 = new LoftModel(new HourPrice(30,
                5000,
                6000), 109, "Банка");
        LoftModel loft3 = new LoftModel(new HourPrice(30,
                6000,
                7000), 110, "Витрина");
        LoftModel loft4 = new LoftModel(new HourPrice(30,
                8000,
                10000), 115, "Мираж");

        loftModels = new LoftModel[]{loft1, loft2, loft3, loft4};

    }

    public String getLoftOffer() {
        return "Выбрать лофт " + Arrays.toString(loftModels);
    }

    public List<LoftModel> getLoftsWithPriceLessThenGiven(int givenPrice, int peopleCount) {
        List<LoftModel> result = new ArrayList<>();
        for (LoftModel loft : loftModels){
            if (loft.price.getHourPrice(peopleCount) <= givenPrice) {
                result.add(loft);
            }
        }
        return result;
    }
    public List<LoftModel> getLoftsWithAreaGreaterOrEqualThanGiven(int givenArea) {
        List<LoftModel> result = new ArrayList<>();
        for (LoftModel loft : loftModels) {
            if (loft.area >= givenArea) {
                result.add(loft);
            }
        }
        return result;
    }
    public LoftModel getLoftWithName(String name) {
        LoftModel result = null;
        for (LoftModel loft : loftModels) {
            if (loft.name.equals(name)){
                result=loft;
            }
        }
        return result;
    }
}
