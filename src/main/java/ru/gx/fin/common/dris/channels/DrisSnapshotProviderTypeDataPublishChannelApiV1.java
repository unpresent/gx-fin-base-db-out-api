package ru.gx.fin.common.dris.channels;

import ru.gx.core.channels.AbstractChannelApiDescriptor;
import ru.gx.core.channels.SerializeMode;
import ru.gx.core.messaging.MessageKind;
import ru.gx.fin.common.dris.config.DrisChannelNames;
import ru.gx.fin.common.dris.config.DrisMessageTypes;
import ru.gx.fin.common.dris.messages.DrisSnapshotProviderTypeDataPublish;

@SuppressWarnings("unused")
public class DrisSnapshotProviderTypeDataPublishChannelApiV1
        extends AbstractChannelApiDescriptor<DrisSnapshotProviderTypeDataPublish> {

    public DrisSnapshotProviderTypeDataPublishChannelApiV1() {
        super(
                DrisChannelNames.Snapshots.PROVIDER_TYPES_V1,
                SerializeMode.JsonString,
                DrisSnapshotProviderTypeDataPublish.class,
                MessageKind.DataPublish,
                DrisMessageTypes.Snapshots.PROVIDER_TYPE,
                DrisSnapshotProviderTypeDataPublish.V1
        );
    }
}
