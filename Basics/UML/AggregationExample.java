import java.util.List;
import java.util.Arrays;

// Professor class
class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Department class (Aggregation relationship)
class Department {
    private String name;
    private List<Professor> professors;

    public Department(String name, List<Professor> professors) {
        this.name = name;
        this.professors = professors;
    }

    public void showProfessors() {
        System.out.println("Department: " + name);
        for (Professor prof : professors) {
            System.out.println(prof.getName());
        }
    }
}



public class AggregationExample {
    public static void main(String[] args) {
        Professor prof1 = new Professor("Mr. Bhavesh");
        Professor prof2 = new Professor("Miss. Neha");

        List<Professor> professors = Arrays.asList(prof1, prof2);
        Department department = new Department("Computer Science", professors);

        // Aggregation relationship: department has professors, but professors exist independently
        department.showProfessors();
        // Output:
        // Department: Computer Science
        // Mr. Bhavesh
        // Miss. Neha
    }
}