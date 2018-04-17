package lista;

public class Main  {    
    public static void main (String args[]){
        System.out.println("Testando a lista:");
        
        //criando a lista
        Lista lista = new Lista(10);
        //Teste estaCheia();
        if(lista.estaCheia())
            System.out.println("Lista está cheia!");
        
        //Teste estaVazia();
        lista.estaVazia();
            System.out.println("Lista está vazia");
            
        //Teste inserir();
        for(int i=0;i<lista.lista.length;i++){
            lista.inserir(i, (i+1));
        }
        if(lista.estaCheia())
            System.out.println("Lista está cheia!");
        //teste retirar();
        System.out.println("Itens retirados");
        for(int i=0;i<lista.lista.length;i++){
            System.out.println(lista.retirar(0));
        }
        lista.estaVazia();
        
        for(int i = 0; i<5;i++){
            lista.inserir(i, (i+1));
        }
        
        //Obtendo o tamanho;
        System.out.println("Tamanho da lista: " + lista.obterTamanho());
        
        //obter elemento;
        for(int i =0;i<lista.obterTamanho();i++){
            System.out.println(lista.obterElemento(i));
        }
        System.out.println("");
        lista.inserir(2, "Teste");
        
        for(int i =0;i<lista.obterTamanho();i++){
            System.out.println(lista.obterElemento(i));
        }
        
        
    }
    
}
