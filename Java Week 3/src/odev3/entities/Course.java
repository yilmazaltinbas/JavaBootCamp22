package odev3.entities;

public class Course {
    private int id;
    private String name;
    private String description;
    private String instructorId;
    private int courseUnitPrice;

    public Course() {
    }

    public Course(int id, String name, String description, String instructorId, int courseUnitPrice) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.instructorId = instructorId;
        this.courseUnitPrice = courseUnitPrice;
    }

    public int getCourseUnitPrice() {
        return courseUnitPrice;
    }

    public void setCourseUnitPrice(int courseUnitPrice) {
        this.courseUnitPrice = courseUnitPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }
}

