package com.datastax.sample;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SingleColumnRowMapper;

import com.simba.spark.jdbc41.DataSource;
import com.simba.spark.jdbc41.Driver;

/**
 * Connectivity to Spark
 */
public class TestDseJdbcSparkSQL {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(TestDseJdbcSparkSQL.class);
    
    private static String       jdbcHost = "localhost";
    private static int          jdbcPort = 10000;
    private static JdbcTemplate jdbcTemplate;
    
    @BeforeAll
    public static void initJdbc() throws ClassNotFoundException {
        Class.forName(Driver.class.getName());
        DataSource ds = new com.simba.spark.jdbc41.DataSource();
        ds.setURL("jdbc:spark://" + jdbcHost + ":" + jdbcPort);
        jdbcTemplate = new JdbcTemplate(ds);
    }
    
    @Test
    public void testConnectivity() {
        long top = System.currentTimeMillis();
        List<String> databaseNames = jdbcTemplate.query("SHOW DATABASES", 
                new SingleColumnRowMapper<String>());
        LOGGER.info("Listing databases in {} millis {}", 
                System.currentTimeMillis() - top, 
                databaseNames);
    }

}
