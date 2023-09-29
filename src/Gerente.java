//Gerente es un Funcionario
public class Gerente extends Funcionario {

    private String clave;

    public void setClave(String clave){
        this.clave = clave;
    }

    public boolean iniciarSesion(String clave){
        return clave == "AluraCursosOnLine";
    }

    //sobre-escritura del método
    public double getBonificacion(){
        return super.getSalario() + super.getBonificacion();
    }
}