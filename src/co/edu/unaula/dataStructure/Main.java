package co.edu.unaula.dataStructure;

import queues.Queues;
import stacks.Stacks;

import java.util.Scanner;

public class Main {

    private static final String VALOR_ERRONEO = "Valor erroneo";


    private static String showMenu() {

        Scanner read = new Scanner(System.in).useDelimiter("\n");
        String opc;
        System.out.println("Principal menu");
        System.out.println("choose an option");
        System.out.println("1. Stacks");
        System.out.println("2. Queue");
        System.out.println("Other Nomber exit");
        opc = read.next();

        if (isNumber(opc)){
            return opc;
        }
        return VALOR_ERRONEO;


    }

    private static boolean isNumber(String value){
        try{
            double number = Double.parseDouble(value);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public static void main(String[] args) {

        String opt;

        do {
            opt = showMenu();

            if (!opt.equals(VALOR_ERRONEO)) {
                switch (opt) {
                    case "1":
                        useStacks();
                        break;
                    case "2":
                        useQueues();
                        break;
                }
            }
            else {
                System.out.println("Debe ingrear solo numeros");
                opt = showMenu();
                while (opt.equals(VALOR_ERRONEO)){
                    System.out.println("Debe ingrear solo numeros");
                    opt = showMenu();
                }
            }


        } while (opt == "1" || opt == "2");
    }

    private static void useQueues() {

        // asi en el parcial no separar imprimir, ingresar etc....
        //preguntar imprimir y demas

        Queues objQueue = new Queues();

        objQueue.enqueues("Ingles 1");
        objQueue.enqueues("Ingles 2");
        objQueue.enqueues("Ingles 3");
        objQueue.enqueues("Ingles 4");
        objQueue.enqueues("Ingles 5");
        objQueue.enqueues("Ingles 6");
        objQueue.enqueues("Ingles 7");
        System.out.println("********************************* Encolar *********************************");
        objQueue.printQueue();
        System.out.println("********************************* Desencolar *********************************");
        objQueue.desqueue();
        objQueue.printQueue();
    }

    private static void useStacks() {
        Stacks objStack = new Stacks();

        objStack.push("1");
        objStack.push("2");
        objStack.push("3");
        objStack.push("4");
        objStack.push("5");


        System.out.println("********************************* PILA *********************************");
        objStack.print();
        System.out.println("********************************* Eliminar primer elemento *********************************");
        objStack.pop();
        objStack.print();
    }
}
