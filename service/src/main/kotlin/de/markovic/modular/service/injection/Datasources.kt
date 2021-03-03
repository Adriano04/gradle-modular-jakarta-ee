package de.markovic.modular.service.injection

import javax.enterprise.inject.Produces
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

/**
 * The producers for data sources. Note that the unit name must match
 * the name in the peristence.xml file.
 *
 * @author Adriano
 *
 */
class Datasources {

    @Produces
    @PersistenceContext(name = "JPAHomeSpaceDatasourcePU")
    private lateinit var em: EntityManager
}
