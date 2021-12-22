package ru.gx.fin.common.dris.out;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.gx.core.data.AbstractDataObject;

/**
 * Провайдеры
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true, of = "code")
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
// @JsonIdentityInfo(property = "code", generator = ObjectIdGenerators.PropertyGenerator.class, resolver = ProvidersMemoryRepository.IdResolver.class)
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
    @NotNull
    private final String type;

    /**
     * Площадка, о которой танслирует данный провайдер
     */
    @Nullable
    private final String place;

    @JsonCreator
    public Provider(
            @JsonProperty("code") @NotNull final String code,
            @JsonProperty("name") @Nullable final String name,
            @JsonProperty("type") @NotNull final String type,
            @JsonProperty("place") @Nullable final String place
    ) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.place = place;
    }
}
