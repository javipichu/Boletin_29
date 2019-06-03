
package boletin29;

/**
 *
 * @author slorenzorodriguez
 */
public class Boletin29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Barco A = new Veleros("AGSAGAS54",20.44f,3);
        Barco B = new Deportivas("KGLAGS5",5.62f,220);
        Barco C = new Yates("GIDSAS42",30.45f,7,5955);
        A.lista.add(A);
        B.lista.add(B);
        C.lista.add(C);
        
        A.factura(0,5);
        B.factura(0,5);
        C.factura(0,5);
        
    }
    
}

