package entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "Payment")
public class Payment {
    @Id
    private String paymentID;
    private String status;

    @OneToOne
    @JoinColumn(name = "billID")
    private Bill bill;
}
