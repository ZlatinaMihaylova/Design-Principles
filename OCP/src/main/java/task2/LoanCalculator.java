package task2;

import java.util.InvalidPropertiesFormatException;

abstract class LoanCalculator {

    private int loan;

   abstract public int calculateLoan(int age, int income);

   public void setLoan(int loan){
       if(loan > 0){
           this.loan = loan;
       }
   }
    public int getLoan(){
        return this.loan;
   }

    void increaseLoan(int value){
        this.loan += value;
    }

}
