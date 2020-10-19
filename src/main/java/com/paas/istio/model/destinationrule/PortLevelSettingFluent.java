package com.paas.istio.model.destinationrule;

import com.paas.istio.model.virtualservice.SpecHttpFluent;
import com.paas.istio.model.virtualservice.SpecHttpRewrite;
import io.fabric8.kubernetes.api.builder.Fluent;

/**
 * @Classname VirtualServiceSpecFluent
 * @Description TODO
 * @Date 2020/10/20 0020 14:52
 * @Create by llarao
 */
public interface PortLevelSettingFluent<A extends PortLevelSettingFluent<A>> extends Fluent<A> {
    PortSetting getPort();
    PortSetting buildPort();
    A withPort(PortSetting item);
    Boolean hasPort();
    PortNested<A> withNewPort();
    PortNested<A> withNewPortLike(PortSetting item);
    PortNested<A> editPort();
    PortNested<A> editOrNewPort();
    PortNested<A> editOrNewPortLike(PortSetting item);

    ConnectionPool getConnectionPool();
    ConnectionPool buildConnectionPool();
    A withConnectionPool(ConnectionPool item);
    Boolean hasConnectionPool();
    ConnectionPoolNested<A> withNewConnectionPool();
    ConnectionPoolNested<A> withNewConnectionPoolLike(ConnectionPool item);
    ConnectionPoolNested<A> editConnectionPool();
    ConnectionPoolNested<A> editOrNewConnectionPool();
    ConnectionPoolNested<A> editOrNewConnectionPoolLike(ConnectionPool item);

    public interface PortNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>, PortSettingFluent<PortNested<N>> {
        public N and();    public N endPort();
    }

    public interface ConnectionPoolNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>, ConnectionPoolFluent<ConnectionPoolNested<N>> {
        public N and();    public N endConnectionPool();
    }
}
