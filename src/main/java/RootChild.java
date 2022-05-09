import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class RootChild extends AbstractParent {

    private String rootDescription;

    private int rootNumber;

    public RootChild(Long id) {
        super(id);
    }
}
