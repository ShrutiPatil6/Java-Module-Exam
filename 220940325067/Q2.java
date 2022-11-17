class BankAccount{
    int accno;
    double balance;

    BankAccount(){}

    BankAccount(int accno, double balance){
        this.accno = accno;
        this.balance = balance;
    }

    double withdraw(double amount){
        this.balance = this.balance - amount;
        return this.balance;        
    }

    double deposit(double amount){
        this.balance = this.balance +amount;
        return this.balance;
    }

    void show(){
        System.out.println("Account no.:"+this.accno);
        System.out.println("Balance: "+this.balance);
    }
}

class withdrawException extends Exception{
    withdrawException(String s){
        System.out.println(s);
    }
}

public class Q2 {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount(12345, 1000);
        System.out.println("*****Initial Account details*****");
        ba.show();

        double amount = 1500;

        try{
            
            if(amount>ba.balance)
            {
                throw new withdrawException("Error!!! Withdraw amount is more than balance");
            }
            else{
                System.out.println("*****After withdrawal*****");
                ba.withdraw(amount);
                ba.show();
            }
        }
        catch(withdrawException e)
        {
            // System.out.println(e);
        }

        System.out.println("*****After deposit*****");
        ba.deposit(900);
        ba.show();

        
    }
}
