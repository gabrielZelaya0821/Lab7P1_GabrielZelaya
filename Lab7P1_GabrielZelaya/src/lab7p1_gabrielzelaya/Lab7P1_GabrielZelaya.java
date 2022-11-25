package lab7p1_gabrielzelaya;
import java.util.Scanner;

public class Lab7P1_GabrielZelaya {

    public static void menu(){
        Scanner entrada = new Scanner(System.in);
        int menu;
        do {
            System.out.println("--------Menú--------");
            System.out.println("(1)El calamar Pablo\n(2)Torre de control\n(3)Salir");
            menu = entrada.nextInt();
            switch  (menu){
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Número es invalido, intente de nuevo");
            }
        } while (menu != 3);
        if (menu == 3){
            System.out.println("Saliendo del menú");
        }   
    }
    public static void ejercicio1(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Selecciones disponibles: ");
        System.out.println("(1)España (2)Alemania\n(3)Costa Rica (4)Japón\n(5)Bélgica (6)Croacia\n(7)Canadá (8)Marruecos");
        System.out.println("Ingrese el número de la selección: ");
        int num = entrada.nextInt();
        String pais;
        char grupo;
        String DT;
        int jugadoresConvocados = 26;
        boolean ganadoMundial = false;
        int posicionTabla;
        int goles = 0;
        
        Seleccion seleccion1 = new Seleccion();
        Seleccion seleccion2 = new Seleccion();
        Seleccion seleccion3 = new Seleccion();
        Seleccion seleccion4 = new Seleccion();
        Seleccion seleccion5 = new Seleccion();
        Seleccion seleccion6 = new Seleccion();
        Seleccion seleccion7 = new Seleccion();
        Seleccion seleccion8 = new Seleccion();  
      
        switch (num){
            case 1:
                pais = "España";
                grupo = 'E';
                DT = "Luis Enrique";
                ganadoMundial = true;
                posicionTabla = 1;
                seleccion1 = new Seleccion(pais,grupo,DT,jugadoresConvocados,ganadoMundial,posicionTabla,goles);
                System.out.println(seleccion1);
                break;
            case 2:
                pais = "Alemania";
                grupo = 'E';
                DT = "Hansi Flick";
                ganadoMundial = true;
                posicionTabla = 3;
                seleccion2 = new Seleccion(pais,grupo,DT,jugadoresConvocados,ganadoMundial,posicionTabla,goles);
                System.out.println(seleccion2);
                break;
            case 3:
                pais = "Costa Rica";
                grupo = 'E';
                DT = "Luis Fernando Suarez";
                posicionTabla = 4;
                seleccion3 = new Seleccion(pais,grupo,DT,jugadoresConvocados,ganadoMundial,posicionTabla,goles);
                System.out.println(seleccion3);
                break;
            case 4:
               pais = "Japón";
               grupo = 'E';
               DT = "Hajime Moriyasu";
               posicionTabla = 2;
               seleccion4 = new Seleccion(pais,grupo,DT,jugadoresConvocados,ganadoMundial,posicionTabla,goles);
               System.out.println(seleccion4);
               break;
            case 5:
                pais = "Bélgica";
                grupo = 'F';
                DT = "Roberto Martínez";
                posicionTabla = 1;
                seleccion5 = new Seleccion(pais,grupo,DT,jugadoresConvocados,ganadoMundial,posicionTabla,goles);
                System.out.println(seleccion5);
                break;
            case 6:
                pais = "Croacia";
                grupo = 'F';
                DT = "Zlakto Dalic";
                posicionTabla = 2;
                seleccion6 = new Seleccion(pais,grupo,DT,jugadoresConvocados,ganadoMundial,posicionTabla,goles);
                System.out.println(seleccion6);
                break;
            case 7:
                pais = "Canadá";
                grupo = 'F';
                DT = "John Herdman";
                posicionTabla = 4;
                seleccion7 = new Seleccion(pais,grupo,DT,jugadoresConvocados,ganadoMundial,posicionTabla,goles);
                System.out.println(seleccion7);
                break;
            case 8:
                pais = "Marruecos";
                grupo = 'F';
                DT = "Walid Regragui";
                posicionTabla = 3;
                seleccion8 = new Seleccion(pais,grupo,DT,jugadoresConvocados,ganadoMundial,posicionTabla,goles);
                System.out.println(seleccion8);
                break;
            default:
                System.out.println("Selección inválida");
        }
        
        partido1(seleccion4,seleccion3);
        partido2(seleccion5,seleccion8);
        partido3(seleccion6,seleccion7);
        partido4(seleccion1,seleccion2);
    }
    
    public static void partido1(Seleccion Japón, Seleccion CostaRica){
        Japón.setGoles(0);
        CostaRica.setGoles(0);
        System.out.println("---------------");
        System.out.println("Juega Japón contra Costa Rica");
        System.out.println("Japón " + Japón.getGoles() + " Costa Rica " + CostaRica.getGoles());
        if (Japón.getGoles() > CostaRica.getGoles()) {
            System.out.println("Ha ganado Japón");
        } else if (Japón.getGoles() < CostaRica.getGoles()) {
            System.out.println("Ha ganado Costa Rica");
        } else {
            System.out.println("Ha sido un empate");
        }
        
    }
    
    public static void partido2(Seleccion Bélgica, Seleccion Marruecos){
        Bélgica.setGoles(0);
        Marruecos.setGoles(0);
        System.out.println("---------------");
        System.out.println("Juega Bélgica contra Marruecos");
        System.out.println("Bélgica " + Bélgica.getGoles() + " Marruecos " + Marruecos.getGoles());
        if (Bélgica.getGoles() > Marruecos.getGoles()) {
            System.out.println("Ha ganado Bélgica");
        } else if (Bélgica.getGoles() < Marruecos.getGoles()) {
            System.out.println("Ha ganado Marruecos");
        } else {
            System.out.println("Ha sido un empate");
        }
        System.out.println("---------------");
    }
    
    public static void partido3(Seleccion Croacia, Seleccion Canadá){
        Croacia.setGoles(0);
        Canadá.setGoles(0);
        System.out.println("Juega Croacia contra Canadá");
        System.out.println("Croacia " + Croacia.getGoles() + " Canadá " + Canadá.getGoles());
        if (Croacia.getGoles() > Canadá.getGoles()) {
            System.out.println("Ha ganado Croacia");
        } else if (Croacia.getGoles() < Canadá.getGoles()) {
            System.out.println("Ha ganado Canadá");
        } else {
            System.out.println("Ha sido un empate");
        }
        System.out.println("---------------");
    }
    
    public static void partido4(Seleccion España, Seleccion Alemania){
        España.setGoles(0);
        Alemania.setGoles(0);
        System.out.println("Juega España contra Alemania");
        System.out.println("España " + España.getGoles() + " Alemania " + Alemania.getGoles());
        if (España.getGoles() > Alemania.getGoles()) {
            System.out.println("Ha ganado España");
        } else if (España.getGoles() < Alemania.getGoles()) {
            System.out.println("Ha ganado Alemania");
        } else {
            System.out.println("Ha sido un empate");
        }
    }
    
    public static void ejercicio2(){
        int num = 1;
        Scanner entradaInt = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        do {
            switch  (num){
                case 1:
                    System.out.println("Avion " + num);
                    System.out.println("Ingrese el modelo del avión: ");
                    String modelo = entrada.nextLine();
                    System.out.println("Ingrese el codigo: ");
                    String codigo = entrada.nextLine();
                    System.out.println("Ingrese el año de fabricación: ");
                    int año = entradaInt.nextInt();
                    System.out.println("Ingrese la capacidad máxima de pasajeros: ");
                    int capacidad_max = entradaInt.nextInt();
                    System.out.println("Ingrese el peso del avión: ");
                    int peso = entradaInt.nextInt();
                    System.out.println("Ingrese el nombre de la aerolina: ");
                    String nombre = entrada.nextLine();
                    System.out.println("Cual es el estado del avión del 1 al 3: ");
                    int estado = entradaInt.nextInt();
                    Avion avion1 = new Avion(modelo,codigo,año,capacidad_max,peso,nombre,estado);
                    break;
                case 2:
                    System.out.println("Avion " + num);
                    System.out.println("Ingrese el modelo del avión: ");
                    modelo = entrada.nextLine();
                    System.out.println("Ingrese el codigo: ");
                    codigo = entrada.nextLine();
                    System.out.println("Ingrese el año de fabricación: ");
                    año = entradaInt.nextInt();
                    System.out.println("Ingrese la capacidad máxima de pasajeros: ");
                    capacidad_max = entradaInt.nextInt();
                    System.out.println("Ingrese el peso del avión: ");
                    peso = entradaInt.nextInt();
                    System.out.println("Ingrese el nombre de la aerolina: ");
                    nombre = entrada.nextLine();
                    System.out.println("Cual es el estado del avión del 1 al 3: ");
                    estado = entradaInt.nextInt();
                    Avion avion2 = new Avion(modelo,codigo,año,capacidad_max,peso,nombre,estado);
                    break;
                case 3:
                    System.out.println("Avion " + num);
                    System.out.println("Ingrese el modelo del avión: ");
                    modelo = entrada.nextLine();
                    System.out.println("Ingrese el codigo: ");
                    codigo = entrada.nextLine();
                    System.out.println("Ingrese el año de fabricación: ");
                    año = entradaInt.nextInt();
                    System.out.println("Ingrese la capacidad máxima de pasajeros: ");
                    capacidad_max = entradaInt.nextInt();
                    System.out.println("Ingrese el peso del avión: ");
                    peso = entradaInt.nextInt();
                    System.out.println("Ingrese el nombre de la aerolina: ");
                    nombre = entrada.nextLine();
                    System.out.println("Cual es el estado del avión del 1 al 3: ");
                    estado = entradaInt.nextInt();
                    Avion avion3 = new Avion(modelo,codigo,año,capacidad_max,peso,nombre,estado);
                    break;
            }
            num++;
        }while(num <= 3);

    }
    
    public static void main(String[] args) {
        menu();
    }
    
}
