public class Manager extends Employee{ //Subclass
    // bir sınıf başka bir sınıftan miras alınırken 'extend' anahtar kelimesi kullanılır.
    // bu durumda IndividualCustomer, Customer sınıfının genişletilmiş halidir.

    private int howMany;

    public Manager (String name, int salary, String department, int howMany){
        super(name, salary, department);
        this.howMany = howMany;
    }

    public void zamYap(int zam_miktari){
        System.out.println("Çalışanlara "+zam_miktari+"TL zam yapıldı.");
    }

    //overriding
    public void showInformation(){
        /*System.out.println("Name: "+getName());
        System.out.println("Salary:"+getSalary());
        System.out.println("Department:"+getDepartment());*/
        //veya daha kolay olarak
        super.showInformation();
        System.out.println("Number of people responsible:"+howMany);

    }
}
