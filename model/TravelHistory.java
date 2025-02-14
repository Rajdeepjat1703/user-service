package com.webknot.user_service.model;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonBackReference;
import java.time.LocalDateTime;

@Entity
@Table(name = "travel_history")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TravelHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long sourceStation;
    private Long destinationStation;
    private double fare;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private LocalDateTime travelDate;

    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonBackReference
    private User user;
}
