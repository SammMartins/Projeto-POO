package Program.Interface_graf.conexao;

public class Usuario {

private int id;
private String nome;
private String celular;
private String cpf;


public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getCelular() {
    return celular;
}
public void setCelular(String celular) {
    this.celular = celular;
}
public String getCpf() {
    return cpf;
}
public void setCpf(String novoCpf) {
        if (validarCpf(novoCpf)) {
            cpf = formatarCpf(novoCpf);
        } else {
            throw new IllegalArgumentException("CPF inválido. Por favor, insira um CPF válido.");
        }
    }

    private boolean validarCpf(String cpf) {
        // Implemente a lógica de validação do CPF aqui
        // Você pode utilizar bibliotecas de terceiros ou implementar manualmente a validação do CPF
        // Neste exemplo, consideraremos que qualquer CPF válido possui 11 dígitos

        return cpf != null && cpf.length() == 11;
    }

    private String formatarCpf(String cpf) {
        String parte1 = cpf.substring(0, 3);
        String parte2 = cpf.substring(3, 6);
        String parte3 = cpf.substring(6, 9);
        String parte4 = cpf.substring(9);

        return parte1 + "." + parte2 + "." + parte3 + "-" + parte4;
    }
}


