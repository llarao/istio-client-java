package com.istio.model.gateway;

import io.fabric8.kubernetes.api.builder.Fluent;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * @Classname VirtualServiceFluent
 * @Description TODO
 * @Date 2020/10/17 0017 10:21
 * @Create by llarao
 */
public interface GatewaySpecFluent<A extends GatewaySpecFluent<A>> extends Fluent<A> {

    Map<String, String> getSelector();
    Map<String, String> buildSelector();
    String buildSelector(String key);
    A withSelector(Map<String, String> item);
    Boolean hasSelector();
    A addNewSelector(String key ,String item);
    A removeFromSelector(String... keys);

    List<GatewayServer> getServers();
    List<GatewayServer> buildServers();
    GatewayServer buildServers(int index);
    A withServers(List<GatewayServer> items);
    A withServers(GatewayServer... items);
    Boolean hasServers();
    GatewayServerNested<A> addNewServer();
    GatewayServerNested<A> addNewServerLike(GatewayServer item);
    GatewayServerNested<A> setNewServerLike(int i , GatewayServer item);
    GatewayServerNested<A> editServers(int i);
    GatewayServerNested<A> editFirstServers();
    GatewayServerNested<A> editLastServers();
    A addNewServer(GatewayServer specHttp);
    A addToServer(int index, GatewayServer item);
    A setToServer(int index, GatewayServer item);
    A addToServer(GatewayServer... items);
    A addAllToServers(Collection<GatewayServer> items);
    A removeFromServer(GatewayServer... items);
    A removeAllFromServers(Collection<GatewayServer> items);


    public interface GatewayServerNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>, GatewayServerFluent<GatewayServerNested<N>> {
        public N and();    public N endServer();
    }
}
