import java.util.*;

public class Parenthese {

    public boolean isValid(String s) {
        List<Character> caracters = new ArrayList<>(Arrays.asList('(', '{', '[', ')', '}', ']'));
        List<Character> list = new ArrayList<>();
        List<Character> caracteresOuvrant = caracters.subList(0, caracters.size() / 2);
        List<Character> caracteresFermant = caracters.subList(caracters.size() / 2, caracters.size());

        for (int i = 0; i < s.length(); i++) {
            char ccr = s.charAt(i);

            if (caracteresOuvrant.contains(ccr)) {
                list.add(ccr);
            } else if (caracteresFermant.contains(ccr)) {
                if (!list.isEmpty()
                        && list.get(list.size() - 1) == caracteresOuvrant.get(caracteresFermant.indexOf(ccr))) {
                    list.remove(list.size() - 1);
                } else {
                    return false;
                }
            }
        }
        return list.isEmpty();
    }

    public boolean parentheses(String chccr) {
        Map<Character, Character> ch = new HashMap<>();
        ch.put('{', '}');
        ch.put('(', ')');
        ch.put('[', ']');
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < chccr.length(); i++) {
            Character ccr = chccr.charAt(i);
            if (ch.keySet().contains(ccr))
                list.add(ccr);
            else if (ch.values().contains(ccr)) {
                if (ch.get(list.get(list.size() - 1)).equals(ccr) && !list.isEmpty())
                    list.remove(list.size() - 1);
                else
                    return false;
            }
        }

        return list.isEmpty();
    }

    public static void main(String[] arg) {
        Parenthese parenthese = new Parenthese();
        System.out.println(parenthese.isValid("(){}[]"));
    }
}
