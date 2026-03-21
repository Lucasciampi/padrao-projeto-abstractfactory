package org.example;

public class FabricaRelatorioTerceirizado implements FabricaRelatorio {

    @Override
    public RelatorioFuncionario criarRelatorioFuncionario() {
        return new RelatorioFuncionarioTerceirizado();
    }

    @Override
    public RelatorioProjeto criarRelatorioProjeto() {
        return new RelatorioProjetoTerceirizado();
    }
}
