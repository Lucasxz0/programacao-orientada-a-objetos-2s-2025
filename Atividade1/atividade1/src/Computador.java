public class Computador{
    private Integer memoriaRam;
    private Integer SSD;
    private Integer nucleos;
    private float operacoesPorSegundo;

    public Computador(Integer memoriaRam, Integer SSD, Integer nucleos, float operacoesPorSegundo){
        this.memoriaRam = memoriaRam;
        this.SSD = SSD;
        this.nucleos = nucleos;
        this.operacoesPorSegundo = operacoesPorSegundo;
    }
    
    public Integer memoriaRam(){
        return memoriaRam;
    }
    public Integer SSD(){
        return SSD;
    }
    public Integer nucleos(){
        return nucleos;
    }
    public Float operacoesPorSegundo(){
        return operacoesPorSegundo;
    }
    
    public Integer getmemoriaRam(){
        return memoriaRam;
    }
    public Integer getSSD(){
        return SSD;
    }
    public Integer getnucleos(){
        return nucleos;
    }
    public Float getoperacoesPorSegundo(){
        return operacoesPorSegundo;
    }

    //set
    public void setmemoriaRam(Integer memoriaRam){
        this.memoriaRam = memoriaRam;
    }
    public void setSSD(Integer SSD){
        this.SSD = SSD;
    }
    public void setnucleos(Integer nucleos){
        this.nucleos = nucleos;
    }
    public void setoperacoesPorSegundo(Float operacoesPorSegundo){
        this.operacoesPorSegundo = operacoesPorSegundo;
    }

}