package com.ventas.sistemaventas.entidad;

import com.arangodb.springframework.annotation.Document;
import com.arangodb.springframework.annotation.ArangoId;
import java.util.List;
import org.springframework.data.annotation.Id;
import java.util.Date;

class LugarNacimiento {
    private String municipio;
    private String ciudad;
    private String departamento;
    private String estado;
    private String pais;

    // Constructor por defecto
    public LugarNacimiento() {
        super();
    }

    // Constructor con parametros
    public LugarNacimiento(final String municipio, final String ciudad, final String departamento, final String estado,
            final String pais) {
        super();
        this.municipio = municipio;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.estado = estado;
        this.pais = pais;
    }

    // Getters and Setters
    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}

class LugarUbicacion {
    private String municipio;
    private String ciudad;
    private String departamento;
    private String region;
    private String estado;
    private String pais;
    private int codigo_postal;

    // Constructor por defecto
    public LugarUbicacion() {
        super();
    }

    // Constructor con parametros
    public LugarUbicacion(final String municipio, final String ciudad, final String departamento, final String region,
            final String estado, final String pais, final int codigo_postal) {
        super();
        this.municipio = municipio;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.region = region;
        this.estado = estado;
        this.pais = pais;
        this.codigo_postal = codigo_postal;
    }

    // Getters and Setters
    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getCodigo_postal() {
        return codigo_postal;
    }

    public void setCodigo_postal(int codigo_postal) {
        this.codigo_postal = codigo_postal;
    }
}

@Document("cliente")
public class Cliente {

    @Id
    private String id;

    @ArangoId
    private String arangoId;

    private int cantidad_hijos;
    private List<LugarNacimiento> lugar_nacimiento;
    private List<LugarUbicacion> lugar_ubicacion;
    private String religion;
    private List<String> hobbies;
    private List<String> deportes;
    private String estado_civil;
    private Date fecha_cambio_estado_civil = new Date();

    // Constructor por defecto
    public Cliente() {
        super();
    }

    // Constructor con parametros
    public Cliente(final int cantidad_hijos, final List<LugarNacimiento> lugar_nacimiento,
            final List<LugarUbicacion> lugar_ubicacion, final String religion,
            final List<String> hobbies, final List<String> deportes, final String estado_civil,
            final Date fecha_cambio_estado_civil) {
        super();
        this.cantidad_hijos = cantidad_hijos;
        this.lugar_nacimiento = lugar_nacimiento;
        this.lugar_ubicacion = lugar_ubicacion;
        this.religion = religion;
        this.hobbies = hobbies;
        this.deportes = deportes;
        this.estado_civil = estado_civil;
        this.fecha_cambio_estado_civil = fecha_cambio_estado_civil;
    }

    public int getCantidad_hijos() {
        return cantidad_hijos;
    }

    public void setCantidad_hijos(int cantidad_hijos) {
        this.cantidad_hijos = cantidad_hijos;
    }

    public List<LugarNacimiento> getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(List<LugarNacimiento> lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public List<LugarUbicacion> getLugar_ubicacion() {
        return lugar_ubicacion;
    }

    public void setLugar_ubicacion(List<LugarUbicacion> lugar_ubicacion) {
        this.lugar_ubicacion = lugar_ubicacion;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public List<String> getDeportes() {
        return deportes;
    }

    public void setDeportes(List<String> deportes) {
        this.deportes = deportes;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public Date getFecha_cambio_estado_civil() {
        return fecha_cambio_estado_civil;
    }

    public void setFecha_cambio_estado_civil(Date fecha_cambio_estado_civil) {
        this.fecha_cambio_estado_civil = fecha_cambio_estado_civil;
    }
}
