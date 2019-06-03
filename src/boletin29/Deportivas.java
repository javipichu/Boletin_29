
package boletin29;

import javax.swing.JOptionPane;

/**
 *
 * @author  jalvarezotero
 */
public class Deportivas extends Barco {

    String matriDepor;

    public Deportivas(String matriDepor, float eslora, int mastilCv) {
        super(eslora, mastilCv);
        this.matriDepor = matriDepor;
    }

    @Override
    public void factura(int numlista, int dias) {
        JOptionPane.showMessageDialog(null, "FACTURA"
                + "\n Matrícula del barco: " + matriDepor
                + "\n Eslora: " + eslora
                + "\n Precio aluger: " + super.aluger(numlista, dias));
    }

}