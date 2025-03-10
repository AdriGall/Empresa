
package Empresa;
// declaracion de clase
public class Empleados {
    //Atributos
    private String nombre;
    private int edad;
    private int Noempleado;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNoempleado() {
        return Noempleado;
    }

    public Empleados(String nombre, int edad, int Noempleado) {
        this.nombre = nombre;
        this.edad = edad;
        this.Noempleado = Noempleado;
    }
    
    
    
}

