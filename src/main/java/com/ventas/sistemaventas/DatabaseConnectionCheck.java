package com.ventas.sistemaventas;
import com.arangodb.ArangoDBException;
import com.arangodb.ArangoDatabase;
import com.arangodb.entity.CollectionEntity;
import com.arangodb.springframework.core.template.ArangoTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.Collectors;
@Component
public class DatabaseConnectionCheck {
    @Autowired
private ArangoTemplate arangoTemplate;

    public void checkConnection() {
    try {
        ArangoDatabase db = arangoTemplate.driver().db();
        Collection<String> collectionNames = db.getCollections().stream()
            .map(CollectionEntity::getName)
            .collect(Collectors.toList());
        System.out.println("Conectado correctamente. Las colecciones en la base de datos son: " + collectionNames);
    } catch (ArangoDBException e) {
        System.err.println("No se pudo conectar a la base de datos. Error: " + e.getMessage());
    }
}
}
