import java.util.Scanner;

//Classe de execução => main
public class CriarLivros {
    public static void main(String[] args) {
        //Instanciando um objeto => criar um objeto na memória
        //tipoObjeto nomeObejto = operadorInstancia   construtor;
        // Livro     favorito =       new              Livro();
        Livro favorito = new Livro();
        Scanner leitor = new Scanner(System.in);
        favorito.titulo = "O Hobbit";
        favorito.autor = "J. R. R. Talkien";
        favorito.valor =  37.37;
        favorito.editora = "Harper Collins";
        favorito.resumo = "Bilbo era um dos ...";
        favorito.tipoCapa = "Comum";

        System.out.println("Meu livro favorito é: " + favorito.titulo + "\n\nSeu autor é: " + favorito.autor + "\n\nPreço é: " + favorito.valor);

        Livro meuLivro = new Livro();
        meuLivro.titulo = "UML 2.0";
        meuLivro.valor = 50.99;

        System.out.println(favorito.retornarDados());

        Livro favorito2 = new Livro();
        System.out.println("Digite o titulo do livro: ");
        favorito2.titulo = leitor.nextLine();

        System.out.println("Seu livro favorito é: " + favorito2.titulo);
    }
}
