package ru.gx.fin.common.dris.messages;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.gx.fin.common.dris.config.DrisMessageTypes;
import ru.gx.fin.common.dris.out.Place;
import ru.gx.core.messaging.*;

import java.util.Arrays;

@SuppressWarnings("unused")
public class DrisSnapshotPlaceDataPublish
        extends AbstractMessage<DrisSnapshotPlaceDataPublish.DrisSnapshotPlaceDataPublishBody> {
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
                        DrisSnapshotPlaceDataPublish.class,
                        DrisSnapshotPlaceDataPublishBody.class
                )
        );
    }

    @JsonCreator
    public DrisSnapshotPlaceDataPublish(
            @JsonProperty("header") @NotNull final StandardMessageHeader header,
            @JsonProperty("body") @NotNull final DrisSnapshotPlaceDataPublishBody body,
            @JsonProperty("correlation") final @Nullable MessageCorrelation correlation
    ) {
        super(header, body, correlation);
    }

    public static class DrisSnapshotPlaceDataPublishBody extends AbstractMessageBodyDataObject<Place> {
        @JsonCreator
        public DrisSnapshotPlaceDataPublishBody(
                @JsonProperty("dataObject") @NotNull final Place dataObject
        ) {
            super(dataObject);
        }
    }
}
