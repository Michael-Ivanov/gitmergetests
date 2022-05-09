import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class AnotherChild extends AbstractParent {

    private boolean isWorking;

    @NonNull
    private int threads;

    public AnotherChild(Long id, int threads) {
        super(id);
        this.threads = threads;
    }



}
