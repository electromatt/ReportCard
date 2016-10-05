/**
 * Created by Matthew on 10/5/2016.
 */
public class ReportCard {

    private int mMath;
    private int mScience;
    private int mEnglish;
    private int mHistory;

    public ReportCard(int math, int science, int english, int history){
        mMath = math;
        mScience = science;
        mEnglish = english;
        mHistory = history;
    }

    public String calculateGrade(int grade){
        if(grade >= 90 && grade <= 100){
            return "A";
        }
        if(grade >= 80 && grade <= 89){
            return "B";
        }
        if(grade >= 70 && grade <= 80){
            return "C";
        }
        if(grade >= 60 && grade <= 69){
            return "D";
        }
        if(grade <= 59){
            return "F";
        }
        else{
            return "No grade";
        }
    }

    public String getMath(){
        return calculateGrade(mMath);
    }
    public String getScience(){
        return calculateGrade(mScience);
    }
    public String getEnglish(){
        return calculateGrade(mEnglish);
    }
    public String getHistory(){
        return calculateGrade(mHistory);
    }

    @Override
    public String toString(){
        return "Grades {" +
                "Math: '" + mMath + '\'' +
                ", Science: '" + mScience + '\'' +
                ", English: '" + mEnglish + '\'' +
                ", History: '" + mHistory + '\'' +
                '}';
    }

}

