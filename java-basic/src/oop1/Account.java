package oop1;

public class Account {
    // 잔액
    int balance;


    // 입금 메서드
    public void deposit(int amount){
        balance += amount;
    }

    // 출금 메서드
    public void withdraw(int amount){
        if (balance >= amount){
        balance -= amount;
        }else{
            System.out.println("잔액 부족");
        }
    }
}
