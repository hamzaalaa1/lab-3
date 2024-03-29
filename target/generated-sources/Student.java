// default package
// Generated Jan 11, 2023, 3:26:30 PM by Hibernate Tools 6.0.0.Alpha3


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Student generated by hbm2java
 */
@Entity
@Table(name="student"
    ,catalog="inheritance1"
)
public class Student  implements java.io.Serializable {


     private Integer id;
     private String firstName;
     private String lastName;
     private String department;

    public Student() {
    }

    public Student(String firstName, String lastName, String department) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.department = department;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="first_name", nullable=false, length=50)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="last_name", nullable=false, length=50)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    @Column(name="department", nullable=false, length=45)
    public String getDepartment() {
        return this.department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }




}


