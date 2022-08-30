import java.util.Random;

class Main {
  
  public static void testBasic() {
    BankAccount acct1 = new BankAccount(0);
    BankAccount acct2 = new BankAccount(0);
    double million = 1.0e+6;
    double billion = Math.pow(10, 9);
    acct1.deposit((int)million);
    acct2.deposit((int)billion);
    acct1.withdraw((int)1.0e+5);    
    acct2.withdraw(1);    
    System.out.println(acct1);
    System.out.println(acct2);
  }

  public static void testTransfer() {
    boolean success = false;
    System.out.println("Success = " + success);
  }

  public static void main(String[] args) {
    testBasic();
    testTransfer();
  }
}
