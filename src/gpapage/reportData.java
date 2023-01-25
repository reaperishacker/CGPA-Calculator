package gpapage;

public class reportData {

    private static reportData instance;

    String[] courseNames = new String[8];
    double[] obtainedMarks = new double[8];
    int[] totalMarks = new int[8];
    int[] creditHours = new int[8];

    public String[] getCourseNames() {
        return courseNames;
    }

    public void setCourseNames(String[] courseNames) {
        this.courseNames = courseNames;
    }

    public double[] getObtainedMarks() {
        return obtainedMarks;
    }

    public void setObtainedMarks(double[] obtainedMarks) {
        this.obtainedMarks = obtainedMarks;
    }

    public int[] getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int[] totalMarks) {
        this.totalMarks = totalMarks;
    }

    public int[] getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int[] creditHours) {
        this.creditHours = creditHours;
    }

    String[] gif0_1 = {"/gif/01_1.gif", "/gif/01_2.gif", "/gif/01_3.gif", "/gif/01_4.gif"};
    String[] gif1_2 = {"/gif/12_1.gif", "/gif/12_2.gif", "/gif/12_3.gif", "/gif/12_4.gif"};
    String[] gif2_3 = {"/gif/23_1.gif", "/gif/23_2.gif", "/gif/23_3.gif", "/gif/23_4.gif"};
    String[] gif3_4 = {"/gif/34_1.gif", "/gif/34_2.gif", "/gif/34_3.gif", "/gif/34_4.gif"};

    private reportData() {
    }

    public static reportData getInstance() {
        if (instance != null) {
            return instance;
        }
        instance = new reportData();
        return instance;
    }

}
