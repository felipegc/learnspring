package com.in28minutes.database.databasedemo.jpa;

import com.in28minutes.database.databasedemo.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

//Repository
//Transaction
@Repository
@Transactional
public class PersonJpaRespository {
    // connect to the database
    @PersistenceContext
    EntityManager entityManager;

    public Person findById(int id) {
        return entityManager.find(Person.class, id); // JPA
    }

    public Person update(Person person) {
        return entityManager.merge(person);
    }

    // Merge identifies if the id is present and updates otherwise it inserts.
    public Person insert(Person person) {
        return entityManager.merge(person);
    }

    public void deleteById(int id){
        Person person = findById(id);
        entityManager.remove(person);
    }

    public List<Person> findAll() {
        // This is using JPQL - java persistence query language. It uses the entities instead of databases.
        TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons", Person.class);
        return namedQuery.getResultList();
    }
}
