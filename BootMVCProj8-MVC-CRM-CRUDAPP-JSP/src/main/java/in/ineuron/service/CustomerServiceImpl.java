package in.ineuron.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.dao.ICustomerDao;
import in.ineuron.model.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	ICustomerDao repo;
	@Override
	public List<Customer> getCustomers() {

		List<Customer>list=(List<Customer>) repo.findAll();
		return list;
	}
	@Override
	public void saveCustomer(Customer customer) {
		repo.save(customer);
		
	}
	@Override
	public Customer getCustomer(Integer customerId) {
		Optional<Customer> optional = repo.findById(customerId);
		return optional.get();
	}
	@Override
	public void deleteCustomer(Integer customerId) {
		// TODO Auto-generated method stub
		repo.deleteById(customerId);
	}

}
