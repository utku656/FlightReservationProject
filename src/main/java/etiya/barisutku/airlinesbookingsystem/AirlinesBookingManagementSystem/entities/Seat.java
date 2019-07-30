package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "Seats")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "seat_ID" )
    private Long seatId;

    @Column(name= "seat_Number" )
    private Integer seatNumber;

    @Column(name= "seat_Character" )
    private Character seatCharacter;

    @Column(name= "seat_LineCapacity" )
    private Integer seatLineCapacity;


}
