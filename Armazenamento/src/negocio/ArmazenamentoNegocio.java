package negocio;
import entidades.Armazenamento;
public class ArmazenamentoNegocio {
	public static Armazenamento gravarDados(Armazenamento armazenamento, float valor) {
		armazenamento.setQuantidadeGB(armazenamento.getQuantidadeGB() + valor);
		return armazenamento;
	}
	
	public static boolean verificarEspaco(Armazenamento armazenamento, float valor) {
	if(armazenamento.getQuantidadeGB() + armazenamento.getMemoriaOcupada() <= valor) {
		return false;
	}
	else {
		return true;
	}
}

	public static Armazenamento deletar(Armazenamento armazenamento, float valor) {
		armazenamento.setQuantidadeGB(armazenamento.getQuantidadeGB() - valor);
		return armazenamento;
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
