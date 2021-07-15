package com.istio.model.gateway;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class GatewayServerBuilder extends GatewayServerFluentImpl<GatewayServerBuilder> implements VisitableBuilder<GatewayServer, GatewayServerBuilder>{

    GatewayServerFluent<?> fluent;
    Boolean validationEnabled;

    public GatewayServerBuilder(){
            this(true);
    }
    public GatewayServerBuilder(Boolean validationEnabled){
        this(new GatewayServer(), validationEnabled);
    }
    public GatewayServerBuilder(GatewayServerFluent<?> fluent){
            this(fluent, true);
    }
    public GatewayServerBuilder(GatewayServerFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new GatewayServer(), validationEnabled);
    }
    public GatewayServerBuilder(GatewayServerFluent<?> fluent, GatewayServer instance){
            this(fluent, instance, true);
    }
    public GatewayServerBuilder(GatewayServerFluent<?> fluent, GatewayServer instance, Boolean validationEnabled){
            this.fluent = fluent;
        fluent.withPort(instance.getPort());
        fluent.withHosts(instance.getHosts());
        fluent.withDefaultEndpoint(instance.getDefaultEndpoint());
        fluent.withTls(instance.getTls());
            this.validationEnabled = validationEnabled;
    }
    public GatewayServerBuilder(GatewayServer instance){
            this(instance,true);
    }
    public GatewayServerBuilder(GatewayServer instance, Boolean validationEnabled){
            this.fluent = this;
        fluent.withPort(instance.getPort());
        fluent.withHosts(instance.getHosts());
        fluent.withDefaultEndpoint(instance.getDefaultEndpoint());
        fluent.withTls(instance.getTls());
        this.validationEnabled = validationEnabled;
    }

    @Override
    public GatewayServer build(){
        GatewayServer buildable = new GatewayServer(fluent.getPort(),fluent.getHosts(),fluent.getDefaultEndpoint(),fluent.getTls());
        return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            GatewayServerBuilder that = (GatewayServerBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
