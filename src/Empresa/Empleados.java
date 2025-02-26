
package Empresa;
// declaracion de clase
public class Empleados {
    //Atributos
    String nombre;
    int edad;
    int Noempleado;
    
    //Metodos
    
   //metodo constructor
    public Empleados(String _nombre,int _edad,int _Noempleado){
       nombre = _nombre;
       edad = _edad;
       Noempleado = _Noempleado;
     
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("la edad es: "+edad);
        System.out.println("El numero de empleado es: "+Noempleado);
        
        
    }
}
