package com.paas.istio.model.destinationrule;

import io.fabric8.kubernetes.api.builder.VisitableBuilder;

public class ConnectionTCPBuilder extends ConnectionTCPFluentImpl<ConnectionTCPBuilder> implements VisitableBuilder<ConnectionTCP, ConnectionTCPBuilder>{

    ConnectionTCPFluent<?> fluent;
    Boolean validationEnabled;

    public ConnectionTCPBuilder(){
            this(true);
    }
    public ConnectionTCPBuilder(Boolean validationEnabled){
        this(new ConnectionTCP(), validationEnabled);
    }
    public ConnectionTCPBuilder(ConnectionTCPFluent<?> fluent){
            this(fluent, true);
    }
    public ConnectionTCPBuilder(ConnectionTCPFluent<?> fluent, Boolean validationEnabled){
            this(fluent, new ConnectionTCP(), validationEnabled);
    }
    public ConnectionTCPBuilder(ConnectionTCPFluent<?> fluent, ConnectionTCP instance){
            this(fluent, instance, true);
    }
    public ConnectionTCPBuilder(ConnectionTCPFluent<?> fluent, ConnectionTCP instance, Boolean validationEnabled){
        this.fluent = fluent;
        fluent.withMaxConnections(instance.getMaxConnections());
        fluent.withConnecTimeout(instance.getConnecTimeout());
        fluent.withTcpKeepalive(instance.getTcpKeepalive());
        this.validationEnabled = validationEnabled;
    }
    public ConnectionTCPBuilder(ConnectionTCP instance){
            this(instance,true);
    }
    public ConnectionTCPBuilder(ConnectionTCP instance, Boolean validationEnabled){
        this.fluent = this;
        fluent.withMaxConnections(instance.getMaxConnections());
        fluent.withConnecTimeout(instance.getConnecTimeout());
        fluent.withTcpKeepalive(instance.getTcpKeepalive());
        this.validationEnabled = validationEnabled;
    }

    @Override
    public ConnectionTCP build(){
        ConnectionTCP buildable = new ConnectionTCP(fluent.getMaxConnections(), fluent.getConnecTimeout(), fluent.getTcpKeepalive());
        return buildable;
    }

    @Override
    public boolean equals(Object o){
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            ConnectionTCPBuilder that = (ConnectionTCPBuilder) o;
            if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;

            if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
            return true;
    }




}
