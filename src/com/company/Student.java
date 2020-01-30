package com.company;

public class Student {
    private int id;
    private String fullname;
    private String group;
    private String faculty;
    private String university;

    public Student() {
    }

    public Student(String fullname, String group, String faculty, String university) {
        this.fullname = fullname;
        this.group = group;
        this.faculty = faculty;
        this.university = university;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullname='" + fullname + '\'' +
                ", group='" + group + '\'' +
                ", faculty='" + faculty + '\'' +
                ", university='" + university + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }
}
