package StepikJava.ZaurJava.Course1.ProjectBankAccount;

public class BankAccount {

    private int id;
    private String firstName;
    private String lastName;
    private double balance;

    public BankAccount(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public BankAccount(int id, String firstName, String lastName, double balance) {
        this(id, firstName, lastName);
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " has $" + balance + " of accounts";
    }

    /**
     * Метод увеличивает баланс клиента на указанную сумму
     * @param inputMoney - сумма для зачисления на счет
     */
    public void accountIncrease(double inputMoney) {
        this.balance += inputMoney;
    }

    /**
     * Метод уменьшает баланс клиента на указанную сумму
     * @param inputMoney - сумма для снятия со счета
     */
    public void accountReduction(double inputMoney) {
        this.balance -= inputMoney;
    }
}



























