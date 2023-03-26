package ru.kisa.lofts;

import java.util.Objects;

public class LoftModel {
    final HourPrice price;
    final int area;
    final String name;

    public LoftModel(HourPrice price, int area, String name) {
        this.price = price;
        this.area = area;
        this.name = name;
    }

    @Override
    public String toString() {
        return "пространство " + name + " площадью " + area + " м2 " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoftModel loftModel = (LoftModel) o;

        return name.equals(loftModel.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
