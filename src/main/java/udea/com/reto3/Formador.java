
package udea.com.reto3;


public class Formador extends UsuarioMoodle {
    
    //atributos
    public String escalafon;
    
    //contructor

    public Formador(String escalafon, String nombreCompleto, String documentoIdentidad, String password, String correo, String descripcion) {
        super(nombreCompleto, documentoIdentidad, password, correo, descripcion);
        this.escalafon = escalafon;
    }
    
    //setters y getters
    public String getEscalafon() {
        return escalafon;
    }

    public void setEscalafon(String escalafon) {
        this.escalafon = escalafon;
    }
    
    //metodo
    public void calificar(Tripulante tripulanteACalificar, int k){
        if(tripulanteACalificar.getEntregas()[k] != true){
            tripulanteACalificar.getCalificaciones()[k] = 0;
        }else{
            tripulanteACalificar.getCalificaciones()[k] = 5;
        }//fin if
    }// fin metodo
}

