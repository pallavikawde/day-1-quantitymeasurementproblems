package com.brigdelabs.quantitymeasurement;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    public void given0feetand0feet_whencompare_shouldreturnEquals() {
        length feet1 = new length(length.Unit.feet ,0.0);
        length feet2 = new length(length.Unit.feet,0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    public void given0feetand1feet_whencompare_shouldreturnnotEquals() {
        length feet1 = new length(length.Unit.feet,0.0);
        length feet2 = new length(length.Unit.feet,0.1);
        Assertions.assertNotEquals(feet1, feet2);
    }
    @Test
    public void givenNullCheck_whencompare_shouldreturnNotEquals() {
        length feet1 = new length(length.Unit.feet,2.2);
        length feet2 = null;
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenTwoVAlueWithDifferentRefrances_whencompare_shouldreturnfalse() {
        length feet1 = new length(length.Unit.feet,0.0);
        length inch = new length(length.Unit.inch,0.1);
        boolean diffrefrance = feet1 == inch;//compare
        Assertions.assertFalse(diffrefrance);
    }

    @Test
    public void givenTwoVAlueWithSameRefrances_whencompare_shouldreturnTrue() {
        length feet1 = new length(length.Unit.feet,0.0);
        Boolean samevalue = feet1 == feet1;
        Assertions.assertTrue(samevalue);
    }

    //type
    @Test
    public void givenTwoType_whencompare_shouldreturnNotEqual() {
        length feet1 = new length(length.Unit.feet,0.0);
        length inch = new length(length.Unit.feet,1.0);
        Assertions.assertNotEquals(feet1, inch);
    }

    @Test
    public void given0inchand0inch_whencompare_shouldreturnEquals() {
        length inch1 = new length(length.Unit.inch,0.0);
        length inch2 = new length(length.Unit.inch,0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    public void given0inchand1inch_whencompare_shouldreturnnotEquals() {
        length inch1 = new length(length.Unit.inch,0.0);
        length inch2 = new length(length.Unit.inch,1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenNullINCH_whencompare_shouldreturnNotEquals() {
        length inch1 = new length(length.Unit.inch,2.2);
        length inch2 = null;
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenTwoInchesWithDifferentRefrances_whencompare_shouldreturnfalse() {
        length inch1 = new length(length.Unit.inch,0.0);
        length feet = new length(length.Unit.feet,0.0);
        boolean diffrefrance = inch1 == feet;//compare
        Assertions.assertFalse(diffrefrance);
    }

    @Test
    public void givenTwoinchesWithSameRefrances_whencompare_shouldreturnTrue() {
        length inch1 = new length(length.Unit.inch,0.0);
        Boolean samevalue = inch1 == inch1;
        Assertions.assertTrue(samevalue);
    }

    //type
    @Test
    public void givenTwoinchType_whencompare_shouldreturnNotEqual() {
        length inch1 = new length(length.Unit.inch,0.0);
        length feet1 = new length(length.Unit.feet,1.0);
        Assertions.assertNotEquals(inch1, feet1);
    }
//feet
    @Test
    void given1FeetAnd12Inch_WhenEqual_ShouldReturnEquals() {
        length feetToInch = new length(length.Unit.inch,1.0);
        double result = feetToInch.feettoinch();
        Assertions.assertEquals(result, 12);
    }
//yard

    @Test
    void given3feetand1yard_whencomapre_shouldreturnEqual() {
    length yard = new length(length.Unit.yard,1);
    double result = yard.YARDTOFEETCONVERSION();
    Assertions.assertEquals(result,3);
    }

    @Test
    void given1ftand1yard_whencompare_shouldreturnNotEqual() {
        length yard = new length(length.Unit.yard,1);
        double result = yard.YARDTOFEETCONVERSION();
        Assertions.assertNotEquals(result,1);
    }

    @Test
    void Given1inchand1yard_whencompare_shouldreturnNotEquals(){
       length inchtoyard = new length(length.Unit.yard,1);
       double result = inchtoyard.getinchtoyard();
       Assertions.assertNotEquals(result,1);
    }

    @Test
    void given1yard36inch_whencompare_shouldreturnequals() {
        length yardtoinch = new length(length.Unit.yard,1.0);
        double result = yardtoinch.getinchtoyard();
        Assertions.assertEquals(result,36);
    }

    @Test
    void given36inch1yard_whencompare_shouldreturnequal() {
      length inchtoyard = new length(length.Unit.inch,1.0);
      double result = inchtoyard.getinchtoyard();
      Assertions.assertEquals(result,36);
    }

    @Test
    void given1yard2feet_whencompare_shouldreturnEqual() {
        length yardtofeet = new length(length.Unit.yard,1.0);
        double actual = yardtofeet.YARDTOFEETCONVERSION();
        Assertions.assertEquals(actual, 3);
    }

}




