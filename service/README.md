# Service Module

A module containing all `EJB`s and `Managed Beans` which implement the interfaces from the `api` module.
Also, it locates the `persistence.xml` which is setting up a `JPA Persitence Unit` and contains the connection
information for the given database as a `Datasource` in the corresponding `web.xml`.
