package iti.jets.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.IDENTITY;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

 
@Entity
@Table(name="student"
    ,catalog="inheritance1"
)
public class Student extends Person implements java.io.Serializable {


     private Integer id;
   
     private String department;

    public Student() {
    }

    public Student( String department ,String f_name ,String l_name) {
        super(f_name,l_name);
      
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
    
    @Column(name="department", nullable=false, length=45)
    public String getDepartment() {
        return this.department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }




}


