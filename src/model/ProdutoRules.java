package model;

public class ProdutoRules {
	public String validarCadastro(Produto produto) {
		if (produto.codigo <= 0) {
			return "C�digo n�o informado.";
		}
		if (produto.nome == null || produto.nome.equals("")) {
			return "Produto n�o pode ficar vazio.";
		}
		if (produto.preco <= 0) {
			return "Valor Obrigat�rio";
		}
		if (produto.quantidade <= 0) {
			return "Informe a quantidade.";
		}
		if (produto.compatibilidadeSoftware == null || produto.compatibilidadeSoftware.size() <= 0) {
			return "Informe ao menos uma compatibilidade de Software.";
		}
		if (validarCompatibilidadeHardware(produto)) {
			return "Informe ao menos uma compatibilidade de HardWare.";
		}
		return null;
	}

	public boolean validarCompatibilidadeHardware(Produto produto) {
		boolean valido = true;
		if (produto.compatibilidadeHardware.slot == null || produto.compatibilidadeHardware.slot.equals("")) {
			valido = false;
		} else if (produto.compatibilidadeHardware.modelo == null
				|| produto.compatibilidadeHardware.modelo.equals("")) {
			valido = false;
		} else if (produto.compatibilidadeHardware.encapsulamento == null
				|| produto.compatibilidadeHardware.encapsulamento.equals("")) {
			valido = false;
		}
		return valido;
	}
}
