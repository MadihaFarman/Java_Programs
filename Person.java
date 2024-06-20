public class Person {
    private String name;
    private String CNICNo;
    private String contactNo;
    private String address;

    public Person(String name, String CNICNo, String contactNo, String address){
        this.name = name;
        this.CNICNo = CNICNo;
        this.contactNo = contactNo;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCNICNo() {
        return CNICNo;
    }

    public void setCNICNo(String cNICNo) {
        CNICNo = cNICNo;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        return String.format("%nName: %s%nCNICNo: %s%nContact No: %s%nAddress: %s%n",name,CNICNo,contactNo,address);
    }
}