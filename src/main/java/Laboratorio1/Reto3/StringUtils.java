package Laboratorio1.Reto3;

import java.util.stream.Stream;

public class StringUtils {

    public String replicate(String message){
        StringBuilder amplificationMessage = new StringBuilder();

        Stream.generate(() -> " " + message)
                .limit(2)
                .forEach(ampflication -> amplificationMessage.append(ampflication));

        return amplificationMessage.toString();
    }

    public String reverseAndReplicate(String message){
        String messageAmplification = replicate(message);
        System.out.println("Canal A: \"" +  messageAmplification + "\"");

        return messageAmplification;
    }
}
