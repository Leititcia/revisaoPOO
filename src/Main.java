import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Retangulo retangulo1 = new Retangulo(12.5, 10);
//        Retangulo retangulo2 = new Retangulo(20.5, 32);
//
//        System.out.println(retangulo1.exibirInformacoes());
//        System.out.println(retangulo2.exibirInformacoes());
//

        Retangulo[] vetorRetangulo = new Retangulo[5];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("----Retângulo " + (i + 1) + "----");
            System.out.println("Informe a largura: ");
            double largura = input.nextDouble();

            System.out.println("Informe a altura: ");
            double altura = input.nextDouble();

            vetorRetangulo[i] = new Retangulo(largura, altura);
        }

        double maiorArea = 0;
        double menorPerimetro = Double.MAX_VALUE;

        Retangulo retanguloMaiorArea = null;
        Retangulo retanguloMenorPerimetro = null;

        for (int i = 0; i < vetorRetangulo.length; i++) {
            Retangulo retangulo = vetorRetangulo[i];

            System.out.println("\n**** Retângulo " + (i + 1) + " ****");
            System.out.println(retangulo.exibirInformacoes());

            if (retangulo.areaRetangulo > maiorArea) {
                maiorArea = retangulo.areaRetangulo;
                retanguloMaiorArea = retangulo;
            }

            if (retangulo.perimetroRetangulo < menorPerimetro) {
                menorPerimetro = retangulo.perimetroRetangulo;
                retanguloMenorPerimetro = retangulo;
            }
        }

        System.out.println("\nRetângulo com a Maior área:");
        if (retanguloMaiorArea != null) {
            System.out.println(retanguloMaiorArea.exibirInformacoes());
        }

        System.out.println("\nRetângulo com o Menor perímetro:");
        if (retanguloMenorPerimetro != null) {
            System.out.println(retanguloMenorPerimetro.exibirInformacoes() + "\n");
        }


        Retangulo[] vetorExpansao = new Retangulo[vetorRetangulo.length * 2];

        for (int i = 0; i < vetorRetangulo.length; i++) {
            vetorExpansao[i] = vetorRetangulo[i];
        }

        vetorRetangulo = vetorExpansao;


        for (int i = 5; i < vetorRetangulo.length; i++) {
            System.out.println("----Novo retângulo " + (i + 1) + "----");
            System.out.println("Informe a largura: ");
            double largura = input.nextDouble();

            System.out.println("Informe a altura: ");
            double altura = input.nextDouble();

            vetorRetangulo[i] = new Retangulo(largura, altura);
        }

        Arrays.sort(vetorRetangulo, new Comparator<Retangulo>() {
            @Override
            public int compare(Retangulo r1, Retangulo r2) {
                return Double.compare(r1.getPerimetro(), r2.getPerimetro());
            }
        });

        System.out.println("\nVetor de retângulos ordenado por área:");

        for (int i = 0; i < vetorRetangulo.length; i++) {
            Retangulo retangulo = vetorRetangulo[i];

            System.out.println(retangulo.exibirInformacoes());
        }

    }
}