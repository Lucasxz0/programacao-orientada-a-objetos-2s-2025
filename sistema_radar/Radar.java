package sistema_radar;

public class Radar{

    public String localizacao;
    public Integer limiteVelocidade;

    public void emitirNotificacao(String placa, Integer velocidadeObservada)
    {
    System.out.println("placa: " +placa);
    System.out.println("velocidade observada: " +velocidadeObservada);
    System.out.println("localizacao" + this.localizacao);
    System.out.println ("velocidade da via: " + this.limiteVelocidade);
    }
    public void avaliarvelocidade(Carro carro)
    {
        if(carro.velocidade > this.limiteVelocidade)
        {
            System.out.println("Acima da velocidade");
            emitirNotificacao(carro.placa, carro.velocidade);
        }

    }

}