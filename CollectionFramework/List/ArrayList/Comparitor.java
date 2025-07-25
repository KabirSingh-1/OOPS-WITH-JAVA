package CollectionFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
class StringLenthComparitor implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }

}

class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2){
        return o1-o2;
    }

  

}
 class Student{
    private String name;
    private double gpa;
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}
public class Comparitor {
    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // // list.sort(new MyComparator()); //manual by comparator 
        // list.sort((a,b)->a-b); // lemda expression 
        // System.out.println(list);

        // List<String> word = Arrays.asList("apple","banana","date");
        // // word.sort(new StringLenthComparitor()); //manual by comparator
        // word.sort((a,b)->a.length()-b.length()); // lemda expression

        // System.out.println(word);
      

        List<Student> students = new ArrayList<>();
        students.add(new Student("Kabir", 8.4));
        students.add(new Student("Nandini", 8.4));
        students.add(new Student("Gaurav", 7.1));
        students.add(new Student("Hitesh", 7.1));
        students.add(new Student("Mohit", 8.6));
        // method refrensing
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        students.sort(comparator);
        // students.sort((a,b)-> {
        //     if(a.getGpa()-b.getGpa()>0){
        //         return 1;
        //     }
        //     else if(a.getGpa()-b.getGpa()<0){
        //         return -1;
        //     }
             // return a.getName().compareTo(b.getName()); 
            // else return 0;
        // });

        // Collections.sort(students,comparator);
        for(Student s : students){
            System.out.println(s.getName()+" : "+s.getGpa());
        }

    }
}
