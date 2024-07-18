package net.ekobis.ekobis.partner.repository;


import net.ekobis.ekobis.partner.model.entity.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<SupplierEntity, String> {
}
