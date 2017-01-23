package com.example.zar.reportcard;

/**
 * Created by Zar on 12/23/2016.
 */

public class ReportCard {
    private String studentName;
    private int studentRoll;
    private int englishTotalMarks;
    private int mathTotalMarks;
    private int physicsTotalMarks;
    private int chemistryTotalMarks;
    private int socialTotalMarks;
    private int sum;
    private  double percentage;
    private final static String SCHOOL_NAME="Udacity";
    private final static double TOTAL=5.0d;


    public ReportCard(int socialTotalMarks,int chemistryTotalMarks, int mathTotalMarks, int englishTotalMarks,int physicsTotalMarks, String studentName, int studentRoll)
    {
        this.socialTotalMarks=socialTotalMarks;
        this.chemistryTotalMarks=chemistryTotalMarks;
        this.physicsTotalMarks=physicsTotalMarks;
        this.mathTotalMarks=mathTotalMarks;
        this.englishTotalMarks=englishTotalMarks;
        this.studentName=studentName;
        this.studentRoll=studentRoll;
    }

    public double getPercentage() {
        return percentage;
    }

    public int getChemistryTotalMarks() {
        return chemistryTotalMarks;
    }

    public int getEnglishTotalMarks() {
        return englishTotalMarks;
    }

    public int getMathTotalMarks() {
        return mathTotalMarks;
    }

    public int getPhysicsTotalMarks() {
        return physicsTotalMarks;
    }

    public int getSocialTotalMarks() {
        return socialTotalMarks;
    }

    public int getStudentRoll() {
        return studentRoll;
    }

    public int getSum() {
        return sum;
    }

    public String getStudentName() {
        return studentName;
    }

    public static String getSchoolName() {
        return SCHOOL_NAME;
    }

    public void setChemistryTotalMarks(int chemistryTotalMarks) {
        this.chemistryTotalMarks = chemistryTotalMarks;
    }

    public void setEnglishTotalMarks(int englishTotalMarks) {
        this.englishTotalMarks = englishTotalMarks;
    }

    public void setMathTotalMarks(int mathTotalMarks) {
        this.mathTotalMarks = mathTotalMarks;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public void setPhysicsTotalMarks(int physicsTotalMarks) {
        this.physicsTotalMarks = physicsTotalMarks;
    }

    public void setSocialTotalMarks(int socialTotalMarks) {
        this.socialTotalMarks = socialTotalMarks;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentRoll(int studentRoll) {
        this.studentRoll = studentRoll;
    }

    private String getGrade(int eng,int math, int phy,int chem,int social)
    {

        String grade;
        sum=eng+math+phy+chem+social;
        percentage=sum/TOTAL;

        if(percentage>=90.0)
        {
            grade="A";
        }
        else  if(percentage<90.0&&percentage>=80.0)
        {
            grade="B";
        }
        else if(percentage<80.0 && percentage>=70.0)
        {
            grade="C";
        }
        else if(percentage<70.0 && percentage>=60.0)
        {
            grade="D";
        }
        else if (percentage<60.0)
        {
            grade="Fail";
        }
        else {
            grade="error";
        }
return grade;
    }

    public String displayResult()
    {
        return  "University-------------- "+getSchoolName()+'\n'+
                "Student Name------ "+studentName+'\n'+
                "Roll Number---------- "+studentRoll+'\n'+
                "English Marks------- "+englishTotalMarks+'\n'+
                "Math Marks----------- "+mathTotalMarks+'\n'+
                "Physics Marks-------- "+physicsTotalMarks+'\n'+
                "Chemistry Marks--- "+chemistryTotalMarks+'\n'+
                "Social Marks--------- "+socialTotalMarks+'\n'+
                "Grade-------------------- "+getGrade(englishTotalMarks,mathTotalMarks,physicsTotalMarks,chemistryTotalMarks,socialTotalMarks);

    }
    @Override
    public String toString()
    {
        return "ReportCard{"+

            "studentName='"+studentName+'\''+
            ",rollNumber=" +studentRoll+
                ",englishMarks="+englishTotalMarks+
                ",mathMarks="+mathTotalMarks+
                ",physicsMarks="+physicsTotalMarks+
                ", chemistryMarks="+chemistryTotalMarks+
                ", socialMarks="+socialTotalMarks+
                ", grade='"+getGrade(englishTotalMarks,mathTotalMarks,physicsTotalMarks,chemistryTotalMarks,socialTotalMarks)+'\''+'}';
    }


}
