 
package school.management.system;

 

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;
   // private int feesRemained;
    
    public Student(int id,String name,int grade){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;
        
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
    public void setGrade(int grade){
        this.grade=grade;
    }
    public void payFees(int fees){
        feesPaid +=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }
    public int getRemainedFees(int fees){
         
        return feesTotal-feesPaid;
    }
    public String toString(){
        return "Student's name: "+name+ ", feesPaid is Tshs :"+feesPaid+", feesRemained "+(feesTotal-feesPaid)+", Student's ID is : "+id;
    }
}
