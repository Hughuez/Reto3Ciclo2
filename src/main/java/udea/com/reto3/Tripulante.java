
package udea.com.reto3;


public class Tripulante extends UsuarioMoodle {
    
    //atributos
    private double[] calificaciones; 
    private boolean [] entregas;

    //constructor

    public Tripulante(String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion, int n) {
        super(nombreCompleto, documentoIdentidad, password, correo, descripcion);
        this.calificaciones = new double[n];
        this.entregas = new boolean[n];
        for(int i = 0; i<this.entregas.length; i++){
            entregas[i] = false;
        }//fin for
    }

    
    //setters y getters
    public double[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public boolean[] getEntregas() {
        return entregas;
    }

    public void setEntregas(boolean[] entregas) {
        this.entregas = entregas;
    }
    
    //metodo
        
    public void resolverReto(int retoAEntregar){
        if(entregas[retoAEntregar] != true){
            entregas[retoAEntregar] = true;
        }
    }//fin metodo
    
    
    
    
    /**/
    public void mostrarDatos(){
    System.out.println("Nombre: " + getNombreCompleto() + 
            "\nDocumento de identidad: " + getDocumentoIdentidad() + 
            "\nContraseña: " + getPassword() + //atributo heredado de la clase persona
            "\nCorreo : " + getCorreo() + // atributo propio de la clase estudiante, no necesita getter
            "\nDescripción : " + getDescripcion() + 
            "\nCalificaciones: " + getCalificaciones()[0] + " " + getCalificaciones()[1] + " " + getCalificaciones()[2] + " " + getCalificaciones()[3] + " " + getCalificaciones()[4] +
            "\nEntregas: " + " " + getEntregas()[0] + " " + getEntregas()[1] + " " + getEntregas()[2] + " " + getEntregas()[3] + " " + getEntregas()[4]); 
    }
    
}
