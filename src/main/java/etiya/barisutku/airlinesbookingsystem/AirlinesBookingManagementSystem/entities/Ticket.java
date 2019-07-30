package etiya.barisutku.airlinesbookingsystem.AirlinesBookingManagementSystem.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Tickets")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "ticket_ID" )
    private Long ticketId;

    @Column(name= "ticket_Price" )
    private Integer ticketPrice;

    @JoinColumn(name= "passenger_ID" )
    @ManyToOne(fetch = FetchType.LAZY)
    private Passenger passengerId;

    @JoinColumn(name= "flight_ID" )
    @ManyToOne(fetch = FetchType.LAZY)
    private Flight flightId;

    @Column(name= "ticket_Type" )
    private String ticketType;

    @Column(name= "ticket_PNR" )
    private String ticketPNR;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "seat_ID" )
    private Seat seatId;

}
