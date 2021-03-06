package prob5;

public class Account {
	private String accountNo;
	private int balance;
	
	public Account(String accountNo) {
		this.accountNo = accountNo;
		this.balance = 0;
		System.out.printf("%s계좌가 개설되었습니다.\n", accountNo);
	}
	
	public void save(int money) {
		balance += money;
		System.out.printf("%s계좌에 %d만원이 입금되었습니다.\n", accountNo, money);
	}
	
	public void deposit(int money) {
		balance -= money;
		System.out.printf("%s계좌에 %d만원이 출금되었습니다.\n", accountNo, money);
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
