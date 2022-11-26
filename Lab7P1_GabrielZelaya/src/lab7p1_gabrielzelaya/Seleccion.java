package lab7p1_gabrielzelaya;
import java.util.Random;

public class Seleccion {
    public char grupo;
    public String pais;
    public String DT;
    public int jugadoresConvocados;
    public boolean ganadoMundial;
    public int posicionTabla;
    public int goles;
    
    public Seleccion(String pais, char grupo, String DT, int jugadoresConvocados, boolean ganadoMundial, int posicionTabla, int goles) {
        this.pais = pais;
        this.grupo = grupo;
        this.DT = DT;
        this.jugadoresConvocados = jugadoresConvocados;
        this.ganadoMundial = ganadoMundial;
        this.posicionTabla = posicionTabla;
    }
    
    public Seleccion(){
        
    }

    public void setGoles(int goles) {
        this.goles = goles;
        int rand = new Random().nextInt((5-1)+1);
        this.goles = rand;
    }

    public int getGoles() {
        return this.goles;
    }    

    public String getPais() {
        return pais;
    }
    
    public String haGanado(boolean ganadoMundial){
        if (ganadoMundial == true) {
            return "Si ha ganado un mundial";
        } else {
            return "No ha ganado un mundial";
        }
    }

    @Override
    public String toString() {
        return pais + " pertenece al grupo " + grupo + "\nSu director tecnico es " + DT + "\nTiene " + jugadoresConvocados + " jugadores convocados\n" + haGanado(ganadoMundial) + "\nEstá en la " + posicionTabla + " posicion del grupo";
    }
    
    
            
}
