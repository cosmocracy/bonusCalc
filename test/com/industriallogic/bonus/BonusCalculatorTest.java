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
        assertEquals("first", 90.00, calc11000.individualBonus());

        BonusCalculator calc12000 = new BonusCalculator(12000, 12000, 10.0, 10.0, 1);
        assertEquals("2nd", 0.00, calc12000.individualBonus());

        BonusCalculator calc15000 = new BonusCalculator(12000, 15000, 10.0, 10.0, 1);
        assertEquals("3rd", 0.00, calc15000.individualBonus());
    }
    public void testTeamBonus() {
        BonusCalculator teamCalc = new BonusCalculator(12000, 11000, 10.0, 0.0, 4);
        assertEquals("4th", 25.0, teamCalc.teamBonus());
    }

}



