package system.model;

/**
 * Created by Max on 16.07.2017.
 */
public class User {

    private static int count = 0;
    private final int id = count++;
    private String name;
    private int age;
    private String address;
    private String email;
    private Department department;
    private float salary;
    private Vacation vacation = new Vacation();

    private String userName;
    private String password;
    private int accessLevel;

    @Override
    public String toString() {
        return String.format("%s: <br>" +
                        "-----------------------------\n"+
                        "   age:%d<br>" +
                        "   addr:%s<br> " +
                        "   email:%s<br> " +
                        "   dep:%s<br> " +
                        "   salary:%.2f$<br> " +
                        "   vacation: %s<br>"+
                        "------------------------------",
                name, age, address, email, department, salary, vacation);
    }

    public User() {

    }

    public User(Department department, String name, int age, String userName, String password, int accessLevel,
                float salary, String address, String email) {
        this.department = department;
        this.name = name;
        this.age = age;
        this.userName = userName;
        this.password = password;
        this.accessLevel = accessLevel;
        this.salary = salary;
        this.address = address;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(int accessLevel) {
        this.accessLevel = accessLevel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getUserName() {
        return userName;
    }

    public Vacation getVacation() {
        return vacation;
    }

    public void setVacation(Vacation vacation) {
        this.vacation = vacation;
    }
}
