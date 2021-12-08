package ru.gx.fin.common.dris.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@ConfigurationProperties(prefix = "service.mem-data.dris")
@Getter
@Setter
public class ConfigurationPropertiesServiceMemData {
    @NestedConfigurationProperty
    private MemoryRepository instrumentTypes;

    @NestedConfigurationProperty
    private MemoryRepository places;

    @NestedConfigurationProperty
    private MemoryRepository providerTypes;

    @NestedConfigurationProperty
    private MemoryRepository providers;

    @Getter
    @Setter
    public static class MemoryRepository {
        public boolean enabled = true;
    }
}
