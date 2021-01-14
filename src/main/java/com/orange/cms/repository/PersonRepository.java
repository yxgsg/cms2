package com.orange.cms.repository;

import com.orange.cms.domain.Person;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created on 1/9/21.
 *
 * @author Xiaogang Yu
 */
@Transactional
public interface PersonRepository extends CrudRepository<Person, Long>
{
    Person findPersonByName(String name);
}
