package ru.gx.fin.common.dris.events;

import org.jetbrains.annotations.NotNull;
import ru.gx.core.channels.ChannelDescriptor;
import ru.gx.core.events.AbstractDataEvent;

@SuppressWarnings("unused")
public class LoadedDrisPlaceEvent extends AbstractDataEvent {
    public LoadedDrisPlaceEvent(@NotNull final Object source, @NotNull final ChannelDescriptor channelDescriptor) {
        super(source, channelDescriptor);
    }
}
