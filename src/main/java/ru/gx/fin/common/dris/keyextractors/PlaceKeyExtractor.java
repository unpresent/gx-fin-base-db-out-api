package ru.gx.fin.common.dris.keyextractors;

import org.jetbrains.annotations.NotNull;
import ru.gx.core.data.DataObjectKeyExtractor;
import ru.gx.fin.common.dris.out.Place;

@SuppressWarnings("unused")
public class PlaceKeyExtractor implements DataObjectKeyExtractor<Place> {
    @Override
    public Object extractKey(@NotNull Place place) {
        return place.getCode();
    }
}
