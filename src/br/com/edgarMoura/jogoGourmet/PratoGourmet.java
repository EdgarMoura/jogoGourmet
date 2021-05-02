package br.com.edgarMoura.jogoGourmet;

public class PratoGourmet {

	private String nome;
	private PratoGourmet sim;
	private PratoGourmet nao;

	public PratoGourmet(String nome, PratoGourmet sim, PratoGourmet nao) {
		this.nome = nome;
		this.sim = sim;
		this.nao = nao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public PratoGourmet getSim() {
		return sim;
	}

	public void setSim(PratoGourmet sim) {
		this.sim = sim;
	}

	public PratoGourmet getNao() {
		return nao;
	}

	public void setNao(PratoGourmet nao) {
		this.nao = nao;
	}	

}
