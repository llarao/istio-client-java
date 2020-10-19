package com.paas.istio.model.destinationrule;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class TcpKeepaliveBuilder extends TcpKeepaliveFluentImpl<TcpKeepaliveBuilder> implements VisitableBuilder<TcpKeepalive, TcpKeepaliveBuilder>{

    TcpKeepaliveFluent<?> fluent;
    Boolean validationEnabled;

    public TcpKeepaliveBuilder(){
            this(true);
    }
    public TcpKeepaliveBuilder(Boolean validationEnabled){
        this(new TcpKeepalive(), validationEnabled);
    }
    public TcpKeepaliveBuilder(TcpKeepaliveFluent<?> fluent){
            this(fluent, true);
    }
    public TcpKeepaliveBuilder(TcpKeepaliveFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new TcpKeepalive(), validationEnabled);
    }
    public TcpKeepaliveBuilder(TcpKeepaliveFluent<?> fluent, TcpKeepalive instance){
            this(fluent, instance, true);
    }
    public TcpKeepaliveBuilder(TcpKeepaliveFluent<?> fluent, TcpKeepalive instance, Boolean validationEnabled){
        this.fluent = fluent;
        fluent.withProbes(instance.getProbes());
        fluent.withTime(instance.getTime());
        fluent.withInterval(instance.getInterval());
        this.validationEnabled = validationEnabled;
    }
    public TcpKeepaliveBuilder(TcpKeepalive instance){
            this(instance,true);
    }
    public TcpKeepaliveBuilder(TcpKeepalive instance, Boolean validationEnabled){
        this.fluent = this;
        fluent.withProbes(instance.getProbes());
        fluent.withTime(instance.getTime());
        fluent.withInterval(instance.getInterval());
        this.validationEnabled = validationEnabled;
    }

    @Override
    public TcpKeepalive build(){
        TcpKeepalive buildable = new TcpKeepalive(fluent.getProbes(), fluent.getTime(), fluent.getInterval());
        return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            TcpKeepaliveBuilder that = (TcpKeepaliveBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
