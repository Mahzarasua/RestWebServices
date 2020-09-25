package zars.springframework.springmvcrest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import zars.springframework.springmvcrest.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
