package id.foundry.startupvault.backend.model;
 
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="dummy")
public class Dummy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idDummy;
}
