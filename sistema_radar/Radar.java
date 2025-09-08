package sistema_radar;

public class Radar{

    private String localizacao;
    private Integer limiteVelocidade;

    public Radar(String localizacao, Integer limiteVelocidade)
    {
    this.localizacao = localizacao;
    this.limiteVelocidade = limiteVelocidade;
    }   

    public String getlocalizacao()
    {
        return this.localizacao;
    }

    public Integer getlimitedeVelocidade()
    {
        return this.limiteVelocidade;
    }
    
    public void setlocalizacao(String localizacao)
    {
        this.localizacao = localizacao;
    }

    public void setlimiteVelocidade(Integer limiteVelocidade)
    {
        this.limiteVelocidade = limiteVelocidade;
    }


    public void emitirNotificacao(String placa, Integer velocidadeObservada)
    {
    System.out.println("placa: " +placa);
    System.out.println("velocidade observada: " +velocidadeObservada);
    System.out.println("localizacao" + this.localizacao);
    System.out.println ("velocidade da via: " + this.limiteVelocidade);
    }

    public void avaliarvelocidade(Carro carro)
    {
        if(carro.getvelocidade() > this.limiteVelocidade)
        {
            System.out.println("Acima da velocidade");
            emitirNotificacao(carro.getplaca(), carro.getvelocidade());
        }

    }

}