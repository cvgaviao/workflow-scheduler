package io.matrisk;

import io.quarkiverse.flow.Flow;
import io.smallrye.common.annotation.Identifier;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class OrchestrationMonitoringService {

    @Inject
    @Identifier("test:orchestrator")
    Flow flow;

    @PostConstruct
    void init() {
        var appctx = flow.definition().application();
        appctx.contextFactory().createCollection();
    }
}
