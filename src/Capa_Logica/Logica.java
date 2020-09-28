package Capa_Logica;

import gt.gob.banguat.variables.ws.InfoVariable;
import gt.gob.banguat.variables.ws.TipoCambio;
import java.math.BigDecimal;

public class Logica {
//Hola
    public Double Valor1;

    public Logica(String varlor1) {

        Valor1 = Double.parseDouble(varlor1);

    }

    public Double Quetzales() {
        TipoCambio Cambio = new TipoCambio();
        String Retorno;
        Retorno = Cambio.getTipoCambioSoap().tipoCambioDiaString();
        String Separado1[] = Retorno.split("<");
        String Separado2[] = Separado1[7].split(">");
        String Cambi = Separado2[1];
        Double Cambia = Double.parseDouble(Cambi);
        Double Retornar = Cambia * Valor1;
        return Retornar;
    }

    public Double Dolares() {
        TipoCambio Cambio = new TipoCambio();
        String Retorno;
        Retorno = Cambio.getTipoCambioSoap().tipoCambioDiaString();
        String Separado1[] = Retorno.split("<");
        String Separado2[] = Separado1[7].split(">");
        String Cambi = Separado2[1];
        Double Cambia = Double.parseDouble(Cambi);
        Double Retornar = Valor1/Cambia;
        return Retornar;
    }

}
