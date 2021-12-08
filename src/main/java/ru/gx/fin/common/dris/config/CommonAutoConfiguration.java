package ru.gx.fin.common.dris.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.gx.fin.common.dris.memdata.InstrumentTypesMemoryRepository;
import ru.gx.fin.common.dris.memdata.PlacesMemoryRepository;
import ru.gx.fin.common.dris.memdata.ProviderTypesMemoryRepository;
import ru.gx.fin.common.dris.memdata.ProvidersMemoryRepository;

@Configuration
@EnableConfigurationProperties(ConfigurationPropertiesServiceMemData.class)
public class CommonAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "service.mem-data.dris.instrument-types.enabled", havingValue = "true")
    public InstrumentTypesMemoryRepository instrumentTypesMemoryRepository() {
        return new InstrumentTypesMemoryRepository();
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "service.mem-data.dris.places.enabled", havingValue = "true")
    public PlacesMemoryRepository placesMemoryRepository() {
        return new PlacesMemoryRepository();
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "service.mem-data.dris.provider-types.enabled", havingValue = "true")
    public ProviderTypesMemoryRepository providerTypesMemoryRepository() {
        return new ProviderTypesMemoryRepository();
    }

    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnProperty(value = "service.mem-data.dris.providers.enabled", havingValue = "true")
    public ProvidersMemoryRepository providersMemoryRepository() {
        return new ProvidersMemoryRepository();
    }
}
