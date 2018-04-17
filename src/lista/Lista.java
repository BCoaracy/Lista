package lista;

public class Lista {

    private int posicao = -1;
    private int ultimo = 5;
    public Object[] lista = new Object[5];
   
    
    public Lista(){
        
    }
    
    public Lista(int max){
        this.posicao = -1;
        this.ultimo = max;
        this.lista = new Object[max];
    }
    
    //TAD Lista
    
    public boolean estaCheia(){
        if(this.obterTamanho()==this.ultimo){
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
                for(int i = (posicao+1); i<ultimo;i++){
                    lista[i]=aux;
                    if(i!=ultimo)
                        aux=lista[i+1];
                }
            }
        }
        this.posicao++;
    }
    
    
    public Object retirar(int posicao){
        if(this.estaVazia()){
            System.out.println("A lista está vazia");
            return null;
        }else{
            Object elemento = new Object();
            Object aux = new Object();
            elemento = this.lista[posicao];
            for(int i = (posicao+1);i<this.ultimo;i++){
                this.lista[i-1]=this.lista[i];
            }
            this.posicao--;
            this.ultimo--;
            return elemento;
        }
    }
    
    public Object obterElemento(int posicao){
            return this.lista[posicao];
    }
    
    public int obterTamanho(){           
        return this.posicao+1;
    }   
}