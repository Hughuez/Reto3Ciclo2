

package udea.com.reto3;


public class Principal {

    public static void main(String[] args) {
        
        Formador profe = new Formador("Docente", "Erica Pinto", "12345", "ep", "esteesuncorreo@email.com", "Profesora fundamentos de la programación");
        
        Tripulante estudiante = new Tripulante("andres ocampo", "2352", "fsad", "otrocorreo@email.com", "estudiante ciclo 2", 5);
        
        System.out.println("************ datos ************");
        System.out.println("Profesores: ");
        profe.mostrarDatos();
        System.out.println("-----------------");
        System.out.println("Alumnos: ");
        estudiante.mostrarDatos();
        System.out.println("-----------------");
        
                
        System.out.println("************ modificar datos ************");
        profe.editarPerfil("xxx", "xxx", "xxx", "xxx@xxx.xxx", "otro profe");
        profe.mostrarDatos();
        System.out.println("-----------------");
        estudiante.editarPerfil("zzz", "zzz", "zzz", "zzz@zzz.zzz", "otro tripulante");
        estudiante.mostrarDatos();        System.out.println("-----------------");
        
          estudiante.resolverReto(1);
          estudiante.resolverReto(2);
          estudiante.resolverReto(3);
          
          for (int i = 0; i < 5; i++) {
            profe.calificar(estudiante, i);
        }
          
          System.out.println(estudiante.getCalificaciones()[0] + " " + 
                  estudiante.getCalificaciones()[1] + " " +
                  estudiante.getCalificaciones()[2] + " " +
                  estudiante.getCalificaciones()[3] + " " +
                  estudiante.getCalificaciones()[4]);
          
         System.out.println("************ datos final ************");
          estudiante.mostrarDatos();
          
        
    }
}
