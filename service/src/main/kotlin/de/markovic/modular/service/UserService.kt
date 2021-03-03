package de.markovic.modular.service

import javax.ejb.Stateless
import javax.inject.Inject
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

/**
 * Simple stateless EJB which handles user related database operations.
 *
 * @author Adriano
 */
@Stateless
class UserService {

    @Inject
    private lateinit var em: EntityManager

    fun persistUser(firstName: String, lastName: String) {
        val user = UserEntity(firstName, lastName)
        em.persist(user)
        em.flush()
        println("User added: $user")
    }
}
