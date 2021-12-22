package ru.gx.fin.common.dris.config;

import org.jetbrains.annotations.NotNull;
import ru.gx.core.redis.upload.AbstractRedisOutcomeCollectionsConfiguration;

public class DrisRedisOutcomeCollectionsConfiguration extends AbstractRedisOutcomeCollectionsConfiguration {
    public DrisRedisOutcomeCollectionsConfiguration(@NotNull String configurationName) {
        super(configurationName);
    }
}
