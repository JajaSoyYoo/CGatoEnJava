
package act5;

import java.util.HashMap;
import java.util.Map;

public class TablaSimbolos {//nombres de variables, constantes, metodos, clases
    private Map<String,Simbolo> tabla;
    
    public TablaSimbolos(){
        tabla=new HashMap<>();
    }
    
    public boolean agregar(String nombre, Simbolo simbolo){
        if (tabla.containsKey(nombre))
            return false;
        else{
            tabla.put(nombre, simbolo);
            return true;
        }
    }
    
    public boolean verificar(String nombre){
        return tabla.containsKey(nombre);
    }
    
    public Simbolo obtenerSimbolo(String nombre){
        return tabla.get(nombre);
    }
    
    
    public String mostrar(){
        String simbolos = "";
        for (Simbolo value : tabla.values()) {
            simbolos+=value;
        }
        return simbolos;
    }
}
