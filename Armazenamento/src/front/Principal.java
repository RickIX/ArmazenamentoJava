package front;

import entidades.Armazenamento;
import negocio.ArmazenamentoNegocio;
import persistencia.ArmazenamentoPersistencia;
public class Principal {

	public static void main(String[] args) {
		int op;
		float valor;
		Armazenamento armazenamento;

		do {
			System.out.println("1 - Criar objeto de armazenamento");
			System.out.println("2 - Gravar dados");
			System.out.println("3 - Apagar dados");
			System.out.println("4 - Verificar espaço disponível");
			System.out.println("5 - Sair");
			op = Console.readInt("opção: ");
			switch (op) {
			case 1:

				armazenamento = new Armazenamento();
				armazenamento.setTipoArmazenamento(Console.readString());
				armazenamento.setQuantidadeGB(Console.readFloat());

				if (ArmazenamentoPersistencia.buscarVolume(armazenamento) == null) {
					ArmazenamentoPersistencia.adicionarNaColecao(armazenamento);
				} else {
					System.out.println("O Armazenamento informado já existe.");
				}
				break;

			case 2:
				armazenamento = new Armazenamento();
				armazenamento.setTipoArmazenamento(Console.readString());

				if (ArmazenamentoPersistencia.buscarVolume(armazenamento) != null) {
					valor = Console.readFloat();
					if (ArmazenamentoNegocio.verificarEspaco(armazenamento, valor) == true) {
						ArmazenamentoNegocio.gravarDados(armazenamento, valor);
						ArmazenamentoPersistencia.atualizarColecao(armazenamento);
						System.out.println("Dados salvos!");
					} else {
						System.out.println("O valor informado excede o espaco disponivel.");
					}
				} else {
					System.out.println("O armazenamento não existe.");
				}
				break;


			case 3:
				armazenamento = new Armazenamento();
				armazenamento.setTipoArmazenamento("Qual o tipo de volume: ");
				armazenamento = ArmazenamentoPersistencia.buscarVolume(armazenamento);
				if (armazenamento != null) {
					valor = Console.readFloat("Quantos GB deseja apagar: ");
					if (ArmazenamentoNegocio.verificarEspaco(armazenamento, valor) == true) {
						ArmazenamentoNegocio.deletar(armazenamento, valor);
						ArmazenamentoPersistencia.atualizarColecao(armazenamento);
						System.out.println("Os daddos foram excuidos com sucesso.");
					}

				}
				break;

			case 4:
				armazenamento = new Armazenamento();
				armazenamento.setTipoArmazenamento("Qual o tipo de volume: ");
				armazenamento = ArmazenamentoPersistencia.buscarVolume(armazenamento);
				if (armazenamento != null) {
					System.out.println("Tipo de volume: " + armazenamento.getTipoArmazenamento());
					System.out.println("Espaço total: " + armazenamento.getQuantidadeGB());
					System.out.println("Espaço ocupado: " + armazenamento.getMemoriaOcupada());
				}
				break;

			case 5:
				break;
			}
		} while (op != 5);

	}

}
