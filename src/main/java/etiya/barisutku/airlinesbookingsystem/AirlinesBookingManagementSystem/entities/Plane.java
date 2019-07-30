package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Planes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Plane {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "plane_ID" )
    private Long planeId;

    @Column(name= "plane_Model" )
    private String planeModel;

    @Column(name= "plane_Name" )
    private String planeName;

    @Column(name= "plane_Capacity" )
    private Integer planeCapacity;

}

