package GameDemo;

public class CheckPersonManager extends BaseCustomerCheckManager{

	public boolean ifRealPerson(Customer customer) {
			if (customer.getNationallyId() == "123456789" && customer.getFirstName() == "Muhammed"
					&& customer.getLastName() == "Cihan" && customer.getBirthYear() == "1999") {

				System.out.println("Kimlik Doğrulandı");
				return true;
} 
			
			else if ((customer.getNationallyId() == "987654321" && customer.getFirstName() == "Furkan"
					&& customer.getLastName() == "Ulutaş" && customer.getBirthYear() == "2001")) {
				System.out.println("Kimlik Doğrulandı");
				return true;
			}
			else if ((customer.getNationallyId() == "0123456789" && customer.getFirstName() == "Ceyda Ceren"
					&& customer.getLastName() == "Yavuz" && customer.getBirthYear() == "2001")) {
				System.out.println("Kimlik Doğrulandı");
				return true;
			}
			
			else {
				return false;
			}
		}

}
