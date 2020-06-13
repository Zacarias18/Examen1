package clase1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Estudiantes
{
   String Nombre;
   String Apellido;
   private int Edad;
   String Cedula;
   String Genero;
   int Trimestre;
   String Carrera;
   int A_ingreso;
   String Correo;
   
   Estudiantes(String nombre, String apellido, String cedula)
   {
       this.Nombre = nombre;
       this.Apellido = apellido;
       this.Cedula = cedula;
   }
   void inscribir(){
       System.out.println("Estudiante Inscrito");
   }
   void imprimir_datos_base()
   {
       System.out.println(this.Nombre);
       System.out.println(this.Apellido);
       System.out.println(this.Cedula);
   }
}

public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ingrese nombre");
        String nombre = br.readLine();
        System.out.println("Ingrese apellido");
        String apellido = br.readLine();
        System.out.println("ingrese cedula por favor");
        String cedula = br.readLine();
        System.out.println("");
        Estudiantes estu = new Estudiantes(nombre, apellido, cedula);
    }
    
}
