package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Airports")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Airport {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "airport_ID" )
    private Long airportId;

    @Column(name= "airport_Name" )
    private String airportName;

    @Column(name= "airport_City" )
    private String airportCity;


}
