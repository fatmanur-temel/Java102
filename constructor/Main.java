public class Main {

	public static void main(String[] args) {

		Account account1 = new Account();
		account1.setHesapNo("1");
		account1.setIsim("a");
		account1.setBakiye(0.0);
		account1.setEmail("b");
		account1.setTelefonNo("05421369845");

		Account account2 = new Account("2","ab",1.0,"df","05326578425");

		
		System.out.println(account1.getEmail());
		System.out.println(account2.getEmail());
		
	}

}
