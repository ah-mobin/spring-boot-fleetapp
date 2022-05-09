package mobin.project.fleetapp.models;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String first_name;
    private String last_name;
    private String other_name;
    private String title;
    private String initials;
    private String socialSecurityNumber;
    private String gender;
    private String maritalStatus;

    @ManyToOne
    @JoinColumn(name="country_id", insertable=false, updatable=false)
    private Country country;
    private Integer country_id;

    @ManyToOne
    @JoinColumn(name="state_id", insertable=false, updatable=false)
    private State state;
    private Integer state_id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date_of_birth;
    private String city;
    private String address;
    private String phone;
    private String mobile;
    private String email;
    private String photo;
}
