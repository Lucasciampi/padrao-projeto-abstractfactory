package org.example;

public class FabricaRelatorioInterno implements FabricaRelatorio {

    @Override
    public RelatorioFuncionario criarRelatorioFuncionario() {
        return new RelatorioFuncionarioInterno();
    }

    @Override
    public RelatorioProjeto criarRelatorioProjeto() {
        return new RelatorioProjetoInterno();
    }
}
