public class Student {
    String firstName;
    String lastName;
    String group;
    Double averageMark;

    public Student(String firstName, String lastName, String group, Double averageMark){
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }
    String getFirstName() {return this.firstName;}
    String getLastName() {return this.lastName;}
    String getGroup() {return this.group;}
    Double getAverageMark() {return this.averageMark;}
    int sum=0;
    public int getScholarship(){
        if (averageMark==5.0) sum = 100;
        else sum = 80;
        return sum;
    }
}

