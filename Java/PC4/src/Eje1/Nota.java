package Eje1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Nota {
    private List<Double> notas;

    public Nota() {
        this.notas = new ArrayList<>();
    }
    public void agregarNota(double nota){
        notas.add(nota);
    }
    public  double calcularPromedio(){
        if (notas.isEmpty()) {
            return 0;
        }
        double suma=0;
        for (double nota: notas) {
            suma+= nota;
        }
        return suma/notas.size();
    }
    
    public double obtenerNotaMayor(){
        if (notas.isEmpty()) {
            return 0;
        }
        double mayor = notas.get(0);
        for (double nota:notas) {
            if (nota>mayor) {
                mayor=nota;
            }
        }
        return mayor;
    }
    public double obtenerNotaMenor(){
        if (notas.isEmpty()) {
            return 0;
        }
        double menor = notas.get(0);
        for (double nota:notas) {
            if (nota<menor) {
                menor=nota;
            }
        }
        return menor;
    }
    public int contarAprobados(double umbral){
        int aprobados =0;
        for (double nota: notas) {
            if (nota>=umbral) {
                aprobados++;
            }
        }
        return aprobados;
    }
    
     public int contarDesaprobados(double umbral) {
        int desaprobados = 0;
        for (double nota : notas) {
            if (nota < umbral) {
                desaprobados++;
            }
        }
        return desaprobados;
    }
    public List<Double> getNotas() {
        return notas;
    }
    public void limpiarNotas() {
        notas.clear();
    }
    
    public double GetNota(int id){
        return notas.get(id);
    }
    public int Tamaño(){
        return notas.size();
    }
}
