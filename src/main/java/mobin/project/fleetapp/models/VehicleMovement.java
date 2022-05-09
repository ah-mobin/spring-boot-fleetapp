package mobin.project.fleetapp.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class VehicleMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @ManyToOne
    @JoinColumn(name="vehicle_id", insertable=false, updatable=false)
    private Vehicle vehicle;
    private int vehicle_id;

    @ManyToOne
    @JoinColumn(name="location_id_1", insertable=false, updatable=false)
    private Location location1;
    private int location_id_1;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date_1;

    @ManyToOne
    @JoinColumn(name="location_id_2", insertable=false, updatable=false)
    private Location location2;
    private int location_id_2;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date_2;

    private String remarks;
}
