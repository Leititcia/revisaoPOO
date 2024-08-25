import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Retangulo retangulo1 = new Retangulo(12.5, 10);
//        Retangulo retangulo2 = new Retangulo(20.5, 32);
//
//        System.out.println(retangulo1.exibirInformacoes());
//        System.out.println(retangulo2.exibirInformacoes());
//

        LinkedList<Retangulo> listaRetangulo = new LinkedList<>();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("----Retângulo " + (i + 1) + "----");
            System.out.println("Informe a largura: ");
            double largura = input.nextDouble();

            System.out.println("Informe a altura: ");
            double altura = input.nextDouble();

            listaRetangulo.add(new Retangulo(largura, altura));
        }

        for (int i = 5; i < 10; i++) {
            System.out.println("----Novo retângulo " + (i + 1) + "----");
            System.out.println("Informe a largura: ");
            double largura = input.nextDouble();

            System.out.println("Informe a altura: ");
            double altura = input.nextDouble();

            listaRetangulo.add(new Retangulo(largura, altura));
        }

        double maiorArea = 0;
        double menorPerimetro = Double.MAX_VALUE;

        Retangulo retanguloMaiorArea = null;
        Retangulo retanguloMenorPerimetro = null;

        for (Retangulo retangulo : listaRetangulo) {
            if (retangulo.getArea() > maiorArea) {
                maiorArea = retangulo.getArea();
                retanguloMaiorArea = retangulo;
            }

            if (retangulo.getPerimetro() < menorPerimetro) {
                menorPerimetro = retangulo.getPerimetro();
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


        listaRetangulo.sort(new Comparator<Retangulo>() {
            @Override
            public int compare(Retangulo r1, Retangulo r2) {
                return Double.compare(r1.getArea(), r2.getArea());
            }
        });

        System.out.println("\nLista de retângulos ordenada por área:");

        for (int i = 0; i < listaRetangulo.size(); i++) {
            Retangulo retangulo = listaRetangulo.get(i);
            System.out.println(retangulo.exibirInformacoes());
        }

    }
}