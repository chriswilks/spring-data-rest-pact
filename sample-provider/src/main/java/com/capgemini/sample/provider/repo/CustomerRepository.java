package com.capgemini.sample.provider.repo;

import com.capgemini.sample.provider.entity.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by chrisw on 13/06/2016.
 */
@RepositoryRestResource(collectionResourceRel = "customers", path = "customers")
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {

    List<Customer> findByLastName(@Param("name") String name);
}
