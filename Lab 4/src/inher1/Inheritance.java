package inher1;

public class Inheritance {
	public static void main(String[] args) {
	
	Person p1=new Person("smith", 21);
	Person p2=new Person("kavy",22);
		
	Account a1= new Account(1111, 2000.0,p1);
	Account a2= new Account(2222,3000.0,p2);
	
	a1.setAccHolder(p1);
	a2.setAccHolder(p2);
	//a1.deposit(3000);
	System.out.println("Smith:" +a1.getBalance());
	a2.withdraw(2000);
	System.out.println("Kavy:" +a2.getBalance());
	Saving s =new Saving();
	s.withdraw(90);
	Current c=new Current();
	c.currentAccount(500);
	c.withdraw(3000);
	
	
	}
}
