import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner Scanner = new Scanner(System.in);
        double base, altura, areaRetangulo;

        System.out.println("Informe o valor da base: ");
        base = Scanner.nextDouble();

        System.out.println("Informe o valor da altura: ");
        altura = Scanner.nextDouble();

        areaRetangulo = base * altura;

        System.out.println("A area de um retangulo de base = " + base);
        System.out.println("e altura " + altura);
        System.out.println("é" + areaRetangulo);
    }  
}