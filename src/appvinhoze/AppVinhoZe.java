package appvinhoze;

public class AppVinhoZe {
//    MEMBROS 
//    JOSÉ RENATO CUNHA ROYER, RA:262012782
//    ARTHUR SILVA FIGUEIRINHA, RA:262012855

    public static void main(String[] args) {
        Adega adega = new Adega();
        Vinho vin = new Vinho();

        int qtde_vinho = 0, qtde_garrafas = 0;
        float v_tot = 0;

        vin.setTipo("branco");
        vin.setMarca("Vinhos Brasil");
        vin.setVol(2);
        vin.setValor((float) 23.50);
        vin.setData("31/12/1900");

        //ITEM a)
        adega.IncluiVinho(0, 1, vin);
        //ITEM b)
        adega.IncluiVinhoAleatorio(vin);
        //ITEM c)
        qtde_vinho = adega.contaTipo("branco");
        System.out.println(qtde_vinho);
        //ITEM d)
        qtde_garrafas = adega.getGarrafas();
        System.out.println(qtde_garrafas + " vinhos");
        //ITEM e)
        v_tot = adega.getValorTot();
        System.out.println(v_tot + " é o valor total de vinhos");
        //ITEM f)
        adega.getMaisAntigo();
        //ITEM g)
        adega.ExcluiVinho(0, 1);
        System.out.println("Excluido!");
    }
}
