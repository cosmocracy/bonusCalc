package com.industriallogic.bonus;

/**
 * Created by matt on 2017-05-31.
 */
public class BonusCalculator {
    int sales;
    int quota;
    double commission;
    double tax;
    int numberOfTeamMembers;


    public BonusCalculator(int sales, int quota, double commission, double tax, int numberOfTeamMembers) {
        this.sales = sales;
        this.quota = quota;
        this.commission = commission;
        this.tax = tax;
        this.numberOfTeamMembers = numberOfTeamMembers;
    }
    public double individualBonus(){

        if(sales>quota)
            return (sales - quota) * commission/100 * (1 - tax/100);
        else
            return 0.0;
    }
    //public double teamBonus(int sales, int quota, double commission, int numberOfTeamMembers);
    public double teamBonus(){
        if (sales>quota)
            return (sales - quota) * (commission/100) / numberOfTeamMembers;
        else
            return 0.0;
    }
}
