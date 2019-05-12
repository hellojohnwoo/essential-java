package chap07;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<Integer> vect = new Vector<Integer>();

        vect.add(11);
        vect.add(22);
        vect.add(-3);

        vect.add(2, 11);

        System.out.println(vect.size());
        System.out.println(vect.capacity());
        System.out.println();


        for (int i=0; i<vect.size(); i++) {
            int n = vect.get(i);
            System.out.println(n);
        }
        System.out.println();

        int sum = 0;
        for (int i=0; i<vect.size(); i++) {
            int n = vect.elementAt(i);
            sum += n;
        }

        System.out.println(sum);
    }
}
