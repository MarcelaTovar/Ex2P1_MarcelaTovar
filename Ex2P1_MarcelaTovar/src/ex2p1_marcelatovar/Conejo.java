
package ex2p1_marcelatovar;


public class Conejo {
    String nombre;
    int precio;
    int venta;

    public Conejo(String nombre) {
        this.nombre = nombre;
        this.precio = 150;
        this.venta = 170;
    }

    public int getVenta() {
        return venta;
    }

    public void setVenta(int venta) {
        this.venta = venta;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
