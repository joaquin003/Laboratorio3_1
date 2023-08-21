package lab3_lp2_1;

public class Gerente extends Empleado{
    private String empresa;
    
    public Gerente(String nombre, String apellido, String empresa){
        super(nombre, apellido);
        this.empresa = empresa;
    }
}
