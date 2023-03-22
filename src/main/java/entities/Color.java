package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
@Table(name = "Color")
public class Color implements Serializable {
    @Id
    private String colorID;
    private String colorName;
    @OneToMany(mappedBy = "color")
    private List<Watch> watchList;
}
