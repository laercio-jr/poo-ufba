
package com.mycompany.heranca.atendente;


import com.mycompany.heranca.interfaces.ILider;
import java.util.Arrays;

public class Supervisor extends Atendente implements ILider {
    private String[] setoresResponsavel;
    private Gerente responsavel;

    public Supervisor(String nome, Gerente responsavel, String[] setoresResponsavel, String setor, int cargaHoraria) {
        super(nome, setor, cargaHoraria);
        this.responsavel = responsavel;
        this.setoresResponsavel = setoresResponsavel;
    }
 
    public void status() {
        System.out.println("Esse supervisor é responsavel pelos setores    "
        + Arrays.toString(this.getSetoresResponsavel()));
    }
    public void aceitarRelatorio() {
        System.out.println("Um novo relatorio foi entregue,"
                + " o supervisor vai aceitar");
    }

    public Gerente getResponsavel() {
        return responsavel;
    }
    public void setResponsavel(Gerente responsavel) {
        this.responsavel = responsavel;
    }

    public String[] getSetoresResponsavel() {
        return setoresResponsavel;
    }

    public void setSetoresResponsavel(String[] setoresResponsavel) {
        this.setoresResponsavel = setoresResponsavel;
    }


    @Override
    public void solicitarDesligamento() {
        System.out.println("Solicitando desligamento...");
    }

    @Override
    public void rotacionarFuncionarios() {
        System.out.println("Apenas gerentes podem rotacionar funcionarios");
    }
}
