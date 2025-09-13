public class Programa {
    private Integer memoriaRamAlocada;
    private Integer SSDOcupado;
    private Integer nucleos;
    private Integer quantidadeOperacoes;

    public Programa(Integer memoriaRamAlocada, Integer SSDOcupado, Integer nucleos, Integer quantidadeOperacoes){
        this.memoriaRamAlocada = memoriaRamAlocada;
        this.SSDOcupado =   SSDOcupado;
        this.nucleos = nucleos;
        this.quantidadeOperacoes = quantidadeOperacoes;
    }
    public Integer getMemoriaRamAlocada(){
        return memoriaRamAlocada;
    }
    public Integer getSSDOcupado(){
            return SSDOcupado;
    }
    public Integer getNucleos(){
        return nucleos;
    }
    public Integer getQuantidadeOperacoes(){
        return quantidadeOperacoes;
    }

    //set
    public void memoriaRamAlocada(Integer memoriaRamAlocada){
        this.memoriaRamAlocada = memoriaRamAlocada;
    }
    public void SSDOcupado(Integer SSDOcupado){
        this.SSDOcupado = SSDOcupado;
    }
    public void nucleos(Integer nucleos){
        this.nucleos = nucleos;
    }
    public void quantidadeOperacoes(Integer quantidadeOperacoes){
        this.quantidadeOperacoes = quantidadeOperacoes;
    }
    
}
