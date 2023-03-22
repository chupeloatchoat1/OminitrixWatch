package entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "Bill")
public class Bill implements Serializable {
    @Id
    private String billID;
    private Date date;
    private double total;
    @ManyToOne
    @JoinColumn(name = "userID")
    private User user;
    @PrimaryKeyJoinColumn
    @OneToOne(mappedBy = "bill")
    private Payment payment;

    @OneToMany(mappedBy = "bill")
    private List<BillDetail> billDetailList;

}
