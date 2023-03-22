package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "WatchType")
public class WatchType {
    @Id
    private String typeID;
    private String typeName;
    @OneToMany(mappedBy = "watchType")
    private List<Watch> watchList;
}
