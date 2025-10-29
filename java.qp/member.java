public class member {
    String employeeName;
    double salary;
    String designation;
    String organization;

    void empIn() {
        employeeName = "Dinesh";
        salary = 10000;
        designation = "Management";
        organization = "Tata";
    }
    void display(){
        System.out.println("employeename:"+employeeName);
        System.out.println("salary:"+salary);
        System.out.println("designation:"+designation);
        System.out.println("organization:"+organization);
    }
      public static void main(String args[])
      {
        member m=new member();
        m.empIn();
        m.display();
      }

}


