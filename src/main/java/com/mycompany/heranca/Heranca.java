

package com.mycompany.heranca;

import com.mycompany.heranca.atendente.*;
import com.mycompany.heranca.medico.*;
import com.mycompany.heranca.consultor.*;

public class Heranca {

    public static void main(String[] args) {

        //Atendentes
        System.out.println("");
        System.out.println("Testando atendentes....");

        System.out.println("-- Gerente --");
        Gerente gerente = new Gerente("Malaquias", "Sênior", "Noturno", "Pediatria", 40 );
        gerente.rotacionarFuncionarios();

        System.out.println("-- Supervisor --");
        Supervisor supervisor = new Supervisor( "Alexnilton", gerente,new String[]{"Emergência", "Raio X"}, "Coordenação", 48);
        supervisor.aceitarRelatorio();
        supervisor.getResponsavel();

        //Médicos
        System.out.println("");
        System.out.println("Testando médicos....");

        System.out.println("-- Diretores (líderes de residentes e internos) --");
        Diretor medicoDiretor = new Diretor("Sudeste", "9999", "Clínico Geral");
        Diretor medicoDiretor2 = new Diretor("Centro oeste", "8888", "Clínico Geral");

        System.out.println("-- Residente --");
        Residente medicoResidente = new Residente(true, new String[]{"Terça", "Sexta"}, medicoDiretor2, "8855", "Pediatra" );
        medicoResidente.getSupervisor();

        System.out.println("-- Interno --");
        Interno medicoInterno = new Interno("Manhã", "Medicina", medicoDiretor, true, "4040", "Ginecologista");
        medicoInterno.setResponsavel(medicoDiretor2);
        medicoInterno.reportarResponsavel();


    }
}
