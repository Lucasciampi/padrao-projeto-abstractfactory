package org.example;

public class Relatorio {

    private RelatorioFuncionario relatorioFuncionario;
    private RelatorioProjeto relatorioProjeto;

    public Relatorio(FabricaRelatorio fabrica) {
        this.relatorioFuncionario = fabrica.criarRelatorioFuncionario();
        this.relatorioProjeto = fabrica.criarRelatorioProjeto();
    }

    public String emitirRelatorioFuncionario() {
        return this.relatorioFuncionario.emitir();
    }

    public String emitirRelatorioProjeto() {
        return this.relatorioProjeto.emitir();
    }

}
