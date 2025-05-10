package Facade;

public class Facade_Main {
    public static void main(String[] args) {
        Sistema_de_Som som = new Sistema_de_Som();
        Sistema_de_Luz luz = new Sistema_de_Luz();
        Projetor projetor = new Projetor();
        Player dvd = new Player();

        Fachada_Cinema cinema = new Fachada_Cinema(som, luz, projetor, dvd);

        cinema.assistirFilme("Interestelar");
        System.out.println("-----");
        cinema.encerrarSessao();
}
}
