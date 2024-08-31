package youssef.com.restfullwebflux.repositories;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import youssef.com.restfullwebflux.domains.Vendor;

public interface VendorRepository extends ReactiveMongoRepository<Vendor, String> {
}
