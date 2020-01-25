public class PlusLongChiffre {

    public int plusLong(int[] list) {
        if (list.length == 0)
            return 0;
        int max = list[0];
        for (int i = 0; i < list.length; i++) {
            if (String.valueOf(Math.sqrt(list[i])).length() > String.valueOf(Math.sqrt(max)).length()) {
                max = list[i];
            }
        }
        return max;
    }

    public static void main(String[] arg) {
        PlusLongChiffre longLettre = new PlusLongChiffre();
        int[] list = { 1, -5, 9, 69999 };
        System.out.println(longLettre.plusLong(list));
    }
}
