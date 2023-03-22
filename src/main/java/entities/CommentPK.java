package entities;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class CommentPK implements Serializable {
    private String user;
    private String watch;
}
