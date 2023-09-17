package set.ConjuntoConvidados;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return this.nome;
    }

    public int getCodigoConvite() {
        return this.codigoConvite;
    }

    @Override
    public String toString() {
        return "{" +
                " nome='" + getNome() + "'" +
                ", codigoConvite='" + getCodigoConvite() + "'" +
                "}";
    }

}
