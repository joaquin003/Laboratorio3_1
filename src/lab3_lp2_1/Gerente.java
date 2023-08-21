package lab3_lp2_1;

/**
 *
 * Esta clase define objetos que contienen datos de un gerente
 *
 * @author: Grupo 2
 *
 * @version: 21/08/2023
 *
 */
public class Gerente extends Empleado {

    private String empresa;

    /*
     * Constructor para la clase Gerente
    
     * @param nombre El parámetro nombre define el nombre del Gerente
    
     * @param apellido El parámetro apellido define el apellido del Gerente
     */
    public Gerente(String nombre, String apellido, String empresa) {
        super(nombre, apellido);
        this.empresa = empresa;
    } // cierre del constructor
}
