package task2;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LoanCalculatorTest {


    @Test
    public void studentLoanForYoungPoorPerson() {
        assertThat(new StudentLoanCalcuator().calculateLoan(18, 100), is(100));
    }

    @Test
    public void studentLoanForOldPerson() {
        assertThat(new StudentLoanCalcuator().calculateLoan(21, 100), is(250));
    }

    @Test
    public void studentLoanForRichPerson() {
        assertThat(new StudentLoanCalcuator().calculateLoan(18, 2_000), is(200));
    }

    @Test
    public void carLoanForYoungPoorPerson() {
        assertThat(new CarLoanCalculator().calculateLoan(20, 500), is(2_000));
    }

    @Test
    public void carLoanForAdultPoorPerson() {
        assertThat(new CarLoanCalculator().calculateLoan(45, 500), is(3_000));
    }

    @Test
    public void carLoanForOldPoorPerson() {
        assertThat(new CarLoanCalculator().calculateLoan(60, 500), is(3_500));
    }

    @Test
    public void carLoanForYoungRichPerson() {
        assertThat(new CarLoanCalculator().calculateLoan(20, 2_000), is(4_000));
    }

    @Test
    public void carLoanForAdultRichPerson() {
        assertThat(new CarLoanCalculator().calculateLoan(45, 2_000), is(6_000));
    }

    @Test
    public void carLoanForOldRichPerson() {
        assertThat(new CarLoanCalculator().calculateLoan(60, 2_000), is(7_000));
    }

    @Test
    public void houseLoanForYoungPoorPerson() {
        assertThat(new HouseLoanCalculator().calculateLoan(20, 500), is(100_000));
    }

    @Test
    public void houseLoanForOldPoorPerson() {
        assertThat(new HouseLoanCalculator().calculateLoan(60, 500), is(100_000));
    }

    @Test
    public void houseLoanForYoungRichPerson() {
        assertThat(new HouseLoanCalculator().calculateLoan(20, 65_000), is(200_000));
    }

    @Test
    public void houseLoanForOldRichPerson() {
        assertThat(new HouseLoanCalculator().calculateLoan(60, 65_000), is(400_000));
    }
}
