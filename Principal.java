import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {


        Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal");

        Livro livro1 = new Livro("Harry Potter", "henrique", 1990, true);
        Livro livro2 = new Livro("Parsy jackson", "thais", 2014, true);
        Livro livro3 = new Livro("sherlock Homes", "caua", 1960, true);
        Livro livro4 = new Livro("cthullo", "Love craft", 1950, true);
        Livro livro5 = new Livro("it a coisa", "erick", 1995, true);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);
        biblioteca.adicionarLivro(livro5);

        biblioteca.listarLivro();
        System.out.println();

        biblioteca.emprestarLivro("Harry Potter");
        System.out.println();

        biblioteca.listarLivro();
        System.out.println();

        biblioteca.emprestarLivro("Harry Potter");
        System.out.println();

        biblioteca.devolverLivro("Harry Potter");
        System.out.println();

        biblioteca.listarLivro();
        System.out.println();


        biblioteca.buscarLivroPorTitulo("Batman");


    }
}