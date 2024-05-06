package list;

public class NovaFilaComPilha implements FilaComPilha{
    private NovaPilha pilha1;
    private NovaPilha pilha2;

    public NovaFilaComPilha(){
        this.pilha1 = new NovaPilha();
        this.pilha2 = new NovaPilha();
    }
    
    @Override
    public void enqueue(int entrada){
        pilha1.push(entrada);
    }
    @Override
    public int dequeue(){
        if (pilha2.isEmpty()){
            while (!pilha1.isEmpty()){
                int numero = pilha1.pop();
                pilha2.push(pilha1.pop());
            }
        }
        return pilha2.pop();
    }
    @Override
    public boolean isEmpty(){
        if (pilha1.isEmpty() && pilha2.isEmpty()){
            return true;
        }
        return false;
    }
    @Override
    public int size(){
        return pilha1.size() + pilha2.size();
    }
}
