package updow;

public class RodarAp {
    public static void main(String[] args) {


        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente(); // upcast e herança simples
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Gerente gerente = new Funcionario();
        Vendedor vendedor = (vendedor) new Funcionario(); //downcast
    }
}