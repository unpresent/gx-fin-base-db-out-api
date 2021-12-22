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
 * Тип ФИ
 */
@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true, of = "code")
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
// @JsonIdentityInfo(property = "code", generator = ObjectIdGenerators.PropertyGenerator.class, resolver = InstrumentTypesMemoryRepository.IdResolver.class)
public class InstrumentType extends AbstractDataObject {
    /**
     * Родительсткий тип самого верхнего уровня
     */
    // @JsonIdentityReference(alwaysAsId = true)
    @Nullable
    private final String rootType;

    /**
     * Родительсткий тип ФИ
     */
    // @JsonIdentityReference(alwaysAsId = true)
    @Nullable
    private final String parent;

    /**
     * Код ФИ
     */
    @NotNull
    private final String code;

    /**
     * Краткое название типа ФИ
     */
    @Nullable
    private final String nameShort;

    /**
     * Полное название типа ФИ
     */
    @Nullable
    private final String nameFull;

    @JsonCreator
    public InstrumentType(
            @JsonProperty("rootType") @Nullable final String rootType,
            @JsonProperty("parent") @Nullable final String parent,
            @JsonProperty("code") @NotNull final String code,
            @JsonProperty("nameShort") @Nullable final String nameShort,
            @JsonProperty("nameFull") @Nullable final String nameFull
    ) {
        this.rootType = rootType;
        this.parent = parent;
        this.code = code;
        this.nameShort = nameShort;
        this.nameFull = nameFull;
    }
}
