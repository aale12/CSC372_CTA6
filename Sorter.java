package CSC273.CSC372_CTA6;

import java.util.ArrayList;

public class Sorter {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("11th Street", "Anthony", 3));
        students.add(new Student("B Street", "Frank", 2));
        students.add(new Student("Orchard Street", "Kimberly", 1));
        students.add(new Student("Fukui Street", "Mikayla", 4));
        students.add(new Student("Smith Street", "Andrew", 5));
        students.add(new Student("Lincoln Ave", "Alex", 6));
        students.add(new Student("East Street", "Sarthe", 7));
        students.add(new Student("Oaks Drive", "Frank", 8));
        students.add(new Student("River Oaks Boulevard", "Hannah", 9));
        students.add(new Student("13th Street", "Richard", 10));
        System.out.println("Before Sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        //rollno sort comparator
        SelectionSort.selectionSort(students, new RollnoComparator());
        System.out.println("\nAfter roll number sorting:");
        for (Student s : students) {
            System.out.println(s);
        }

        //name sort comparator
        SelectionSort.selectionSort(students, new NameComparator());
        System.out.println("\nAfter name sorting:");

    }
}
