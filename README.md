# Connect Java App to SparkSQL
----

DataStax provides multiple ODBC drivers to connect to Cassandra and DSE, please see [here](https://downloads.datastax.com/#odbc-jdbc-drivers) for more information.

In the project we illustrate the `Simba JDBC Driver for Apache Cassandra`
* Here is the [installation guide](https://downloads.datastax.com/jdbc/cql/2.0.3.1003/SimbaCassandraJDBCGuide.pdf)
* Here is the [documentation] (https://docs.datastax.com/en/dse/6.7/dse-admin/datastax_enterprise/spark/simbaOdbcDriver.html)

### Pre-requisites

* You must have java 11+ install on your machine (can be changed in `pom.xml`)
* You must have a DataStax Enterprise Started with the Spark Workload enabled and the AlwaysOn options enabled as well
* In this sample the Alwaays-on service is expected to be available on `localhost:10000` but you can change it

### Installation

* Clone the repository
* Import the maven project in your IDE
* Add manually the dependencies from folder `lib` to the classpath : those are not available on repositories.


### Usage

* Simply Run the Unit Test, it will ist you available databases

