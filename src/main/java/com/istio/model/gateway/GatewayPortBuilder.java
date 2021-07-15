package com.istio.model.gateway;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class GatewayPortBuilder extends GatewayPortFluentImpl<GatewayPortBuilder> implements VisitableBuilder<GatewayPort, GatewayPortBuilder>{

    GatewayPortFluent<?> fluent;
    Boolean validationEnabled;

    public GatewayPortBuilder(){
            this(true);
    }
    public GatewayPortBuilder(Boolean validationEnabled){
        this(new GatewayPort(), validationEnabled);
    }
    public GatewayPortBuilder(GatewayPortFluent<?> fluent){
            this(fluent, true);
    }
    public GatewayPortBuilder(GatewayPortFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new GatewayPort(), validationEnabled);
    }
    public GatewayPortBuilder(GatewayPortFluent<?> fluent, GatewayPort instance){
            this(fluent, instance, true);
    }
    public GatewayPortBuilder(GatewayPortFluent<?> fluent, GatewayPort instance, Boolean validationEnabled){
            this.fluent = fluent;
        fluent.withNumber(instance.getNumber());
        fluent.withName(instance.getName());
        fluent.withProtocol(instance.getProtocol());
            this.validationEnabled = validationEnabled;
    }
    public GatewayPortBuilder(GatewayPort instance){
            this(instance,true);
    }
    public GatewayPortBuilder(GatewayPort instance, Boolean validationEnabled){
            this.fluent = this;
        fluent.withNumber(instance.getNumber());
        fluent.withName(instance.getName());
        fluent.withProtocol(instance.getProtocol());
            this.validationEnabled = validationEnabled;
    }

    @Override
    public GatewayPort build(){
        GatewayPort buildable = new GatewayPort(fluent.getNumber(),fluent.getName(),fluent.getProtocol());
        return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            GatewayPortBuilder that = (GatewayPortBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
