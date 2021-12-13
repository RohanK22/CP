import java.util.regex.*;

public class Arti {
    public static String[] redactCardDetails(String message) {
        String regexAMEX = "(?<AMEX>(34|37)\\d{13})";
        String regexMASTERCARD = "(?<MASTERCARD>5(1|2|3|4|5)\\d{14})";
        String regexVISA = "(?<VISA>4\\d{12})";
        
        Pattern patternAMEX = Pattern.compile(regexAMEX);
        Matcher matcherAMEX = patternAMEX.matcher(message);
    
        Pattern patternMASTERCARD = Pattern.compile(regexMASTERCARD);
        Matcher matcherMASTERCARD = patternMASTERCARD.matcher(message);
        
        Pattern patternVISA = Pattern.compile(regexVISA);
        Matcher matcherVISA = patternVISA.matcher(message);
    
        if(matcherAMEX.find()) {
            String card = matcherAMEX.group("AMEX");
            String stars = "***************";
            System.out.println(message.replace(card,stars));
            return new String[] {"AMEX", message.replace(card,stars)};
        }
        
        
        if(matcherMASTERCARD.find()) {
            String card = matcherMASTERCARD.group("MASTERCARD");
            String stars = "****************";
            System.out.println(message.replace(card,stars));
            return new String[] {"MASTERCARD", message.replace(card,stars)};
        }
        
        if(matcherVISA.find()) {
            String card = matcherVISA.group("VISA");
            String stars = "*************";
            System.out.println(message.replace(card,stars));
            return new String[] {"VISA", message.replace(card,stars)};
        }
        
        return new String[] {"NONE", message};
        
    }
}