class BankAccount
{
  private int minBalance;
  private int balance;

  public BankAccount(int balance) {
    this.balance = balance;
    this.minBalance = 0;
  } 

  /*
   * minBalance must be lower than balance
   */
  public BankAccount(int balance, int minBalance) {
    this.balance = balance;
    this.minBalance = minBalance;
  } 

  public int getBalance() { return balance; }

  public boolean isLarger(BankAccount other) {
    if (balance < other.getBalance())
      return true;
    else
      return false;
  }
  
  public boolean withdraw(int amount) {
    if (balance - amount < minBalance)
      return false;
    balance = balance - amount;
    return true;
  }

  public void deposit(int amount) {        
    balance = balance + amount;
  }

  public boolean transfer(BankAccount target, int amount) {
    if (withdraw(amount) == false)
      return false;
    target.deposit(amount);
    return true;
  }

  public String toString() {
    String s = "Balance: ";
    s = s + balance;
    return s;
  }  

}
