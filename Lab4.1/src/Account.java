public class Account
{
    private static int numAccounts = 0; //initializing variable

    public Account(String str)
    {
        numAccounts++; //constructor to add +1 for each new Account
    }
    public static int getNumAccounts()
    {
        return Account.numAccounts;
    }
    public static void main(String[] args)
    {
        Account obj;
        obj = new Account ("Kurt Cobain");
        obj = new Account ("Jimmi Hendrix");
        obj = new Account ("Janis Joplin");
        obj = new Account ("John Lennon");
        obj = new Account ("Bob Marley");

        System.out.println("Number of Accounts: " + Account.getNumAccounts());
    }
}