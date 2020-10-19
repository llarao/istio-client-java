package com.paas.istio.model.gateway;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class GatewaySpecBuilder extends GatewaySpecFluentImpl<GatewaySpecBuilder> implements VisitableBuilder<GatewaySpec, GatewaySpecBuilder>{

    GatewaySpecFluent<?> fluent;
    Boolean validationEnabled;

    public GatewaySpecBuilder(){
            this(true);
    }
    public GatewaySpecBuilder(Boolean validationEnabled){
        this(new GatewaySpec(), validationEnabled);
    }
    public GatewaySpecBuilder(GatewaySpecFluent<?> fluent){
            this(fluent, true);
    }
    public GatewaySpecBuilder(GatewaySpecFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new GatewaySpec(), validationEnabled);
    }
    public GatewaySpecBuilder(GatewaySpecFluent<?> fluent, GatewaySpec instance){
            this(fluent, instance, true);
    }
    public GatewaySpecBuilder(GatewaySpecFluent<?> fluent, GatewaySpec instance, Boolean validationEnabled){
            this.fluent = fluent;
        fluent.withSelector(instance.getSelector());
        fluent.withServers(instance.getServers());
            this.validationEnabled = validationEnabled;
    }
    public GatewaySpecBuilder(GatewaySpec instance){
            this(instance,true);
    }
    public GatewaySpecBuilder(GatewaySpec instance, Boolean validationEnabled){
            this.fluent = this;
        fluent.withSelector(instance.getSelector());
        fluent.withServers(instance.getServers());

        this.validationEnabled = validationEnabled;
    }

    @Override
    public GatewaySpec build(){
        GatewaySpec buildable = new GatewaySpec(fluent.getSelector(),fluent.getServers());
        return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            GatewaySpecBuilder that = (GatewaySpecBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
