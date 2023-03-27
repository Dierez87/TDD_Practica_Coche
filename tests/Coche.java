public class Coche {
    public int velocidad;

    public void acelerar_Diego(int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerar_Diego(int desaceleracion) {
        velocidad -= desaceleracion;
        if (velocidad <0) velocidad = 0;
    }
}
