public class Coche {
    public int velocidad;

    public void acelerar(int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerar(int desaceleracion) {
        velocidad -= desaceleracion;
        if (velocidad <0) velocidad = 0;
    }
}
