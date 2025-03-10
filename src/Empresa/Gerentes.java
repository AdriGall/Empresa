
package Empresa;

public class Gerentes extends Empleados {
    private String Area;
    private int sueldo;
    
    public Gerentes (String nombre,int edad,int Noempleado,String Area,int sueldo){
        super(nombre,edad,Noempleado);
        this.Area = Area;
        this.sueldo = sueldo;
        
        
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+
                "\nedad: "+getEdad()+
                "\nNo. empleado: "+getNoempleado()+
                "\nArea: "+Area+
                "\nsueldo: "+sueldo);
    }
}
