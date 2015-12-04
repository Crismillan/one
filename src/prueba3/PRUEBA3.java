/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba3;

import java.util.Scanner;
import prueba3.Negocio.Usuario;
import prueba3.menu;
        
public class PRUEBA3 {  
    public static void main(String[] args) {
        
        
    System.out.println("seleccione una opcion\n"+ 
            "1.-Usuario\n"+
            "2.-Mascota\n" +
            "3.-Raza\n"+
            "4.-Búsquedas y totales\n"+
            "5.-Integrantes\n"+
            "6.-salir\n");
    int menu;
   Scanner in=new Scanner(System.in);
    menu = in.nextInt();
    Usuario usuario=new Usuario();
    boolean quit= false;
  do {
     switch (menu) {
case 1:
                      System.out.print("selecionne una opcion:\n "+ 
                      "1.- Insertar\n" +
                      "2.- Eliminar\n" +
                      "3.- Actualizar\n" +
                      "4.- Mostrar Todo\n");
                      int opt;
                      opt = in.nextInt();
                      
        switch (opt) {
                  case 1: System.out.println("Ingrese id_usuario:");
                            int idu=Integer.parseInt(in.nextLine());
                            usuario.setId_usuario(idu);
                            System.out.println("Ingrese rut:");
                            int run=Integer.parseInt(in.nextLine());
                            usuario.setRut(run);
                            System.out.println("Ingrese Nombre:");
                            String nom=in.nextLine();
                            usuario.setNombre(nom);
                            System.out.println("Ingrese ApePat:");
                            String ape=in.nextLine();
                            usuario.setApepat(ape);
                            System.out.println("Ingrese ApeMat:");
                            String apem=in.nextLine();
                            usuario.setApemat(apem);
                            System.out.println("id_mascota:");
                            int idm=Integer.parseInt(in.nextLine());
                            usuario.setId_usuario(idm);
                            usuario.save();
                             break;
                      
                  case 2: System.out.println("Ingrese id_usuario:");
                          int del=Integer.parseInt(in.nextLine());
                          usuario.setId_usuario(del);
                          usuario.delete();
                        
                        break;
                        
                  case 3:   System.out.println("Ingrese rut:");
                             int run2=Integer.parseInt(in.nextLine());
                             usuario.setRut(run2);
                             System.out.println("Ingrese Nombre:");
                             String nom2=in.nextLine();
                             usuario.setNombre(nom2);
                             System.out.println("Ingrese ApePat:");
                             String ape2=in.nextLine();
                             usuario.setApepat(ape2);
                            System.out.println("Ingrese ApeMat:");
                             String apem2=in.nextLine();
                             usuario.setApemat(apem2);
                            usuario.update();
                  break;
                        
                  case 4:
                        System.out.println("You've chosen item #67");
                        // do something...
                        break;
                       }   
break;

case 2:
                    System.out.print("selecionne una opcion:\n "+ 
                      "1.- Insertar\n" +
                      "2.- Eliminar\n" +
                      "3.- Actualizar\n" +
                      "4.- Mostrar Todo\n");
                    int num12;
                    num12 = in.nextInt();
                  
                      
        switch (num12) {
                  case 1: System.out.println("Ingrese id_usuario:");
                            int idu=Integer.parseInt(in.nextLine());
                            usuario.setId_usuario(idu);
                            System.out.println("Ingrese rut:");
                            int run=Integer.parseInt(in.nextLine());
                            usuario.setRut(run);
                            System.out.println("Ingrese Nombre:");
                            String nom=in.nextLine();
                            usuario.setNombre(nom);
                            System.out.println("Ingrese ApePat:");
                            String ape=in.nextLine();
                            usuario.setApepat(ape);
                            System.out.println("Ingrese ApeMat:");
                            String apem=in.nextLine();
                            usuario.setApemat(apem);
                            System.out.println("id_mascota:");
                            int idm=Integer.parseInt(in.nextLine());
                            usuario.setId_usuario(idm);
                            usuario.save();
                            break;
                  case 2: System.out.println("Ingrese id_usuario:");
                          int del=Integer.parseInt(in.nextLine());
                          usuario.setId_usuario(del);
                          usuario.delete();
                  break;
                        
                  case 3:    System.out.println("Ingrese rut:");
                             int run2=Integer.parseInt(in.nextLine());
                             usuario.setRut(run2);
                             System.out.println("Ingrese Nombre:");
                             String nom2=in.nextLine();
                             usuario.setNombre(nom2);
                             System.out.println("Ingrese ApePat:");
                             String ape2=in.nextLine();
                             usuario.setApepat(ape2);
                            System.out.println("Ingrese ApeMat:");
                             String apem2=in.nextLine();
                             usuario.setApemat(apem2);
                            usuario.update();
                  break;
                        
                  case 4:
                        System.out.println("You've chosen item #67");
                        // do something...
                        break;
                       }   
break;
                        
case 3:
                    System.out.print("selecionne una opcion:\n "+ 
                      "1.- Insertar\n" +
                      "2.- Eliminar\n" +
                      "3.- Actualizar\n" +
                      "4.- Mostrar Todo\n");
                    int ingr;
                    ingr = in.nextInt();
                  
                      
        switch (ingr) {
                  case 1:System.out.println("Ingrese id_usuario:");
                            int idu=Integer.parseInt(in.nextLine());
                            usuario.setId_usuario(idu);
                            System.out.println("Ingrese rut:");
                            int run=Integer.parseInt(in.nextLine());
                            usuario.setRut(run);
                            System.out.println("Ingrese Nombre:");
                            String nom=in.nextLine();
                            usuario.setNombre(nom);
                            System.out.println("Ingrese ApePat:");
                            String ape=in.nextLine();
                            usuario.setApepat(ape);
                            System.out.println("Ingrese ApeMat:");
                            String apem=in.nextLine();
                            usuario.setApemat(apem);
                            System.out.println("id_mascota:");
                            int idm=Integer.parseInt(in.nextLine());
                            usuario.setId_usuario(idm);
                            usuario.save();
                             break;
                  
                  case 2: System.out.println("Ingrese id_usuario:");
                          int del=Integer.parseInt(in.nextLine());
                          usuario.setId_usuario(del);
                          usuario.delete();
                        break;
                        
                  case 3:    System.out.println("Ingrese rut:");
                             int run2=Integer.parseInt(in.nextLine());
                             usuario.setRut(run2);
                             System.out.println("Ingrese Nombre:");
                             String nom2=in.nextLine();
                             usuario.setNombre(nom2);
                             System.out.println("Ingrese ApePat:");
                             String ape2=in.nextLine();
                             usuario.setApepat(ape2);
                            System.out.println("Ingrese ApeMat:");
                             String apem2=in.nextLine();
                             usuario.setApemat(apem2);
                            usuario.update();
                   break;
                        
                  case 4:
                        System.out.println("You've chosen item #67");
                        // do something...
                        break;
                      }
break;
                     
case 4:
                        System.out.println("You've chosen item #4");
                        // do something...
                        break;
case 5:
                        System.out.println("Sistema creador por p y x");
                        break;
                       
case 6:
                    menu = 6;
                        break;
    
       
     }    

   } while (menu!= 6);
            System.out.println("Bye-bye!");
    
  }
}