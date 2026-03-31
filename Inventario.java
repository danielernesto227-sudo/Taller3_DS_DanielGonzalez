import java.util.ArrayList;
import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) {
        ArrayList<String> inventory = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Que tal soldado, Te veo en el campo de batalla");
        System.out.println("Cual es tu nombre para darte la bienvenida que te mereces?"+"\n"
            +"Escribe tu nombre: ");

        String name = sc.nextLine();
        System.out.println("Es un placer que formes parte de nuestras filas " + name + 
         "\nElije una mision y la ejecutamos por ti");
        boolean keep= true;
        while(keep){
            System.out.println("1.Agregar objetos al inventario\n"+"2.Mostrar los objetos del inventario"+
            "\n3.Eliminar objetos del inventario\n"+"4.Busca si un objeto se encuentra en el inventario\n"
            +"5.Salir del inventario e imprimir los objetos actuales");
            int select = sc.nextInt();
            sc.nextLine();
             switch (select) {
                case 1:
                System.out.println("Cuantos objetos quieres ingresar a la lista? : ");
                int quantity = sc.nextInt();
                sc.nextLine();
                for(int ob = 1; ob<=quantity;++ob){
                    System.out.println("Ingrese el objeto #"+ ob + ":");
                    String objeto = sc.nextLine();
                    inventory.add(objeto);
                }
                    break;
                case 2 :
                    inventory = showInventory(inventory);
                    break;
                case 3:
                    System.out.println("Ingresa el objeto que deseas eliminar: ");
                    String delete = sc.nextLine();
                    inventory.remove(delete);
                    System.out.println("Se elimino" + delete + "del inventario");
                    break;
                case 4 :
                    System.out.println("Que objeto te gustaria buscar en el inventario? :");
                    String buscarObjeto= sc.nextLine();
                    if(inventory.contains(buscarObjeto)){
                        System.out.println(buscarObjeto + " si esta en el inventario");
                    }else{
                        System.out.println(buscarObjeto + " no esta en el inventario");
                }
                    break;
                case 5 :
                    keep = false;
                    System.out.println(showInventory(inventory));

                    System.out.println("Quieres hacer un nuevo inventario? (si/no)");
                    String again = sc.nextLine();
                    if(again.equalsIgnoreCase("si")){
                        keep = true;
                    }else{
                        System.out.println("Hasta la proxima soldado");
                    }
                    break;

                default:
                    System.out.println("Opcion invalida");

                    break;
                           }


        }
        sc.close();
    }
    public static ArrayList<String> showInventory(ArrayList<String> inventory){
        if(inventory.size()==0){
        System.out.println("Inventario vacio");
        }
        else{
        System.out.println("Estos son los productos que existen en el inventario");
            for(String objeto:inventory){
            System.out.println(objeto);
         }
        }
        return inventory;
    }
}