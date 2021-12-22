package ru.gx.fin.common.dris.config;

@SuppressWarnings("unused")
public abstract class DrisMessageTypes {

    public abstract static class Snapshots {
        public static final String PLACE = "DRIS:SNAPSHOT-PUBLISH:PLACE";
        public static final String PROVIDER_TYPE = "DRIS:SNAPSHOT-PUBLISH:PROVIDER-TYPE";
        public static final String PROVIDER = "DRIS:SNAPSHOT-PUBLISH:PROVIDER";
        public static final String INSTRUMENT_TYPE = "DRIS:SNAPSHOT-PUBLISH:INSTRUMENT-TYPE";
    }
}
