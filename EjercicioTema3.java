// Ejercicio - Tema 3



//Primera parte

public class SumaNumeros {
    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        int resultado = sumar(3, 5, 7);
        System.out.println(resultado); // Output: 15
    }
}

//Segunda parte

public class Coche {
    private int numeroDePuertas;
    
    public Coche() {
        this.numeroDePuertas = 0;
    }
    
    public void incrementarPuertas() {
        this.numeroDePuertas++;
    }
    
    public int getNumeroDePuertas() {
        return this.numeroDePuertas;
    }
    
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        
        System.out.println(miCoche.getNumeroDePuertas()); // Output: 1
    }
}

