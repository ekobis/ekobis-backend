package net.ekobis.ekobis.inventory.repository;

import net.ekobis.ekobis.inventory.model.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, String> {


}
