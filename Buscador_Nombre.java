import java.util.ArrayList;
import java.util.Scanner;

public class Buscador_Nombre {
    public static void main(String[] args) {
        ArrayList <String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al colegio de paul");

        students.add("Jose");
        students.add("Angel");
        students.add("Smith");
        students.add("Maria");
        students.add("Mohamed");
        System.out.println("Puedes darnos tu nombre?\n"+
        "Ingresa tu nombre :");
        String nombre= sc. nextLine();
        System.out.println("Hola " + nombre + " que gusto tenerte por aqui ");
        Boolean flow = true;
        while (flow) {
        System.out.println("---Menu de colegio---\n"+"1.Consultar la lista de estudiantes\n"
            + "2.Verificar tu nombre en lista\n"+"3.Salir del colegio\n"+
            "Elije una opcion:" );
        int decide = sc.nextInt();
        sc.nextLine();
        
        switch (decide) {
            case 1:
            System.out.println("Lista de estudiantes: ");
                System.out.println(students);
            
            break;
            case 2:
            System.out.println("Ingresa tu nombre al programa: ");
            String registro = sc. nextLine();
            if(students.contains(registro)){
                System.out.println("Student found");
            }else{
                System.out.println("Student no found");
            }
            break;
            case 3:
                flow = false;

                System.out.println("Quieres volver a intentar?(si)");
                String what = sc.nextLine();
                if(what.contains("si")){
                 flow = true;
                }else{
                    System.out.println("Nos vemos pronto "+ nombre);
                }
                break;
            default:
                System.out.println("Esto no existe en mi programa");
                break;
        }

    }
            sc.close();
    }

}
