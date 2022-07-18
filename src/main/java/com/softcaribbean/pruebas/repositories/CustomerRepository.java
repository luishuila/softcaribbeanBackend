package com.softcaribbean.pruebas.repositories;




import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.softcaribbean.pruebas.Models.CustomerModels;




@Repository
public interface CustomerRepository extends CrudRepository<CustomerModels,Long> {

}
