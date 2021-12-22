package ru.gx.fin.common.dris.channels;

import ru.gx.core.channels.AbstractChannelApiDescriptor;
import ru.gx.core.channels.SerializeMode;
import ru.gx.core.messaging.MessageKind;
import ru.gx.fin.common.dris.config.DrisChannelNames;
import ru.gx.fin.common.dris.config.DrisMessageTypes;
import ru.gx.fin.common.dris.messages.DrisSnapshotInstrumentTypeDataPublish;

@SuppressWarnings("unused")
public class DrisSnapshotInstrumentTypeDataPublishChannelApiV1
        extends AbstractChannelApiDescriptor<DrisSnapshotInstrumentTypeDataPublish> {

    public DrisSnapshotInstrumentTypeDataPublishChannelApiV1() {
        super(
                DrisChannelNames.Snapshots.INSTRUMENT_TYPES_V1,
                SerializeMode.JsonString,
                DrisSnapshotInstrumentTypeDataPublish.class,
                MessageKind.DataPublish,
                DrisMessageTypes.Snapshots.INSTRUMENT_TYPE,
                DrisSnapshotInstrumentTypeDataPublish.V1
        );
    }
}
