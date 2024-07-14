package net.ekobis.ekobis.customer.repository;

import net.ekobis.ekobis.customer.domain.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<String, CustomerEntity> {
}
