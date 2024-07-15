package net.ekobis.ekobis.supplier.repository;

import net.ekobis.ekobis.customer.domain.entity.CustomerEntity;
import net.ekobis.ekobis.supplier.domain.entity.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<SupplierEntity, String> {
}
