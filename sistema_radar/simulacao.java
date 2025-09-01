package sistema_radar;

public class simulacao
{
    public static void main (String[] args)
    {
        Carro gol = new Carro();
        gol.ano = 2022;
        gol.modelo = "volkswagen";
        gol.placa = "abc200";
        gol.velocidade = 0;

        Radar radar = new Radar();
        radar.localizacao = "Pistao sul";
        radar.limiteVelocidade = 60;

        gol.acelerar();
        gol.acelerar();
        gol.acelerar();
        gol.acelerar();
        gol.acelerar();
        gol.acelerar();
        gol.acelerar();

        radar.avaliarvelocidade(gol);

    }



}