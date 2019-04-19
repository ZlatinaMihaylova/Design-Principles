package task2;

public class CarLoanCalculator extends LoanCalculator {

    public static final int CAR_LOAN = 2000;
    public static final int FIFTY_YEARS_LOAN_INCREASER = 1500;
    public static final int THIRTY_YEARS_LOAN_INCREASER = 1000;

    public CarLoanCalculator() {
        super.setLoan(CAR_LOAN);
    }

    @Override
    public int calculateLoan(int age, int income){
        if (age > 50) {
            super.increaseLoan(FIFTY_YEARS_LOAN_INCREASER);
        } else if (age > 30) {
            super.increaseLoan(THIRTY_YEARS_LOAN_INCREASER);
        }

        return IncomeMultiplier.multiply(super.getLoan(), income);
    }

}
