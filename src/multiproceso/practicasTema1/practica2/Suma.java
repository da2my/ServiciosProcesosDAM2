package multiproceso.practicasTema1.practica2;

public class Suma {
  public static void main(String[] args) {
    Suma s = new Suma();
    int n1 = Integer.parseInt(args[0]);
    int n2 = Integer.parseInt(args[1]);
    s.sumar(n1, n2);
  }

  public void sumar(int n1, int n2) {
    System.out.println("Suma:\n" + n1 + " + " + n2 + " = " + (n1 + n2));
  }

}
