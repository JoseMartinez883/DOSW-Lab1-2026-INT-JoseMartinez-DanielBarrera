package Laboratorio1.Reto3;

import java.util.stream.IntStream;

public class StringUtils {

    public String reverse(String message) {
        StringBuffer message2 = new StringBuffer(message);
        return message2.reverse().toString();
    }

    public String replicate(String message){
        StringBuilder amplificationMessage = new StringBuilder();

        IntStream.range(0,3).forEach( i -> {
            if(i > 0) amplificationMessage.append(" ");
            amplificationMessage.append(message);
        });

        return amplificationMessage.toString();
    }

    public String reverseAndReplicate(String message){
        String messageAmplification = replicate(message);
        System.out.println("Canal A: " +  messageAmplification);

        String messageAmplificationReverse = reverse(messageAmplification);
        System.out.println("Descrifrado final: " + messageAmplificationReverse);

        return messageAmplificationReverse;
    }
}
