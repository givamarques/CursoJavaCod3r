public class Foreach {
    public static void main(String[] args) {
        double[] notas = {9.9, 8.7, 7.2, 9.4};
        // for tradicional onde no Sout eh acessado o Indice [i] para que se acesse o elemento naquela posicao
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i]);
        }
        System.out.println(" ");
        // aqui o valor de notas vai apontar pra cada um dos elementos do array. eh mais pratico e funciona se vc precisar passar por todos os valores dentro do array (o que acontece na maioria das vezes)
        for (double nota: notas){
            System.out.print(nota);
        }
    }
}
