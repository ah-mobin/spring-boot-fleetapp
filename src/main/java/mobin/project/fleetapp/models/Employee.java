package mobin.project.fleetapp.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class Employee extends Person{
    @ManyToOne
    @JoinColumn(name="employee_type_id", insertable=false, updatable=false)
    private EmployeeType employeeType;
    private Integer employee_type_id;
    private String photo;
    private String username;

    @ManyToOne
    @JoinColumn(name="job_title_id", insertable=false, updatable=false)
    private JobTitle jobTitle;
    private Integer job_title_id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hire_date;
}
