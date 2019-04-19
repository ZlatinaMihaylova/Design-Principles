package task2;

public class StudentLoanCalcuator extends  LoanCalculator {

    public static final int STUDENT_LOAN = 100;

    public StudentLoanCalcuator() {
        super.setLoan(STUDENT_LOAN);
    }

    @Override
    public int calculateLoan(int age, int income){
        if (age >= 21) {
            super.increaseLoan(150);
        }
        return IncomeMultiplier.multiply(super.getLoan(), income);
    }
}
