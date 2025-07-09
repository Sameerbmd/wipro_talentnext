package oopsAndInheritance;
import java.util.StringJoiner;

public class Ques10String {
    public static void main(String[] args) {
        // StringJoiners with '-' as delimiter
        StringJoiner s1 = new StringJoiner("-");
        s1.add("Delhi").add("Mumbai").add("Chennai");

        StringJoiner s2 = new StringJoiner("-");
        s2.add("Hyderabad").add("Kolkata").add("Pune");

        // Display original StringJoiner values
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        // i) s1 merged to s2
        StringJoiner mergedS2 = new StringJoiner("-");
        mergedS2.merge(s2);
        mergedS2.merge(s1);
        System.out.println("\n(i) s1 merged to s2: " + mergedS2);

        // ii) s2 merged to s1
        StringJoiner mergedS1 = new StringJoiner("-");
        mergedS1.merge(s1);
        mergedS1.merge(s2);
        System.out.println("(ii) s2 merged to s1: " + mergedS1);
    }
}
