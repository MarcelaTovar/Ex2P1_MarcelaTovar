
package ex2p1_marcelatovar;

import java.util.*;
public class Ex2P1_MarcelaTovar {

    
    public static void main(String[] args) {
        IndieStardewValley();
    }
    
    public static void IndieStardewValley(){
        Scanner ObiWan = new Scanner(System.in);
        System.out.println("Ingresa el nombre de tu granja: ");
        String nombre = ObiWan.nextLine();
        Granja granja = new Granja(nombre);
        System.out.println("¡Bienvenido a la Granja "+nombre+"!");
        int opcion;
        int dias = 1;
        int cosechas = 0;
        int plantas=0;
        int dias_cosechas = 5;
        int monet = granja.getDinero();
        ArrayList<Conejo> conejo = granja.getConejo();
        ArrayList<Vaca> vaca = granja.getVaca();
        do{
            System.out.println("--Dia "+dias+"--");
            dias++;
            if (plantas == 0) {
                System.out.println("No hay cosechas");
            }else{
                System.out.println("FALTAN "+dias_cosechas+" PARA QUE ESTEN LISTAS LAS COSECHAS");
                dias_cosechas--;
                if (dias_cosechas < 0) {
                    cosechas+=plantas;
                    dias_cosechas = 5;
                    plantas = 0;
                    for (int i = 0; i < cosechas; i++) {
                        Vegetales vegetal = new Vegetales();
                        granja.addVegetal(vegetal);
                    }
                }
            }
            System.out.println("--Menu--"); 
            System.out.println("¿Que desea hacer?");
            System.out.println("1. Plantar Cosechas");
            System.out.println("2. Cosechar las cosechas");
            System.out.println("3. Conseguir animales");
            System.out.println("4. Vender cosas");
            System.out.println("5. Dormir");
            System.out.println("6. Casarse");
            opcion = ObiWan.nextInt();
            while(opcion !=1||opcion!=2||opcion!=3||opcion!=4||opcion!=5||opcion!=6||opcion!=7){
                break;
            }
            if (opcion ==6) {
                System.out.println("Tus amigos te invitan a una fiesta. Despues de tanto trabajar en tu granja logras por fin tomar un descanso.");
                System.out.println("En esa fiesta conoces a la persona más perfecta que tus ojos han visto.");
                System.out.println("Despues de muchos días logras el coraje para una cita con esa persona.");
                System.out.println("No puedes creer que la respuesta fuera sí.");
                System.out.println("Tu no eres nada especial, ¿Que podrías ofrecer?");
                System.out.println("Pero a su lado te das cuenta lograras ofrecer todo si están juntos");
                System.out.println("Tu y tu pareja se casan un hermoso 24 de Julio");
                System.out.println("Felicidades");
                System.out.println("¿Te gustaría ver que pasa despues?(1 para Sí, 2 para no)");
                int dec = ObiWan.nextInt();
                if (dec==1) {
                    System.out.println("Vives el tiempo que fue necesario.");
                    System.out.println("Te sientes satisfecho con tu vida.");
                    System.out.println("¿Qué más podrías pedir?");
                    System.out.println("Tuviste hijos que amas más que a nadie.");
                    System.out.println("Una pareja que te amo y con la que viviste tus días más felices.");
                    System.out.println("Tuviste una familia.");
                    System.out.println("Y más importante, lograste vivir.");
                    System.out.println("Despues de mucho tiempo de trabajar sin vivir, era el momento de que vivieras un poco.");
                    System.out.println("No tenías idea que te faltaba.");
                    System.out.println("Es tiempo de descansar.");
                    System.out.println("Viviste, amaste, y fuiste amado.");
                    System.out.println("Hasta que nos veamos de nuevo viajero.");
                    System.out.println("Gracias por dejarme acompañarte en esta historia.");
                    break;
                }else if(dec==2){
                    System.out.println("Gracias por dejarme acompañarte en esta historia.");
                    break;
                }
            }
            
            switch(opcion){
                case 1 ->{
                    if (plantas>0) {
                        System.out.println("No se puede cosechar más, ya se está cosechando");
                        break;
                    }
                    System.out.println("¿Cuantas plantas va a cosechar?");
                    plantas = ObiWan.nextInt();
                    System.out.println("PLANTANDO COSECHAS...");
                    System.out.println("Las cosechas tardan 5 días en estar.");
                    System.out.println("-----FIN DEL DIA-----");
                    
                }
                case 2 ->{
                    
                    if (cosechas == 0) {
                        System.out.println("LAS COSECHAS NO ESTAN LISTAS");
                    }
                    else if (plantas<0) {
                        System.out.println("NO HAY COSECHAS COSECHANDO");
                    }
                    
                    System.out.println("-----FIN DEL DIA-----");
                }
                case 3 ->{
                    System.out.println("Cantidad de dinero actual "+granja.getDinero());
                    System.out.println("¿Que tipo de animal desea?\n1. Conejos -> 150 Monets\n2.Vacas -> 350 Monets");
                    int animal = ObiWan.nextInt();
                    if (animal >2) {
                        System.out.println("Ingrese un animal válido");
                        break;
                    }else if(animal ==1){
                        System.out.println("¿Cuantos conejos desea?");
                        int animal1 = ObiWan.nextInt();
                        int conta = animal1;
                        int resta = animal1 *150;
                        if (granja.getDinero()<resta) {
                            System.out.println("No hay suficiente dinero");
                            break;
                        }
                        System.out.println("Conejo Comprado");
                        
                        granja.setDinero(granja.getDinero()-resta);
                        while(conta>0){
                        System.out.println("Ingrese el nombre de el conejo: ");
                        ObiWan = new Scanner(System.in);
                        String nombreConejo = ObiWan.nextLine();
                        Conejo con = new Conejo(nombreConejo);
                        granja.addConejo(con);
                        System.out.println(con.getNombre()+" ha sido agregado a la granja");
                        conta--;
                        }
                    }else if(animal == 2){
                        System.out.println("¿Cuantas vacas desea?");
                        int animal1 = ObiWan.nextInt();
                        int conta = animal1;
                        int resta = animal1 *350;
                        if (granja.getDinero()<resta) {
                            System.out.println("No hay suficiente dinero");
                            break;
                        }
                        System.out.println("Vaca Comprado");
                        
                        granja.setDinero(granja.getDinero()-resta);
                        while(conta>0){
                        System.out.println("Ingrese el nombre de la vaca: ");
                        ObiWan = new Scanner(System.in);
                        String nombreVaca= ObiWan.nextLine();
                        Vaca vac = new Vaca(nombreVaca);
                        granja.addVaca(vac);
                        System.out.println(vac.getNombre()+" ha sido agregado a la granja");
                        conta--;
                        }
                    }
                    System.out.println("Tu nueva cantidad de dinero es: "+granja.getDinero());
                    System.out.println("-----FIN DEL DIA-----");
                }
                case 4 ->{
                    System.out.println("¿Que deseas vender?");
                    System.out.println("-----ANALISIS DE GRANJA----");
                    granja.printGranja();
                    System.out.println("----------------------");
                    System.out.println("Selecciona: ");
                    System.out.println("1. vacas\n2. vegetales\n3. conejos");
                    int op = ObiWan.nextInt();
                    if (op==1) {
                        if (granja.vacioVaca()) {
                            System.out.println("No tienes vacas");
                            break;
                        }else{
                        System.out.println("La cantidad de vacas es: "+granja.tamaVaca());
                        System.out.println("Los nombres de las vacas son: ");
                        granja.printNombreVaca();
                        System.out.println("Ingrese la cantidad a vender: ");
                        int cantidad = ObiWan.nextInt();
                        for (int i = 0; i < cantidad; i++) {
                            
                            granja.quitarVaca(0);
                        }
                        
                        int suma = 400*cantidad;
                        granja.setDinero(granja.getDinero()+suma);
                        }
                        System.out.println("Tu nueva cantidad de dinero es: "+granja.getDinero());
                    }else if(op==3){
                        if (granja.vacioConejo()) {
                            System.out.println("No tienes conejos");
                            break;
                        }else{
                        System.out.println("La cantidad de conejos es: "+granja.tamaConejo());
                        System.out.println("Los nombres de los conejos son: ");
                        granja.printNombreConejo();
                        System.out.println("Ingrese la cantidad a vender: ");
                        int cantidad = ObiWan.nextInt();
                        for (int i = 0; i < cantidad; i++) {
                            granja.quitarConejo(0);
                        }   
                        int suma = 170*cantidad;
                        granja.setDinero(granja.getDinero()+suma);
                        }
                        System.out.println("Tu nueva cantidad de dinero es: "+granja.getDinero());
                    }else if(op==2){
                        if (granja.vacioVegetal()) {
                            System.out.println("No tienes vegetales");
                            break;
                        }else{
                        System.out.println("La cantidad de vegetales es: "+granja.tamaVegetal());
                        System.out.println("Ingrese la cantidad a vender: ");
                        int cantidad = ObiWan.nextInt();
                        for (int i = 0; i < cantidad; i++) {
                            granja.quitarVegetal(0);
                        }   
                        int suma = 100*cantidad;
                        granja.setDinero(granja.getDinero()+suma);
                        }
                        System.out.println("Tu nueva cantidad de dinero es: "+granja.getDinero());
                    }else{
                        System.out.println("Ingrese opcion valida");
                    }
                    System.out.println("-----FIN DEL DIA-----");
                }
                case 5 ->{
                    System.out.println("Buenas noches!");
                    System.out.println("-----FIN DEL DIA-----");
                }
                
            }
        }while(opcion==1||opcion==2||opcion==3||opcion==4||opcion==5||opcion !=6||opcion!=7);
    }
    
}
