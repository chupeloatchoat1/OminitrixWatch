package entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "Users")
public class User implements Serializable {
    @Id
    private String userID;
    private String avatar;
    private String email;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Account account;

    @OneToMany(mappedBy = "user")
    private List<Comment> commentList;


}
