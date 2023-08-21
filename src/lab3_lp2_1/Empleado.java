package lab3_lp2_1;

/**

 * Esta clase define objetos que contienen datos de un empleado

 * @author: Grupo 2

 * @version: 21/08/2023

 */

public class Empleado {

    private String nombre;
    private String apellido;
    
    /*
     * Constructor para la clase Empleado
    
     * @param nombre El parámetro nombre define el nombre del empleado
    
     * @param apellido El parámetro apellido define el apellido del empleado
    */
    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    } // cierre del constructor

    @Override
    public String toString() {
        return String.format("%s %s", nombre, apellido);
    } // cierre del metodo
}
