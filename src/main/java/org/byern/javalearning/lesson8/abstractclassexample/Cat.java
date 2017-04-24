package org.byern.javalearning.lesson8.abstractclassexample;

/**
 * Created by ByerN on 27.03.2017.
 */
public class Cat extends Pet {

    /*
         *  Every method from abstract class has to be implemented in implementing class.
         *  It means that it should have body and same signature as abstract method.
         */
    @Override//@Override annotation is optional but leaving it here is a good practice
    public void makeSound() {
        System.out.println("Miau!");
    }

    @Override
    public void move() {
        System.out.println("Moving on " + pawNumber + " paws!");
    }

    @Override
    public void doPet() {
        System.out.println("Pet the cat!");
    }
}
