import java.util.ArrayList;
import java.util.Scanner;

public class CarritoCompras {
  public static void main(String[] args) {
    ArrayList <Double> prices= new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Esta es la lista de precios que hay disponible");
    prices.add(16.50);
    prices.add(20.00);
    prices.add(80.00);
    prices.add(125.00);
    prices.add(10.00);
    
    boolean mantener= true;
    while(mantener){
        System.out.println("Verificalo que en las siguientes opciones\n");
        System.out.println("\n1.Ver la lista de precios\n"+"2.Ver el calculo final de precios\n"
            +"3.Salir del programa y ver precios disponibles"
        );
        System.out.println("Elije una opcion: ");
        int opcion  = sc.nextInt();
        sc.nextLine();
        switch (opcion) {
            case 1:
            System.out.println(prices);
            break;
            case 2:
            double total= calculateTotal(prices);
            System.out.println(total);

            case 3:
            mantener= false;
            System.out.println( "precios actuales "+ prices);

            System.out.println("Quieres volver a inicar el programa? (si)");
            String keep = sc.nextLine();
            if(keep.contains("si")){
                mantener=true;
            }
            default:
            System.out.println("Esta opcion no existe");
            break;
        }

    }
         sc.close();
    }

    public static Double calculateTotal(ArrayList<Double>prices){
        double total=0;
        for(Double price : prices){
            total += price;
        }
        return total;

    }
  }  

