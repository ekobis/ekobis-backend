package net.ekobis.ekobis.customer.repository;


import net.ekobis.ekobis.customer.model.entity.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<SupplierEntity, String> {
}
