package javatraining;
public class Account {
	private float balance;
	private String email;
	private float accountno;
	
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAccountno() {
		return accountno;
	}
	public void setAccountno(float accountno) {
		this.accountno = accountno;
	}

	public static void main(String[] args) {
	 Account ac = new Account();
	 ac.setBalance(5000f);
	 ac.setEmail("muhammadsaifkhan2000@gmail.com");
	 ac.setAccountno(68000f);
	 System.out.println(ac.getBalance());
	 System.out.println(ac.getEmail());
	 System.out.println(ac.getAccountno());
	 
	}
}
