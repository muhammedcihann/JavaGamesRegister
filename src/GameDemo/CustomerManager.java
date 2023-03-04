package GameDemo;

public class CustomerManager extends BaseCustomerManager{
	BaseCustomerCheckManager baseCustomerCheckManager;

	public CustomerManager(BaseCustomerCheckManager baseCustomerCheckManager) {
		this.baseCustomerCheckManager = baseCustomerCheckManager;
	}

	@Override
	public void add(Customer customer) {
		if (baseCustomerCheckManager.ifRealPerson(customer)) {

			System.out.println("Hesap Açıldı" + customer.getFirstName() + " " + customer.getLastName());
		} else {

			System.out.println("Geçersiz Kuallanıcı");
		}

	}
}
