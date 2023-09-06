public class Computador {
    String modelo;
    int ano;
    boolean funcionando;

    public void ligar(){

        System.out.println("o PC está ligando...");
    }
    public void desligar(){
        if (funcionando==true) {
            System.out.println("o PC vai desligar!");
        }
        else
            System.out.println("Bah!!!!!!!!!!!!!");
    }
    public void mostrarModelo (){
        System.out.println("modelo: "+modelo);
    }
    public void mostrarAno (){
        System.out.println("ano: "+ano);
    }

}
