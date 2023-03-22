package entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@IdClass(BillDetailPK.class)
public class BillDetail implements Serializable {
    private int quantity;
    private double price;
    @Id
    @ManyToOne
    @JoinColumn(name = "billID")
    private Bill bill;
    @Id
    @ManyToOne
    @JoinColumn(name = "watchID")
    private Watch watch;
}
