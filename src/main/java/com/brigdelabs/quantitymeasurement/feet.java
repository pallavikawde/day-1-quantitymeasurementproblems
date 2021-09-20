package com.brigdelabs.quantitymeasurement;

import java.util.Objects;

public class feet {
    private final double value;

    public feet(double value) {
        this.value=value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        feet feet = (feet) o;
        return Double.compare(feet.value, value) == 0;
    }


}
