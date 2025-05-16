import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        double altura = 0;
        double comprimento = 0;
        double area = 0;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a altura: ");
        altura = scanner.nextDouble();
        
        System.out.print("Qual o comprimento?: ");
        comprimento = scanner.nextDouble();

        area = altura * comprimento;
        System.out.println("A area do retangulo calculado eh de: " + area + "(" + altura + "x" + comprimento + ")");

        scanner.close();


    }   
}