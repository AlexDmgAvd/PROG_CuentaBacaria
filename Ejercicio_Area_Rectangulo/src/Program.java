import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        System.out.println("Indica la base (en notacion decimal)");
        Scanner sc = new Scanner(System.in);
        double baseUsuario = sc.nextDouble();
        System.out.println("Indica la altura (en notacion decimal)");
        double alturaUsuario = sc.nextDouble();

        AreaRectangulo rect = new AreaRectangulo(baseUsuario,alturaUsuario);
        System.out.println("El area del rectangulo es:" + rect.calculateArea());
        System.out.println("El perimetro del rectangulo es:" + rect.calculatePerimetro());

    }
}
