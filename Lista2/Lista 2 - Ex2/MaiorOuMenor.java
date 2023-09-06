public class MaiorOuMenor {
    static int a=0, b=0, c=0, d=0, e=0, maior=0, menor=0;

    public void comparacao1 (int a , int b){
        if (a>b) {
            maior = a;
            menor = b;
        }
        else {
            maior = b;
            menor = a;
        }
    }
    public void comparação2 (int maior, int menor, int c){
        if(c<menor)
            menor = c;
        if (c>maior)
            maior = c;
        if (c<maior && c>menor)
            break;

    }
    public void comparação3 (int maior, int menor, int d){
        if(d<menor)
            menor = d;
        if (d>maior)
            maior = d;
        if (d<maior && d>menor)
            break;

    }
    public void comparação4 (int maior, int menor, int e){
        if(e<menor)
            menor = e;
        if (e>maior)
            maior = e;
        if (e<maior && e>menor)
            break;

    }



}
