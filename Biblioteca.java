public class Biblioteca {


    private String nome;

    private Livro[]  vect = new Livro[5];

    public Biblioteca(String nome) {
        this.nome = nome;
    }

    public void adicionarLivro(Livro livro){
        for( int i = 0 ; i < vect.length; i++){

            if(vect[i] == null){
                vect[i] = livro;
                return;
            }

        }
        System.out.println("A biblioteca esta cheia");
    }


    public Livro buscarLivroPorTitulo(String titulo){

        for(int i = 0; i < vect.length; i++){

            if(vect[i] != null){
                if(vect[i].getTitulo().equals(titulo))
                    return vect[i];
            }
        }

        System.out.println("Livro não existe na biblioteca");
        return null;
    }

    public void emprestarLivro(String titulo){

        Livro livroEncontrado = buscarLivroPorTitulo(titulo);

        if(livroEncontrado == null){
            System.out.println("Livro não encontrado");
        }else{

            boolean podeEmprestar = livroEncontrado.emprestar();
            if(podeEmprestar == true){
                System.out.println("Livro emprestado com sucesso!");
            }else {
                System.out.println("O livro já está emprestado.");
            }


        }

    }

    public void devolverLivro(String titulo){

        Livro livroencontrado = buscarLivroPorTitulo(titulo);

        if(livroencontrado == null){
            System.out.println("Livro não encontrado");
        }else {
            livroencontrado.devolver();
            System.out.println("livro foi devolvido com sucesso.");

        }

    }

    public void listarLivro(){

        System.out.println("=== Livros da Biblioteca ===");
        for(int i = 0 ; i < vect.length; i++){

            if(vect[i]==null){

            }else {

                System.out.println(vect[i].toString());

            }

        }
        System.out.println("=== Fim da lista ===");
    }



















    }

