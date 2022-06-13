
package com.mycompany.heranca.medico;

import java.util.Arrays;


public class Residente extends Medico {
    private boolean substituicaoSemanal;
    private String[] diasPlantao;
    private Diretor supervisor;

    public Residente(boolean substituicaoSemanal, String[] diasPlantao, Diretor supervisor, String crm, String especialidade) {
        super(crm, especialidade);
        this.substituicaoSemanal = substituicaoSemanal;
        this.diasPlantao = diasPlantao;
        this.supervisor = supervisor;
    }

    public void substituirMedico() {
       if (this.isSubstituicaoSemanal()) { 
           
           System.out.println("Esse médico, de crm: " + this.getCrm()
                  + " vai subsituir um medico da semana");
       }
    }

    public void status() {
        System.out.println("Os dias de plantao desse residente sao " + 
                Arrays.toString(this.getDiasPlantao()));
        System.out.println("E seu supervisor é " + this.supervisor);
    }

    public boolean isSubstituicaoSemanal() {
        return substituicaoSemanal;
    }

    public void setSubstituicaoSemanal(boolean substituicaoSemanal) {
        this.substituicaoSemanal = substituicaoSemanal;
    }

    public String[] getDiasPlantao() {
        return diasPlantao;
    }

    public void setDiasPlantao(String[] diasPlantao) {
        this.diasPlantao = diasPlantao;
    }

    public String getSupervisor() {
        return supervisor.getNome();
    }

    public void setSupervisor(Diretor supervisor) {
        this.supervisor = supervisor;
    }
    
    
}
