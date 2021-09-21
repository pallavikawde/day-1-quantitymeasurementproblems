package com.brigdelabs.quantitymeasurement;

import java.util.Objects;

public class length {
    enum Unit {inch, feet, yard};

    private final Unit unit;
    private double value;

    public length(Unit unit,double value) {
        this.value = value;
        this.unit = unit;
    }
    public double YARDTOFEETCONVERSION() {
        double conversion = value*3;
        return conversion;
    }
    public double getinchtoyard(){
        double result =value*36;
        return result;
    }
    public double feettoinch(){
        double result = value*12;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        length length = (length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }

}
