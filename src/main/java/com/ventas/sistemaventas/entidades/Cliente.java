package com.ventas.sistemaventas.entidades;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "clientes")
public class Cliente {
    @Id
    private String id;
    private String nombre;
    private List<Hijo> hijos;
    private Lugar lugarNacimiento;
    private Lugar lugarUbicacion;
    private String religion;
    private List<String> gustos;
    private List<String> deportes;
    private EstadoCivil estadoCivil;

    // Getters y setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Hijo> getHijos() {
        return hijos;
    }

    public void setHijos(List<Hijo> hijos) {
        this.hijos = hijos;
    }

    public Lugar getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(Lugar lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public Lugar getLugarUbicacion() {
        return lugarUbicacion;
    }

    public void setLugarUbicacion(Lugar lugarUbicacion) {
        this.lugarUbicacion = lugarUbicacion;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public List<String> getGustos() {
        return gustos;
    }

    public void setGustos(List<String> gustos) {
        this.gustos = gustos;
    }

    public List<String> getDeportes() {
        return deportes;
    }

    public void setDeportes(List<String> deportes) {
        this.deportes = deportes;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
