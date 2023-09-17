package set.CadastroProdutos;

import java.util.Comparator;
import java.util.Objects;

import set.AgendaContatos.Contato;

public class Produto implements Comparable<Produto> {
    private long codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public long getCodigo() {
        return this.codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Produto produto))
            return false;
        return getCodigo() == produto.getCodigo();
    }

    public int hashCode() {
        return Objects.hashCode(getCodigo());
    }

    @Override
    public String toString() {
        return "{" +
                " codigo='" + getCodigo() + "'" +
                ", nome='" + getNome() + "'" +
                ", preco='" + getPreco() + "'" +
                ", quantidade='" + getQuantidade() + "'" +
                "}";
    }

}

class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());

    }

}