package com.ventas.sistemaventas.entidad;

import com.arangodb.springframework.annotation.Edge;
import com.arangodb.springframework.annotation.ArangoId;
import org.springframework.data.annotation.Id;

@Edge("relacion_parental")
public class RelacionParental {

    @Id
    private String id;

    @ArangoId
    private String arangoId;

    private String from;
    private String to;

    // Constructor por defecto
    public RelacionParental() {
        super();
    }

    // Constructor con parametros
    public RelacionParental(final String from, final String to) {
        super();
        this.from = from;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }
}