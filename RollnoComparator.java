package CSC273.CSC372_CTA6;

import java.util.Comparator;

public class RollnoComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return student1.getRollno() - student2.getRollno();
    }
}
