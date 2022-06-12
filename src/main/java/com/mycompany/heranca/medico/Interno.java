
package com.mycompany.heranca.medico;


public class Interno extends Medico {
    private String turno;
    private String faculdade;
    private Diretor responsavel;
    private boolean relatorioEntregue;

    public Interno(String turno, String faculdade, Diretor responsavel,
            boolean relatorioEntregue, 
            String crm, String especialidade) {
        super(crm, especialidade);
        this.turno = turno;
        this.faculdade = faculdade;
        this.responsavel = responsavel;
        this.relatorioEntregue = relatorioEntregue;
    }
    
    public void reportarResponsavel(){
        System.out.println("Esse interno estará reportando a " + this.getResponsavel()
        + " sobre a situação da semana ");
    }
    
    public void status(){
        System.out.println("Esse interno é da faculdade  " + this.getFaculdade());
        System.out.println("Tem o responsavel: " + this.getResponsavel());
        System.out.println("Tem o relatorio entregue? " + this.isRelatorioEntregue());
        System.out.println("E é do turno " + this.getTurno());
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getFaculdade() {
        return faculdade;
    }

    public void setFaculdade(String faculdade) {
        this.faculdade = faculdade;
    }

    public String getResponsavel() {
        return responsavel.getNome();
    }

    public void setResponsavel(Diretor responsavel) {
        this.responsavel = responsavel;
    }

    public boolean isRelatorioEntregue() {
        return relatorioEntregue;
    }

    public void setRelatorioEntregue(boolean relatorioEntregue) {
        this.relatorioEntregue = relatorioEntregue;
    }
    
      
    
    
}
