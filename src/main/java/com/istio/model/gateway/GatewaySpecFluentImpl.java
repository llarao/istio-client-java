package com.istio.model.gateway;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Classname GatewayFluentImpl
 * @Description TODO
 * @Date 2020/10/17 0017 10:21
 * @Create by llarao
 */
public class GatewaySpecFluentImpl<A extends GatewaySpecFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements GatewaySpecFluent<A> {
    private Map<String, String> selector;
    private List<GatewayServerBuilder> servers;

    public GatewaySpecFluentImpl(){
    }
    public GatewaySpecFluentImpl(GatewaySpec instance){
        this.withSelector(instance.getSelector());
        this.withServers(instance.getServers());
    }

    @Override
    public Map<String, String> getSelector() {
        return this.selector==null?new HashMap<>():this.selector;
    }

    @Override
    public Map<String, String> buildSelector() {
        return this.selector==null?new HashMap<>():this.selector;

    }

    @Override
    public String buildSelector(String key) {
        return this.selector==null?null:this.selector.get(key);
    }

    @Override
    public A withSelector(Map<String, String> item) {
        this.selector = item;
        return (A)this;
    }

    @Override
    public Boolean hasSelector() {
        return this.selector != null;
    }

    @Override
    public A addNewSelector(String key, String item) {
        if (this.selector==null) {
            this.selector = new HashMap<>();
        }
        this.selector.put(key, item);
        return (A)this;

    }

    @Override
    public A removeFromSelector(String... keys) {
        if (keys!=null) {
            if (this.selector != null) {
                for (String key : keys) {
                    this.selector.remove(key);
                }
            }
        }
        return (A)this;

    }

    @Override
    public List<GatewayServer> getServers() {
        return build(servers);
    }

    @Override
    public List<GatewayServer> buildServers() {
        return build(servers);
    }

    @Override
    public GatewayServer buildServers(int index) {
        return this.servers.get(index).build();
    }

    @Override
    public A withServers(List<GatewayServer> servers) {
        if (this.servers != null) { _visitables.get("servers").removeAll(this.servers);}
        if (servers != null) {
            this.servers = new ArrayList<>();
            for (GatewayServer item : servers){
                this.addToServer(item);
            }
        } else {
            this.servers = null;
        }
        return (A) this;
    }

    @Override
    public A withServers(GatewayServer... servers) {
        if (this.servers != null) {
            this.servers.clear();
        }
        if (servers != null) {
            for (GatewayServer item :servers){
                this.addToServer(item);
            }
        }
        return (A) this;
    }

    @Override
    public Boolean hasServers() {
        return this.servers!=null;
    }

    @Override
    public GatewayServerNested<A> addNewServer() {
        return new GatewayServerNestedImpl<>();
    }

    @Override
    public GatewayServerNested<A> addNewServerLike(GatewayServer item) {
        return new GatewayServerNestedImpl<>(-1,item);
    }

    @Override
    public GatewayServerNested<A> setNewServerLike(int i, GatewayServer item) {
        return new GatewayServerNestedImpl<>(i,item);
    }

    @Override
    public GatewayServerNested<A> editServers(int index) {
        if (servers.size() <= 0) {
            throw new RuntimeException("Can't edit servers. Index exceeds size.");
        }
        return setNewServerLike(index, buildServers(index));
    }

    @Override
    public GatewayServerNested<A> editFirstServers() {
        if (servers.size() == 0) {
            throw new RuntimeException("Can't edit servers. Index exceeds size.");
        }
        return setNewServerLike(0, buildServers(0));
    }

    @Override
    public GatewayServerNested<A> editLastServers() {
        int index = servers.size() - 1;
        if (index < 0) {
            throw new RuntimeException("Can't edit servers. Index exceeds size.");
        }
        return setNewServerLike(index, buildServers(index));
    }

    @Override
    public A addNewServer(GatewayServer specHttp) {
        return this.addToServer(-1,specHttp);
    }

    @Override
    public A addToServer(int index, GatewayServer servers) {
        if (this.servers == null) {
            this.servers = new ArrayList<GatewayServerBuilder>();
        }
        GatewayServerBuilder builder = new GatewayServerBuilder(servers);
        _visitables.get("servers").add(index >= 0 ? index : _visitables.get("servers").size(), builder);
        this.servers.add(index >= 0 ? index : this.servers.size(), builder);
        return (A)this;
    }

    @Override
    public A setToServer(int index, GatewayServer item) {
        if (this.servers == null) {
            this.servers = new ArrayList<GatewayServerBuilder>();
        }
        GatewayServerBuilder builder = new GatewayServerBuilder(item);
        if (index < 0 || index >= _visitables.get("servers").size()) {
            _visitables.get("servers").add(builder);
        } else {
            _visitables.get("servers").set(index, builder);
        }
        if (index < 0 || index >= servers.size()) {
            servers.add(builder);
        } else {
            servers.set(index, builder);
        }
        return (A)this;
    }

    @Override
    public A addToServer(GatewayServer... servers) {
        if (this.servers == null) {
            this.servers = new ArrayList<GatewayServerBuilder>();
        }
        for (GatewayServer item : servers) {
            GatewayServerBuilder builder = new GatewayServerBuilder(item);
            _visitables.get("servers").add(builder);
            this.servers.add(builder);
        }
        return (A)this;
    }

    @Override
    public A addAllToServers(Collection<GatewayServer> servers) {
        if (this.servers == null) {
            this.servers = new ArrayList<GatewayServerBuilder>();
        }
        for (GatewayServer item : servers) {
            GatewayServerBuilder builder = new GatewayServerBuilder(item);
            _visitables.get("servers").add(builder);
            this.servers.add(builder);
        }
        return (A)this;
    }

    @Override
    public A removeFromServer(GatewayServer... servers) {
        for (GatewayServer item : servers) {
            GatewayServerBuilder builder = new GatewayServerBuilder(item);
            _visitables.get("servers").remove(builder);
            if (this.servers != null) {
                this.servers.remove(builder);
            }
        }
        return (A)this;
    }

    @Override
    public A removeAllFromServers(Collection<GatewayServer> servers) {
        for (GatewayServer item : servers) {
            GatewayServerBuilder builder = new GatewayServerBuilder(item);
            _visitables.get("servers").remove(builder);
            if (this.servers != null) {
                this.servers.remove(builder);
            }
        }
        return (A)this;
    }


    public class GatewayServerNestedImpl<N> extends GatewayServerFluentImpl<GatewayServerNested<N>> implements GatewayServerNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private GatewayServerBuilder builder;
        private final int index;

        GatewayServerNestedImpl(int index, GatewayServer item){
            this.index = index;
            this.builder = new GatewayServerBuilder(this, item);
        }
        GatewayServerNestedImpl(){
            this.index = -1;
            this.builder = new GatewayServerBuilder(this);
        }

        @Override
        public N and(){
            return (N) GatewaySpecFluentImpl.this.setToServer(index,builder.build());
        }

        @Override
        public N endServer() {
            return and();
        }
    }
}
