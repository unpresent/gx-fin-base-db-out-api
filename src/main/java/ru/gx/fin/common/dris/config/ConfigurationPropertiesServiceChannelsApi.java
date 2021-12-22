package ru.gx.fin.common.dris.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@ConfigurationProperties(prefix = "service.channels-api")
@Getter
@Setter
public class ConfigurationPropertiesServiceChannelsApi {

    @NestedConfigurationProperty
    public Snapshots drisSnapshots;

    @Getter
    @Setter
    public static class Snapshots {
        @NestedConfigurationProperty
        public Enabled placesV1;

        @NestedConfigurationProperty
        public Enabled providerTypesV1;

        @NestedConfigurationProperty
        public Enabled providersV1;

        @NestedConfigurationProperty
        public Enabled instrumentTypesV1;
    }

    @Getter
    @Setter
    public static class Enabled {
        public boolean enabled = true;
    }
}
