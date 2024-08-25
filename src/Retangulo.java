public class Retangulo {

    double largura;
    double altura;
    double areaRetangulo;
    double perimetroRetangulo;

    Retangulo() {

    }

    Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
        calcularArea();
        calcularPerimetro();
    }

    void calcularArea() {
        this.areaRetangulo = largura * altura;
    }

    void calcularPerimetro() {
        this.perimetroRetangulo = 2 * (largura + altura);
    }

    String exibirInformacoes() {
        return "Largura = " + this.largura + ", Altura = " + this.altura +
                ", Área: " + areaRetangulo + ", Perímetro: " + perimetroRetangulo;
    }

    public double getArea() {
        return areaRetangulo;
    }

    // Getter para perímetro
    public double getPerimetro() {
        return perimetroRetangulo;
    }

}
