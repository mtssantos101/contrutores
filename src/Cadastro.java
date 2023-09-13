public class Cadastro {
    public static void main(String[] args) {
        Pessoa matheus = new Pessoa("123.456.789-00", "matheus");
        matheus.setEndereco("Rua das flores ");

        System.out.println(matheus.getNome()+"-"+matheus.getCpf());
    }
}
