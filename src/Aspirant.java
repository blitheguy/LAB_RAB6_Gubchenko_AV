public class Aspirant extends Student {
    String Rab;

    public Aspirant(String firstName, String lastName, String group, Double averageMark, String Rab) {
        super(firstName, lastName, group, averageMark);
        this.Rab = Rab;
        System.out.println(getRab());
   }
   public String getRab() {return this.Rab;}
   @Override
       public int getScholarship(){
        if (averageMark==5.0) sum = 200;
        else sum = 180;
        return sum;
    }
}
