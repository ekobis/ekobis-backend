package net.ekobis.ekobis.product.repository;

import net.ekobis.ekobis.product.model.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,String> {
}
