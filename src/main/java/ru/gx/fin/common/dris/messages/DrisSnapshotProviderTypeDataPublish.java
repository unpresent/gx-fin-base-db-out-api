package ru.gx.fin.common.dris.messages;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.gx.core.messaging.*;
import ru.gx.fin.common.dris.config.DrisMessageTypes;
import ru.gx.fin.common.dris.out.ProviderType;

import java.util.Arrays;

@SuppressWarnings("unused")
public class DrisSnapshotProviderTypeDataPublish
        extends AbstractMessage<DrisSnapshotProviderTypeDataPublish.DrisSnapshotProviderTypeDataPublishBody> {
    public static final int V1 = 1;
    public static final int[] SUPPORTED_VERSIONS = {V1};

    private static boolean initialized = false;

    public static void staticInit() {
        if (initialized) {
            return;
        }
        initialized = true;
        Arrays.stream(SUPPORTED_VERSIONS).forEach(version ->
                MessageTypesRegistrator.registerType(
                        MessageKind.DataPublish,
                        DrisMessageTypes.Snapshots.PROVIDER_TYPE,
                        version,
                        DrisSnapshotProviderTypeDataPublish.class,
                        DrisSnapshotProviderTypeDataPublishBody.class
                )
        );
    }

    @JsonCreator
    public DrisSnapshotProviderTypeDataPublish(
            @JsonProperty("header") @NotNull final StandardMessageHeader header,
            @JsonProperty("body") @NotNull final DrisSnapshotProviderTypeDataPublishBody body,
            @JsonProperty("correlation") final @Nullable MessageCorrelation correlation
    ) {
        super(header, body, correlation);
    }

    public static class DrisSnapshotProviderTypeDataPublishBody extends AbstractMessageBodyDataObject<ProviderType> {
        @JsonCreator
        public DrisSnapshotProviderTypeDataPublishBody(
                @JsonProperty("dataObject") @NotNull final ProviderType dataObject
        ) {
            super(dataObject);
        }
    }
}
