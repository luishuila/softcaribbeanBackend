/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.softcaribbean.pruebas.Models;

import java.time.LocalDate;

import javax.persistence.*;

/**
 *
 * @author Luis Alfonso
 */
@Entity
@Table(name = "Customer")
public class CustomerModels {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial", unique = true, nullable = false, name = "nmid")
    private Long nmid;

    @Column(columnDefinition = "bigint", name = "cus_nmcliente")
    private Long nmcliente;

    @Column(length = 120, name = "cus_dsnombres")
    private String nombres;
    @Column(length = 120, name = "cus_dsapellidos")
    private String apellidos;

    @Column(length = 120, name = "cus_dsdireccion")
    private String dsdireccion;

    @Column(length = 120, name = "cus_dscorreo")
    private String dscorreo;

    @Column(length = 120, name = "cus_cdtelefono")
    private String telefono;

    @Column(length = 120, name = "cus_cdtelefonoalter")
    private String cdtelefonoalter;

    @Column(length = 120, name = "cus_cdcelular")
    private String cdcelular;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "bigint", name = "cus_nmcargo")    
    private Long idcargo;

    @Column(length = 120, name = "cus_dscargo")
    private String cargo;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "integer", name = "cus_nmciudad")
    private Long idciudad;

    @Column(length = 120, name = "cus_dsciudad")
    private String ciudad;

    @Column(name = "cus_fenacimiento")
    private LocalDate fenacimiento;

    @Column(length = 120, name = "cus_genero")
    private String genero;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "integer", name = "cus_nmcomunidad")
    private Long idcomunidad;

    @Column(length = 120, name = "cus_dscomunidad")
    private String comunidad;

    @Column(length = 120, name = "cus_dsempresalabora")
    private String empresalabora;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "integer", name = "cus_nmdivision")
    private Long iddivision;

    @Column(length = 120, name = "cus_dsdivision")
    private String cus_dsdivision;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "integer", name = "cus_nmpais")
    private Long idpais;

    @Column(length = 120, name = "cus_dspais")
    private String pais;

    @Column(columnDefinition = "text", length = 120, name = "cus_hobbies")
    private String hobbies;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public Long getId() {
        return nmid;
    }

    public void setId(Long id) {
        this.nmid = id;
    }

    public Long getNmcliente() {
        return nmcliente;
    }

    public void setNmcliente(Long nmcliente) {
        this.nmcliente = nmcliente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDsdireccion() {
        return dsdireccion;
    }

    public void setDsdireccion(String dsdireccion) {
        this.dsdireccion = dsdireccion;
    }

    public String getDscorreo() {
        return dscorreo;
    }

    public void setDscorreo(String dscorreo) {
        this.dscorreo = dscorreo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String cus_cdtelefono) {
        this.telefono = cus_cdtelefono;
    }

    public String getCdtelefonoalter() {
        return cdtelefonoalter;
    }

    public void setCdtelefonoalter(String cdtelefonoalter) {
        this.cdtelefonoalter = cdtelefonoalter;
    }

    public String getCdcelular() {
        return cdcelular;
    }

    public void setCdcelular(String cdcelular) {
        this.cdcelular = cdcelular;
    }

    public Long getIdcargo() {
        return idcargo;
    }

    public void setIdcargo(Long idcargo) {
        this.idcargo = idcargo;
    }

    

    public Long getIdciudad() {
        return idciudad;
    }

    public void setIdciudad(Long idciudad) {
        this.idciudad = idciudad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public LocalDate getFenacimiento() {
        return fenacimiento;
    }

    public void setFenacimiento(LocalDate fenacimiento) {
        this.fenacimiento = fenacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Long getIdcomunidad() {
        return idcomunidad;
    }

    public void setIdcomunidad(Long idcomunidad) {
        this.idcomunidad = idcomunidad;
    }

    public String getComunidad() {
        return comunidad;
    }

    public void setComunidad(String comunidad) {
        this.comunidad = comunidad;
    }

    public String getEmpresalabora() {
        return empresalabora;
    }

    public void setEmpresalabora(String empresalabora) {
        this.empresalabora = empresalabora;
    }

    public Long getIddivision() {
        return iddivision;
    }

    public void setIddivision(Long iddivision) {
        this.iddivision = iddivision;
    }

    public String getCus_dsdivision() {
        return cus_dsdivision;
    }

    public void setCus_dsdivision(String cus_dsdivision) {
        this.cus_dsdivision = cus_dsdivision;
    }

    public Long getIdpais() {
        return idpais;
    }

    public void setIdpais(Long idpais) {
        this.idpais = idpais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
}
