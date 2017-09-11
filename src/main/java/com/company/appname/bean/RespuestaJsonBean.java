package com.company.appname.bean;

/**
 * Clase que representa una respuesta json
 * @author OMartinez, V1.1
 * @version 1.0, 14/08/2016
 */
public class RespuestaJsonBean {
    
    private String estatus;
    private String mensaje;
    private String valor;

    public RespuestaJsonBean() {
    }

    public RespuestaJsonBean(String estatus, String mensaje) {
        this.estatus = estatus;
        this.mensaje = mensaje;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
}
