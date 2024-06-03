package com.ventas.sistemaventas.entidad;

import com.arangodb.springframework.annotation.Document;
import com.arangodb.springframework.annotation.ArangoId;
import org.springframework.data.annotation.Id;
import java.util.Date;

@Document("hijo_cliente")
public class HijoCliente {

    @Id
    private String id;

    @ArangoId
    private String arangoId;

    private Date fecha_nacimiento = new Date();
    private String genero;
    private Boolean esEstudiante;

    // Constructor por defecto
    public HijoCliente() {
        super();
    }

    // Constructor con parametros
    public HijoCliente(final Date fecha_nacimiento, final String genero, final Boolean esEstudiante) {
        super();
        this.fecha_nacimiento = fecha_nacimiento;
        this.genero = genero;
        this.esEstudiante = esEstudiante;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Boolean getEsEstudiante() {
        return esEstudiante;
    }

    public void setEsEstudiante(Boolean esEstudiante) {
        this.esEstudiante = esEstudiante;
    }
}