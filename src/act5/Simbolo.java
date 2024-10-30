
package act5;

import java.util.Objects;

public class Simbolo {
    private String nombre;
    private String tipo;
    private String valor;
    private String ambito;
    private boolean constante;

    public Simbolo(String nombre, String tipo, String valor, String ambito, boolean constante) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.valor = valor;
        this.ambito = ambito;
        this.constante = constante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }

    public boolean isConstante() {
        return constante;
    }

    public void setConstante(boolean constante) {
        this.constante = constante;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.nombre);
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
        final Simbolo other = (Simbolo) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "Simbolo{" + "nombre=" + nombre + ", tipo=" + tipo + ", valor=" + valor + ", ambito=" + ambito + ", constante=" + constante + '}';
    }

    
    
    
}
