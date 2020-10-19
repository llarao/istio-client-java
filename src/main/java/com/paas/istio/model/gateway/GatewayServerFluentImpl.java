package com.paas.istio.model.gateway;


import com.paas.istio.model.virtualservice.SpecHttp;
import com.paas.istio.model.virtualservice.SpecHttpFluentImpl;
import com.paas.istio.model.virtualservice.SpecHttpMatchBuilder;
import com.paas.istio.model.virtualservice.SpecHttpRewriteBuilder;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @Classname GatewayFluentImpl
 * @Description TODO
 * @Date 2020/10/17 0017 10:21
 * @Create by llarao
 */
public class GatewayServerFluentImpl<A extends GatewayServerFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements GatewayServerFluent<A> {

    private GatewayPortBuilder port;
    private List<String> hosts;
    private String defaultEndpoint;
    private GatewayTLSBuilder tls;

    public GatewayServerFluentImpl(){
    }
    public GatewayServerFluentImpl(GatewayServer instance){
        this.withPort(instance.getPort());
        this.withHosts(instance.getHosts());
        this.withDefaultEndpoint(instance.getDefaultEndpoint());
        this.withTls(instance.getTls());
    }

    @Override
    public GatewayPort getPort() {
        return this.port!=null?this.port.build():null;
    }

    @Override
    public GatewayPort buildPort() {
        return this.port!=null?this.port.build():null;
    }

    @Override
    public A withPort(GatewayPort port) {
        _visitables.get("port").remove(this.port);
        if (port!=null){ this.port= new GatewayPortBuilder(port); _visitables.get("port").add(this.port);} return (A) this;
    }

    @Override
    public Boolean hasPort() {
        return this.port!=null;
    }

    @Override
    public GatewayPortNested<A> withNewPort() {
        return new GatewayPortNestedImpl<>();
    }

    @Override
    public GatewayPortNested<A> withNewPortLike(GatewayPort item) {
        return new GatewayPortNestedImpl<>(item);
    }

    @Override
    public GatewayPortNested<A> editPort() {
        return withNewPortLike(getPort());
    }

    @Override
    public GatewayPortNested<A> editOrNewPort() {
        return withNewPortLike(getPort() != null ? getPort(): new GatewayPortBuilder().build());
    }

    @Override
    public GatewayPortNested<A> editOrNewPortLike(GatewayPort item) {
        return withNewPortLike(getPort() != null ? getPort(): item);
    }

    @Override
    public List<String> getHosts() {
        return this.hosts==null?new ArrayList<>():this.hosts;
    }

    @Override
    public List<String> buildHosts() {
        return this.hosts==null?new ArrayList<>():this.hosts;
    }

    @Override
    public String buildHosts(int index) {
        return this.hosts.get(index);
    }

    @Override
    public A withHosts(List<String> items) {
        if (items!=null) {
            this.hosts = items;
        }
        return (A)this;
    }

    @Override
    public A withHosts(String... items) {
        if (this.hosts==null) {
            this.hosts = new ArrayList<>();
        }
        if (items!=null) {
            this.hosts.addAll(Arrays.asList(items));
        }
        return (A)this;
    }

    @Override
    public Boolean hasHosts() {
        return this.hosts != null;
    }

    @Override
    public A addNewHost(String specHttp) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(specHttp);
        return (A)this;

    }

    @Override
    public A addToHost(int index, String item) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.add(index, item);
        return (A)this;

    }

    @Override
    public A setToHost(int index, String item) {
        if (this.hosts==null) {
            this.hosts = new ArrayList<>();
        }
        if (this.hosts.size() >= index) {
            this.hosts.set(index, item);
        } else {
            this.hosts.add(item);
        }
        return (A)this;

    }

    @Override
    public A addToHost(String... items) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }

        this.hosts.addAll(Arrays.asList(items));
        return (A)this;
    }

    @Override
    public A addAllToHosts(Collection<String> items) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }

        this.hosts.addAll(items);
        return (A)this;
    }

    @Override
    public A removeFromHost(String... items) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        for (String item : items) {
            this.hosts.remove(item);
        }
        return (A)this;
    }

    @Override
    public A removeAllFromHosts(Collection<String> items) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        for (String item : items) {
            this.hosts.remove(item);
        }
        return (A)this;
    }

    @Override
    public A withDefaultEndpoint(String defaultEndpoint) {
        this.defaultEndpoint = defaultEndpoint;
        return (A)this;
    }

    @Override
    public String getDefaultEndpoint() {
        return this.defaultEndpoint;
    }

    @Override
    public GatewayTLS getTls() {
        return this.tls!=null?this.tls.build():null;
    }

    @Override
    public GatewayTLS buildTls() {
        return this.tls!=null?this.tls.build():null;
    }

    @Override
    public A withTls(GatewayTLS tls) {
        _visitables.get("tls").remove(this.tls);
        if (tls!=null){ this.tls= new GatewayTLSBuilder(tls); _visitables.get("tls").add(this.tls);} return (A) this;
    }

    @Override
    public Boolean hasTls() {
        return this.tls!=null;
    }

    @Override
    public GatewayTLSNested<A> withNewTls() {
        return new GatewayTLSNestedImpl<>();
    }

    @Override
    public GatewayTLSNested<A> withNewTlsLike(GatewayTLS item) {
        return new GatewayTLSNestedImpl(item);
    }

    @Override
    public GatewayTLSNested<A> editTls() {
        return withNewTlsLike(getTls());
    }

    @Override
    public GatewayTLSNested<A> editOrNewTls() {
        return withNewTlsLike(getTls() != null ? getTls(): new GatewayTLSBuilder().build());
    }

    @Override
    public GatewayTLSNested<A> editOrNewTlsLike(GatewayTLS item) {
        return withNewTlsLike(getTls() != null ? getTls(): item);
    }


    public class GatewayPortNestedImpl<N> extends GatewayPortFluentImpl<GatewayPortNested<N>> implements GatewayPortNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private GatewayPortBuilder builder;

        GatewayPortNestedImpl(GatewayPort item){
            this.builder = new GatewayPortBuilder(this, item);
        }
        GatewayPortNestedImpl(){
            this.builder = new GatewayPortBuilder(this);
        }

        @Override
        public N and(){
            return (N) GatewayServerFluentImpl.this.withPort(builder.build());
        }

        @Override
        public N endPort() {
            return and();
        }

    }


    public class GatewayTLSNestedImpl<N> extends GatewayTLSFluentImpl<GatewayTLSNested<N>> implements GatewayTLSNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private GatewayTLSBuilder builder;

        GatewayTLSNestedImpl(GatewayTLS item){
            this.builder = new GatewayTLSBuilder(this, item);
        }
        GatewayTLSNestedImpl(){
            this.builder = new GatewayTLSBuilder(this);
        }

        @Override
        public N and(){
            return (N) GatewayServerFluentImpl.this.withTls(builder.build());
        }

        @Override
        public N endTls() {
            return and();
        }

    }
}
