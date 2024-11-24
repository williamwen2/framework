package com.order.poc.db.repository;

import org.springframework.stereotype.Service;

/**
 * order DB Repository
 *
 * **/
@Service
public interface OrderRepository extends CrudRepository<String, String> {
}
