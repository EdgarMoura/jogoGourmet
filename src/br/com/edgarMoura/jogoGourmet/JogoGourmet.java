package br.com.edgarMoura.jogoGourmet;

public class JogoGourmet {

	private PratoGourmet inicio;
	private final int sim = 0;
	private final int nao = 1;
	AppTelaJogoGourmet appTelaJogoGourmet = new AppTelaJogoGourmet();

	public JogoGourmet() {
		inicio = entrada();
	}

	public void iniciar() {
		perguntar(inicio);
	}
	
	private PratoGourmet entrada() {

		PratoGourmet lasanha = new PratoGourmet("Lasanha", null, null);
		PratoGourmet bolo = new PratoGourmet("Bolo de Chocolate", null, null);
		PratoGourmet massa = new PratoGourmet("Massa", lasanha, bolo);

		return massa;
	}

	private PratoGourmet perguntar(PratoGourmet prato) {
		int escolha = appTelaJogoGourmet.exibirPerguntaPrato(prato.getNome());
		PratoGourmet novoPrato;
		if (this.sim == escolha) {
			if (prato.getSim() == null) {
				appTelaJogoGourmet.exibirMensagemAcertei();
				novoPrato = null;
			} else {
				novoPrato = perguntar(prato.getSim());
				if (novoPrato != null) {
					prato.setSim(novoPrato);
					novoPrato = null;
				}
			}
		}
		if (this.nao == escolha) {
			if (prato.getNao() == null) {
				novoPrato = criarNovoPrato(prato);
			} else {
				novoPrato = perguntar(prato.getNao());
				if (novoPrato != null) {
					prato.setNao(novoPrato);
					novoPrato = null;
				}
			}
		} else {
			novoPrato = null;
		}

		return novoPrato;
	}

	private PratoGourmet criarNovoPrato(PratoGourmet prato) {
		String novoNome = appTelaJogoGourmet.exibirPerguntaNovoPrato();

		if (novoNome != null) {
			novoNome = novoNome.trim();
			if (!novoNome.isEmpty()) {
				PratoGourmet novo = new PratoGourmet(novoNome, null, null);

				String novoTipoPrato = appTelaJogoGourmet.exibirPerguntaNovoTipoPrato(novoNome, prato.getNome());

				PratoGourmet novoPratoInserido = new PratoGourmet(novoTipoPrato, novo, prato);
				return novoPratoInserido;
			}
		}
		return null;

	}

}
