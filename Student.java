public class Student extends Person {
    private String regNo;
    private double fee;

    public Student(String name, String CNICNo, String contactNo, String address,String regNo, double fee){
        super(name,CNICNo,contactNo,address);
        this.regNo = regNo;
        this.fee = fee;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    
    public String toString(){
        return String.format("Personal Details: %s%nAcademic Details:%nRegistration No: %s%nFee: %.2f%n", super.toString(),regNo,fee);
    }
}
