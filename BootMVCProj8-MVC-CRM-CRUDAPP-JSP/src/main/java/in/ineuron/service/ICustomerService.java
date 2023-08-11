package in.ineuron.service;
import in.ineuron.model.Customer;

import java.util.List;

public interface ICustomerService {

	public List<Customer> getCustomers();
	public void saveCustomer(Customer customer);
	public Customer getCustomer(Integer customerId);
	public void deleteCustomer(Integer customerId);
}
