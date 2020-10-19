package com.paas.istio.model.serviceentry;

import com.paas.istio.model.virtualservice.SpecHttpFluent;
import com.paas.istio.model.virtualservice.SpecHttpRetriesFluent;
import com.paas.istio.model.virtualservice.SpecHttpRoute;
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
public interface ServiceEntrySpecFluent<A extends ServiceEntrySpecFluent<A>> extends Fluent<A> {



    List<String> getHosts();
    List<String> buildHosts();
    String buildHosts(int index);
    A withHosts(List<String> items);
    A withHosts(String... items);
    Boolean hasHosts();
    A addNewHost(String specHttp);
    A addToHost(int index, String item);
    A setToHost(int index, String item);
    A addToHost(String... items);
    A addAllToHosts(Collection<String> items);
    A removeFromHost(String... items);
    A removeAllFromHosts(Collection<String> items);

    List<String> getAddresses();
    List<String> buildAddresses();
    String buildAddresses(int index);
    A withAddresses(List<String> items);
    A withAddresses(String... items);
    Boolean hasAddresses();
    A addNewAddresse(String specHttp);
    A addToAddresse(int index, String item);
    A setToAddresse(int index, String item);
    A addToAddresse(String... items);
    A addAllToAddresses(Collection<String> items);
    A removeFromAddresse(String... items);
    A removeAllFromAddresses(Collection<String> items);

    List<ServiceEntryPort> getPorts();
    ServiceEntryPort buildPorts(int index);
    List<ServiceEntryPort> buildPorts();
    A withPorts(List<ServiceEntryPort> items);
    A withPorts(ServiceEntryPort... items);
    Boolean hasPorts();
    ServiceEntryPortNested<A> addNewPorts();
    ServiceEntryPortNested<A> setNewPortLike(ServiceEntryPort item);
    ServiceEntryPortNested<A> setNewPortLike(int i , ServiceEntryPort item);
    ServiceEntryPortNested<A> editFirstPorts();
    ServiceEntryPortNested<A> editLastPorts();
    ServiceEntryPortNested<A> editPorts(int i);
    A addNewPorts(ServiceEntryPort specHttp);
    A setToPorts(int index, ServiceEntryPort item);
    A addToPorts(int index, ServiceEntryPort item);
    A addToPorts(ServiceEntryPort... items);
    A addAllToPorts(Collection<ServiceEntryPort> items);
    A removeFromPorts(ServiceEntryPort... items);
    A removeAllFromPorts(Collection<ServiceEntryPort> items);

    A withLocation(String location);
    String getLocation();

    A withResolution(String resolution);
    String getResolution();

    List<String> getSubjectAltNames();
    List<String> buildSubjectAltNames();
    String buildSubjectAltNames(int index);
    A withSubjectAltNames(List<String> items);
    A withSubjectAltNames(String... items);
    Boolean hasSubjectAltNames();
    A addNewSubjectAltName(String specHttp);
    A addToSubjectAltName(int index, String item);
    A setToSubjectAltName(int index, String item);
    A addToSubjectAltName(String... items);
    A addAllToSubjectAltNames(Collection<String> items);
    A removeFromSubjectAltName(String... items);
    A removeAllFromSubjectAltNames(Collection<String> items);

    List<ServiceEntryEndpoint> getEndpoints();
    ServiceEntryEndpoint buildEndpoints(int index);
    List<ServiceEntryEndpoint> buildEndpoints();
    A withEndpoints(List<ServiceEntryEndpoint> items);
    A withEndpoints(ServiceEntryEndpoint... items);
    Boolean hasEndpoints();
    ServiceEntryEndpointNested<A> addNewEndpoints();
    ServiceEntryEndpointNested<A> setNewEndpointLike(ServiceEntryEndpoint item);
    ServiceEntryEndpointNested<A> setNewEndpointLike(int i , ServiceEntryEndpoint item);
    ServiceEntryEndpointNested<A> editFirstEndpoints();
    ServiceEntryEndpointNested<A> editLastEndpoints();
    ServiceEntryEndpointNested<A> editEndpoints(int i);
    A addNewEndpoints(ServiceEntryEndpoint specHttp);
    A setToEndpoints(int index, ServiceEntryEndpoint item);
    A addToEndpoints(int index, ServiceEntryEndpoint item);
    A addToEndpoints(ServiceEntryEndpoint... items);
    A addAllToEndpoints(Collection<ServiceEntryEndpoint> items);
    A removeFromEndpoints(ServiceEntryEndpoint... items);
    A removeAllFromEndpoints(Collection<ServiceEntryEndpoint> items);

    A withExportTo(String exportTo);
    String getExportTo();
    

    public interface ServiceEntryPortNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>, ServiceEntryPortFluent<ServiceEntryPortNested<N>> {
        public N and();    public N endPorts();
    }

    public interface ServiceEntryEndpointNested<N> extends io.fabric8.kubernetes.api.builder.Nested<N>, ServiceEntryEndpointFluent<ServiceEntryEndpointNested<N>> {
        public N and();    public N endEndpoints();
    }

}
