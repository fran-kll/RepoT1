/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t1sem6;

/**
 *
 * @author UCA40418
 */
public class Alumno
{
    private String nombre;
    private String app_paterno; 
    private String app_materno; 
    private String tipo_doc; 
    private String nro_doc;
    private String nivel_social;
    private String tipo_beca;
    
    public Alumno(String nombre, String app_paterno, String app_materno,
              String tipo_doc, String nro_doc,
              String nivel_social, String tipo_beca)
    {
        this.nombre = nombre;
        this.app_paterno = app_paterno;
        this.app_materno = app_materno;
        this.tipo_doc = tipo_doc;
        this.nro_doc = nro_doc;
        this.nivel_social = nivel_social;
        this.tipo_beca = tipo_beca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApp_paterno() {
        return app_paterno;
    }

    public void setApp_paterno(String app_paterno) {
        this.app_paterno = app_paterno;
    }

    public String getApp_materno() {
        return app_materno;
    }

    public void setApp_materno(String app_materno) {
        this.app_materno = app_materno;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public String getNro_doc() {
        return nro_doc;
    }

    public void setNro_doc(String nro_doc) {
        this.nro_doc = nro_doc;
    }

    public String getNivel_social() {
        return nivel_social;
    }

    public void setNivel_social(String nivel_social) {
        this.nivel_social = nivel_social;
    }

    public String getTipo_beca() {
        return tipo_beca;
    }

    public void setTipo_beca(String tipo_beca) {
        this.tipo_beca = tipo_beca;
    }

    
    
}
