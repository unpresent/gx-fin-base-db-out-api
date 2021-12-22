package ru.gx.fin.common.dris.channels;

import ru.gx.core.channels.AbstractChannelApiDescriptor;
import ru.gx.core.channels.SerializeMode;
import ru.gx.core.messaging.MessageKind;
import ru.gx.fin.common.dris.config.DrisChannelNames;
import ru.gx.fin.common.dris.config.DrisMessageTypes;
import ru.gx.fin.common.dris.messages.DrisSnapshotProviderDataPublish;

@SuppressWarnings("unused")
public class DrisSnapshotProviderDataPublishChannelApiV1
        extends AbstractChannelApiDescriptor<DrisSnapshotProviderDataPublish> {

    public DrisSnapshotProviderDataPublishChannelApiV1() {
        super(
                DrisChannelNames.Snapshots.PROVIDERS_V1,
                SerializeMode.JsonString,
                DrisSnapshotProviderDataPublish.class,
                MessageKind.DataPublish,
                DrisMessageTypes.Snapshots.PROVIDER,
                DrisSnapshotProviderDataPublish.V1
        );
    }
}
