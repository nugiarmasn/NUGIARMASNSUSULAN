import java.util.HashMap;
import java.util.Map;

public class Main{
    public static void main(String[] args) {
        String kata = "PERTAMA";
        Map<Character, Integer> hasil = hitungKarakter(kata);


        System.out.println("String: " + kata);
        System.out.println("Hasil: " + hasil);
    }


    private static Map<Character, Integer> hitungKarakter(String input) {

        Map<Character, Integer> karakterCount = new HashMap<>();


        for (char karakter : input.toCharArray()) {

            if (karakterCount.containsKey(karakter)) {

                karakterCount.put(karakter, karakterCount.get(karakter) + 1);
            } else {

                karakterCount.put(karakter, 1);
            }
        }


        return karakterCount;
    }
}
