import java.util.Scanner;

public class metodos {
    public objFastfood[][] IngresarPedidos(int n, Scanner sc) {
        objFastfood[][] m = new objFastfood[n][n];
        metodos 
        int Tipo = 0;
        int Tamano = 0;
        int Cantidad = 0;
        double PrecioUnidad = 0;
        double TotalPagar = 0;
        String Descripcion = "";
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.println("Bienvenidos al expendio de comidas rapidas");
                System.out.println("Seleccione el tipo de comida");
                System.out.println("1) perro");
                System.out.println("2) perra");
                System.out.println("3) salchipapa");
                System.out.println("4) hamburguesa");
                Tipo = sc.nextInt();
                while (!sc.hasNextInt()) {
                    System.out.println("Por favor ingrese un numero valido");
                }
                System.out.println("Ingrese tamaño");
                System.out.println("1) pequeño");
                System.out.println("2) mediano");
                System.out.println("3) grande");
                Tamano = M.validarEntero(sc);
            }
        }
        return m
    }
}
