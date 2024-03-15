public class Livro {
    //---ATRIBUTOS---//
        //+ (public) TipoDado nomeAtributoOuVariavel
        public String titulo;

        public String autor;

        public double valor;

        public Editora editora;
        public int paginas;

        public String resumo;

        public String tipoCapa;

        public String retornarDados(){
            String tituloF = "--------------------" +
                            "\nTitulo: " + this.titulo +
                            "\nResumo: " + this.resumo +
                            "\nPreço: R$ " + this.valor +
                            "\nPáginas: " + this.paginas +
                            "\nEditora: " + this.editora.nome +
                            "\n-------------------";
            return tituloF;

        }
        public Livro(String titulo, double preco){
            this.titulo = titulo;
            this.valor = preco;
        }
}
