package net.ekobis.ekobis.category.repository;

import net.ekobis.ekobis.category.domain.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, String> {


}
