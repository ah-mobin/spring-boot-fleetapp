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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleHire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @ManyToOne
    @JoinColumn(name="vehicle_id", insertable=false, updatable=false)
    private Vehicle vehicle;
    private Integer vehicle_id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date_out;

    private String time_out;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date_in;

    private String time_in;

    @ManyToOne
    @JoinColumn(name="client_id", insertable=false, updatable=false)
    private Client client;
    private Integer client_id;

    @ManyToOne
    @JoinColumn(name="location_id", insertable=false, updatable=false)
    private Location location;
    private Integer location_id;

    private String price;

    private String remarks;
}
