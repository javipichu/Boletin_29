/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import javax.swing.JOptionPane;

/**
 *
 * @author jalvarezotero
 */
public class Veleros extends Barco {

    String matriVel;

    public Veleros(String matricula,float eslora, int mastilCv) {
        super(eslora, mastilCv);
        this.matriVel = matricula;
    }

    @Override
    public void factura(int numlista, int dias) {
        JOptionPane.showMessageDialog(null, "FACTURA"
                + "\n Matrícula del barco: " + matriVel
                + "\n Eslora: " + eslora
                + "\n Precio aluger: " + super.aluger(numlista, dias));
    }

}