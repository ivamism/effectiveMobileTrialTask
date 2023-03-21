package byIvam.UserService.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;
import org.springframework.format.annotation.NumberFormat;


@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name= "users")
@Accessors(chain = true)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private String name;
    @jakarta.validation.constraints.NotNull
    private String email;
    @jakarta.validation.constraints.NotNull
    private String password;
    @jakarta.validation.constraints.PositiveOrZero
    @Column(nullable = false)
    @NumberFormat(pattern = "#,###,###,###.##", style = NumberFormat.Style.CURRENCY)
    private double balance;
}
