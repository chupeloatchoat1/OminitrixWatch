package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
public class Image implements Serializable {
    @Id
    private String imageID;
    private String imageURL;
    @ManyToOne
    @JoinColumn(name = "watchID")
    private Watch watch;
}
