# Incidencias : 
```java

import java.util.Random;

public class Incidencia {
    public  enum Estado {
        Pendiente,
        Resuelto
    }
    private  int  code;
    private  int numeroDePuesto;
    private  String motivoDeIncidencia;
    private  Estado estadoDeLaIncidencia;
    private  String solucionDeIncidencia;
    static int num_incidencia = 1;

    public Incidencia( int numeroDePuesto , String motivoDeIncidencia) {
        this.setCode(num_incidencia);
        this.setEstadoDeLaIncidencia(Estado.Pendiente);
        this.setMotivoDeIncidencia(motivoDeIncidencia);
        this.setNumeroDePuesto(numeroDePuesto);
        this.setSolucionDeIncidencia("No ha sido resuelta");
        num_incidencia++;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Estado getEstadoDeLaIncidencia() {
        return estadoDeLaIncidencia;
    }

    public void setEstadoDeLaIncidencia(Estado estadoDeLaIncidencia) {
        this.estadoDeLaIncidencia = estadoDeLaIncidencia;
    }

    public int getNumeroDePuesto() {
        return numeroDePuesto;
    }

    public void setNumeroDePuesto(int numeroDePuesto) {
        this.numeroDePuesto = numeroDePuesto;
    }

    public String getMotivoDeIncidencia() {
        return motivoDeIncidencia;
    }

    public void setMotivoDeIncidencia(String motivoDeIncidencia) {
        this.motivoDeIncidencia = motivoDeIncidencia;
    }

    public String getSolucionDeIncidencia() {
        return solucionDeIncidencia;
    }

    public void setSolucionDeIncidencia(String solucionDeIncidencia) {
        this.solucionDeIncidencia = solucionDeIncidencia;
    }

    public  void solucionarIncidencia(String metodoEmpleado){
        this.estadoDeLaIncidencia=Estado.Resuelto;
        this.setSolucionDeIncidencia(metodoEmpleado);
    }

    @Override
    public String toString() {
        return "Incidencia{" +
                "Codigo=" + this.getCode()+
                ", Puesto=" + this.getNumeroDePuesto() +
                ", MOTIVO='" + this.getMotivoDeIncidencia() + '\'' +
                ", ESTADO=" + this.getEstadoDeLaIncidencia() +
                ", SOLUCION='" + this.getSolucionDeIncidencia() + '\'' +
                '}';
    }
}
```
