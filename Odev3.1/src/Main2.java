public class Main2 {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new Customer(),new MilitaryCreditManager());
        customerManager.GiveCredit();
		/*CreditManager creditManager = new CreditManager();
		creditManager.Calaculate();
		creditManager.Calaculate();
		creditManager.Save();

		Customer customer = new Customer();
		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.Save();
		customerManager.Delete();

		Person person = new Person();
		person.setNatinolIdentity("4567890");

		CustomerManager customerManager2 = new CustomerManager(person);
		customerManager2.Save();

		Company company = new Company(55,"hjop");
		company.setTexNumber("fghuıo");

		CustomerManager customerManager3 = new CustomerManager(company);
		customerManager3.Save();*/



    }

}

/*class CreditManager {
	public void Calaculate() {

		System.out.println("Hesaplandı");

	}

	public void Save() {
		System.out.println("Kredi verildi");
	}
}*/
interface CreditManager{
    void Calculate();
    void Save();
}

abstract class BaseCreditManager implements CreditManager {
    public abstract void Calculate();

    public void Save() {
        System.out.println("Kaydedildi");
    }

}
class TeacherCreditManager extends  BaseCreditManager{

    @Override public void Calculate() {

        System.out.println("Öğretmen kredisi hesaplandı");
    }



}
class MilitaryCreditManager extends BaseCreditManager{

    @Override public void Calculate() {
        System.out.println("Asker kredisi hesaplandı");

    }



}

class Customer {
    private int id;
    private String city;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
}

class Company extends Customer {

    private String TexNumber;
    public String getTexNumber() {
        return TexNumber;
    }
    public void setTexNumber(String texNumber) {
        TexNumber = texNumber;
    }
}

class Person extends Customer {

    private String NatinolIdentity;
    public String getNatinolIdentity() {
        return NatinolIdentity;
    }
    public void setNatinolIdentity(String natinolIdentity) {
        NatinolIdentity = natinolIdentity;
    }
}

class CustomerManager {
    public Customer _customer;
    public CreditManager _creditManager;
    public CustomerManager(Customer customer,CreditManager creditManager) {
        _customer = customer;
        _creditManager=creditManager;

    }
    public void Save() {
        System.out.println("Müşteri eklendi : " );
    }
    public void Delete() {
        System.out.println("Müşteri silindi : ");
    }
    public void GiveCredit() {
        _creditManager.Calculate();
        _creditManager.Save();

    }
}
