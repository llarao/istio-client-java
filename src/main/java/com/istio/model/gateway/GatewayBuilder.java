package com.istio.model.gateway;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class GatewayBuilder extends GatewayFluentImpl<GatewayBuilder> implements VisitableBuilder<Gateway, GatewayBuilder>{

    GatewayFluent<?> fluent;
    Boolean validationEnabled;

    public GatewayBuilder(){
            this(true);
    }
    public GatewayBuilder(Boolean validationEnabled){
        this(new Gateway(), validationEnabled);
    }
    public GatewayBuilder(GatewayFluent<?> fluent){
            this(fluent, true);
    }
    public GatewayBuilder(GatewayFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new Gateway(), validationEnabled);
    }
    public GatewayBuilder(GatewayFluent<?> fluent, Gateway instance){
            this(fluent, instance, true);
    }
    public GatewayBuilder(GatewayFluent<?> fluent, Gateway instance, Boolean validationEnabled){
            this.fluent = fluent;
            fluent.withApiVersion(instance.getApiVersion());
            fluent.withKind(instance.getKind());
            fluent.withMetadata(instance.getMetadata());
            fluent.withSpec(instance.getSpec());
            this.validationEnabled = validationEnabled;
    }
    public GatewayBuilder(Gateway instance){
            this(instance,true);
    }
    public GatewayBuilder(Gateway instance, Boolean validationEnabled){
            this.fluent = this;
            fluent.withApiVersion(instance.getApiVersion());
            fluent.withKind(instance.getKind());
            fluent.withMetadata(instance.getMetadata());
            fluent.withSpec(instance.getSpec());
            this.validationEnabled = validationEnabled;
    }

    @Override
    public Gateway build(){
        Gateway buildable = new Gateway(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec());
        return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            GatewayBuilder that = (GatewayBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
