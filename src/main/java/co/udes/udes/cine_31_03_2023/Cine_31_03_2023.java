/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.udes.udes.cine_31_03_2023;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author LabSispc13
 */
public class Cine_31_03_2023 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        ArrayList<String> storageEmpl = new ArrayList();
        ArrayList<String> storageCust = new ArrayList();
        ArrayList<String> storageMovi = new ArrayList();
        ArrayList<String> storageFunc = new ArrayList();
        ArrayList<String> storageHall = new ArrayList();
        ArrayList<String> storageProd = new ArrayList();

        String x="";
        int y=0, submenu;
        boolean infinity = true;
        
        while(infinity==true){
            
            System.out.println("\nBienvenido, que con le gustaria trabajar el dia de hoy?");
            System.out.println("1->Empleados");
            System.out.println("2->Funciones");
            System.out.println("3->Peliculas"); 
            System.out.println("4->Salas");
            System.out.println("5->Usuario");
            System.out.println("6->Producto");
            System.out.println("7->Salir");
            
            y=keyboard.nextInt();
            
            if (y==7){
                System.out.println("\nMuchas gracias por usar este servicio");
              System.exit(0);
            }
            
            for(int h=0; h<y; h++){  //h 0,

                  if(h==0 && h==(y-1)){ 
                   x="Empleado";
                  } else if(h==1 && h==(y-1)){
                   x="Funcion";
                  }else if(h==2 && h==(y-1)){ 
                   x="Pelicula";
                  }else if(h==3 && h==(y-1)){ 
                   x="Sala";
                  }else if(h==4 && h==(y-1)){ 
                   x="Usuario";
                  }else if(h==5 && h==(y-1)){
                   x="Producto";
                  }
            }
        
            submenu=Submenu(keyboard, x);
        
            switch(submenu){
                case 1:
                    if(x.equals("Empleado")){
                        storageEmpl=Add(storageEmpl, keyboard, x);
                        
                    }else if(x.equals("Usuario")){
                        storageCust=Add(storageCust, keyboard, x);
                        
                    }else if(x.equals("Pelicula")){
                        storageMovi=Addfun(storageMovi, keyboard, x);
                        
                    }else if(x.equals("Funcion")){
                        storageFunc=Addfun(storageFunc, keyboard, x);
                        
                    }else if(x.equals("Sala")){
                        storageHall=AddFinal(storageHall, keyboard, x);
                        
                    }else if(x.equals("Producto"))
                        storageProd=AddFinal(storageProd, keyboard, x);
                    
                    break;
                
                case 2:
                    if(x.equals("Empleado")){
                        storageEmpl=Delete(storageEmpl, keyboard, x);
                        
                    }else if(x.equals("Usuario")){
                        storageCust=Delete(storageCust, keyboard, x);
                        
                    }else if(x.equals("Pelicula")){
                        storageMovi=Delete(storageMovi, keyboard, x);
                        
                    }else if(x.equals("Funcion")){
                        storageFunc=Delete(storageFunc, keyboard, x);
                        
                    }else if(x.equals("Sala")){
                        storageHall=Delete(storageHall, keyboard, x);
                        
                    }else if(x.equals("Producto"))
                        storageProd=Delete(storageProd, keyboard, x);
                    
                    break;
                
                case 3:
                    if(x.equals("Empleado")){
                        Show(storageEmpl);
                        
                    }else if(x.equals("Usuario")){
                        Show(storageCust);
                        
                    }else if(x.equals("Pelicula")){
                        Show(storageMovi);
                        
                    }else if(x.equals("Funcion")){
                        Show(storageFunc);
                        
                    }else if(x.equals("Sala")){
                        Show(storageHall);
                        
                    }else if(x.equals("Producto"))
                        Show(storageProd);
  
            
            }
        
        }   
    }
            
   public static int Submenu(Scanner keyboard, String x){
        System.out.println("\nBienvenido al submenu "+x);
        System.out.println("Que le gustaria hacer el dia de hoy?");
        System.out.println("1->Agregar "+x);
        System.out.println("2->Eliminar "+x);
        System.out.println("3->Ver "+x);
        System.out.println("4->Salir");
        return keyboard.nextInt();  
        
    }
    
   public static ArrayList Add(ArrayList storage,Scanner keyboard, String x){ 
    int cycles=0;   
    System.out.println("Cuantos "+x+" quieres agregar?");
    cycles = keyboard.nextInt();
    
    for(int i=0; i<cycles; i++){   
        int aux =0;
        boolean contract=false, member=false;
        String rol="",assignedA="", entryTime="", departureTime="";
        double salary=0;

        System.out.println("\nIngrese los siguientes datos: ");
        System.out.print("Nombre: ");
        String name=keyboard.next();
        System.out.print("#Identificacion: ");
        String ID = keyboard.next();
        System.out.print("Edad: ");
        int age = keyboard.nextInt();

       if(x.equals("Empleado")){ 
         System.out.print("Rol: ");
         rol = keyboard.next();
         System.out.print("Salario: ");
         salary = keyboard.nextDouble();
         System.out.print("Area Asignada: ");
         assignedA=keyboard.next();
         System.out.println("Inicio Jordana laboral: ");
         System.out.println("Ejemplo 8:00_AM");
         entryTime=keyboard.next();
         System.out.println("Fin Jornada laboral: ");
         System.out.println("Ejemplo 8:00_PM");
         departureTime = keyboard.next(); 

         do{
         System.out.println("\nContrato: ");
         System.out.println("1->Activo");
         System.out.println("2->Suspendido");
         aux = keyboard.nextInt();
         if(aux==1){
          contract = true;
         }else if(aux==2){
          contract = false;    
         }else{
             System.out.println("Selecciono de manera incorrecta, vuelva a intentar\n");
         }
         }while(aux!=1 && aux!=2);
       }

       if(x.equals("Usuario")){
         do{
         System.out.println("\nMiembro: ");
         System.out.println("1->Activo");
         System.out.println("2->No es miembro");
         aux = keyboard.nextInt();
         if(aux==1){
          member = true;
         }else if(aux==2){
          member = false;    
         }else{
             System.out.println("Selecciono de manera incorrecta, vuelva a intentar\n");
         }
         }while(aux!=1 && aux!=2);
       }


       if(x.equals("Empleado")){
        Employee myEmployee = new Employee(rol, salary,assignedA, departureTime, entryTime, contract, name, ID, age); 
        storage.add(myEmployee);

       }else if(x.equals("Usuario")){
         Customer myCustomer = new Customer(member, name, ID, age);
         storage.add(myCustomer);

       }
    }  
     return storage; 
   }
   
   public static ArrayList Addfun(ArrayList storage, Scanner keyboard, String x){
    int cycles=0;
    System.out.println("Cuantos "+x+" quieres agregar?");
    cycles = keyboard.nextInt();
    
    for(int i=0; i<cycles; i++){    
       
       System.out.println("\nIngrese los siguientes datos: ");
       System.out.print("Nombre de la pelicula: ");
       String name=keyboard.next();
       System.out.println("Fecha de Estreno: ");
       System.out.println("Ejemplo: 2_Abril_2022");
       String releasedate = keyboard.next();
       System.out.println("Genero: ");
       System.out.println("Ejemplo si son mas de 1 genero: Accion_y_Comedia");
       String genre = keyboard.next();
       System.out.print("Audiencia: ");
       String audience=keyboard.next();
       
       Pelicula myMovie= new Pelicula(name, releasedate, genre, audience);
       
       if(x.equals("Funcion")){
        System.out.print("#Sala: ");
        String Nhall = keyboard.next();
        System.out.println("horario: ");
           System.out.println("Ejemplo: 7:00_PM");
        String schedule = keyboard.next();
        System.out.print("Precio: ");
        double TicketPrice = keyboard.nextDouble();
        Function myFunction = new Function(myMovie, Nhall, schedule, TicketPrice);
        storage.add(myFunction);
       }
       storage.add(myMovie);
    }   
    return storage;
   }
    
   public static ArrayList AddFinal(ArrayList storage, Scanner keyboard, String x){
    int cycles=0;
    System.out.println("Cuantos "+x+" quieres agregar?");
    cycles = keyboard.nextInt();
    
    for(int i=0; i<cycles; i++){    
       System.out.println("\nIngrese los siguientes datos para: "+x);
       System.out.print("Nombre: ");
       String name=keyboard.next();
       
      if(x.equals("Sala")){
       System.out.print("Cantidad de sillas: ");
       int capacity = keyboard.nextInt();
       System.out.println("Tipo de sala: ");
       System.out.println("Ejemplo: Sala_Premium");
       String TyHall = keyboard.next();
       Hall myHall=new Hall(name, capacity, TyHall);
       storage.add(myHall);
      }else{
          System.out.print("Precio: ");
          double price = keyboard.nextDouble();
          System.out.print("#Identificacion: ");
          String ProductID = keyboard.next();
          Product myProduct = new Product(name, price, ProductID);
          storage.add(myProduct);
      }
       
    }
    return storage;
   }
   
   public static void Show(ArrayList storage){
       System.out.println("");
       for(int i=0; i<storage.size(); i++){
           System.out.println("En la poscicion "+i+" se encuentra: \n"+storage.get(i));
       }
   }
   
   public static ArrayList Delete(ArrayList storage, Scanner keyboard, String x){
       System.out.println("Que elemento deseas remover de los datos de "+x);
       System.out.println("Recuerda que los elementos van del 0 hasta N numero");
       int i=keyboard.nextInt();
       storage.remove(i);
       
       return storage;
   }
   
}
    

