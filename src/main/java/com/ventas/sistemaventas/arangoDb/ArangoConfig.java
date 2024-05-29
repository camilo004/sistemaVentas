package com.ventas.sistemaventas.arangoDb;

import com.arangodb.ArangoDB;
import com.arangodb.ArangoDatabase;
import com.arangodb.springframework.core.ArangoOperations;
import com.arangodb.springframework.core.template.ArangoTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArangoConfig {

    @Value("${spring.data.arangodb.host}")
    private String host;

    @Value("${spring.data.arangodb.port}")
    private int port;

    @Value("${spring.data.arangodb.user}")
    private String user;

    @Value("${spring.data.arangodb.password}")
    private String password;

    @Value("${spring.data.arangodb.database-name}")
    private String database;

    @Bean
    public ArangoTemplate arangoTemplate() {
        ArangoDB.Builder arango = new ArangoDB.Builder()
            .host(host, port)
            .user(user)
            .password(password);
        ArangoDB arangoDB = arango.build();
        ArangoDatabase arangoDatabase = arangoDB.db(database);
        return new ArangoTemplate(arangoDB, database, null, null);
    }
}
