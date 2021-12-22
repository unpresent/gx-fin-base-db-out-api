package ru.gx.fin.common.dris.keyextractors;

import org.jetbrains.annotations.NotNull;
import ru.gx.core.data.DataObjectKeyExtractor;
import ru.gx.fin.common.dris.out.InstrumentType;

@SuppressWarnings("unused")
public class InstrumentTypeKeyExtractor implements DataObjectKeyExtractor<InstrumentType> {
    @Override
    public Object extractKey(@NotNull InstrumentType instrumentType) {
        return instrumentType.getCode();
    }
}
