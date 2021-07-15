package com.istio.model.virtualservice;

import io.fabric8.kubernetes.api.builder.Fluent;

import java.util.Collection;
import java.util.List;

/**
 * @Classname VirtualServiceSpecFluent
 * @Description TODO
 * @Date 2020/10/20 0020 14:52
 * @Create by llarao
 */
public interface VirtualServiceSpecFluent <A extends VirtualServiceSpecFluent<A>> extends Fluent<A> {
    List<String> getHosts();
    A withHosts(List<String> items);
    Boolean hasHosts();
    A addNewHost(String host);
    A setToHost(int index,String item);
    A addToHost(String... items);
    A addAllToHosts(Collection<String> items);
    A removeFromHost(String... items);
    A removeAllFromHosts(Collection<String> items);

    List<String> getGateways();
    A withGateways(List<String> items);
    Boolean hasGateways();
    A addNewGateway(String gateway);
    A setToGateway(int index,String item);
    A addToGateway(String... items);
    A addAllToGateways(Collection<String> items);
    A removeFromGateway(String... items);
    A removeAllFromGateways(Collection<String> items);


    List<SpecHttp> getHttps();
    List<SpecHttp> buildHttps();
    SpecHttp buildHttp(int index);
    A withHttps(List<SpecHttp> items);
    A withHttps(SpecHttp... items);
    Boolean hasHttps();
    SpecHttpNested<A> addNewHttps();
    SpecHttpNested<A> addNewHttpLike(SpecHttp item);
    SpecHttpNested<A> setNewHttpLike(int i, SpecHttp item);
    SpecHttpNested<A> editHttp(int i);
    SpecHttpNested<A> editFirstHttp();
    SpecHttpNested<A> editLastHttp();
    A addNewHttp(SpecHttp specHttp);
    A addToHttp(int index, SpecHttp item);
    A setToHttp(int index, SpecHttp item);
    A addToHttp(SpecHttp... items);
    A addAllToHttps(Collection<SpecHttp> items);
    A removeFromHttp(SpecHttp... items);
    A removeAllFromHttps(Collection<SpecHttp> items);


    public interface SpecHttpNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>, SpecHttpFluent<SpecHttpNested<N>> {
        @Override
        public N and();
        public N endHttp();
    }
}
