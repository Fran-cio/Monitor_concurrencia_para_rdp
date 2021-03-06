/*
 * Productor
 *
 * Version 1.0
 *
 * Copyright BeerWare
 */

package com.bugui_soft.operario;

import com.bugui_soft.utils.Constantes;

public class Productor extends Operario implements Runnable {

    public Productor() {
        //Invariante de transiciones del Productor.(T2 a T5)
        Integer[] tInvariante = new Integer[]{2, 3, 4, 5};
        setTInvariante(tInvariante);
    }

    public void run() {
        Thread.currentThread().setName(Constantes.PRODUCTOR);
        aTrabajar(Constantes.SLEEP_PRODUCTOR_MS);
    }

}
