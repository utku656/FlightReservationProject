package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Flights")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Flight {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "flight_ID" )
    private Long flightId;

    @JsonFormat(pattern="yyyy-MM-dd")
    @Column(name= "flight_Date" )
    private LocalDate flightDate;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name= "flight_DepartureTime" )
    private LocalDateTime flightDepartureTime;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Column(name= "flight_ArrivalTime" )
    private LocalDateTime flightArrivalTime;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "plane_ID" )
    private Plane planeId;

    @Column(name= "flight_Length" )
    private String flightLength;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="flightDepartureID", referencedColumnName="airport_ID" )
    private Airport flightDepartureID;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name="flightArrivalID", referencedColumnName="airport_ID" )
    private Airport flightArrivalID;


}
