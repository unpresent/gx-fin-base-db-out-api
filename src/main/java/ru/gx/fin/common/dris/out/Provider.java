package ru.gx.fin.common.dris.out;

import com.fasterxml.jackson.annotation.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.gx.core.data.AbstractDataObject;
import ru.gx.fin.common.dris.memdata.ProvidersMemoryRepository;

/**
 * Провайдеры
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true, of = "code")
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonIdentityInfo(property = "code", generator = ObjectIdGenerators.PropertyGenerator.class, resolver = ProvidersMemoryRepository.IdResolver.class)
public class Provider extends AbstractDataObject {
    /**
     * Код
     */
    @NotNull
    private final String code;

    /**
     * Название.
     */
    @Nullable
    private final String name;

    /**
     * Тип провайдера
     */
    @JsonIdentityReference(alwaysAsId = true)
    @NotNull
    private final ProviderType type;

    /**
     * Площадка, о которой танслирует данный провайдер
     */
    @JsonIdentityReference(alwaysAsId = true)
    @Nullable
    private final Place place;

    @JsonCreator
    public Provider(
            @JsonProperty("code") @NotNull final String code,
            @JsonProperty("name") @Nullable final String name,
            @JsonProperty("type") @NotNull final ProviderType type,
            @JsonProperty("place") @Nullable final Place place
    ) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.place = place;
    }
}
