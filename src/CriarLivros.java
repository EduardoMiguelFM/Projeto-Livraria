//Clase de execução =>main
public class CriarLivros {
    public static void main(String[] args) {
        // Instanciando um objeto = criar o objeto na memória
        // tipoObjeto nomeObejto = operadorInstaciação construtor
        // Livro      favorito =   new                 Livro();

        Livro favorito = new Livro();
        favorito.titulo = "Diário de um Banana";
        favorito.autor ="Jeff Kinney";
        favorito.valor = 49.50;
        favorito.editora ="VR Editora; 1ª edição";
        favorito.resumo ="Não é fácil ser criança...";
        favorito.tipoCapa ="Dura";
        //capa: comum, capaDura, digital

        System.out.println("Meu livro favorito é: " +
        favorito.titulo + "\nO seu autor é:" + favorito.autor +
        "\nPreço: R$ " + favorito.valor);










        //Livro meuLivro = new Livro();

    }
}
