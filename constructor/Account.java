public class Account {

	private String hesapNo;
	private String isim;
	private double bakiye;
	private String email;
	private String telefonNo;
	
	//constructor, class'ın ismi ile aynı olmalı.
	public Account()
	{
		System.out.println("Yapıcı blok 1 çalıştı.");
	}
	//parametreli constructor, account nesnesi oluşturmak için paarametreleri vermek zorunludur.
	public Account(String hesapNo, String isim, double bakiye, String email, String telefonNo)
	{
		System.out.println("Yapıcı blok 2 çalıştı.");
		this.hesapNo = hesapNo;
		this.isim = isim;
		this.bakiye = bakiye;
		this.email = email;
		this.telefonNo = telefonNo;
	}

	public String getHesapNo() {
		return hesapNo;
	}
	public void setHesapNo(String hesapNo) {
		this.hesapNo = hesapNo;
	}
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public double getBakiye() {
		return bakiye;
	}
	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefonNo() {
		return telefonNo;
	}
	public void setTelefonNo(String telefonNo) {
		this.telefonNo = telefonNo;
	}
}
