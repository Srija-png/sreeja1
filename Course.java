class Course {
    String courseCode, courseName, year;
    
    Course(String courseCode, String courseName, String year) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.year = year;
    }
}

class Student {
    String regNo, name, section, branch, dept;
    
    Student(String regNo, String name, String section, String branch, String dept) {
        this.regNo = regNo;
        this.name = name;
        this.section = section;
        this.branch = branch;
        this.dept = dept;
    }
}

public class CourseSelection {
    public static void main(String[] args) {
        Course[] courses = {
            new Course("CS101", "Data Structures", "2024"),
            new Course("CS102", "Algorithms", "2024"),
            new Course("CS103", "Machine Learning", "2024")
        };
        
        // Create student objects
        Student[] students = {
            new Student("REG123", "srija", "A", "BCA", "Engineering"),
            new Student("REG124", "sneha", "B", "BCA", "Engineering"),
            new Student("REG125", "madhu", "C", "BCA", "Engineering")
        };
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Course Code: " + courses[i].courseCode +
                               ", Course Name: " + courses[i].courseName +
                               ", Year: " + courses[i].year);
            System.out.println("Student RegNo: " + students[i].regNo + 
                               ", Name: " + students[i].name +
                               ", Section: " + students[i].section +
                               ", Branch: " + students[i].branch +
                               ", Dept: " + students[i].dept);
            System.out.println();
        }
    }
}
