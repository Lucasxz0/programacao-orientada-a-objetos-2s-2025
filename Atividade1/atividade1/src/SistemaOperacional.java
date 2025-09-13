public class SistemaOperacional {
    private Computador computador;

    public SistemaOperacional(Computador computador){
        this.computador = computador;
    }
    public boolean executarPrograma(Programa p){
        if (p.getSSDOcupado() > computador.getSSD()){
            System.out.println("ERRO - Armazenamento cheio");
        return false;
        }
        if (p.getMemoriaRamAlocada() > computador.getmemoriaRam()){
            System.out.println("ERRO- Memoria RAM cheia");
            return false;
        }

        float tempoExecucao = (float) p.getQuantidadeOperacoes() /(computador.getoperacoesPorSegundo() * computador.getnucleos());
        System.out.println("Programa executado com sucesso!");
        System.out.println("Tempo de execução: " + tempoExecucao + " segundos.");
        return true;
    }
    


}
