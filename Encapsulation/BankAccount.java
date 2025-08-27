package Encapsulation;
 class bank {
   private double balance;
   
   public void setbalance(double balance){
    this.balance = balance;
   }
   public double getbalance(){
    return balance;
   }
   public void deposit(double amount){
    if(amount>0){
        balance+=amount;
    }
   }
   public void withdraw(double amount){
    if(amount<=balance){
        balance-=amount;
    }
   }
}
public class BankAccount{
     public static void main(String[] args) {
        bank obj = new bank();
        obj.setbalance(1000);
        obj.deposit(500);
        obj.withdraw(700);
        System.out.println(obj.getbalance());
     }
}
