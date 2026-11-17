/*
Create a BankAccount class: 
o deposit, withdraw, balance check  */

class BankAccount {
    float balance = 0.0F;

    public void deposit(float money) {
        if (money > 0.0F) {
            balance += money;
        }
    }

}

public class qs2 {
    public static void main(String[] args) {

    }
}
