package aulas.trabalhandoComDatas.javaLocalDate;

import java.time.LocalTime;

/**
 * Exemplo de como utilizar LocalTime
 */
public class Exemplo012 {
    public static void main(String[] args) {

        //diferente a local date ele trabalha tambem com horas
        LocalTime agora = LocalTime.now();

        System.out.println(agora);
        // 23:53:58.421

    }
}
