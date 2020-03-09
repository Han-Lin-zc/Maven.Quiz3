package rocks.zipcode.io.quiz3.collections;

import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    List<Lab> labs;
    String labName;
    LabStatus labStatus;
    Lab lab;

    public Student() {
        this.labName = "";
    }

    public Student(List<Lab> labs) {
        this.labs = labs;
        this.lab = new Lab();
        this.labName = lab.getName();
    }


    public Lab getLab(String labName) {
        this.lab.setName(labName);
        return this.lab;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        this.labName = labName;
        this.labStatus = labStatus;
    }

    public void forkLab(Lab lab) {
        this.labs.add(lab);
    }

    public LabStatus getLabStatus(String labName) {
        return new Lab(labName).getStatus();
    }

    @Override
    public String toString() {
        return labName + " -> " + labStatus + "\n" +
                labName + " -> " + labStatus;
    }
}
