package mainPack;

public class Circulo extends Forma {
    private float raio;


    public Circulo(float raio) {
        this.raio = raio;
    }

    public float calcularArea() {
        return (float) (Math.PI * raio * raio);
    }

    public float calcularPerimetro() {
        return (float) (2 * Math.PI * raio);
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
}
