
public class acc {
    public static void main(String[] args) {
        account a = new account();
        a.withdraw(1000);
    }
}
// package stest;

// public class a{

// }

class account{
    int balance = 500;
    void deposit(int a){
        balance += a;
    }
    void withdraw(int a){
        try{
            balance -= a;
            if(balance < 500){
                throw new less_balance_exception();
            }
        }
        catch(less_balance_exception e){
            balance += a;
            System.out.println("Withdraw amount not valid");
        }
    }

}

class less_balance_exception extends Exception{

}
