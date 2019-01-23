package com.tt.teach22.pojo;

import java.io.Serializable;
/**
 *@作者：zhujungui
 *@时间：2019/01/22 17:50
 *@描述：实体类Subject——》对应数据库科目表
 */
public class Subject implements Serializable {
    private Integer subjectNo;
    private Integer classHour;
    private Integer gradeID;
    private String subjectName;
    private String gradeName;


    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

    public Integer getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(Integer subjectNo) {
        this.subjectNo = subjectNo;
    }

    public Integer getClassHour() {
        return classHour;
    }

    public void setClassHour(Integer classHour) {
        this.classHour = classHour;
    }

    public Integer getGradeID() {
        return gradeID;
    }

    public void setGradeID(Integer gradeID) {
        this.gradeID = gradeID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Subject() {
    }

    public Subject(Integer subjectNo, Integer classHour, Integer gradeID, String subjectName, String gradeName) {
        this.subjectNo = subjectNo;
        this.classHour = classHour;
        this.gradeID = gradeID;
        this.subjectName = subjectName;
        this.gradeName = gradeName;
    }

}
