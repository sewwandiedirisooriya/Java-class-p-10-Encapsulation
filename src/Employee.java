public class Employee {
    private int emp_id;
    private String emp_name;
    private int emp_age;
    private double emp_sallery;

    public int getEmp_id() {
        return emp_id;
    }
    public String getEmp_name(){
        return emp_name;
    }
    public int getEmp_age(){
        return emp_age;
    }
    public double getEmp_sallery(){
        return emp_sallery;

    }
    public void setEmp_id(int emp_id){
        this.emp_id = emp_id;

    }
    public void setEmp_name(String emp_name){
        this.emp_name = emp_name;

    }
    public void setEmp_age(int emp_age){
        this.emp_age = emp_age;
    }
    public void setEmp_sallery(double emp_sallery){
        this.emp_sallery = emp_sallery;
    }
}
class RunEmployee {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmp_id(12345);
        e.setEmp_name("Gawesh");
        e.setEmp_age(25);
        e.setEmp_sallery(563489.765);
        System.out.println(e.getEmp_id());
        System.out.println(e.getEmp_name());
        System.out.println(e.getEmp_age());
        System.out.println(e.getEmp_sallery());
    }
}
