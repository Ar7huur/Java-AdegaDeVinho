package appvinhoze;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vinho {

    private String tipo, marca;
    private int vol;
    private float valor;
    private LocalDate data;
    private DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Vinho() {
        this.tipo = "";
        this.marca = "";
        this.vol = 0;
        this.valor = 0;
        this.data = LocalDate.now();
    }

    public Vinho(String tipo, String marca, int vol, float valor, LocalDate data) {
        this();
        this.tipo = tipo;
        this.marca = marca;
        this.vol = vol;
        this.valor = valor;
        this.data = data;
    }

    public String getTipo() {

        if (!"".equals(tipo)) {
            return tipo;
        } else {
            return null;
        }
    }

    public String getMarca() {
        if (!"".equals(tipo)) {
            return marca;
        } else {
            return null;
        }
    }

    public int getVol() {
        if (vol > 0) {
            return vol;
        } else {
            return 0;
        }
    }

    public float getValor() {
        if (valor > 0) {
            return valor;
        } else {
            return 0;
        }
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(String data) {
        this.data = LocalDate.parse(data, format);
    }
}
