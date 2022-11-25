package lab7p1_gabrielzelaya;

public class Avion {
    public String modelo;
    public String codigo;
    public int año;
    public int capacidad_max;
    public int peso;
    public String nombre;
    public int estado;
    
    public Avion(String modelo,String codigo,int año,int capacidad_max,int peso,String nombre,int estado){
        this.modelo = modelo;
        this.codigo = codigo;
        this.año = año;
        this.capacidad_max = capacidad_max;
        this.peso = peso;
        this.nombre = nombre;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    
    public void estado(int estado){
        switch (estado) {
            case 1 -> System.out.println("Despegando");
            case 2 -> System.out.println("Aterrizando");
            default -> System.out.println("Estacionado");
        }
    }
    
    
}
