package br.com.estudosjava.interfaces;

import javax.swing.*;

public class Cat  implements Animal {
    @Override
    public void emitirsomeSom() {
        System.out.println("Miau Miau");
    }
}
