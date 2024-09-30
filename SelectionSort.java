package CSC273.CSC372_CTA6;

import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSort {

    public static void selectionSort(ArrayList<Student> students, Comparator<Student> comparator) {
        int n = students.size();
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(students.get(j), students.get(min)) < 0) {
                    min = j;
                }
            }
            Student temp = students.get(i);
            students.set(i, students.get(min));
            students.set(min, temp);
        }

    }
}
