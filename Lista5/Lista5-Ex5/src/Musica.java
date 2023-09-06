public class Musica {
        private int codigo;
        private String nome;
        private int duracao;
        private String album;
        private String artista;

        public Musica(int codigo, String nome, int duracao, String album, String artista) {
                this.codigo = codigo;
                this.nome = nome;
                this.duracao = duracao;
                this.album = album;
                this.artista = artista;
        }

        public String getAlbum() {
                return album;
        }

        public void mostrarDados(){
                System.out.println("Codigo: "+codigo+" Nome: "+nome+" Duração: "+duracao+" Album: "+album+" Artista: "+artista);
        }
}
