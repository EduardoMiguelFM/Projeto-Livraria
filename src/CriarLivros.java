//Clase de execução =>main
public class CriarLivros {
    public static void main(String[] args) {
        // Instanciando um objeto = criar o objeto na memória
        // tipoObjeto nomeObejto = operadorInstaciação construtor
        // Livro      favorito =   new                 Livro();
        Editora editora = new Editora();
        editora.nome ="VR Editora; 1ª edição";
        editora.representane = "João";

        Livro favorito = new Livro("Diário de um Banana", "Jeff Kinney", 49.50, editora ,50, "Não é fácil ser criança...", "Dura" );

        //favorito.titulo = "Diário de um Banana";
        //favorito.autor ="Jeff Kinney";
        //favorito.valor = 49.50;
        //favorito.editora ="VR Editora; 1ª edição";
        //favorito.paginas = 50;
        //favorito.resumo ="Não é fácil ser criança...";
        //favorito.tipoCapa ="Dura";


        System.out.println("Meu livro favorito é: " +
        favorito.titulo + "\nO seu autor é:" + favorito.autor +
        "\nPreço: R$ " + favorito.valor);

        System.out.println(favorito.exibirDados());

    }

}
