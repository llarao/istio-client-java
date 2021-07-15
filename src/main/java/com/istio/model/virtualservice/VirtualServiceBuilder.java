package com.istio.model.virtualservice;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class VirtualServiceBuilder extends VirtualServiceFluentImpl<VirtualServiceBuilder> implements VisitableBuilder<VirtualService, VirtualServiceBuilder>{

    VirtualServiceFluent<?> fluent;
    Boolean validationEnabled;

    public VirtualServiceBuilder(){
            this(true);
    }
    public VirtualServiceBuilder(Boolean validationEnabled){
        this(new VirtualService(), validationEnabled);
    }
    public VirtualServiceBuilder(VirtualServiceFluent<?> fluent){
            this(fluent, true);
    }
    public VirtualServiceBuilder(VirtualServiceFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new VirtualService(), validationEnabled);
    }
    public VirtualServiceBuilder(VirtualServiceFluent<?> fluent, VirtualService instance){
            this(fluent, instance, true);
    }
    public VirtualServiceBuilder(VirtualServiceFluent<?> fluent, VirtualService instance, Boolean validationEnabled){
            this.fluent = fluent;
            fluent.withApiVersion(instance.getApiVersion());
            fluent.withKind(instance.getKind());
            fluent.withMetadata(instance.getMetadata());
            fluent.withSpec(instance.getSpec());
            this.validationEnabled = validationEnabled;
    }
    public VirtualServiceBuilder(VirtualService instance){
            this(instance,true);
    }
    public VirtualServiceBuilder(VirtualService instance, Boolean validationEnabled){
            this.fluent = this;
            fluent.withApiVersion(instance.getApiVersion());
            fluent.withKind(instance.getKind());
            fluent.withMetadata(instance.getMetadata());
            fluent.withSpec(instance.getSpec());
            this.validationEnabled = validationEnabled;
    }

    @Override
    public VirtualService build(){
            VirtualService buildable = new VirtualService(fluent.getApiVersion(),fluent.getKind(),fluent.getMetadata(),fluent.getSpec());
            return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            VirtualServiceBuilder that = (VirtualServiceBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
