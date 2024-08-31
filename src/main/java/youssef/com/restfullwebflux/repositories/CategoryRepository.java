package youssef.com.restfullwebflux.repositories;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import youssef.com.restfullwebflux.domains.Category;

public interface CategoryRepository extends ReactiveMongoRepository<Category, String> {
}
