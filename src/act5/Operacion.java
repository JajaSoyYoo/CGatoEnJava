
package act5;

/**
 *
 * @author nanon
 */
public class Operacion {
    public static String convInt(String num1, String op, String num2){
        String resultado;
        int temp1 = Integer.parseInt(num1);
        int temp2 = Integer.parseInt(num2);
        int res = 0;
        if("+".equals(op)){
        res = temp1+temp2;
        }
        if("-".equals(op)){
        res = temp1-temp2;
        }
        if("*".equals(op)){
        res = temp1*temp2;
        }
        if("/".equals(op)){
        res = temp1/temp2;
            if (temp2 != 0) {
                res = temp1 / temp2;
            } else {
                return "error"; // Manejo de error
            }
        }
        resultado = String.valueOf(res);
        
        return resultado;
    }
    
    
    public static String convFloat(String num1, String op, String num2) {
    String resultado;
    float temp1 = Float.parseFloat(num1); 
    float temp2 = Float.parseFloat(num2); 
    float res = 0;

    if ("+".equals(op)) {
        res = temp1 + temp2;
    }
    if ("-".equals(op)) {
        res = temp1 - temp2;
    }
    if ("*".equals(op)) {
        res = temp1 * temp2;
    }
    if ("/".equals(op)) {
        // Verificar división por cero
        if (temp2 != 0) {
            res = temp1 / temp2;
        } else {
            return "error"; // Manejo de error
        }
    }

    resultado = String.valueOf(res); // Convertir el resultado a String
    return resultado;
    
    }
    
    public static Boolean verifico(String num1, String op, String num2){
        boolean siono = false;
        int temp1 = Integer.parseInt(num1);
        int temp2 = Integer.parseInt(num2);
        if("==".equals(op)){
            if(temp1 == temp2)
                siono = true;
            else
                siono = false;
        }
        if("!=".equals(op)){
            if(temp1 != temp2)
                siono = true;
            else
                siono = false;
        }
        if(">".equals(op)){
            if(temp1 > temp2)
                siono = true;
            else
                siono = false;
        }
        if("<".equals(op)){
            if(temp1 < temp2)
                siono = true;
            else
                siono = false;
        }
        if("<=".equals(op)){
            if(temp1 <= temp2)
                siono = true;
            else
                siono = false;
        }
        if(">=".equals(op)){
            if(temp1 >= temp2)
                siono = true;
            else
                siono = false;
        }
        return siono;
    }
    
}
