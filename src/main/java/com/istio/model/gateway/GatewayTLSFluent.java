package com.istio.model.gateway;

import io.fabric8.kubernetes.api.builder.Fluent;

import java.util.Collection;
import java.util.List;

/**
 * @Classname VirtualServiceFluent
 * @Description TODO
 * @Date 2020/10/17 0017 10:21
 * @Create by llarao
 */
public interface GatewayTLSFluent<A extends GatewayTLSFluent<A>> extends Fluent<A> {

    A withHttpsRedirect(Boolean item);
    Boolean getHttpsRedirect();

    A withMode(String item);
    String getMode();

    A withServerCertificate(String item);
    String getServerCertificate();

    A withPrivateKey(String item);
    String getPrivateKey();

    List<String> getCaCertificates();
    List<String> buildCaCertificates();
    String buildCaCertificates(int index);
    A withCaCertificates(List<String> items);
    A withCaCertificates(String... items);
    Boolean hasCaCertificates();
    A addNewCaCertificate(String specHttp);
    A addToCaCertificate(int index, String item);
    A setToCaCertificate(int index, String item);
    A addToCaCertificates(String... items);
    A addAllToCaCertificates(Collection<String> items);
    A removeFromCaCertificates(String... items);
    A removeAllFromCaCertificates(Collection<String> items);
    
    
    A withCredentialName(String item);
    String getCredentialName();

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

    A withMinProtocolVersion(String item);
    String getMinProtocolVersion();

    A withMaxProtocolVersion(String item);
    String getMaxProtocolVersion();

    A withCipherSuites(String item);
    String getCipherSuites();






}
