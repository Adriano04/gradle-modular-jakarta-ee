package de.markovic.modular.service

import javax.ws.rs.ApplicationPath
import javax.ws.rs.core.Application

/**
 * The REST application.
 *
 * Must add all resources into a set and return it with the [getClasses] method because most of the
 * JAX-RS annotations are defined on interfaces in a seperate "api" module to keep the API separated
 * from the concrete implementation.
 *
 * @author Adriano
 */
@ApplicationPath("/api")
class HelloApplication : Application() {

    private val classes = HashSet<Class<*>>()

    init {
        classes.add(HelloResource::class.java)
    }

    override fun getClasses(): MutableSet<Class<*>> = classes
}
