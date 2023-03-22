package entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "Watch")
public class Watch {
    @Id
    private String watchID;
    private String watchName;
    private double price;
    private boolean waterResistance;
    private String description;
    private double thickness;
    private boolean watchGender;
    private int voteLike;
    private int limitQuantity;
    @ManyToOne
    @JoinColumn(name = "colorID")
    private Color color;
    @ManyToOne
    @JoinColumn(name = "watchTypeID")
    private WatchType watchType;
    @ManyToOne
    @JoinColumn(name = "brandID")
    private Brand brand;

    @OneToMany(mappedBy = "watch")
    private List<Comment> commentList;

    @OneToMany(mappedBy = "watch")
    private List<Image> imageList;

    @OneToMany(mappedBy = "watch")
    private List<BillDetail> billDetailList;
}
