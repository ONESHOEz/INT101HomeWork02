package int101.homework02;

import work01.Utilitor;
import work02.Person;
import work03.Account;


public class Int101Homework02 {

    public static void main(String[] args) {
       work01Utilitor();
       work02Person();
       work03Account();
    }

    static void work01Utilitor() {
        System.out.println( "Test 1.2");

        try {
            System.out.println(Utilitor.testString(""));
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }

        try {
            System.out.printf(Utilitor.testString(null));
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }

        System.out.println("testString: " + Utilitor.testString("Test string"));

        System.out.println( "Test 1.3");

        try {
            System.out.printf(Utilitor.testPositive(0) + "");
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }

        System.out.println("testPositive: " + Utilitor.testPositive(100));
        System.out.println( "Test 1.4");
        try {
            System.out.printf(Utilitor.computeIsbn10(-1) + "");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        System.out.println("computeIsbn10: " + Utilitor.computeIsbn10( 1_000_000_000));
    }

    static void work02Person() {
        System.out.println( "Test 2.6");
        try {
            Person nullPerson = new Person(null, null);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        Person Anthony = new Person("Anthony", "Higgins");
        Person Michael = new Person("Michael", "Jordan");

        System.out.println( "Test 2.7");
        System.out.println(Anthony.toString());
        System.out.println(Michael.toString());
        System.out.println( "Test 2.8");
        System.out.println("Anthony firstName: " + Anthony.getFirstname());
        System.out.println("Anthony lastName: " + Anthony.getLastname());
        System.out.println("Anthony ID: " + Anthony.getId());
        System.out.println( "Test 2.9");
        System.out.println("Change Anthony firstName to null: ");
        try {
            Anthony.setFirstname(null);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        System.out.println("Change Anthony firstName to Juice: ");
        Anthony.setFirstname("Juice");
        System.out.println("Anthony's firstName: " + Anthony.getFirstname());

        System.out.println("Change Anthony lastName to null: ");
        try {
            Anthony.setFirstname(null);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        System.out.println("Change Anthony lastName to WRLD: ");
        Anthony.setLastname("WRLD");
        System.out.println("Anthony firstName: " + Anthony.getFirstname());
        System.out.println( "Test 2.10");
        System.out.println("Anthony equals Anthony: " + Anthony.equals(Anthony));
        System.out.println("Michael equals Michael: " + Michael.equals(Michael));
        System.out.println("Anthony equals Michael: " + Anthony.equals(Anthony));
        System.out.println("Michael equals Anthony: " + Michael.equals(Anthony));
    }

    static void work03Account() {
        System.out.println( "Test 3.6");

        try {
            new Account(null);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }

        Person Anthony = new Person("Anthony", "Higgins");
        Account AnthonyAccount = new Account(Anthony);
        System.out.println("Anthony account has been created.");

        System.out.println( "Test 3.7");
        System.out.println("Anthony account balance: " + AnthonyAccount.getBalance() + "$");
        System.out.println("Anthony account no: " + AnthonyAccount.getNo());
        System.out.println("Anthony account owner: " + AnthonyAccount.getOwner());
        System.out.println( "Test 3.8");

        try {
            System.out.println(AnthonyAccount.deposit(-1));
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Anthony account balance deposit 500: " + AnthonyAccount.deposit(999));
        System.out.println( "Test 3.9");

        try {
            System.out.println(AnthonyAccount.withdraw(-1));
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Anthony account balance withdraw 100: " + AnthonyAccount.withdraw(333));
        System.out.println( "Test 3.10");
        Person Michael = new Person("Michael", "Jordan");
        Account MichaelAccount = new Account(Michael);

        try {
            AnthonyAccount.transfer(100, null);
        } catch (Exception e) {
            System.out.println(e);
        }

        AnthonyAccount.transfer(100, MichaelAccount);

        System.out.println("Michael account balance: " + MichaelAccount.getBalance());
        System.out.println("Anthony account balance: " + AnthonyAccount.getBalance());

        System.out.println( "Test 3.11");
        System.out.println(AnthonyAccount.toString());
        System.out.println(MichaelAccount.toString());
        System.out.println( "Test 3.12");
        System.out.println("Anthony account equals Anthony account: " + AnthonyAccount.equals(AnthonyAccount));
        System.out.println("Michael account equals Michael account: " + MichaelAccount.equals(MichaelAccount));
        System.out.println("Anthony account equals Michael account: " + AnthonyAccount.equals(MichaelAccount));
        System.out.println("Michael account equals Anthony account: " + MichaelAccount.equals(AnthonyAccount));
    }
}
