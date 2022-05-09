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
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    private String name;
    @ManyToOne
    @JoinColumn(name="vehicle_type_id", insertable=false, updatable=false)
    private VehicleType vehicleType;
    private Integer vehicle_type_id;

    private String vehicle_number;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date registration_date;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date acquisition_date;
    private String description;

    @ManyToOne
    @JoinColumn(name="vehiclemakeid", insertable=false, updatable=false)
    private VehicleMake vehicleMake;
    private Integer vehicle_make_id;

    private String power;
    private String fuelCapacity;
    @ManyToOne
    @JoinColumn(name="vehicle_status_id", insertable=false, updatable=false)
    private VehicleStatus vehicleStatus;
    private Integer vehicle_status_id;

    private String net_weight;

    @ManyToOne
    @JoinColumn(name="employee_id", insertable=false, updatable=false)
    private Employee inCharge;
    private Integer employee_id;

    @ManyToOne
    @JoinColumn(name="vehicle_model_id", insertable=false, updatable=false)
    private VehicleModel vehicleModel;
    private Integer vehicle_model_id;

    @ManyToOne
    @JoinColumn(name="location_id", insertable=false, updatable=false)
    private Location currentLocation;
    private Integer location_id;

    private String remarks;
}
