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
public class ConnectionPoolFluentImpl<A extends ConnectionPoolFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements ConnectionPoolFluent<A> {

    private ConnectionHTTPBuilder http;
    private ConnectionTCPBuilder tcp;

    public ConnectionPoolFluentImpl(){
    }
    public ConnectionPoolFluentImpl(ConnectionPool instance){
        this.withHttp(instance.getHttp());
        this.withTcp(instance.getTcp());
    }

    @Override
    public ConnectionHTTP getHttp() {
        return this.http!=null?this.http.build():null;
    }

    @Override
    public ConnectionHTTP buildHttp() {
        return this.http!=null?this.http.build():null;

    }

    @Override
    public A withHttp(ConnectionHTTP http) {
        _visitables.get("http").remove(this.http);
        if (http!=null){ this.http= new ConnectionHTTPBuilder(http); _visitables.get("http").add(this.http);} return (A) this;
    }

    @Override
    public Boolean hasHttp() {
        return this.http!=null;
    }

    @Override
    public ConnectionHTTPNested<A> withNewHttp() {
        return new ConnectionHTTPNestedImpl<>();
    }

    @Override
    public ConnectionHTTPNested<A> withNewHttpLike(ConnectionHTTP item) {
        return new ConnectionHTTPNestedImpl(item);
    }

    @Override
    public ConnectionHTTPNested<A> editHttp() {
        return withNewHttpLike(getHttp());
    }

    @Override
    public ConnectionHTTPNested<A> editOrNewHttp() {
        return withNewHttpLike(getHttp() != null ? getHttp(): new ConnectionHTTPBuilder().build());
    }

    @Override
    public ConnectionHTTPNested<A> editOrNewHttpLike(ConnectionHTTP item) {
        return withNewHttpLike(getHttp() != null ? getHttp(): item);
    }

    @Override
    public ConnectionTCP getTcp() {
        return this.tcp!=null?this.tcp.build():null;
    }

    @Override
    public ConnectionTCP buildTcp() {
        return this.tcp!=null?this.tcp.build():null;

    }

    @Override
    public A withTcp(ConnectionTCP tcp) {
        _visitables.get("tcp").remove(this.tcp);
        if (tcp!=null){ this.tcp= new ConnectionTCPBuilder(tcp); _visitables.get("tcp").add(this.tcp);} return (A) this;
    }

    @Override
    public Boolean hasTcp() {
        return this.tcp!=null;
    }

    @Override
    public ConnectionTCPNested<A> withNewTcp() {
        return new ConnectionTCPNestedImpl<>();
    }

    @Override
    public ConnectionTCPNested<A> withNewTcpLike(ConnectionTCP item) {
        return new ConnectionTCPNestedImpl(item);
    }

    @Override
    public ConnectionTCPNested<A> editTcp() {
        return withNewTcpLike(getTcp());
    }

    @Override
    public ConnectionTCPNested<A> editOrNewTcp() {
        return withNewTcpLike(getTcp() != null ? getTcp(): new ConnectionTCPBuilder().build());
    }

    @Override
    public ConnectionTCPNested<A> editOrNewTcpLike(ConnectionTCP item) {
        return withNewTcpLike(getTcp() != null ? getTcp(): item);
    }

    public class ConnectionHTTPNestedImpl<N> extends ConnectionHTTPFluentImpl<ConnectionHTTPNested<N>> implements ConnectionHTTPNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private ConnectionHTTPBuilder builder;

        ConnectionHTTPNestedImpl(ConnectionHTTP item){
            this.builder = new ConnectionHTTPBuilder(this, item);
        }
        ConnectionHTTPNestedImpl(){
            this.builder = new ConnectionHTTPBuilder(this);
        }

        @Override
        public N and(){
            return (N) ConnectionPoolFluentImpl.this.withHttp(builder.build());
        }

        @Override
        public N endHttp() {
            return and();
        }
    }

    public class ConnectionTCPNestedImpl<N> extends ConnectionTCPFluentImpl<ConnectionTCPNested<N>> implements ConnectionTCPNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private ConnectionTCPBuilder builder;

        ConnectionTCPNestedImpl(ConnectionTCP item){
            this.builder = new ConnectionTCPBuilder(this, item);
        }
        ConnectionTCPNestedImpl(){
            this.builder = new ConnectionTCPBuilder(this);
        }

        @Override
        public N and(){
            return (N) ConnectionPoolFluentImpl.this.withTcp(builder.build());
        }

        @Override
        public N endTcp() {
            return and();
        }
    }
}
