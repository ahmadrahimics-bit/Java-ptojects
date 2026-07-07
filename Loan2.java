
package javaapplication12;

import java.util.Date;

/**
 *
 * @author neoHussain
 */
public class Loan2 {
    
    double annualInterestRate =2.5;
    int numberOfYears = 1;
    double loanAmount = 1000;
    Date loanDate = new Date();
    
    Loan2(){ // first constructore
        
    }
    
     public Loan2( double annualInterestRate , int numberOfYears , double loanAmount){ // second  constructore
         this.annualInterestRate = annualInterestRate;
         this.loanAmount = loanAmount;
         this.numberOfYears = numberOfYears;
         
     }
    
     public double getAnnualInterestRate(){
         return annualInterestRate;
     }
     
     public  int numberOfYears(){
         return this.numberOfYears;
         //System.out.println("number of the years is : "+numberOfYears);
     }
     public double getLoanAmount(){
         return  this.loanAmount;
     }
     public Date getDate(){
         return loanDate;
     }
     public double  setLoanAmount(double amount){
         return this.loanAmount = amount;
         
     }
     public int setYear(int numberOfYear){
         return this.numberOfYears = numberOfYear;
     }
     
    
     public double getMonthlyPayment() {
     double monthlyInterestRate = annualInterestRate / 1200;
     double monthlyPayment = loanAmount * monthlyInterestRate / (1- 
        (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
     return monthlyPayment; 
    }
     
     public double getTotalPayment(){
         double totalPayment = getMonthlyPayment()*numberOfYears * 12;

         return totalPayment;
        }
     
     public java.util.Date getLoanDate() {
      return loanDate;
    }
     
     
    
    
    
    
}
