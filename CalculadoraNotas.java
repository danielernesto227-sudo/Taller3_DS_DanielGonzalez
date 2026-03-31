import java.util.ArrayList;
import java.util.Scanner;

public class CalculadoraNotas {
public static void main(String[] args) {
    ArrayList<Double> grades = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Bienvenido al control de notas");
    System.out.println("Cuantas notas quieres ingresar? ");
    int cantidad = sc.nextInt();

    for(int N = 0; N<cantidad;++N){
        System.out.println("Ingresa la nota # "+ (N +1) + ": ");
        double nota = sc.nextDouble();
        grades.add(nota);
    }
    double promedio= calculateAverage(grades);
    System.out.println("El promedio de las notas es: " + promedio);
    System.out.println(grades);
    sc.close();
}
    public static double calculateAverage(ArrayList<Double>grades){
        int suma = 0;

        for(double grade: grades){
            suma += grade;
        }
        return (double) suma/grades.size();

    }

}
