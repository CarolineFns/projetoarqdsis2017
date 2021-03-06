package bean;

public class CardapioTO {

	private int id;
	private String tipo, disponibilidade, descricao;
	private double preco;

	public CardapioTO() {
		this.tipo = tipo;
		this.disponibilidade = disponibilidade;
		this.descricao = descricao;
		this.preco = preco;
	}

	public CardapioTO(int id, String tipo, String disponibilidade, String descricao, double preco) {
		this.id = id;
		this.tipo = tipo;
		this.disponibilidade = disponibilidade;
		this.descricao = descricao;
		this.preco = preco;
	}

	public CardapioTO(String tipo, String disponibilidade, String descricao, double preco) {
		this.id = id;
		this.tipo = tipo;
		this.disponibilidade = disponibilidade;
		this.descricao = descricao;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "CardapioTO [id=" + id + ", tipo=" + tipo + ", disponibilidade=" + disponibilidade + ", descricao="
				+ descricao + ", preco=" + preco + ", getId()=" + getId() + ", getTipo()=" + getTipo()
				+ ", getDisponibilidade()=" + getDisponibilidade() + ", getDescricao()=" + getDescricao()
				+ ", getPreco()=" + getPreco() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
