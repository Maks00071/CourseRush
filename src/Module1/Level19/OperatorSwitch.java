package Module1.Level19;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class OperatorSwitch {
    public static void main(String[] args) {
        System.out.println(getPlanetAtmosphere(5));
    }

    public static List<String> getPlanetAtmosphere(int seqNumberFromSun) {
        List<String> result = new ArrayList<>();

        switch(seqNumberFromSun) {
            case 1 -> result.add("Нет атмосферы");
            case 2, 4 -> result.add("Углекислый газ");
            case 3 -> Collections.addAll(result, "Углекислый газ", "Азот", "Кислород");
            case 5, 6 -> Collections.addAll(result, "Водород", "Гелий");
            case 7, 8 -> Collections.addAll(result, "Метан", "Водород", "Гелий");
            default -> {
                break;
            }
        }
        return result;
    }
}
