package HW15;

public enum CourseNames15 {
    FRONTENDBASIC("Front-end Basic"), JAVAPRO ("Java Pro"), QA ("qa"), PYTHON ("python"), C ("c#");
    final String courseName15;

    CourseNames15(String s) {
        courseName15=s;
    }

    public String getCourseName() {
        return courseName15;
    }
}
