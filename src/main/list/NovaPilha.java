package list;
import linked.ListaLigada;

public class NovaPilha implements Pilha{
    private ListaLigada lista;

    public boolean isEmpty(){
        if (lista == null){
            return true;
        }
        return false;
    }
    public void push (int valor){
        lista.insereInicio(valor);
    }
    public int pop(){
        if (isEmpty()){
            return -1;
        }
        int valor = lista.getValor();
        lista.removeInicio();
        return valor;
        
    }
}

