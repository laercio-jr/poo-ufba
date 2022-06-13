

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
        Gerente gerente = new Gerente("Malaquias", "S�nior", "Noturno", "Pediatria", 40 );
        gerente.rotacionarFuncionarios();

        System.out.println("-- Supervisor --");
        Supervisor supervisor = new Supervisor( "Alexnilton", gerente,new String[]{"Emerg�ncia", "Raio X"}, "Coordena��o", 48);
        supervisor.aceitarRelatorio();
        supervisor.getResponsavel();

        //M�dicos
        System.out.println("");
        System.out.println("Testando m�dicos....");

        System.out.println("-- Diretores (l�deres de residentes e internos) --");
        Diretor medicoDiretor = new Diretor("Sudeste", "9999", "Cl�nico Geral");
        Diretor medicoDiretor2 = new Diretor("Centro oeste", "8888", "Cl�nico Geral");

        System.out.println("-- Residente --");
        Residente medicoResidente = new Residente(true, new String[]{"Ter�a", "Sexta"}, medicoDiretor2, "8855", "Pediatra" );
        medicoResidente.getSupervisor();

        System.out.println("-- Interno --");
        Interno medicoInterno = new Interno("Manh�", "Medicina", medicoDiretor, true, "4040", "Ginecologista");
        medicoInterno.setResponsavel(medicoDiretor2);
        medicoInterno.reportarResponsavel();


    }
}
