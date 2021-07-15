package com.istio.model.destinationrule;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @Classname VirtualServiceSpecFluentImpl
 * @Description TODO
 * @Date 2020/10/21 0021 10:20
 * @Create by llarao
 */
public class TrafficPolicyFluentImpl<A extends TrafficPolicyFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements TrafficPolicyFluent<A> {

    private LoadBalancerBuilder loadBalancer;

    private ConnectionPoolBuilder connectionPool;

    private OutlierDetectionBuilder outlierDetection;

    private List<PortLevelSettingBuilder> portLevelSettings;

    public TrafficPolicyFluentImpl(){
    }
    public TrafficPolicyFluentImpl(TrafficPolicy instance){
        this.withLoadBalancer(instance.getLoadBalancer());
        this.withConnectionPool(instance.getConnectionPool());
        this.withOutlierDetection(instance.getOutlierDetection());
        this.withPortLevelSettings(instance.getPortLevelSettings());
    }

    @Override
    public LoadBalancer getLoadBalancer() {
        return this.loadBalancer!=null?this.loadBalancer.build():null;
    }

    @Override
    public LoadBalancer buildLoadBalancer() {
        return this.loadBalancer!=null?this.loadBalancer.build():null;

    }

    @Override
    public A withLoadBalancer(LoadBalancer loadBalancer) {
        _visitables.get("loadBalancer").remove(this.loadBalancer);
        if (loadBalancer!=null){ this.loadBalancer= new LoadBalancerBuilder(loadBalancer); _visitables.get("loadBalancer").add(this.loadBalancer);} return (A) this;
    }

    @Override
    public Boolean hasLoadBalancer() {
        return this.loadBalancer!=null;
    }

    @Override
    public LoadBalancerNested<A> withNewLoadBalancer() {
        return new LoadBalancerNestedImpl<>();
    }

    @Override
    public LoadBalancerNested<A> withNewLoadBalancerLike(LoadBalancer item) {
        return new LoadBalancerNestedImpl<>(item);

    }

    @Override
    public LoadBalancerNested<A> editLoadBalancer() {
        return withNewLoadBalancerLike(getLoadBalancer());
    }

    @Override
    public LoadBalancerNested<A> editOrNewLoadBalancer() {
        return withNewLoadBalancerLike(getLoadBalancer() != null ? getLoadBalancer(): new LoadBalancerBuilder().build());
    }

    @Override
    public LoadBalancerNested<A> editOrNewLoadBalancerLike(LoadBalancer item) {
        return withNewLoadBalancerLike(getLoadBalancer() != null ? getLoadBalancer(): item);
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
        return new ConnectionPoolNestedImpl<>(item);
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

    @Override
    public OutlierDetection getOutlierDetection() {
        return this.outlierDetection!=null?this.outlierDetection.build():null;
    }

    @Override
    public OutlierDetection buildOutlierDetection() {
        return this.outlierDetection!=null?this.outlierDetection.build():null;
    }

    @Override
    public A withOutlierDetection(OutlierDetection outlierDetection) {
        _visitables.get("outlierDetection").remove(this.outlierDetection);
        if (outlierDetection!=null){ this.outlierDetection= new OutlierDetectionBuilder(outlierDetection); _visitables.get("connectionPool").add(this.connectionPool);} return (A) this;
    }

    @Override
    public Boolean hasOutlierDetection() {
        return this.outlierDetection!=null;
    }

    @Override
    public OutlierDetectionNested<A> withNewOutlierDetection() {
        return new OutlierDetectionNestedImpl<>();
    }

    @Override
    public OutlierDetectionNested<A> withNewOutlierDetectionLike(OutlierDetection item) {
        return new OutlierDetectionNestedImpl<>(item);
    }

    @Override
    public OutlierDetectionNested<A> editOutlierDetection() {
        return withNewOutlierDetectionLike(getOutlierDetection());
    }

    @Override
    public OutlierDetectionNested<A> editOrNewOutlierDetection() {
        return withNewOutlierDetectionLike(getOutlierDetection() != null ? getOutlierDetection(): new OutlierDetectionBuilder().build());
    }

    @Override
    public OutlierDetectionNested<A> editOrNewOutlierDetectionLike(OutlierDetection item) {
        return withNewOutlierDetectionLike(getOutlierDetection() != null ? getOutlierDetection(): item);
    }

    @Override
    public List<PortLevelSetting> getPortLevelSettings() {
        return build(portLevelSettings);
    }

    @Override
    public List<PortLevelSetting> buildPortLevelSettings() {
        return build(portLevelSettings);
    }

    @Override
    public PortLevelSetting buildPortLevelSettings(int index) {
        return this.portLevelSettings.get(index).build();
    }

    @Override
    public A withPortLevelSettings(List<PortLevelSetting> portLevelSettings) {
        if (this.portLevelSettings != null) { _visitables.get("portLevelSettings").removeAll(this.portLevelSettings);}
        if (portLevelSettings != null) {
            this.portLevelSettings = new ArrayList<>();
            for (PortLevelSetting item : portLevelSettings){
                this.addToPortLevelSetting(item);
            }
        } else {
            this.portLevelSettings = null;
        }
        return (A) this;
    }

    @Override
    public A withPortLevelSettings(PortLevelSetting... portLevelSettings) {
        if (this.portLevelSettings != null) {
            this.portLevelSettings.clear();
        }
        if (portLevelSettings != null) {
            for (PortLevelSetting item :portLevelSettings){
                this.addToPortLevelSetting(item);
            }
        }
        return (A) this;
    }

    @Override
    public Boolean hasPortLevelSettings() {
        return this.portLevelSettings!=null;
    }

    @Override
    public PortLevelSettingNested<A> addNewPortLevelSetting() {
        return new PortLevelSettingNestedImpl<>();
    }

    @Override
    public PortLevelSettingNested<A> addNewPortLevelSettingLike(PortLevelSetting item) {
        return new PortLevelSettingNestedImpl<>(-1,item);
    }

    @Override
    public PortLevelSettingNested<A> setNewPortLevelSettingLike(int i, PortLevelSetting item) {
        return new PortLevelSettingNestedImpl<>(i,item);
    }

    @Override
    public PortLevelSettingNested<A> editPortLevelSettings(int i) {
        if (portLevelSettings.size() <= 0) {
            throw new RuntimeException("Can't edit portLevelSettings. Index exceeds size.");
        }
        return setNewPortLevelSettingLike(i, buildPortLevelSettings(i));
    }

    @Override
    public PortLevelSettingNested<A> editFirstPortLevelSettings() {
        if (portLevelSettings.size() == 0) {
            throw new RuntimeException("Can't edit portLevelSettings. Index exceeds size.");
        }
        return setNewPortLevelSettingLike(0, buildPortLevelSettings(0));
    }

    @Override
    public PortLevelSettingNested<A> editLastPortLevelSettings() {
        int index = portLevelSettings.size() - 1;
        if (index < 0) {
            throw new RuntimeException("Can't edit portLevelSettings. Index exceeds size.");
        }
        return setNewPortLevelSettingLike(index, buildPortLevelSettings(index));
    }

    @Override
    public A addNewPortLevelSetting(PortLevelSetting specHttp) {
        return this.addToPortLevelSetting(-1,specHttp);
    }

    @Override
    public A addToPortLevelSetting(int index, PortLevelSetting portLevelSettings) {
        if (this.portLevelSettings == null) {
            this.portLevelSettings = new ArrayList<PortLevelSettingBuilder>();
        }
        PortLevelSettingBuilder builder = new PortLevelSettingBuilder(portLevelSettings);
        _visitables.get("portLevelSettings").add(index >= 0 ? index : _visitables.get("portLevelSettings").size(), builder);
        this.portLevelSettings.add(index >= 0 ? index : this.portLevelSettings.size(), builder);
        return (A)this;
    }

    @Override
    public A setToPortLevelSetting(int index, PortLevelSetting item) {
        if (this.portLevelSettings == null) {
            this.portLevelSettings = new ArrayList<PortLevelSettingBuilder>();
        }
        PortLevelSettingBuilder builder = new PortLevelSettingBuilder(item);
        if (index < 0 || index >= _visitables.get("portLevelSettings").size()) {
            _visitables.get("portLevelSettings").add(builder);
        } else {
            _visitables.get("portLevelSettings").set(index, builder);
        }
        if (index < 0 || index >= portLevelSettings.size()) {
            portLevelSettings.add(builder);
        } else {
            portLevelSettings.set(index, builder);
        }
        return (A)this;
    }

    @Override
    public A addToPortLevelSetting(PortLevelSetting... portLevelSettings) {
        if (this.portLevelSettings == null) {
            this.portLevelSettings = new ArrayList<PortLevelSettingBuilder>();
        }
        for (PortLevelSetting item : portLevelSettings) {
            PortLevelSettingBuilder builder = new PortLevelSettingBuilder(item);
            _visitables.get("portLevelSettings").add(builder);
            this.portLevelSettings.add(builder);
        }
        return (A)this;
    }

    @Override
    public A addAllToPortLevelSettings(Collection<PortLevelSetting> portLevelSettings) {
        if (this.portLevelSettings == null) {
            this.portLevelSettings = new ArrayList<PortLevelSettingBuilder>();
        }
        for (PortLevelSetting item : portLevelSettings) {
            PortLevelSettingBuilder builder = new PortLevelSettingBuilder(item);
            _visitables.get("match").add(builder);
            this.portLevelSettings.add(builder);
        }
        return (A)this;
    }

    @Override
    public A removeFromPortLevelSetting(PortLevelSetting... portLevelSettings) {
        for (PortLevelSetting item : portLevelSettings) {
            PortLevelSettingBuilder builder = new PortLevelSettingBuilder(item);
            _visitables.get("portLevelSettings").remove(builder);
            if (this.portLevelSettings != null) {
                this.portLevelSettings.remove(builder);
            }
        }
        return (A)this;
    }

    @Override
    public A removeAllFromPortLevelSettings(Collection<PortLevelSetting> portLevelSettings) {
        for (PortLevelSetting item : portLevelSettings) {
            PortLevelSettingBuilder builder = new PortLevelSettingBuilder(item);
            _visitables.get("portLevelSettings").remove(builder);
            if (this.portLevelSettings != null) {
                this.portLevelSettings.remove(builder);
            }
        }
        return (A)this;
    }

    public class LoadBalancerNestedImpl<N> extends LoadBalancerFluentImpl<LoadBalancerNested<N>> implements LoadBalancerNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private LoadBalancerBuilder builder;

        LoadBalancerNestedImpl(LoadBalancer item){
            this.builder = new LoadBalancerBuilder(this, item);
        }
        LoadBalancerNestedImpl(){
            this.builder = new LoadBalancerBuilder(this);
        }

        @Override
        public N and(){
            return (N) TrafficPolicyFluentImpl.this.withLoadBalancer(builder.build());
        }

        @Override
        public N endLoadBalancer() {
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
            return (N) TrafficPolicyFluentImpl.this.withConnectionPool(builder.build());
        }

        @Override
        public N endConnectionPool() {
            return and();
        }
    }

    public class OutlierDetectionNestedImpl<N> extends OutlierDetectionFluentImpl<OutlierDetectionNested<N>> implements OutlierDetectionNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private OutlierDetectionBuilder builder;

        OutlierDetectionNestedImpl(OutlierDetection item){
            this.builder = new OutlierDetectionBuilder(this, item);
        }
        OutlierDetectionNestedImpl(){
            this.builder = new OutlierDetectionBuilder(this);
        }

        @Override
        public N and(){
            return (N) TrafficPolicyFluentImpl.this.withOutlierDetection(builder.build());
        }

        @Override
        public N endOutlierDetection() {
            return and();
        }
    }

    public class PortLevelSettingNestedImpl<N> extends PortLevelSettingFluentImpl<PortLevelSettingNested<N>> implements PortLevelSettingNested<N>,io.fabric8.kubernetes.api.builder.Nested<N>{

        private PortLevelSettingBuilder builder;
        private final int index;

        PortLevelSettingNestedImpl(int index, PortLevelSetting item){
            this.index = index;
            this.builder = new PortLevelSettingBuilder(this, item);
        }
        PortLevelSettingNestedImpl(){
            this.index = -1;
            this.builder = new PortLevelSettingBuilder(this);
        }

        @Override
        public N and(){
            return (N) TrafficPolicyFluentImpl.this.setToPortLevelSetting(index,builder.build());
        }

        @Override
        public N endPortLevelSetting() {
            return and();
        }
    }
    
}
