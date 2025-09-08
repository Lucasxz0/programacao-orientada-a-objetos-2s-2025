package sistema_radar;

public class Carro{

private String placa;
private Integer velocidade;
private Integer ano;
private String modelo;

public Carro(String placa, Integer velocidade, Integer ano, String modelo)
{
    this.placa = placa;
    this.velocidade = velocidade;
    this.ano = ano;
    this.modelo = modelo;

}

    public Integer getvelocidade()
    {
        return this.velocidade;
    }

    public String getplaca()
    {
        return this.placa;
    }

    public Integer getano()
    {
        return this.ano;
    }

    public String getmodelo()
    {
        return this.modelo;
    }

    public void setplaca(String placa)
    {
        this.placa = placa;
    }

    public  void setano(Integer ano)
    {
        this.ano = ano;
    }

    public void setmodelo(String modelo)
    {
        this.modelo = modelo;
    }

    public void setvelocidade()
    {
        this.velocidade= 0;
    }
    public void setvelocidade(Integer velocidade)
    {
        if(velocidade >= 0)
        this.velocidade = velocidade;
    }

    public void acelerar ()
    {
        this.velocidade += 10;
    }

    public void frear()
    {
        if(this.velocidade>0)
        {
        this.velocidade -= 10;
        }
    }



}