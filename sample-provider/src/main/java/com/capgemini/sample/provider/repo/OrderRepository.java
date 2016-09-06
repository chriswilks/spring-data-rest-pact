package com.capgemini.sample.provider.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.capgemini.sample.provider.entity.Order;

/**
 * Created by chrisw on 13/06/2016.
 */
@RepositoryRestResource
public interface OrderRepository extends PagingAndSortingRepository<Order, Long> {
}
