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
 * Тип провайдера
 */
@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true, of = "code")
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
// @JsonIdentityInfo(property = "code", generator = ObjectIdGenerators.PropertyGenerator.class, resolver = ProviderTypesMemoryRepository.IdResolver.class)
public class ProviderType extends AbstractDataObject {
    /**
     * Родительсткий тип самого верхнего уровня
     */
    // @JsonIdentityReference(alwaysAsId = true)
    @Nullable
    private final String rootType;

    /**
     * Родительсткий тип провайдера
     */
    // @JsonIdentityReference(alwaysAsId = true)
    @Nullable
    private final String parent;

    /**
     * Код типа провайдера
     */
    @NotNull
    private final String code;

    /**
     * Название типа провайдера
     */
    @Nullable
    private final String name;

    @JsonCreator
    public ProviderType(
            @JsonProperty("rootType") @Nullable final String rootType,
            @JsonProperty("parent") @Nullable final String parent,
            @JsonProperty("code") @NotNull final String code,
            @JsonProperty("name") @Nullable final String name
    ) {
        this.rootType = rootType;
        this.parent = parent;
        this.code = code;
        this.name = name;
    }
}
