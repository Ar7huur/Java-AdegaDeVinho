package appvinhoze;

import java.time.LocalDate;

public class Adega {

    private Vinho[][] mat;

    public Adega() {
        this.mat = new Vinho[20][10];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                mat[i][j] = null;
            }
        }
    }

    public Vinho[][] getMat() {
        return mat;
    }

    public void setMat(Vinho[][] mat) {
        this.mat = mat;
    }

    public void IncluiVinho(int linha, int coluna, Vinho vin) {
        mat[linha][coluna] = vin;
    }

    public void IncluiVinhoAleatorio(Vinho vin) {
        int a, b;
        a = (int) (Math.random() * 20);
        b = (int) (Math.random() * 10);

        while (vin.getValor() == 0) {
            a = (int) (Math.random() * 20);
            b = (int) (Math.random() * 10);
        }

        mat[a][b] = vin;
    }

    public int contaTipo(String tipo) {
        int n = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 10; j++) {
                if (mat[i][j] != null && mat[i][j].getTipo().equals(tipo)) {
                    n++;
                }
            }
        }
        return n;
    }

    public int getGarrafas() {
        int cont = 0;

        for (int l = 0; l < 20; l++) {
            for (int c = 0; c < 10; c++) {
                if (mat[l][c] != null && !mat[l][c].equals("")) {
                    cont++;
                }
            }
        }
        return cont;
    }

    public float getValorTot() {
        float cont = 0;

        for (int l = 0; l < 20; l++) {
            for (int c = 0; c < 10; c++) {
                if (mat[l][c] != null && mat[l][c].getValor() > 0) {
                    cont += mat[l][c].getValor();
                }
            }
        }

        return cont;
    }

    public Vinho getMaisAntigo() {
        Vinho aux = new Vinho();
        LocalDate menor_data = LocalDate.MAX;
        for (int l = 0; l < 20; l++) {
            for (int c = 0; c < 10; c++) {
                if (mat[l][c] != null && mat[l][c].getTipo().equals("") && mat[l][c].getData().isBefore(menor_data)) {
                    aux = mat[l][c];
                    menor_data = mat[l][c].getData();
                }
            }
        }
        return aux;
    }

    void ExcluiVinho(int linha, int coluna) {
        Vinho novo = new Vinho();
        mat[linha][coluna] = novo;
    }
}
