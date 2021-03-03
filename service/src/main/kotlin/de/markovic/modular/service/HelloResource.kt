package de.markovic.modular.service

import de.markovic.modular.api.IHelloService
import javax.ejb.EJB
import javax.enterprise.context.RequestScoped

/**
 * Hello resource implementing the [IHelloService] interface.
 *
 * @author Adriano
 */
@RequestScoped
class HelloResource : IHelloService {

    @EJB
    private lateinit var userService: UserService

    override fun hello(): String {
        userService.persistUser("Adriano", "Markovic")
        return "Hello, World! And welcome to my web page!"
    }
}
