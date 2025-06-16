public class Student extends Preson{
    private String id;
    private String course;
    private String teacherName;

    public Student(String firstName, String lastName, String id, String course, String teacherName) {
        super(firstName, lastName);
        this.id = id;
        this.course = course;
        this.teacherName = teacherName;
    }

    public String getId() {
        return id;
    }

    public String getCourse() {
        return course;
    }

    public String getTeacherName() {
        return teacherName;
    }
    public void displayDetails(){
        super.displayDetails();
        System.out.println("ID "+ id );
        System.out.println("Course "+ course);
        System.out.println("Teacher Name "+ teacherName);
    }
}
