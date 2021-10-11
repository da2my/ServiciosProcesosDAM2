package multiproceso.practicasTema1.practica2;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Lanzador l = new Lanzador();

    int n1 = 0;
    int n2 = 0;

    do {
      System.out.println("Introduce dos numeros entre 1 y 99, el primero mayor que el segundo");
      System.out.println("Introduce el primer numero: ");
      n1 = sc.nextInt();
      System.out.println("Introduce el segundo numero: ");
      n2 = sc.nextInt();
      if (((n1 >= 1 && n1 <= 99) && (n2 >= 1 && n2 <= 99)) && n1 > n2) {
        l.lanzadorX(n1, n2);
      }
    } while ((!(n1 >= 1 && n1 <= 99) || !(n2 >= 1 && n2 <= 99)) || n1 < n2);
    sc.close();
  }
}