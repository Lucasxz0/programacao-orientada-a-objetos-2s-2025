public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador(16, 500, 4, 2.5f);
        SistemaOperacional so = new SistemaOperacional(pc);

        Programa p1 = new Programa(8, 200, 2, 10000);  
        Programa p2 = new Programa(4, 600, 2, 5000);   
        Programa p3 = new Programa(32, 200, 2, 5000);  
        Programa p4 = new Programa(4, 100, 8, 5000);   

        System.out.println("teste programa 1");
        so.executarPrograma(p1);

        System.out.println("teste programa 2");
        so.executarPrograma(p2);

        System.out.println("teste programa 3");
        so.executarPrograma(p3);

        System.out.println("teste programa 4");
        so.executarPrograma(p4);
    }
}
