
package ejemploobjetos;

public class EjemploObjetos {

    public static void main(String[] args) {
        //instanciar objeto
        Semaforo unsemaforo = new Semaforo();
        unsemaforo.setColor("verde");
        String valor = unsemaforo.getColor();
        System.out.println("color = "+valor);
        
        //instanciar otro objeto
        Semaforo otrosemaforo = new Semaforo();
        otrosemaforo.setColor("rojo");
        String valor2 = otrosemaforo.getColor();
        System.out.println("color = "+valor2); //también se puede poner directamente el método asociado a valor2
        
        
        
    }
    
}
