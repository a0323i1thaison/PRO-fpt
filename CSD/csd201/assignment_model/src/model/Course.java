package model;



public class Course {

    private String courseId;
    private String courseName;
    private String courseDescription;
   //private List<Workout> workouts;
   //private Coach coach;
    

//        public Course(String courseId, String courseName, String courseDescription, Coach coach) {
//        this.courseId = courseId;
//        this.courseName = courseName;
//        this.courseDescription = courseDescription;
//        this.coach = coach;
//        this.workouts = new ArrayList<>();
//    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    
    
}