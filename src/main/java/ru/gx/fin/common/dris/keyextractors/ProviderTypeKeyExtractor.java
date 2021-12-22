package ru.gx.fin.common.dris.keyextractors;

import org.jetbrains.annotations.NotNull;
import ru.gx.core.data.DataObjectKeyExtractor;
import ru.gx.fin.common.dris.out.ProviderType;

@SuppressWarnings("unused")
public class ProviderTypeKeyExtractor implements DataObjectKeyExtractor<ProviderType> {
    @Override
    public Object extractKey(@NotNull ProviderType providerType) {
        return providerType.getCode();
    }
}
