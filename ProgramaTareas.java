import java.util.ArrayList;
import java.util.Scanner;
public class ProgramaTareas {
    public static void main(String[] args) {
        ArrayList<String>taskhomenext= new ArrayList<>();
        ArrayList<String>completedtask= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("***Bienvenido a la lista de tareas***\n"+
        "Cual es tu nombre estimado(a): ");
        String user= sc.nextLine();
        System.out.println("Que tal estimado " + user +"."+"\nAtiende nuestras opciones y sigue las indicaciones...\n");

        boolean keep = true;
        while(keep)
            {
            System.out.println("***Menu opciones***");
            System.out.println("1.Agregar tareas\n"+"2.Mostrar tareas pendientes "+"\n3.mostrar tareas completadas"
             +"\n4.Eliminar tareas "+"\n5.Marcar tareas completadas"+"\n6.Salir"  
            );
            System.out.println("Elije una opcion: ");
            int select = sc.nextInt();
            sc.nextLine();
            switch (select) {
                case 1:
                    addTask(taskhomenext, sc);
                    break;
                case 2: 
                    lookpendienTask(taskhomenext);
                    break;
                case 3:
                    lookcompletetask(completedtask);
                    break;
                case 4:
                    droptaskhomenext (taskhomenext, sc);
                    break;
                case 5:
                    changesFuntion(taskhomenext, completedtask, sc);
                    break;
                case 6:
                    keep = false;
                    System.out.println("Gracias por hacer uso de esta app. Hasta la proxima ");
                    break;
                    default:
                    System.out.println("Opcion no encontrada"+"Imgresa una de las opciones disponibles");
                    break;
            }
        }
    }  // cierre de main

    public static ArrayList <String> addTask (ArrayList <String> taskhomenext, Scanner sc){
        boolean keep=true;
        while(keep){
        System.out.println("ingresa el numero de tareas a cumplir.");
        int times = sc.nextInt();
        sc.nextLine(); // limpiar el buffer
        for(int i = 0; i<times;++i){
            System.out.println("Tarea # "+ (i+1)+ ": ");
            String list= sc.nextLine();
            taskhomenext.add(list);
          
        }
            System.out.println("Deseas agregar mas tareas?(si) ");
           String repeat = sc.nextLine();
           if(repeat.equalsIgnoreCase("si")){
            keep=true;
           }else{
            keep = false;
            System.out.println("Volvemos al menu principal");
           }  
      
      }

    return taskhomenext;
}

    public static void lookpendienTask(ArrayList<String>taskhomenext){
     if(taskhomenext.size()>0){
    System.out.println("Su lista de tareas pendientes es: ");
    for(String must : taskhomenext){
    System.out.println( "Tarea : "+ must);
    }
     } else if(taskhomenext.size()==0){
        System.out.println("Estas al dia en tus tareas");
     }
     }
     public static void lookcompletetask(ArrayList<String>completedtask){
        boolean keep = true;
        while (keep) {
            
        
        if(completedtask.size()>0){
        System.out.println("Las tareas comletadas son las siguientes: ");
        for(String must : completedtask){
            System.out.println("Tarea : " + must + " = " + "✓");
            keep = false;
        }
        }else if (completedtask.size() ==0){
        System.out.println("Estas un poco fresco.\n"+ "\nEs un deber ponerte al dia");
        keep=false;
        }
        }
    }
    public static ArrayList<String>  droptaskhomenext (ArrayList<String>hometasknext, Scanner sc){
        boolean keep = true;
        while(keep){
        System.out.println("Deseas eliminar alguna tareas? indica cual eliminaras: ");
        String dropTask= sc.nextLine();
        if(hometasknext.contains(dropTask)){
            hometasknext.remove(dropTask);

        } 
         if(hometasknext.size()>0){
            System.out.println("Quieres eliminar mas tareas? (si)");
            String repeat = sc.nextLine();
        if(repeat.equalsIgnoreCase("si")){
            keep = true;
        }else{
            System.out.println("Ya no tienes tareas por eliminar");
            keep = false;
                }
        }
        }
        return hometasknext;
    }
        public static void changesFuntion(ArrayList <String> taskhomenext, ArrayList<String> completedtask,Scanner sc){
        boolean keep = true;
        while(keep){
            System.out.println("Muestra las tareas que has cumplido: ");
            String list = sc.nextLine();
            if(!taskhomenext.contains(list)){
                System.out.println("Esta tarea no esta pendiente y no se puede marcar como completada");
            }else if(taskhomenext.contains(list) && ! completedtask.contains(list)){
                taskhomenext.remove(list);
                completedtask.add(list);
                System.out.println("La tarea" + list + "ha sido actualizada, ahora paso a estar completada");

            }
            if(taskhomenext.size()==0){
             System.out.println("Ya no quedan mas tareas a marcar");
             return;
            }
             System.out.println("Quieres marcar otra tarea?: (si/no)");
             String repeat = sc.nextLine();
            if(!repeat.equalsIgnoreCase("si")){
             System.out.println("No marcarás más tareas. Volviendo al menú principal...");
             return;
            }   
        }
    }
}
