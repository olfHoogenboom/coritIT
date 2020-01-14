
package com.corit.solutions.repository;

import com.corit.solutions.entities.User_roles;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Master
 */
@Transactional
public interface RoleRepository extends CrudRepository<User_roles,Integer>{
    
}
