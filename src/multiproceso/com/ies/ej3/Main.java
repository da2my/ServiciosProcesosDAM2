package multiproceso.com.ies.ej3;

public class Main {

  public static void main(String[] args) {
    Lanzador l = new Lanzador();
    l.lanzarSumador(1, 8, 1);
    l.lanzarSumador(2, 6, 2);
    l.lanzarSumador(2, 9, 3);
    l.lanzarSumador(3, 15, 4);
    l.lanzarSumador(1, 2, 5);
    System.out.println("Ok");

  }

}
