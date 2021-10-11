package multiproceso.practicasTema1.practica2;

public class Division {
  public static void main(String[] args) {
    Division d = new Division();
    int n1 = Integer.parseInt(args[0]);
    int n2 = Integer.parseInt(args[1]);
    d.dividir(n1, n2);
  }

  public void dividir(int n1, int n2) {
    System.out.println("Division:\n" + n1 + " / " + n2 + " = " + (n1 / n2));
  }
}
