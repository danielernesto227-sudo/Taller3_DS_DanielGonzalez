import java.util.ArrayList;
import java.util.Scanner;
public class ProgramaTareas {
    public static void main(String[] args) {
        ArrayList<String>taskHomeNext= new ArrayList<>();
        ArrayList<String>completedTask= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("***Bienvenido a la lista de tareas***\n"+
        "Cual es tu nombre estimado(a): ");
        String user= sc.nextLine();
        System.out.println("Que tal estimado " + user +"."+"\nAtiende nuestras opciones y sigue las indicaciones...\n");

        boolean keep = true;
        while(keep){
            System.out.println("***Menu opciones***");
            System.out.println("1.Agregar tareas\n"+"2.Mostrar tareas pendientes "+"\n3.mostrar tareas completadas"
             +"\n4.Eliminar tareas "+"\n5.Marcar tareas completadas"+"\n6.Salir");
            System.out.println("Elije una opcion: ");
            int select = sc.nextInt();
            sc.nextLine();
            switch (select) {
                case 1:
                    addTask(taskHomeNext, sc);
                    break;
                case 2: 
                    lookPendienTask(taskHomeNext);
                    break;
                case 3:
                    lookcompleteTask(completedTask);
                    break;
                case 4:
                    dropTaskHomeNext (taskHomeNext, sc);
                    break;
                case 5:
                    changesFuntion(taskHomeNext, completedTask, sc);
                    break;
                case 6:
                    keep = false;
                    System.out.println("Gracias por hacer uso de esta app. Hasta la proxima ");
                    break;
                default:
                    System.out.println("Opcion no encontrada"+"Imgresa una de las opciones disponibles");
                    break;
            }
        } // cierre while
    }  // cierre de main

    public static ArrayList <String> addTask (ArrayList <String> taskHomeNext, Scanner sc){
        boolean keep=true;
        while(keep){
            System.out.println("ingresa el numero de tareas a cumplir.");
            int times = sc.nextInt();
            sc.nextLine(); // limpiar el buffer
            for(int i = 0; i<times;++i){
                System.out.println("Tarea # "+ (i+1)+ ": ");
                String list= sc.nextLine();
                taskHomeNext.add(list);
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
        return taskHomeNext;
    }

    public static void lookPendienTask(ArrayList<String>taskHomeNext){
     if(taskHomeNext.size()>0){
        System.out.println("Su lista de tareas pendientes es: ");
            for(String must : taskHomeNext){
                System.out.println( "Tarea : "+ must);
            }
     } else if(taskHomeNext.size()==0){
            System.out.println("Estas al dia en tus tareas");
       }
     }
     public static void lookcompleteTask(ArrayList<String>completedTask){
        boolean keep = true;
        while (keep) {
            
        
            if(completedTask.size()>0){
                System.out.println("Las tareas comletadas son las siguientes: ");
                    for(String must : completedTask){
                        System.out.println("Tarea : " + must + " = " + "✓");
                        keep = false;
                    }
        }else if (completedTask.size() ==0){
            System.out.println("Estas un poco fresco.\n"+ "\nEs un deber ponerte al dia");
            keep=false;
        }
        }
    }

    public static ArrayList<String>  dropTaskHomeNext (ArrayList<String>homeTaskNext, Scanner sc){
        boolean keep = true;
        while(keep){
           if(homeTaskNext.size()==0){
            System.out.println("No se pueden eliminar tareas, lista vacia");
            break;
           }
           System.out.println("Que tarea deseas eliminar?"+"\nIngresala: ");
           String dropTask = sc.nextLine();
           if(homeTaskNext.contains(dropTask)){
                homeTaskNext.remove(dropTask);
                System.out.println("La tarea "+ dropTask +" ha sido eliminada");
           }else{
                    System.out.println("Esa tarea no existe");
                 }

           if(homeTaskNext.size()>0){
            System.out.println("Quieres eliminar alguna otra tarea?(si/no)");
            String repeat = sc.nextLine();
            if(!repeat.equalsIgnoreCase("si")){
                keep = false;

            }else{
                System.out.println("No hay mas tareas por eliminar");
                keep = false;
            }
            }
            }
        
            
           
           return homeTaskNext;
        }
    
        public static void changesFuntion(ArrayList <String> taskHomeNext, ArrayList<String> completedTask,Scanner sc){
        boolean keep = true;
        while(keep){
            System.out.println("Muestra las tareas que has cumplido: ");
            String list = sc.nextLine();
            if(!taskHomeNext.contains(list)){
                System.out.println("Esta tarea no esta pendiente y no se puede marcar como completada");
            }else if(taskHomeNext.contains(list) && ! completedTask.contains(list)){
                taskHomeNext.remove(list);
                completedTask.add(list);
                System.out.println("La tarea" + list + "ha sido actualizada, ahora paso a estar completada");

            }
            if(taskHomeNext.size()==0){
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
