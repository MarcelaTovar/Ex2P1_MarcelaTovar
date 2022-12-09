
package ex2p1_marcelatovar;

import java.util.ArrayList;

public class Granja {
   String nombre;
   ArrayList<Vaca> vaca = new ArrayList<>();
   ArrayList<Conejo> Conejo = new ArrayList<>();
   ArrayList<Vegetales> Vegetal = new ArrayList<>();
   int dinero;
   
   public Granja(){
       
   }

    public Granja(String nombre) {
        this.vaca = new ArrayList<>();
        this.Conejo = new ArrayList<>();
        this.Vegetal = new ArrayList<>();
        this.nombre = nombre;
        this.dinero = 500;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Vaca> getVaca() {
        return vaca;
    }

    public void setVaca(ArrayList<Vaca> vaca) {
        this.vaca = vaca;
    }

    public ArrayList<Conejo> getConejo() {
        return Conejo;
    }

    public void setConejo(ArrayList<Conejo> Conejo) {
        this.Conejo = Conejo;
    }

    public ArrayList<Vegetales> getVegetal() {
        return Vegetal;
    }

    public void setVegetal(ArrayList<Vegetales> Vegetal) {
        this.Vegetal = Vegetal;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    
    public void addVaca(Vaca Vacaa){
        vaca.add(Vacaa);
    }
    public void addConejo(Conejo Conejoo){
        Conejo.add(Conejoo);
    }
    public void addVegetal(Vegetales Vegetall){
        Vegetal.add(Vegetall);
    }
    public void quitarVaca(int cantidad){
        vaca.remove(cantidad);
    }
    public void quitarConejo(int cantidad){
        Conejo.remove(cantidad);
    }
    public void quitarVegetal(int cantidad){
        Vegetal.remove(cantidad);
    }
    
    public int tamaVaca(){
        return vaca.size();
    }
    public int tamaConejo(){
        return Conejo.size();
    }
    public int tamaVegetal(){
        return Vegetal.size();
    }
    
    public void printGranja(){
        System.out.println("Tienes "+vaca.size()+" de vacas.");
        System.out.println("Tienes "+Conejo.size()+" de conejos.");
        System.out.println("Tienes "+Vegetal.size()+" de vegetales.");
    }
    
    public void printNombreConejo(){
        System.out.println("Estos son los nombres de los conejos: "+Conejo);
        
    }
    public void printNombreVaca(){
        System.out.println("Estos son los nombres de las vacas: "+vaca);
    }
    public boolean vacioVaca(){
        boolean check = false;
        if (vaca.isEmpty()) {
            check = true;
        }else{
            check = false;
        }
        return check;
    }
    public boolean vacioConejo(){
        boolean check = false;
        if (Conejo.isEmpty()) {
            check = true;
        }else{
            check = false;
        }
        return check;
    }
    public boolean vacioVegetal(){
        boolean check = false;
        if (Vegetal.isEmpty()) {
            check = true;
        }else{
            check = false;
        }
        return check;
    }
   
   
}
