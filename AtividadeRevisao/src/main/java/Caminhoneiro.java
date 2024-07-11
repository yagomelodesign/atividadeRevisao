//1. Crie uma classe para armazenar os dados de um caminhoneiro.

public class Caminhoneiro {
    private String nome;
    private String placa;
    private String horarioChegada;

    public Caminhoneiro(String nome, String placa, String horarioChegada) {
        this.nome = nome;
        this.placa = placa;
        this.horarioChegada = horarioChegada;
    }

    public String getNome() {
        return nome;
    }

    public String getPlaca() {
        return placa;
    }

    public String getHorarioChegada() {
        return horarioChegada;
    }
}