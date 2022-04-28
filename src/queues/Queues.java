package queues;

import nodes.Nodes;

public class Queues {

    private Nodes firstElement;
    private Nodes endElement;
    private int size;

    public Queues() {

        this.firstElement = null;
        this.endElement = null;
        this.size = 0;

    }

    public int aumentSize(){
        return size++;
    }

    public int decrementSize(){
        return size++;
    }
    public boolean isEmpty(){
        return size ==0;
    }

    //encolar y ingresar registros

    public void enqueues(String data){
        Nodes newNode = new Nodes(data);
        if (isEmpty()){
            firstElement = newNode;
        }else{
            endElement.setNextNode(newNode);
        }
        endElement = newNode;
        aumentSize();
    }

    //desencolar

    public void desqueue(){


        if (!isEmpty()){

            //tomar el elemento y decir quien se elimino sus datos hacer metodo

            Object elemDelete = firstElement.getNextNode();
            firstElement = firstElement.getNextNode();
            return;
        }
        decrementSize();
        //esto se hace en el front no en el back...
        System.out.println("The queue is empty.");

    }

    public void printQueue(){

        if (!isEmpty()){
            Nodes aux = firstElement;

            for (int i = 0; i < size; i++) {

                // esto no debe estar aqui, lo debo hacer en el front

                System.out.println(aux.getData());
                aux = aux.getNextNode();
            }
            return;
        }
        System.out.println("The queue is empty.");

    }

}
