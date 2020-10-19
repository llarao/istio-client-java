package com.paas.istio.model.virtualservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @Classname VirtualServiceSpecFluentImpl
 * @Description TODO
 * @Date 2020/10/21 0021 10:20
 * @Create by llarao
 */
public class VirtualServiceSpecFluentImpl<A extends VirtualServiceSpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements VirtualServiceSpecFluent<A> {

    private List<String> hosts;

    private List<String> gateways;

    private List<SpecHttpBuilder> http;

    public VirtualServiceSpecFluentImpl(){
    }
    public VirtualServiceSpecFluentImpl(VirtualServiceSpec instance){
        this.withHosts(instance.getHosts());
        this.withGateways(instance.getGateways());
        this.withHttps(instance.getHttp());
    }

    @Override
    public List<String> getHosts() {
        return this.hosts;
    }


    @Override
    public A withHosts(List<String> items) {
        this.hosts = items;
        return (A) this;
    }

    @Override
    public Boolean hasHosts() {
        return this.hosts != null;
    }

    @Override
    public A addNewHost(String host) {
        return addToHost(host);
    }

    @Override
    public A setToHost(int index, String item) {
        if (this.hosts == null) {this.hosts = new ArrayList<String>();}
        this.hosts.add(index, item);
        return (A)this;
    }



    @Override
    public A addToHost(String... items) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.addAll(Arrays.asList(items));
        return (A) this;
    }

    @Override
    public A addAllToHosts(Collection<String> items) {
        if (this.hosts == null) {
            this.hosts = new ArrayList<>();
        }
        this.hosts.addAll(items);
        return (A) this;
    }

    @Override
    public A removeFromHost(String... items) {
        for (String item : items) {
            if (this.hosts != null) {
                this.hosts.remove(item);
            }
        }
        return (A)this;
    }

    @Override
    public A removeAllFromHosts(Collection<String> items) {
        for (String item : items) {
            if (this.hosts != null) {
                this.hosts.remove(item);
            }
        }
        return (A)this;
    }

    @Override
    public List<String> getGateways() {
        return this.gateways;
    }


    @Override
    public A withGateways(List<String> items) {
        this.gateways = items;
        return (A) this;
    }

    @Override
    public Boolean hasGateways() {
        return this.gateways != null;
    }

    @Override
    public A addNewGateway(String gateway) {
        return addToGateway(gateway);
    }

    @Override
    public A setToGateway(int index, String item) {
        if (this.gateways==null) {
            this.gateways = new ArrayList<>();
        }
        this.gateways.add(index, item);
        return (A) this;
    }

    @Override
    public A addToGateway(String... items) {
        if (this.gateways==null) {
            this.gateways = new ArrayList<>();
        }
        this.gateways.addAll(Arrays.asList(items));
        return (A) this;
    }

    @Override
    public A addAllToGateways(Collection<String> items) {
        if (this.gateways==null) {
            this.gateways = new ArrayList<>();
        }
        this.gateways.addAll(items);
        return (A) this;
    }

    @Override
    public A removeFromGateway(String... items) {
        for (String item : items) {
            if (this.gateways != null) {
                this.gateways.remove(item);
            }
        }
        return (A) this;
    }

    @Override
    public A removeAllFromGateways(Collection<String> items) {
        for (String item : items) {
            if (this.gateways != null) {
                this.gateways.remove(item);
            }
        }
        return (A) this;
    }

    @Override
    public List<SpecHttp> getHttps() {
        return build(http);
    }

    @Override
    public List<SpecHttp> buildHttps() {
        return build(http);
    }

    @Override
    public SpecHttp buildHttp(int index) {
        return this.http.get(index).build();
    }

    @Override
    public A withHttps(List<SpecHttp> http) {
        if (this.http != null) { _visitables.get("http").removeAll(this.http);}
        if (http != null) {
            this.http = new ArrayList<>();
            for (SpecHttp item : http){
                this.addToHttp(item);
            }
        } else {
            this.http = null;
        }
        return (A) this;

    }

    @Override
    public A withHttps(SpecHttp... items) {
        if (this.http != null) {
            this.http.clear();
        }
        if (http != null) {
            for (SpecHttp item :items){
                this.addToHttp(item);
            }
        }
        return (A) this;

    }

    @Override
    public Boolean hasHttps() {
        return http!=null;
    }

    @Override
    public SpecHttpNested<A> addNewHttps() {
        return new SpecHttpNestedImpl();

    }

    @Override
    public SpecHttpNested<A> addNewHttpLike(SpecHttp item) {
        return new SpecHttpNestedImpl(-1,item);

    }

    @Override
    public SpecHttpNested<A> setNewHttpLike(int i, SpecHttp item) {
        return new SpecHttpNestedImpl(i,item);

    }

    @Override
    public SpecHttpNested<A> editHttp(int index) {
        if (http.size() <= 0) {
            throw new RuntimeException("Can't edit http. Index exceeds size.");
        }
        return setNewHttpLike(index, buildHttp(index));
    }

    @Override
    public SpecHttpNested<A> editFirstHttp() {
        if (http.size() == 0) {
            throw new RuntimeException("Can't edit http. Index exceeds size.");
        }
        return setNewHttpLike(0, buildHttp(0));
    }

    @Override
    public SpecHttpNested<A> editLastHttp() {
        int index = http.size() - 1;
        if (index < 0) {
            throw new RuntimeException("Can't edit http. Index exceeds size.");
        }
        return setNewHttpLike(index, buildHttp(index));
    }


    @Override
    public A addNewHttp(SpecHttp specHttp) {
        return this.addToHttp(-1,specHttp);
    }

    @Override
    public A addToHttp(int index, SpecHttp item) {
        if (this.http == null) {
            this.http = new ArrayList<SpecHttpBuilder>();
        }
        SpecHttpBuilder builder = new SpecHttpBuilder(item);
        _visitables.get("http").add(index >= 0 ? index : _visitables.get("http").size(), builder);
        this.http.add(index >= 0 ? index : http.size(), builder);
        return (A)this;
    }

    @Override
    public A setToHttp(int index, SpecHttp item) {
        if (this.http == null) {
            this.http = new ArrayList<SpecHttpBuilder>();
        }
        SpecHttpBuilder builder = new SpecHttpBuilder(item);
        if (index < 0 || index >= _visitables.get("http").size()) {
            _visitables.get("http").add(builder);
        } else {
            _visitables.get("http").set(index, builder);
        }
        if (index < 0 || index >= http.size()) {
            http.add(builder);
        } else {
            http.set(index, builder);
        }
        return (A)this;
    }

    @Override
    public A addToHttp(SpecHttp... items) {
        if (this.http == null) {
            this.http = new ArrayList<SpecHttpBuilder>();
        }
        for (SpecHttp item : items) {
            SpecHttpBuilder builder = new SpecHttpBuilder(item);
            _visitables.get("http").add(builder);
            this.http.add(builder);
        }
        return (A)this;
    }

    @Override
    public A addAllToHttps(Collection<SpecHttp> items) {
        if (this.http == null) {
            this.http = new ArrayList<SpecHttpBuilder>();
        }
        for (SpecHttp item : items) {
            SpecHttpBuilder builder = new SpecHttpBuilder(item);
            _visitables.get("http").add(builder);
            this.http.add(builder);
        }
        return (A)this;
    }

    @Override
    public A removeFromHttp(SpecHttp... items) {
        for (SpecHttp item : items) {
            SpecHttpBuilder builder = new SpecHttpBuilder(item);
            _visitables.get("http").remove(builder);
            if (this.http != null) {
                this.http.remove(builder);
            }
        }
        return (A)this;
    }

    @Override
    public A removeAllFromHttps(Collection<SpecHttp> items) {
        for (SpecHttp item : items) {
            SpecHttpBuilder builder = new SpecHttpBuilder(item);
            _visitables.get("http").remove(builder);
            if (this.http != null) {
                this.http.remove(builder);
            }
        }
        return (A)this;
    }

    public class SpecHttpNestedImpl<N> extends SpecHttpFluentImpl<SpecHttpNested<N>> implements VirtualServiceSpecFluent.SpecHttpNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private SpecHttpBuilder builder;
        private final int index;

        SpecHttpNestedImpl(int index, SpecHttp item){
            this.index = index;
            this.builder = new SpecHttpBuilder(this, item);
        }
        SpecHttpNestedImpl(){
            this.index = -1;
            this.builder = new SpecHttpBuilder(this);
        }

        @Override
        public N and(){
            return (N) VirtualServiceSpecFluentImpl.this.setToHttp(index,builder.build());
        }

        @Override
        public N endHttp() {
            return and();
        }

    }
}
