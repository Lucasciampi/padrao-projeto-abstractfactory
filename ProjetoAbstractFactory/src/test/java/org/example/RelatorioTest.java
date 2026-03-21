package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RelatorioTest {

    @Test
    void deveEmitirRelatorioFuncionarioInterno() {
        FabricaRelatorio fabrica = new FabricaRelatorioInterno();
        Relatorio relatorio = new Relatorio(fabrica);
        assertEquals("Relatório de Funcionários Internos", relatorio.emitirRelatorioFuncionario());

    }

    @Test
    void deveEmitirRelatorioFuncionarioTerceirizado() {
        FabricaRelatorio fabrica = new FabricaRelatorioTerceirizado();
        Relatorio relatorio = new Relatorio(fabrica);
        assertEquals("Relatório de Funcionários Terceirizados", relatorio.emitirRelatorioFuncionario());
    }

    @Test
    void deveEmitirRelatorioProjetoInterno() {
        FabricaRelatorio fabrica = new FabricaRelatorioInterno();
        Relatorio relatorio = new Relatorio(fabrica);
        assertEquals("Relatório de Projetos Internos", relatorio.emitirRelatorioProjeto());
    }

    @Test
    void deveEmitirRelatorioProjetoTerceirizado() {
        FabricaRelatorio fabrica = new FabricaRelatorioTerceirizado();
        Relatorio relatorio = new Relatorio(fabrica);
        assertEquals("Relatório de Projetos Terceirizados", relatorio.emitirRelatorioProjeto());
    }


}