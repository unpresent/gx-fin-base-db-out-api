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

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true, of = "code")
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
// @JsonIdentityInfo(property = "code", generator = ObjectIdGenerators.PropertyGenerator.class, resolver = PlacesMemoryRepository.IdResolver.class)
public class Place extends AbstractDataObject {
    /**
     * Код.
     */
    @NotNull
    private final String code;

    /**
     * Название.
     */
    @Nullable
    private final String name;

    @JsonCreator
    public Place(
            @JsonProperty("code") @NotNull final String code,
            @JsonProperty("name") @Nullable final String name
    ) {
        this.code = code;
        this.name = name;
    }
}
