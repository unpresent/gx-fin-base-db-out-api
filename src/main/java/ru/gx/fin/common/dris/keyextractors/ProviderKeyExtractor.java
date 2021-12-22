package ru.gx.fin.common.dris.keyextractors;

import org.jetbrains.annotations.NotNull;
import ru.gx.core.data.DataObjectKeyExtractor;
import ru.gx.fin.common.dris.out.Provider;

@SuppressWarnings("unused")
public class ProviderKeyExtractor implements DataObjectKeyExtractor<Provider> {
    @Override
    public Object extractKey(@NotNull Provider provider) {
        return provider.getCode();
    }
}
