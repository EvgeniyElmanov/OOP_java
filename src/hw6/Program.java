package src.hw6;

import java.io.File;

public class Program {
    /**
     * TODO: Task 1. Homework. Optimize the work of the Order class within the framework of the SRP principle.
     * @param args
     */
    public static void main(String[] args) {
        Order order = new Order("Bruce Wayne", "Porche", 5,50000);
        Saver saver = new Saver();
        Loader loader = new Loader();
        // loader.inputFromConsole(order);
        saver.saveToJson(order);
        saver.saveToXML(order);
        saver.saveToTxt(order);
        Order order1 = new Order();
        loader.loadFromJson(new File("src/hw6/order111.json"), order1);
        System.out.println(order1);
    }
}