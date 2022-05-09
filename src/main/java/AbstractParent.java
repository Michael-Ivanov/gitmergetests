import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
public abstract class AbstractParent {

    @NonNull
    @EqualsAndHashCode.Exclude
    private Long id;

    private String name;

    private Integer order;

    private Boolean selected;

    private String[] messages;

}