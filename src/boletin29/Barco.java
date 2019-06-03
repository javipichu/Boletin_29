/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin29;

import java.util.ArrayList;

/**
 *
 * @author jalvarezotero
 */
public abstract class Barco {
    
    float eslora;
    int mastiles;
    int camarotes;
    int cv;
    Veleros vel;
    Deportivas depor;
    Yates yate;
    ArrayList<Barco> lista = new ArrayList<>();

    public Barco() {
    }

    public Barco(float eslora, int mastilCv) {
        this.eslora = eslora;
        this.mastiles = mastilCv;
        this.cv = mastilCv;
    }

    public Barco(float eslora, int camarotes, int cv) {
        this.eslora = eslora;
        this.camarotes = camarotes;
        this.cv = cv;
    }

    public float aluger(int numlista, int dias) {
        float total;
        if (lista.get(numlista) == vel) {
            total = dias * (10 * eslora) + (8 * mastiles);
            return total;
        } else if (lista.get(numlista) == depor) {
            total = dias * (10 * eslora) + (2 * cv);
            return total;
        } else {
            total = dias * (10 * eslora) + (2 * cv + 25 * camarotes);
            return total;
        }

    }

    public abstract void factura(int numlista, int dias);
}

