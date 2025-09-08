package sistema_radar;

public class simulacao
{
    public static void main (String[] args)
    {
        Carro gol = new Carro("abc200", 0, 2022, "volkswagen");
        

        Radar radar = new Radar("pistao sul",60);
        

        gol.acelerar();
        gol.acelerar();
        gol.acelerar();
        gol.acelerar();
        gol.acelerar();
        gol.acelerar();
        gol.acelerar();
        
        gol.setvelocidade(70);
        

        radar.avaliarvelocidade(gol);

    }



}