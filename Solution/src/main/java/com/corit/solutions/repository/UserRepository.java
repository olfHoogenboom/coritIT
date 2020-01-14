package com.corit.solutions.repository;

import com.corit.solutions.entities.Users;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;


@Transactional
public interface UserRepository extends CrudRepository<Users,String>{

}
