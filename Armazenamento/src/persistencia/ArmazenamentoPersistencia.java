package persistencia;

import java.util.ArrayList;
import java.util.List;
import entidades.Armazenamento;

public class ArmazenamentoPersistencia {
	private static List<Armazenamento> colecao = new ArrayList<Armazenamento>();

	public static void adicionarNaColecao(Armazenamento x) {
		colecao.add(x);
	}

	public static Armazenamento buscarVolume(Armazenamento x) {
		for (Armazenamento objArm : colecao) {
			if (objArm.getTipoArmazenamento() == x.getTipoArmazenamento()) {
				return objArm;
			}

		}
		return null;
	}

	public static void atualizarColecao(Armazenamento x) {
		int i = 0;
		for (Armazenamento objArm : colecao) {
			if (objArm.getTipoArmazenamento() == x.getTipoArmazenamento()) {
				colecao.set(i, x);
				return;
			}
			i++;
		}
	}

}