package com.lambdaschool.orders.repositories;

import com.lambdaschool.orders.models.Payments;
import org.springframework.data.repository.CrudRepository;

public interface PaymentsRepository extends CrudRepository<Payments, Long>
{

}
