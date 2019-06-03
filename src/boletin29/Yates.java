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
public class Yates extends Barco {

    String matriYates;

    public Yates(String matriYates, float eslora, int camarotes, int cv) {
        super(eslora, camarotes, cv);
        this.matriYates = matriYates;
    }

    @Override
    public void factura(int numlista, int dias) {
        JOptionPane.showMessageDialog(null, "FACTURA"
                + "\n Matrícula del barco: " + matriYates
                + "\n Eslora: " + eslora
                + "\n Precio aluger: " + super.aluger(numlista, dias));
    }

}