

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
        Supervisor supervisor = new Supervisor(new String[]{"Emergência", "Raio X"}, "Coordenação", 48);
        supervisor.aceitarRelatorio();

        //Consultores
        System.out.println("");
        System.out.println("Testando consultores....");

        System.out.println("-- Consultor De Vendas --");
        ConsultorDeVendas consultorDeVendas = new ConsultorDeVendas("01.131.500/0001-25","Administração", 53, "Plano de saúde para crianças");
        consultorDeVendas.venderProduto();

        System.out.println("-- Consultor Financeiro --");
        ConsultorFinanceiro consultorFinanceiro = new ConsultorFinanceiro("79.304.886/0001-17", "Ciências Contábeis",true);
        consultorFinanceiro.recomendarInvestimento();

        System.out.println("-- Consultor Juridico --");
        ConsultorJuridico consultorJuridico = new ConsultorJuridico("99.291.513/0001-66","Direito","5500", "Trabalhista");
        consultorJuridico.consultarProcesso();

        //Médicos
        System.out.println("");
        System.out.println("Testando médicos....");

        System.out.println("-- Diretor --");
        Diretor medicoDiretor = new Diretor("Principal", "9999", "Clínico Geral");
        medicoDiretor.mudarTurnos();

        Diretor medicoDiretor2 = new Diretor("sei la", "9922299", "Clínico");

        System.out.println("-- Residente --");
        Residente medicoResidente = new Residente(true, new String[]{"Terça", "Sexta"}, "João", "8855", "Pediatra" );
        medicoResidente.substituirMedico();

        System.out.println("-- Interno --");
        Interno medicoInterno = new Interno("Manhã", "Medicina", medicoDiretor, true, "4040", "Ginecologista");
        medicoInterno.setTurno("Tarde");
        medicoInterno.setResponsavel(medicoDiretor2);
        medicoInterno.reportarResponsavel();
    }
}
