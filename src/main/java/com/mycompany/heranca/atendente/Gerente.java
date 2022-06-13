

package com.mycompany.heranca.atendente;


import com.mycompany.heranca.interfaces.ILider;

public class Gerente extends Atendente implements ILider {
    private String senioridade;
    private String turno;
    
    
     public Gerente(String nome, String senioridade, String turno, String setor, int cargaHoraria) {
        super(nome, setor, cargaHoraria);

        this.senioridade = senioridade;
        this.turno = turno;
    }
     
    public void status() {
        System.out.println("Esse gerente ("+ this.getNome() + ") está no setor " + this.getSetor() + " e sua carga horária eh " + this.getCargaHoraria());
        System.out.println("Tem a senioridade: " + this.getSenioridade());
        System.out.println("Trabalha no turno: " + this.getTurno());
    }


    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    public void alocarAtendentes() {
        System.out.println("Novos atendentes chegaram, esse gerente vai aloca-los");
        
    }

    public void alterarCargaHoraria(){
        System.out.println("Esse gerente alterou a sua carga horaria mensal");
    }


    @Override
    public void solicitarDesligamento() {
        System.out.println("Você não é um supervisor para solicitar desligamento");
    }

    @Override
    public void rotacionarFuncionarios() {
        System.out.println("Esse gerente rotacionou os funcionarios hoje");

    }
}
