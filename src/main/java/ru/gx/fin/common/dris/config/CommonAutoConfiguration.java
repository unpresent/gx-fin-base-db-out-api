package ru.gx.fin.common.dris.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.gx.fin.common.dris.channels.DrisSnapshotInstrumentTypeDataPublishChannelApiV1;
import ru.gx.fin.common.dris.channels.DrisSnapshotPlaceDataPublishChannelApiV1;
import ru.gx.fin.common.dris.channels.DrisSnapshotProviderDataPublishChannelApiV1;
import ru.gx.fin.common.dris.channels.DrisSnapshotProviderTypeDataPublishChannelApiV1;
import ru.gx.fin.common.dris.messages.DrisSnapshotInstrumentTypeDataPublish;
import ru.gx.fin.common.dris.messages.DrisSnapshotPlaceDataPublish;
import ru.gx.fin.common.dris.messages.DrisSnapshotProviderDataPublish;
import ru.gx.fin.common.dris.messages.DrisSnapshotProviderTypeDataPublish;

@Configuration
@EnableConfigurationProperties(ConfigurationPropertiesServiceChannelsApi.class)
public class CommonAutoConfiguration {
    private static final String DOT_ENABLED = ".enabled";

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "service.channels-api." + DrisChannelNames.Snapshots.PLACES_V1 + DOT_ENABLED, havingValue = "true")
    public DrisSnapshotPlaceDataPublishChannelApiV1 drisSnapshotPlaceDataPublishChannelApiV1() {
        DrisSnapshotPlaceDataPublish.staticInit();
        return new DrisSnapshotPlaceDataPublishChannelApiV1();
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "service.channels-api." + DrisChannelNames.Snapshots.PROVIDER_TYPES_V1 + DOT_ENABLED, havingValue = "true")
    public DrisSnapshotProviderTypeDataPublishChannelApiV1 drisSnapshotProviderTypeDataPublishChannelApiV1() {
        DrisSnapshotProviderTypeDataPublish.staticInit();
        return new DrisSnapshotProviderTypeDataPublishChannelApiV1();
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "service.channels-api." + DrisChannelNames.Snapshots.PROVIDERS_V1 + DOT_ENABLED, havingValue = "true")
    public DrisSnapshotProviderDataPublishChannelApiV1 drisSnapshotProviderDataPublishChannelApiV1() {
        DrisSnapshotProviderDataPublish.staticInit();
        return new DrisSnapshotProviderDataPublishChannelApiV1();
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "service.channels-api." + DrisChannelNames.Snapshots.INSTRUMENT_TYPES_V1 + DOT_ENABLED, havingValue = "true")
    public DrisSnapshotInstrumentTypeDataPublishChannelApiV1 drisSnapshotInstrumentTypeDataPublishChannelApiV1() {
        DrisSnapshotInstrumentTypeDataPublish.staticInit();
        return new DrisSnapshotInstrumentTypeDataPublishChannelApiV1();
    }
}
