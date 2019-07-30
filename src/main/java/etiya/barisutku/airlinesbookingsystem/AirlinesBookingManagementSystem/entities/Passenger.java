package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Passengers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "passenger_ID" )
    private Long passengerId;

    @Column(name= "passenger_Name" )
    private String passengerName;

    @Column(name= "passenger_Surname" )
    private String passengerSurname;

    @Column(name= "passenger_Tel" )
    private String passengerTel;

    @Column(name= "passenger_Email" )
    private String passengerEmail;

}
