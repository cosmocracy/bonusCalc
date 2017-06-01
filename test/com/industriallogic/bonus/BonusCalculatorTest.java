// ***************************************************************************
// Copyright (c) 2014, Industrial Logic, Inc., All Rights Reserved.
//
// This code is the exclusive property of Industrial Logic, Inc. It may ONLY be
// used by students during Industrial Logic's workshops or by individuals
// who are being coached by Industrial Logic on a project.
//
// This code may NOT be copied or used for any other purpose without the prior
// written consent of Industrial Logic, Inc.
// ****************************************************************************

package com.industriallogic.bonus;
import junit.framework.TestCase;

public class BonusCalculatorTest extends TestCase {
    // you may want to use "precision" (below) in your asserts...
    // private static final double precision = 0.001;

    public void testIndividualBonus() {
        BonusCalculator calc11000 = new BonusCalculator(12000, 11000, 10.0, 10.0, 1);
        assertEquals("first", 190.00, calc11000.individualBonus());

        BonusCalculator calc2 = new BonusCalculator(12000, 11000, 10.0, 10.0, 1);
        assertEquals("second", 190.00, calc2.individualBonus());

        BonusCalculator calc3 = new BonusCalculator(12000, 11000, 10.0, 10.0, 1);
        assertEquals("third", 190.00, calc3.individualBonus());
    }
    public void testTeamBonus() {
        BonusCalculator teamCalc = new BonusCalculator(12000, 11000, 10.0, 0.0, 4);
        assertEquals("4th", 20.0, teamCalc.teamBonus());

        BonusCalculator teamCalc2 = new BonusCalculator(12000, 11000, 10.0, 0.0, 4);
        assertEquals("5th", 20.0, teamCalc2.teamBonus());
    }

}



