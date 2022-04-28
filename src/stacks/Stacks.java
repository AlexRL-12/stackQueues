package stacks;

import nodes.Nodes;

public class Stacks {

    private Nodes topElement; //ultimo entra primero que sale
    private int size;


    public int aumentSize(){
        return size++;
    }

    public int decrementSize(){
        return size++;
    }
    public boolean isEmpty(){
        return size ==0;
    }

    public Stacks() {
        this.topElement = null;
        this.size = 0;
    }

    //montar un encima del otro

    public void push(String data){

        Nodes newNode = new Nodes(data);
        if (!isEmpty()){
            newNode.setNextNode((topElement));

        }
        topElement = newNode;
        aumentSize();

    }

    //quitar

    public void pop(){

        if (!isEmpty()){

            //mostrar el que se elimino en el main front con el object

            Object elemtDelete = topElement.getNextNode();
            topElement = topElement.getNextNode();
            decrementSize();
            //print publico llamar main
            return;
        }

        //hacerla desde el main
        System.out.println("The stack is empty.");

    }


    public void print(){

        if (!isEmpty()){
            Nodes aux = topElement;

            for (int i = 0; i < size; i++) {

                // esto no debe estar aqui, lo debo hacer en el front

                System.out.println(aux.getData());
                aux = aux.getNextNode();
            }
            return;
        }

        //no se hace aqui;

        System.out.println("The stack is empty.");

    }



}
