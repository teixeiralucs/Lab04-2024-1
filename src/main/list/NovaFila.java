package list;

public class NovaFila<ListaLigada> implements Fila {
    private ListaLigada lista;

    @Override
    public void enqueue(int entrada) {
       lista.insereFim(entrada);
    }

    @Override
    public int dequeue() {
        int numero = lista.buscaIndice(0);
        lista.removeInicio();
        return numero;
    }

    @Override
    public boolean isEmpty(){
        if (lista == null){
            return true;
        }
        return false;
    }
    @Override
    public int size(){
        return lista.getIndice() + 1;

    }
}