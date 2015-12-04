/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba3;

import static java.lang.System.in;
import java.util.Scanner;
import prueba3.Negocio.Usuario;


public class menu {
    
    Scanner in=new Scanner(System.in);
    int menuItem;
   
    public void menu1(){
        System.out.println("selecionne una opcion:");
        
    menuItem = in.nextInt();
    Usuario usuario=new Usuario();
    
        System.out.print("selecionne una opcion: "+ 
                "10.- Insertar\n" +
                "   11.- Eliminar\n" +
                "   12.- Actualizar\n" +
                "   13.- Mostrar Todo(Si tiene id debe mostrar el nombre)");
        
    
  
switch (menuItem) {
        case 1:
        System.out.println("Insertar");
        
        System.out.println("Ingrese id_usuario:");
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
                  case 3:
                        System.out.println("You've chosen item #4");
                        // do something...
                        break;
        
    
    
    
     }
    }
    }