package oop_exer;

public class Customer_ {
	private String firstName;
	private String lastName;
	private Account_ account;
	
	public Customer_(String f,String l) {
		this.firstName=f;
		this.lastName=l;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setAccount(Account_ acct) {
		this.account=acct;
	}
	public Account_ getAccount() {
		return account;
	}
}
