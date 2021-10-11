package multiproceso.practicasTema1.practica2;

public class Resta {
  public static void main(String[] args) {
    Resta r = new Resta();
    int n1 = Integer.parseInt(args[0]);
    int n2 = Integer.parseInt(args[1]);
    r.restar(n1, n2);
  }

  public void restar(int n1, int n2) {
    System.out.println("Resta:\n" + n1 + " - " + n2 + " = " + (n1 - n2));
  }

}
