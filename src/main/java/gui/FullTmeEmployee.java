package gui;

public class FullTmeEmployee extends Employee{
    private double weeklySalary;
    private double benefitDeduction;

    public FullTmeEmployee (double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    public FullTmeEmployee () {
        super();
    }


    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalaryIn) {
        this.weeklySalary = weeklySalaryIn;
    }

    public double getBenefitDeduction() {
        return benefitDeduction;
    }

    public void setBenefitDeduction(double benefitDeductionIn) {
        this.benefitDeduction = benefitDeductionIn;
    }
}
