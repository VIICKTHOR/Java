package main_Pack;

public class Main {

	public static void main(String[] args) {
		
		Endereço e = new Endereço();
		
		e.empregado.nome="Zézinho da Silva";
		e.empregado.CPF="000.000.000-00";
		
		e.empresa.cnpj="00.000.000/0000-00";
		e.empresa.razaoSocial="Fulano Construções";
		
		e.cep = 75706125;
		e.estado = "Goiás";
		e.cidade = "Catalão";
		e.bairro = "Setor Universitário";
		e.rua = "Rua Geraldo Belo da Silva";
		e.numero = 6;
		e.complemento = "Empresa";

	}

}
