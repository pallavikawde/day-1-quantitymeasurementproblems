package com.brigdelabs.quantitymeasurement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest{

    @Test
   public void given0feetand0feet_whencompare_shouldreturnEquals() {
        feet feet1 = new feet(0.0);
        feet feet2 = new feet(0.0);
        Assertions.assertEquals(feet1,feet2);
    }
}


