package com.brigdelabs.quantitymeasurement;

import jdk.incubator.vector.VectorOperators;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

public class QuantityTest {

    @Test
    public void given0feetand0feet_whencompare_shouldreturnEquals() {
        feet feet1 = new feet(0.0);
        feet feet2 = new feet(0.0);
        Assertions.assertEquals(feet1, feet2);
    }
    //equality
    @Test
    public void given0feetand1feet_whencompare_shouldreturnEquals() {
        feet feet1 = new feet(0.0);
        feet feet2 = new feet(0.0);
        Assertions.assertNotEquals(feet1, feet2);

    }
    //null
    @Test
    public void givenNullCheck_whencompare_shouldreturnNotEquals() {
        feet feet1 = new feet(2.2);
        feet feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);

    }
    //refrance
    @Test
    public void givenTwoVAlueWithDifferentRefrances_whencompare_shouldreturnfalse() {
        feet feet1 = new feet(0.0);
        feet feet2 = new feet(0.0);
      boolean diffrefrance = feet1==feet2;//compare
        Assertions.assertFalse(diffrefrance);

    }

    @Test
    public void givenTwoVAlueWithSameRefrances_whencompare_shouldreturnTrue() {
        feet feet1 = new feet(0.0);
        Boolean samevalue= feet1==feet1;
        Assertions.assertTrue(samevalue);

    }

    //type
    @Test
    public void givenTwoType_whencompare_shouldreturnNotEqual() {
        feet feet1 = new feet(1.0);
        feet inch = new feet(1.0);
        Assertions.assertNotEquals(feet1, inch);

    }

    @Test
    public void given0inchand0inch_whencompare_shouldreturnEquals() {
        Inch inch1 = new Inch(0.0);
       Inch inch2 = new Inch(0.0);
        Assertions.assertEquals(inch1, inch2);
    }
    //equality
    @Test
    public void given0inchand1inch_whencompare_shouldreturnnotEquals() {
      Inch inch1 = new Inch(0.0);
      Inch inch2 = new Inch(0.0);
      Assertions.assertNotEquals(inch1, inch2);

    }
    //null
    @Test
    public void givenNullINCH_whencompare_shouldreturnNotEquals() {
        Inch inch1 = new Inch(2.2);
        Inch inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);

    }
    //refrance
    @Test
    public void givenTwoInchesWithDifferentRefrances_whencompare_shouldreturnfalse() {
       Inch inch1  = new Inch(0.0);
       Inch inch2 = new Inch(0.0);
        boolean diffrefrance = inch1==inch2;//compare
        Assertions.assertFalse(diffrefrance);

    }

    @Test
    public void givenTwoinchesWithSameRefrances_whencompare_shouldreturnTrue() {
        Inch inch1= new Inch(0.0);
        Boolean samevalue= inch1==inch1;
        Assertions.assertTrue(samevalue);

    }

    //type
    @Test
    public void givenTwoinchType_whencompare_shouldreturnNotEqual() {
        feet feet1 = new feet(1.0);
        feet inch = new feet(1.0);
        Assertions.assertNotEquals(feet1, inch);

    }
}



