public class CourseDemo {
    // Course class
    static class Course {
        private String courseCode;
        private String title;
        private String instructor;
        private int duration; // in weeks
        private Student[] students; // Array to hold enrolled students
        private int studentCount;

        // Constructor
        public Course(String courseCode, String title, String instructor, int duration) {
            this.courseCode = courseCode;
            this.title = title;
            this.instructor = instructor;
            this.duration = duration;
            this.students = new Student[10]; // Initial capacity of 10 students
            this.studentCount = 0;
        }

        // Getters and setters
        public String getCourseCode() { return courseCode; }
        public void setCourseCode(String courseCode) { this.courseCode = courseCode; }
        public String getTitle() { return title; }
        public void setTitle(String title) { this.title = title; }
        public String getInstructor() { return instructor; }
        public void setInstructor(String instructor) { this.instructor = instructor; }
        public int getDuration() { return duration; }
        public void setDuration(int duration) { this.duration = duration; }

        // Nested Student class
        static class Student {
            private String studentID;
            private String name;
            private double progress; // in percentage (0 to 100)

            // Constructor
            public Student(String studentID, String name) {
                this.studentID = studentID;
                this.name = name;
                this.progress = 0.0; // Default progress is 0%
            }

            // Getters and setters
            public String getStudentID() { return studentID; }
            public void setStudentID(String studentID) { this.studentID = studentID; }
            public String getName() { return name; }
            public void setName(String name) { this.name = name; }
            public double getProgress() { return progress; }
            public void setProgress(double progress) {
                if (progress >= 0 && progress <= 100) {
                    this.progress = progress;
                }
            }
        }

        // Method to enroll a student
        public void enrollStudent(Student student) {
            if (studentCount < students.length) {
                students[studentCount] = student;
                studentCount++;
                System.out.println(student.getName() + " (ID: " + student.getStudentID() + ") enrolled in " + title);
            } else {
                System.out.println("Error: Course is full. Cannot enroll " + student.getName());
            }
        }

        // Method to track student progress
        public void trackProgress(Student student, double progress) {
            for (int i = 0; i < studentCount; i++) {
                if (students[i].getStudentID().equals(student.getStudentID())) {
                    students[i].setProgress(progress);
                    System.out.println(student.getName() + "'s progress updated to " + progress + "% in " + title);
                    return;
                }
            }
            System.out.println("Error: Student " + student.getName() + " not found in " + title);
        }

        // Method to display course information
        public void displayInfo() {
            System.out.println("Course: " + title + " (Code: " + courseCode + ")");
            System.out.println("Instructor: " + instructor + ", Duration: " + duration + " weeks");
            System.out.println("Enrolled Students:");
            for (int i = 0; i < studentCount; i++) {
                System.out.println("  - " + students[i].getName() + " (ID: " + students[i].getStudentID() + "), Progress: " + students[i].getProgress() + "%");
            }
        }
    }

    // Main method to test the classes
    public static void main(String[] args) {
        // Create a new course
        Course course = new Course("CS101", "Introduction to Programming", "Dr. Smith", 12);

        // Create student objects
        Course.Student student1 = new  Course.Student("S001", "Alice");
        Course.Student student2 = new Course.Student("S002", "Bob");

        // Enroll students
        course.enrollStudent(student1);
        course.enrollStudent(student2);

        // Track progress
        course.trackProgress(student1, 75.5);
        course.trackProgress(student2, 50.0);

        // Display course information
        System.out.println("\nCourse Details at 03:45 PM PKT, Tuesday, May 20, 2025:");
        course.displayInfo();
    }
}