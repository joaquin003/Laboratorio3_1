package lab3_lp2_1;

/**

 * Esta clase es para probar las otras clases

 * @author: Grupo 2

 * @version: 21/08/2023

 */

public class Lab3_lp2_1 {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Joaquin", "Uliambre");
        Gerente gerente = new Gerente("Roberto", "Yudis", "Super6");
        TecnicoMantenimiento tecnico = new TecnicoMantenimiento("Fernando", "Vera");
        Informatico informatico = new Informatico("David", "Martinez");
        Operador operador = new Operador("Sofia", "Vergara");
        Programador programador = new Programador("Lucia", "Gonzalez");
        Analista analista = new Analista("Jose", "Gonzalez");

        System.out.println(empleado.toString());
        System.out.println(gerente.toString());
        System.out.println(tecnico.toString());
        System.out.println(informatico.toString());
        System.out.println(operador.toString());
        System.out.println(programador.toString());
        System.out.println(analista.toString());
    }

}
