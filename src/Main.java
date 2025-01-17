import com.codepatasala.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Rama", 25));
        students.add(new Student("Amit", 29));
        students.add(new Student("Sita", 21));
        students.add(new Student("Geeta", 21));
        students.add(new Student("Satya", 21));
        students.add(new Student("Nita", 21));
        students.add(new Student("Nita", 23));
        System.out.println(students);

        List<String> studentStream = students.stream()
                .filter(student -> student.age() <=25)
                .map(Student::name)
                .distinct()
                .sorted()
                .limit(3)
                .skip(1).toList();
                ;
        // Filter boolean
        //Map transformation
        //flatMap
        //distinct
        //sorted

        studentStream.forEach(System.out::println);

        Integer totalAge = students.stream().map(Student::age).reduce(0, Integer::sum);
        System.out.println("total age of all students: " + totalAge);

        Optional<Integer> min = students.stream().map(Student::age).min(Integer::compare);

        System.out.println("number of students with age <=25 are: " + students.stream().filter(student -> student.age()<=25 ).count());

        Map<Character, List<String>> collected = students.stream().map(student -> student.name()).collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println(collected);
    }


    /**
     * JAVA 8
     *  +-<></> | -<></> | << | 2
     *
     *  Nonterminal operation / intermediate operation -> Stream
     *
     *  Terminal operation -> result number/list/map -> not a stream
     *
     *
     *
     */
}