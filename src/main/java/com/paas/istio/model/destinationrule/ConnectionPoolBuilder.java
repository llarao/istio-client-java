package com.paas.istio.model.destinationrule;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class ConnectionPoolBuilder extends ConnectionPoolFluentImpl<ConnectionPoolBuilder> implements VisitableBuilder<ConnectionPool, ConnectionPoolBuilder>{

    ConnectionPoolFluent<?> fluent;
    Boolean validationEnabled;

    public ConnectionPoolBuilder(){
            this(true);
    }
    public ConnectionPoolBuilder(Boolean validationEnabled){
        this(new ConnectionPool(), validationEnabled);
    }
    public ConnectionPoolBuilder(ConnectionPoolFluent<?> fluent){
            this(fluent, true);
    }
    public ConnectionPoolBuilder(ConnectionPoolFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new ConnectionPool(), validationEnabled);
    }
    public ConnectionPoolBuilder(ConnectionPoolFluent<?> fluent, ConnectionPool instance){
            this(fluent, instance, true);
    }
    public ConnectionPoolBuilder(ConnectionPoolFluent<?> fluent, ConnectionPool instance, Boolean validationEnabled){
            this.fluent = fluent;
            fluent.withHttp(instance.getHttp());
            this.validationEnabled = validationEnabled;
    }
    public ConnectionPoolBuilder(ConnectionPool instance){
            this(instance,true);
    }
    public ConnectionPoolBuilder(ConnectionPool instance, Boolean validationEnabled){
            this.fluent = this;
            fluent.withHttp(instance.getHttp());
            this.validationEnabled = validationEnabled;
    }

    @Override
    public ConnectionPool build(){
        ConnectionPool buildable = new ConnectionPool(fluent.getHttp(),fluent.getTcp());
        return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ConnectionPoolBuilder that = (ConnectionPoolBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
