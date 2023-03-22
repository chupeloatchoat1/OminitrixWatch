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
@Table(name = "Account")
public class Account implements Serializable {
    @Id
    private String userName;
    private String password;
    private String role;
    @OneToOne
    @MapsId
    @JoinColumn(name = "userID", unique = true)
    private User user;
}
