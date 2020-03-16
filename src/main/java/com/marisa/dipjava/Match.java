/*
 * Tipo al que se le injectan dependencias a traves de su constructor, en este
 * caso una lista de Sports
 */

package com.marisa.dipjava;

import java.util.List;

/**
 *
 * @author Marisa
 */
 public class Match {

    private final List<Sport> sports;

    public Match(List sports) {
        this.sports = sports;
    }

    public void implement() {
    sports.forEach(s -> {
            s.practice();
        });
    }
}
