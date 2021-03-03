package de.markovic.modular.api

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces


@Path("/hello-world")
interface IHelloService {

    @GET
    @Produces("text/plain")
    fun hello(): String
}
