package de.markovic.modular.service

import javax.persistence.*

/**
 * Simple user entity containing first and last name.
 *
 * @author Adriano
 */
@Entity
@Table(name = "user")
data class UserEntity constructor (
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    var id: Long?,
    var firstName: String,
    var lastName: String
) {
    // Must define a no-args constructor so the JPA framework can initialize this entity.
    constructor() : this(null, "", "")

    constructor(firstName: String, lastName: String) : this(null, firstName, lastName)
}
