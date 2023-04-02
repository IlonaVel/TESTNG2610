package pageObjects;

public enum CourseNames {
    FRONTENDBASIC("Front-end Basic"), JAVAPRO ("Java Pro");
    final String courseName;

    CourseNames(String s) {
        courseName=s;
    }

    public String getCourseName() {
        return courseName;
    }
}
