public class Livro {
    //---ATRIBUTOS---//
        //+ (public) TipoDado nomeAtributoOuVariavel
        public String titulo;

        public String autor;

        public double valor;

        public String editora;
        public int paginas;

        public String resumo;

        public String tipoCapa;

        public String retornarDados(){
            String tituloF = "--------------------" +
                            "\nTitulo: " + this.titulo +
                            "\nResumo: " + this.resumo +
                            "\nPreço: R$ " + this.valor +
                            "\nPáginas: " + this.paginas;
            return tituloF;

        }
}
