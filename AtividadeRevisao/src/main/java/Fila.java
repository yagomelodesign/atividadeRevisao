/*2. Crie uma classe para armazenar os dados da fila estática,
onde em cada posição terá um objeto do tipo <T>.*/

public class Fila<T> {
    private T[] elementos;
    private int inicio=0;
    private int fim;
    private int tamanhoAtual=0;

    // ---------------------------------------
    public Fila(int tamanho) {
        elementos = (T[]) new Object[tamanho];
        this.fim = -1;
    }

     // ---------------------------------------
    public boolean isFull() {
        return this.fim == elementos.length-1;
    }

     // ---------------------------------------
    public boolean isEmpty() {
        if(this.fim==-1)
            return true;
        return false;    }

     // ---------------------------------------
    public void enqueue(T elemento) {
          if(!this.isFull()){
            this.fim++;
            this.elementos[this.fim] = elemento;
            this.tamanhoAtual++;
       }else{
            System.out.println("A fila está cheia. Não é possível enfileirar.");
            }
    }

     // ---------------------------------------
    public T dequeue() {
        if (!isEmpty()) {
            T elementoDesenfileirado = elementos[inicio];
            this.inicio ++;
            this.tamanhoAtual--;
            return elementoDesenfileirado;
        } else {
            System.out.println("A fila está vazia. Não é possível desenfileirar.");
            return null;
        }
    }

     // ---------------------------------------
    public T first() {
        if (!isEmpty()) {
            return elementos[inicio];
        } else {
            System.out.println("A fila está vazia. Não há elementos para mostrar.");
            return null;
        }
    }

     // ---------------------------------------
    public int size() {
        return tamanhoAtual;
    }

    // ---------------------------------------
    @Override
     public String toString(){
        StringBuilder retorno = new StringBuilder();
        for(int i=fim;i>=0;i--)
            retorno.append(elementos[i] + "\n");
        retorno.append("-----------");
        return retorno.toString();
    }
}
