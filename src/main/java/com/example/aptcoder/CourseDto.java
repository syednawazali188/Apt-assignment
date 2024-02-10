package com.example.aptcoder;

public class CourseDto {
    private String name;
    private String subject;
    private int chapters;
    private CourseType type;
    private LearnMode learnMode;

    public CourseDto() {
    }

    public CourseDto(String name, String subject, int chapters, CourseType type, LearnMode learnMode) {
        this.name = name;
        this.subject = subject;
        this.chapters = chapters;
        this.type = type;
        this.learnMode = learnMode;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    public CourseType getType() {
        return type;
    }

    public void setType(CourseType type) {
        this.type = type;
    }

    public LearnMode getLearnMode() {
        return learnMode;
    }

    public void setLearnMode(LearnMode learnMode) {
        this.learnMode = learnMode;
}
}
