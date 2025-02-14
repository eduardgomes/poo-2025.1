import java.util.Scanner;
 public class Aulapoo2 {

public static void main(String[] args) throws Exception {
    //System.out.println('Hello, world!');
    //System.out.println('A residência vai ser massa!');

    char gender = 'f';
    String name = "Bernardo";
    int age = 0;
    double height = 1.75;
    double weight = 72.0;
    boolean canVote = false;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Digite a sua idade: ");
    age = keyboard.nextInt();

    double resultBMI = calculateBMI(height, weight);
    System.out.println("O resultado do IMC é "+ resultBMI);

    System.out.println("Nome: " + name);
    System.out.println("Sua idade é: " + age);
    System.out.println("Sua altura em metros: " + height;

    }