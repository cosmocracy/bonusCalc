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

    BonusCalculator calc;

    protected void setUp() {
        calc = new BonusCalculator();
    }
    public void testIndividualBonusTeamOfOne() {
        assertEquals(90.00, calc.individualBonus(12000, 11000, 10.0, 10.0, 1));
    }
    public void testIndividualBonusTeamOfMany() {
        assertEquals(90.00, calc.individualBonus(12000, 11000, 10.0, 10.0, 5));
    }
    public void testTeamBonusTeamOfOne() {
        assertEquals(100.0, calc.teamBonus(12000, 11000, 10.0, 1));
    }
    public void testTeamBonusTeamOfMany() {
        assertEquals(25.0, calc.teamBonus(12000, 11000, 10.0, 4));
    }
    public void testTeamBonusNoTeam() {
        assertEquals(0.0, calc.teamBonus(12000, 11000, 10.0, 0));
    }
}



