package com.istio.model.destinationrule;

import io.fabric8.kubernetes.api.builder.Fluent;

import java.util.Collection;
import java.util.List;

/**
 * @Classname VirtualServiceSpecFluent
 * @Description TODO
 * @Date 2020/10/20 0020 14:52
 * @Create by llarao
 */
public interface TrafficPolicyFluent<A extends TrafficPolicyFluent<A>> extends Fluent<A> {


    LoadBalancer getLoadBalancer();
    LoadBalancer buildLoadBalancer();
    A withLoadBalancer(LoadBalancer item);
    Boolean hasLoadBalancer();
    LoadBalancerNested<A> withNewLoadBalancer();
    LoadBalancerNested<A> withNewLoadBalancerLike(LoadBalancer item);
    LoadBalancerNested<A> editLoadBalancer();
    LoadBalancerNested<A> editOrNewLoadBalancer();
    LoadBalancerNested<A> editOrNewLoadBalancerLike(LoadBalancer item);

    ConnectionPool getConnectionPool();
    ConnectionPool buildConnectionPool();
    A withConnectionPool(ConnectionPool item);
    Boolean hasConnectionPool();
    ConnectionPoolNested<A> withNewConnectionPool();
    ConnectionPoolNested<A> withNewConnectionPoolLike(ConnectionPool item);
    ConnectionPoolNested<A> editConnectionPool();
    ConnectionPoolNested<A> editOrNewConnectionPool();
    ConnectionPoolNested<A> editOrNewConnectionPoolLike(ConnectionPool item);

    OutlierDetection getOutlierDetection();
    OutlierDetection buildOutlierDetection();
    A withOutlierDetection(OutlierDetection item);
    Boolean hasOutlierDetection();
    OutlierDetectionNested<A> withNewOutlierDetection();
    OutlierDetectionNested<A> withNewOutlierDetectionLike(OutlierDetection item);
    OutlierDetectionNested<A> editOutlierDetection();
    OutlierDetectionNested<A> editOrNewOutlierDetection();
    OutlierDetectionNested<A> editOrNewOutlierDetectionLike(OutlierDetection item);

    List<PortLevelSetting> getPortLevelSettings();
    List<PortLevelSetting> buildPortLevelSettings();
    PortLevelSetting buildPortLevelSettings(int index);
    A withPortLevelSettings(List<PortLevelSetting> items);
    A withPortLevelSettings(PortLevelSetting... items);
    Boolean hasPortLevelSettings();
    PortLevelSettingNested<A> addNewPortLevelSetting();
    PortLevelSettingNested<A> addNewPortLevelSettingLike(PortLevelSetting item);
    PortLevelSettingNested<A> setNewPortLevelSettingLike(int i , PortLevelSetting item);
    PortLevelSettingNested<A> editPortLevelSettings(int i);
    PortLevelSettingNested<A> editFirstPortLevelSettings();
    PortLevelSettingNested<A> editLastPortLevelSettings();
    A addNewPortLevelSetting(PortLevelSetting specHttp);
    A addToPortLevelSetting(int index, PortLevelSetting item);
    A setToPortLevelSetting(int index, PortLevelSetting item);
    A addToPortLevelSetting(PortLevelSetting... items);
    A addAllToPortLevelSettings(Collection<PortLevelSetting> items);
    A removeFromPortLevelSetting(PortLevelSetting... items);
    A removeAllFromPortLevelSettings(Collection<PortLevelSetting> items);

    public interface LoadBalancerNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>, LoadBalancerFluent<LoadBalancerNested<N>> {
        public N and();    public N endLoadBalancer();
    }

    public interface ConnectionPoolNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>, ConnectionPoolFluent<ConnectionPoolNested<N>> {
        public N and();    public N endConnectionPool();
    }

    public interface OutlierDetectionNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>, OutlierDetectionFluent<OutlierDetectionNested<N>> {
        public N and();    public N endOutlierDetection();
    }

    public interface PortLevelSettingNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>, PortLevelSettingFluent<PortLevelSettingNested<N>> {
        public N and();    public N endPortLevelSetting();
    }
}
