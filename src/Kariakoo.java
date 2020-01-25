import java.util.*;
import java.io.*;
import java.math.*;
public class Kariakoo {
    public List<Integer> steps = new ArrayList<Integer>();
    public List<Integer> position = new ArrayList<Integer>();

    int getPositionAt(int n) {
        return position.get(n);
    }

    public static void main(String[] args) {
        Kariakoo kariakoo = new Kariakoo();
        kariakoo.steps.add(0);
        kariakoo.position.add(0);
        kariakoo.steps.add(1);
        kariakoo.position.add(kariakoo.position.get(0) + kariakoo.steps.get(1));
        kariakoo.steps.add(-2);
        kariakoo.position.add(kariakoo.position.get(1) + kariakoo.steps.get(2));
        for (int i = 2; i < 10000000; i++) {
            int nextValue = kariakoo.steps.get(i) - kariakoo.steps.get(i - 1);
            kariakoo.steps.add(i + 1, nextValue);
            kariakoo.position.add(kariakoo.position.get(i) + kariakoo.steps.get(i + 1));
        }
        System.out.print(kariakoo.position.get(1000));
    }
}
