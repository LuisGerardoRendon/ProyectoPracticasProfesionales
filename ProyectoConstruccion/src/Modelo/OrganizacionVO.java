/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.util.Objects;

/**
 * 
 * @author Luis Gerardo Rendon Martinez
 */
public class OrganizacionVO {
    private String idOrganizacion;
    private String nombre, direccion, ciudad, estado, telefono;
    private  String correoElectronico, sector;

    public OrganizacionVO() {
    }

    public OrganizacionVO(String idOrganizacion, String nombre, String direccion, String ciudad, String estado, String telefono, String correoElectronico, String sector) {
        this.idOrganizacion = idOrganizacion;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.estado = estado;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.sector = sector;
    }

    public OrganizacionVO(String nombre, String direccion, String ciudad, String estado, String telefono, String correoElectronico, String sector) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.estado = estado;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.sector = sector;
        this.idOrganizacion = "null";
    }

    public String getIdOrganizacion() {
        return idOrganizacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getSector() {
        return sector;
    }

    public void setIdOrganizacion(String idOrganizacion) {
        this.idOrganizacion = idOrganizacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OrganizacionVO other = (OrganizacionVO) obj;
        if (!Objects.equals(this.idOrganizacion, other.idOrganizacion)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.ciudad, other.ciudad)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.correoElectronico, other.correoElectronico)) {
            return false;
        }
        if (!Objects.equals(this.sector, other.sector)) {
            return false;
        }
        return true;
    }

    
    

    @Override
    public String toString() {
        return "OrganizacionVO{" + "idOrganizacion=" + idOrganizacion + ", nombre=" + nombre + ", direccion=" + direccion + ", ciudad=" + ciudad + ", estado=" + estado + ", telefono=" + telefono + ", correoElectronico=" + correoElectronico + ", sector=" + sector + '}';
    }
    
    

}
