package task2;

public class HouseLoanCalculator  extends  LoanCalculator {

    public static final int HOUSE_LOAN = 100000;

    public HouseLoanCalculator() {
        super.setLoan(HOUSE_LOAN);
    }

    @Override
    public int calculateLoan(int age, int income){
        if (age > 30 && income > super.getLoan() / 2) {
            super.increaseLoan(super.getLoan());
        }
        return IncomeMultiplier.multiply(super.getLoan(), income);
    }
}
