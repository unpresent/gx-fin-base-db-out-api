package ru.gx.fin.common.dris.channels;

import ru.gx.core.channels.AbstractChannelApiDescriptor;
import ru.gx.core.channels.SerializeMode;
import ru.gx.core.messaging.MessageKind;
import ru.gx.fin.common.dris.config.DrisChannelNames;
import ru.gx.fin.common.dris.config.DrisMessageTypes;
import ru.gx.fin.common.dris.messages.DrisSnapshotPlaceDataPublish;

@SuppressWarnings("unused")
public class DrisSnapshotPlaceDataPublishChannelApiV1
        extends AbstractChannelApiDescriptor<DrisSnapshotPlaceDataPublish> {

    public DrisSnapshotPlaceDataPublishChannelApiV1() {
        super(
                DrisChannelNames.Snapshots.PLACES_V1,
                SerializeMode.JsonString,
                DrisSnapshotPlaceDataPublish.class,
                MessageKind.DataPublish,
                DrisMessageTypes.Snapshots.PLACE,
                DrisSnapshotPlaceDataPublish.V1
        );
    }
}
