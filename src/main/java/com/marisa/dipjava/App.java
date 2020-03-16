/*
 * Cualquier tipo que necesita crear Matches de distintos Sports
 */
package com.marisa.dipjava;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Marisa 
 */
public class App {


     public static void main(String[] args) {

       Football football = new Football();
       Basketball basketball = new Basketball();
       List sports = new ArrayList();
       sports.add(football);
       sports.add(basketball);
       Match m = new Match(sports);
       m.implement();

    }   

}