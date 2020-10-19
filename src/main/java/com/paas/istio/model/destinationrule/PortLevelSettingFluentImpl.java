package com.paas.istio.model.destinationrule;

import com.paas.istio.model.virtualservice.SpecHttp;
import com.paas.istio.model.virtualservice.SpecHttpFluent;
import com.paas.istio.model.virtualservice.SpecHttpFluentImpl;
import com.paas.istio.model.virtualservice.SpecHttpRewrite;
import com.paas.istio.model.virtualservice.SpecHttpRewriteBuilder;
import com.paas.istio.model.virtualservice.SpecHttpRewriteFluentImpl;

/**
 * @Classname VirtualServiceSpecFluentImpl
 * @Description TODO
 * @Date 2020/10/21 0021 10:20
 * @Create by llarao
 */
public class PortLevelSettingFluentImpl<A extends PortLevelSettingFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements PortLevelSettingFluent<A> {
    /**
     * 端口配置
     */
    private PortSettingBuilder port;
    /**
     * 连接池配置
     */
    private ConnectionPoolBuilder connectionPool;

    public PortLevelSettingFluentImpl(){
    }
    public PortLevelSettingFluentImpl(PortLevelSetting instance){
        this.withPort(instance.getPort());
        this.withConnectionPool(instance.getConnectionPool());
    }
    @Override
    public PortSetting getPort() {
        return this.port!=null?this.port.build():null;
    }

    @Override
    public PortSetting buildPort() {
        return this.port!=null?this.port.build():null;
    }

    @Override
    public A withPort(PortSetting port) {
        _visitables.get("port").remove(this.port);
        if (port!=null){ this.port= new PortSettingBuilder(port); _visitables.get("port").add(this.port);} return (A) this;
    }

    @Override
    public Boolean hasPort() {
        return this.port!=null;
    }

    @Override
    public PortNested<A> withNewPort() {
        return new PortNestedNestedImpl<>();
    }

    @Override
    public PortNested<A> withNewPortLike(PortSetting item) {
        return new PortNestedNestedImpl(item);
    }

    @Override
    public PortNested<A> editPort() {
        return withNewPortLike(getPort());
    }

    @Override
    public PortNested<A> editOrNewPort() {
        return withNewPortLike(getPort() != null ? getPort(): new PortSettingBuilder().build());
    }

    @Override
    public PortNested<A> editOrNewPortLike(PortSetting item) {
        return withNewPortLike(getPort() != null ? getPort(): item);
    }

    @Override
    public ConnectionPool getConnectionPool() {
        return this.connectionPool!=null?this.connectionPool.build():null;
    }

    @Override
    public ConnectionPool buildConnectionPool() {
        return this.connectionPool!=null?this.connectionPool.build():null;
    }

    @Override
    public A withConnectionPool(ConnectionPool connectionPool) {
        _visitables.get("connectionPool").remove(this.connectionPool);
        if (connectionPool!=null){ this.connectionPool= new ConnectionPoolBuilder(connectionPool); _visitables.get("connectionPool").add(this.connectionPool);} return (A) this;
    }

    @Override
    public Boolean hasConnectionPool() {
        return this.connectionPool!=null;
    }

    @Override
    public ConnectionPoolNested<A> withNewConnectionPool() {
        return new ConnectionPoolNestedImpl<>();
    }

    @Override
    public ConnectionPoolNested<A> withNewConnectionPoolLike(ConnectionPool item) {
        return new ConnectionPoolNestedImpl(item);
    }

    @Override
    public ConnectionPoolNested<A> editConnectionPool() {
        return withNewConnectionPoolLike(getConnectionPool());
    }

    @Override
    public ConnectionPoolNested<A> editOrNewConnectionPool() {
        return withNewConnectionPoolLike(getConnectionPool() != null ? getConnectionPool(): new ConnectionPoolBuilder().build());
    }

    @Override
    public ConnectionPoolNested<A> editOrNewConnectionPoolLike(ConnectionPool item) {
        return withNewConnectionPoolLike(getConnectionPool() != null ? getConnectionPool(): item);
    }

    public class PortNestedNestedImpl<N> extends PortSettingFluentImpl<PortNested<N>> implements PortNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private PortSettingBuilder builder;

        PortNestedNestedImpl(PortSetting item){
            this.builder = new PortSettingBuilder(this, item);
        }
        PortNestedNestedImpl(){
            this.builder = new PortSettingBuilder(this);
        }

        @Override
        public N and(){
            return (N) PortLevelSettingFluentImpl.this.withPort(builder.build());
        }

        @Override
        public N endPort() {
            return and();
        }
    }

    public class ConnectionPoolNestedImpl<N> extends ConnectionPoolFluentImpl<ConnectionPoolNested<N>> implements ConnectionPoolNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private ConnectionPoolBuilder builder;

        ConnectionPoolNestedImpl(ConnectionPool item){
            this.builder = new ConnectionPoolBuilder(this, item);
        }
        ConnectionPoolNestedImpl(){
            this.builder = new ConnectionPoolBuilder(this);
        }

        @Override
        public N and(){
            return (N) PortLevelSettingFluentImpl.this.withConnectionPool(builder.build());
        }

        @Override
        public N endConnectionPool() {
            return and();
        }
    }
}
