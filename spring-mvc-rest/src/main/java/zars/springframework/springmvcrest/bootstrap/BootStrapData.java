package zars.springframework.springmvcrest.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import zars.springframework.springmvcrest.domain.Customer;
import zars.springframework.springmvcrest.repositories.CustomerRepository;

@Component
public class BootStrapData implements CommandLineRunner {

	private final CustomerRepository customerRepository;

	public BootStrapData(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Loading Customer data");

		Customer c1 = new Customer();
		c1.setFirstname("Mike");
		c1.setLastname("Zars");
		customerRepository.save(c1);

		Customer c2 = new Customer();
		c2.setFirstname("Erick");
		c2.setLastname("Ortega");
		customerRepository.save(c2);

		Customer c3 = new Customer();
		c3.setFirstname("Pepe");
		c3.setLastname("Lazcano");
		customerRepository.save(c3);

		System.out.println("Customer saved " + customerRepository.count());
	}

}
