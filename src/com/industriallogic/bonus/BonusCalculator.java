package com.industriallogic.bonus;

/**
 * Created by matt on 2017-05-31.
 */
public class BonusCalculator {

    public double individualBonus(int sales, int quota, double commission, double tax, int numberOfTeamMembers) {
        if(sales>quota)
            return (sales - quota) * commission/100 * (1 - tax/100);
        else
            return 0.0;
    }
    public double teamBonus(int sales, int quota, double commission, int numberOfTeamMembers){
        if(numberOfTeamMembers == 0) {
            return 0.0;
        }
        if (sales>quota)
            return (sales - quota) * (commission/100) / numberOfTeamMembers;
        else
            return 0.0;
    }
}
