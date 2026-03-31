import java.util.ArrayList;
import java.util.Scanner;

public class ListaProductos{
    public static void main(String[] args) {
        ArrayList<String>Shopppinglist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        boolean dentro = true;
        // condicionamos el programa
        System.out.println("Bienvenido a nuestra app, Espero sea de utilidad.");
    while(dentro){

        int option;
        System.out.println("1.Hacer lista de productos"+"\n"+"2.ver lista de productos"
        +"\n"+"3.Agregar un producto mas a la lista"+"\n4.Eliminar un producto de la lista"+"\n5.Buscar un producto en la lista"+
        "\n"+"6.Cerrar lista y mostrar lo actualizado"
       );
        
       option = sc.nextInt();
       sc.nextLine();
       switch (option) {
        case 1:
        System.out.println("Ingresa los productos que te gustaria tener en la lista: ");
        for(int p=0;p <5;p++){
        System.out.println("producto "+ (p+1)+ ": ");
        String producto = sc.nextLine();
        Shopppinglist.add(producto);
        }
        break;
        case 2:
        System.out.println("Esta es la lista de productos: ");
        for(String producto:Shopppinglist){
        System.out.println(producto);
       }
         break;
         case 3:
        System.out.println("Agrega el nuevo producto: ");
        String nuevoProducto= sc.nextLine();
         Shopppinglist.add (nuevoProducto);
         break;
         case 4:
        System.out.println("nombralo y lo eliminamos: ");
        String eliminar = sc.nextLine();
        Shopppinglist.remove(eliminar);
        break;
        case 5:
        System.out.println("Ingresa el producto que quieres buscar:");
         String encontrarproducto= sc.nextLine();
         
        if(Shopppinglist.contains(encontrarproducto)){
            System.out.println(encontrarproducto + " si esta en la lista ");
        } else{
            System.out.println(encontrarproducto + " No esta en la lista ");
        }
        break;

            case 6:
            dentro = false;
            for(String producto:Shopppinglist){
             System.out.println(producto);
       }

       System.out.println("Quieres hacer otra lista?(s) ");
       String respuesta= sc.next();
       if(respuesta.equalsIgnoreCase("s"))
        Shopppinglist.clear();
       else{
        dentro=false;
       }
             break;
        default:
            System.out.println("Opcion invalida");
            break;
       }
        
    }
      sc.close();

    }
}