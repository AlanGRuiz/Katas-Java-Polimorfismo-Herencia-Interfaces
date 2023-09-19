public class TestFuncionario {

    public static void main(String[] args) {
        Funcionario diego = new Funcionario();
        diego.setDocumento("Diego");
        diego.setDocumento("345234523");
        diego.setSalario(2000);
        diego.setTipo(0);

        System.out.println(diego.getSalario());
        System.out.println(diego.getBonificacion());
    }
}