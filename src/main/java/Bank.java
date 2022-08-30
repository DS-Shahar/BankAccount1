class Bank 
{
  private String name;
  private BankAccount[] accounts;
  private int numAccounts;

  public Bank(int maxAccounts, String name) {
    this.name = name;
    accounts = new BankAccount[maxAccounts];
    for (int i=0; i<accounts.length; i++)
    {
      accounts[i] = null;
    }
    numAccounts = 0;
  }

  // Are all accounts of this bank richer than all those of bank b2 ?
  public boolean areAllRicher(Bank b2) {
    for (int i=0; i< numAccounts; i++)
    {
      for (int j=0; j<b2.numAccounts; j++)
      {
        if (this.accounts[i] != null  &&  b2.accounts[j] != null)
          if (this.accounts[i].getBalance() < b2.accounts[j].getBalance())
            return false;
      }
    }
    return true;
  }

  public boolean addAccount(int balance) {    
    for (int i = 0; i < accounts.length; i++)
    {
      if (accounts[i] == null) {
        accounts[i] = new BankAccount(balance, 0);
        numAccounts++;
        return true;
      }  
    }
    return false;
  }
  
  public boolean addAccount(BankAccount acct) {    
    for (int i = 0; i < accounts.length; i++)
    {
      if (accounts[i] == null) {
        accounts[i] = acct;
        numAccounts++;
        return true;
      }  
    }
    return false;
  }

  public BankAccount findRichest() {
    BankAccount maxAcct = null;
    for (int i = 0; i < accounts.length; i++)
    {      
      if (accounts[i] != null)
      {
        if (maxAcct == null || accounts[i].getBalance() > maxAcct.getBalance())
        {
          maxAcct = accounts[i];
        }
      }
    }
    return maxAcct;
  }

  public String toString() {
    String s = "";
    for (int i=0; i < accounts.length; i++) {
      if (accounts[i] != null) {
        s += accounts[i];
        s += "\n";
      }
    }
    return s;
  }
}
