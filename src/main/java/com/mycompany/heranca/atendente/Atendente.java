package com.mycompany.heranca.atendente;

abstract class Atendente {
    
    private String setor;
    protected int cargaHoraria;

    public Atendente(String setor, int cargaHoraria) {
        this.setor = setor;
        this.cargaHoraria = cargaHoraria;
    }
    

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
