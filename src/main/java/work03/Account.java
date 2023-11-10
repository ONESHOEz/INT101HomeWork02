package work03;

import work01.Utilitor;
import work02.Person;

public class Account {
    private static long nextNo = 1_000_000_000;
    private final long no;
    private Person owner;
    private double balance;

    public Account(Person owner) {
         if (owner == null) throw new NullPointerException();
        this.owner = owner;
        this.no = Utilitor.computeIsbn10(nextNo);
        nextNo += 10;
        this.balance = 0.0;
    }

    public long getNo() {
        return no;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
    public double deposit(double amount){
        Utilitor.testPositive(amount);
        balance += amount;
        return balance;
    }
    public double withdraw (double amount){
        Utilitor.testPositive(amount);
        Utilitor.testPositive(balance - amount);
        balance -= amount;
        return balance;
    }
    public double transfer (double amount,Account account){
        if (account == null) throw new IllegalArgumentException();
        this.withdraw(amount);
        account.deposit(amount);
        return amount;
    }

    @Override
    public String toString() {
        return "Account{" + "no=" + no + ", balance=" + balance + '}';
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
 /*
       3.1 Create a public class named "Account" in package named "work03".
           This class contains the following fields and methods.
       3.2 a private static field of type "long" named "nextNo"
           initialized to 100_000_000.
       3.3 a private final "no" field of type "long".
       3.4 a private "owner" field of type "Person".
       3.5 a private "balance" field of type "double".
       3.6 a public constructor that receives an "owner" parameter of
           type "Person" to set the "owner" field. This method throws
           NullPointerException if the "owner" parameter is null.
           This method sets the value of "balance" to 0.0 and sets
           the value of "no" field as follows.
           1) Let result = Utilitor.computeIsbn10(nextNo).
           2) If result is 10, increment the value of "nextNo" by 1
              and try Step 1) again until the result is not 10.
           3) Set the value of "no" filed to be 10 * nextNo + the result.
           4) Increment the value of "nextNo" by 1.
       3.7 public getters for "no", "owner", and "balance".
       3.8 a public method named "deposit" that receives a "double" parameter
           named "amount". This method throws IllegalArgumentException
           if "amount" cannot pass "Utilitor.testPositive" method.
           Otherwise, the method adds the "amount" to "balance"
           and then returns the new "balance".
       3.9 a public method named "withdraw" that receives a "double" parameter
           named "amount". This method throws IllegalArgumentException
           if "amount" does not pass "Utilitor.testPositive" method.
           Otherwise, the method subtracts the "amount" from "balance"
           and then returns the new "balance".  However, this method will not
           do so if the new "balance" cannot pass "Utilitor.testPositive" method.
       3.10 a public method named "transfer" that recieves a "double" parameter
            named "amount" and an "Account" parameter named "account".
            This method throws IllegalArgumentException if "account" is null
            or it cannot "withdraw" the "amount" from this object. Otherwise,
            this method "withdraw" the "amount" from this object and "deposit"
            the "amount" to the "account" object.  This method returns nothing.
       3.11 @Override a public "toString" method that returns
            "Account(no,balance)" where "no" and "balance" are
            the "no" and "balance" fields of this object.
       3.12 @Override a public "equals" method that returns true
            if this object is the same as the object in the parameter
            (i.e., the same reference). Otherwise, it returns false.
       3.13 Show in this "work03Account" method how to
            use 3.6-3.12 and check their correctness. */