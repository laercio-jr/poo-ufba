
package com.mycompany.heranca.medico;

import com.mycompany.heranca.interfaces.ILider;

public class Diretor extends Medico implements ILider {
    private String nome;
    private String enfermarias;

    public Diretor(String enfermarias, String crm, String especialidade) {
        super(crm, especialidade);
        this.nome = "Jubileuton";
        this.enfermarias = enfermarias;
    }

    public void mudarTurnos() {
        System.out.println("Esse diretor, de crm " + this.getCrm() + " vai mudar "
                + "os turnos dos internos e"
                + " dos residentes");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnfermarias() {
        return enfermarias;
    }

    public void setEnfermarias(String enfermarias) {
        this.enfermarias = enfermarias;
    }

    @Override
    public void solicitarDesligamento() {
        System.out.println("Esse diretor vai solicitar o desligamento "
                + "de algum medico ou residente");
    }

    @Override
    public void rotacionarFuncionarios() {
        System.out.println("Esse diretor vai rotacionar os horarios de medicos "
                + " e residentes");
    }
    
    
    
}
