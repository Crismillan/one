/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package prueba3.Negocio;
import prueba3.Conexion.conexion;

public class Usuario {

    private int id_usuario;
    private String nombre;
    private int rut;
    private String apepat;
    private String apemat;
    private int id_mascota;
    conexion con;

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getApepat() {
        return apepat;
    }

    public void setApepat(String apepat) {
        this.apepat = apepat;
    }

    public String getApemat() {
        return apemat;
    }

    public void setApemat(String apemat) {
        this.apemat = apemat;
    }

    public int getId_mascota() {
        return id_mascota;
    }

    public void setId_mascota(int id_mascota) {
        this.id_mascota = id_mascota;
    }

    public conexion getCon() {
        return con;
    }

    public void setCon(conexion con) {
        this.con = con;
    }

    
    
    
    
    
    public void save() {
        con.setEjecutar("insert into usuarios(id_usuarios,rut,nombre,apepat,apemat,id_mascota) values('" + this.id_usuario + "','" + this.rut + "','"+this.nombre+"','" + this.apepat + "','" + this.apemat + "','" + this.id_mascota + "')");
    }

    public void delete() {
        con.setEjecutar("delete from usuarios where usuario_id='" + this.id_usuario + "'");
    }

    public void update() {
        con.setEjecutar("update usuarios set rut='" + this.rut + "', nombre='" + this.nombre + "',apepat='" + this.apepat + "',apemat='"+this.apemat+"' where  id_usuario='" + this.id_usuario + "'");
    }

}
