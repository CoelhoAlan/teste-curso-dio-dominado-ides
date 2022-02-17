package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();

        System.out.println(gato);

        /*    int a = 5;
        int b = 3;
        System.out.println("Hello World! " + (a+b) );*/

        Livro livro1 = new Livro("dhsdhs", 5);
    }

    static class Livro{
        private String nome;
        private Integer numeroPagina;

        public Livro(String nome, Integer numeroPagina) {
            this.nome = nome;
            this.numeroPagina = numeroPagina;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNumeroPagina() {
            return numeroPagina;
        }

        public void setNumeroPagina(Integer numeroPagina) {
            this.numeroPagina = numeroPagina;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", numeroPagina=" + numeroPagina +
                    '}';
        }
    }
}
