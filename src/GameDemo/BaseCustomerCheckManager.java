package GameDemo;

public abstract class BaseCustomerCheckManager implements ICustomerCheckService{
	public abstract boolean ifRealPerson(Customer customer);
}
