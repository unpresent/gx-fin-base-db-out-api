package ru.gx.fin.common.dris.messages;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.gx.core.messaging.*;
import ru.gx.fin.common.dris.config.DrisMessageTypes;
import ru.gx.fin.common.dris.out.Provider;

import java.util.Arrays;

@SuppressWarnings("unused")
public class DrisSnapshotProviderDataPublish
        extends AbstractDataPublish<DrisSnapshotProviderDataPublish.DrisSnapshotProviderDataPublishBody> {
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
                        DrisMessageTypes.Snapshots.PLACE,
                        version,
                        DrisSnapshotProviderDataPublish.class,
                        DrisSnapshotProviderDataPublishBody.class
                )
        );
    }

    @JsonCreator
    public DrisSnapshotProviderDataPublish(
            @JsonProperty("header") @NotNull final DataPublishHeader header,
            @JsonProperty("body") @NotNull final DrisSnapshotProviderDataPublishBody body,
            @JsonProperty("correlation") final @Nullable MessageCorrelation correlation
    ) {
        super(header, body, correlation);
    }

    public static class DrisSnapshotProviderDataPublishBody extends AbstractMessageBodyDataObject<Provider> {
        @JsonCreator
        public DrisSnapshotProviderDataPublishBody(
                @JsonProperty("dataObject") @NotNull final Provider dataObject
        ) {
            super(dataObject);
        }
    }
}
