package es.uah.matcomp.mp.el1.Practica4.ej7;

public class Dog extends Animal {
 @Override
 public void greeting() {
 System.out.println("Woof!");
 }
 public void greeting(Dog another) {
  System.out.println("Woooooooooof!");
 }
}