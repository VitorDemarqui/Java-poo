package aulas.trabalhandoComDatas.javaDate;

import java.util.Date;

/**
 *  Exemplo de utilização do construtor com passagem de parametro em milisegundos
 */
public class
Exemplo002 {
    public static void main(String[] args) {
        //espera que voce passe os milissegundos com base padrão de tempo(epoch)
        // que ussa como referencia 1 de janeiro de 1970)
        //representa uma data como inteiro com base em 1 janeiro de 1970
        Long currentTimeMillis = System.currentTimeMillis();
        //currentTimeMillis retorna um long com os millisegundo mais proximo de quando foi executado-

        System.out.println(currentTimeMillis);
        // 1563127311564


        //instancia a classe date passando como parametro a currenttimemillis e ele irá retornar a data que foi capturado
        Date novaData = new Date(currentTimeMillis);

        System.out.println(novaData);
        // Sun Jul 14 15:01:51 BRT 2019

    }
}
