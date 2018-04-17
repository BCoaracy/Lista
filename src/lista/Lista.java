package lista;

public class Lista {

    private int posicao = 0;
    private int ultimo = 0;
    public Object[] lista = new Object[5];
    
    public Lista(){
        
    }
    
    public Lista(int tamanho){
        this.posicao = 0;
        this.ultimo = 0;
        this.lista = new Object[tamanho];
    }
    
    //TAD Lista
    
    public boolean estaCheia(){
        if(posicao==ultimo){
            return true;
        }
        return false;
    
    }public boolean estaVazia(){
        if(posicao==-1)
            return true;
        return false;
    }
    
    public void inserir(int posicao, Object obj){
        if(lista[posicao]==null){
            this.lista[posicao]=obj;
        } else{
            if(!estaCheia()){
                Object aux = new Object();
                aux = lista[posicao];
                lista[posicao]=obj;
                for(int i = (posicao+1); i<=lista.length;i++){
                    lista[i]=aux;
                    if(i!=lista.length)
                        aux=lista[i+1];
                }
            }
        }
    }
    
    
    public Object retirar(int posicao){
        if(this.estaVazia()){
            System.out.println("A lista está vazia");
            return null;
        }else{
            Object elemento = new Object();
            Object aux = new Object();
            elemento = this.lista[posicao];
            for(int i = (posicao+1);i>=this.lista.length;i++){
                this.lista[i-1]=this.lista[i];
            }
            return elemento;
        }
    }
    
    public Object obterElemento(int posicao){
        if(this.estaVazia()){
            System.out.println("A lista está vazia");
            return null;
        }else{
            return this.lista[posicao];
        }
    }
    
    public int obterTamanho(){
        int tamanho = 0;
        if(this.estaVazia()){
            return tamanho;
        }else
        {
            while(this.obterElemento(tamanho).equals(null)){
                tamanho++;
            }
        }
        return tamanho;
    }   
}