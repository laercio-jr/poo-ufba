package com.mycompany.heranca.atendente;

abstract class Atendente {
    private String nome;
    private String setor;
    protected int cargaHoraria;

    public Atendente(String nome, String setor, int cargaHoraria) {
        this.nome = nome;
        this.setor = setor;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
   
}
