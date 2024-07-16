package net.ekobis.ekobis.inventory.repository;

import net.ekobis.ekobis.inventory.model.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,String> {
}
