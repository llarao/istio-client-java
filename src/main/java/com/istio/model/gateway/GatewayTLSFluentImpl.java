package com.istio.model.gateway;


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
public class GatewayTLSFluentImpl<A extends GatewayTLSFluent<A>> extends io.fabric8.kubernetes.api.builder.BaseFluent<A> implements GatewayTLSFluent<A> {
    private Boolean      httpsRedirect;
    private String       mode;
    private String       serverCertificate;
    private String       privateKey;
    private List<String> caCertificates;
    private String       credentialName;
    private List<String> subjectAltNames;
    private String       minProtocolVersion;
    private String       maxProtocolVersion;
    private String       cipherSuites;

    public GatewayTLSFluentImpl(){
    }
    public GatewayTLSFluentImpl(GatewayTLS instance){
        this.withHttpsRedirect(instance.getHttpsRedirect());
        this.withMode(instance.getMode());
        this.withServerCertificate(instance.getServerCertificate());
        this.withPrivateKey(instance.getPrivateKey());
        this.withCaCertificates(instance.getCaCertificates());
        this.withSubjectAltNames(instance.getSubjectAltNames());
        this.withMinProtocolVersion(instance.getMinProtocolVersion());
        this.withMaxProtocolVersion(instance.getMaxProtocolVersion());
        this.withCipherSuites(instance.getCipherSuites());
    }


    @Override
    public A withHttpsRedirect(Boolean item) {
        this.httpsRedirect = item;
        return (A)this;
    }

    @Override
    public Boolean getHttpsRedirect() {
        return this.httpsRedirect;
    }

    @Override
    public A withMode(String item) {
        this.mode = item;
        return (A)this;

    }

    @Override
    public String getMode() {
        return this.mode;
    }

    @Override
    public A withServerCertificate(String item) {
        this.serverCertificate = item;
        return (A)this;

    }

    @Override
    public String getServerCertificate() {
        return this.serverCertificate;
    }

    @Override
    public A withPrivateKey(String item) {
        this.privateKey = item;
        return (A)this;

    }

    @Override
    public String getPrivateKey() {
        return this.privateKey;
    }

    @Override
    public List<String> getCaCertificates() {

        return this.caCertificates==null?new ArrayList<>():this.caCertificates;

    }

    @Override
    public List<String> buildCaCertificates() {
        return this.caCertificates==null?new ArrayList<>():this.caCertificates;
    }

    @Override
    public String buildCaCertificates(int index) {
        return this.caCertificates.get(index);
    }

    @Override
    public A withCaCertificates(List<String> items) {
        if (items!=null) {
            this.caCertificates = items;
        }
        return (A)this;    }

    @Override
    public A withCaCertificates(String... items) {
        if (this.caCertificates==null) {
            this.caCertificates = new ArrayList<>();
        }
        if (items!=null) {
            this.caCertificates.addAll(Arrays.asList(items));
        }
        return (A)this;    }

    @Override
    public Boolean hasCaCertificates() {
        return this.caCertificates != null;
    }

    @Override
    public A addNewCaCertificate(String specHttp) {
        if (this.caCertificates == null) {
            this.caCertificates = new ArrayList<>();
        }
        return (A)this;
    }

    @Override
    public A addToCaCertificate(int index, String item) {
        if (this.caCertificates == null) {
            this.caCertificates = new ArrayList<>();
        }
        this.caCertificates.add(index, item);
        return (A)this;
    }

    @Override
    public A setToCaCertificate(int index, String item) {
        if (this.caCertificates==null) {
            this.caCertificates = new ArrayList<>();
        }
        if (this.caCertificates.size() >= index) {
            this.caCertificates.set(index, item);
        } else {
            this.caCertificates.add(item);
        }
        return (A)this;
    }

    @Override
    public A addToCaCertificates(String... items) {
        if (this.caCertificates == null) {
            this.caCertificates = new ArrayList<>();
        }

        this.caCertificates.addAll(Arrays.asList(items));
        return (A)this;
    }

    @Override
    public A addAllToCaCertificates(Collection<String> items) {
        if (this.caCertificates == null) {
            this.caCertificates = new ArrayList<>();
        }

        this.caCertificates.addAll(items);
        return (A)this;
    }

    @Override
    public A removeFromCaCertificates(String... items) {
        if (this.caCertificates == null) {
            this.caCertificates = new ArrayList<>();
        }
        for (String item : items) {
            this.caCertificates.remove(item);
        }
        return (A)this;
    }

    @Override
    public A removeAllFromCaCertificates(Collection<String> items) {
        if (this.caCertificates == null) {
            this.caCertificates = new ArrayList<>();
        }
        for (String item : items) {
            this.caCertificates.remove(item);
        }
        return (A)this;
    }

    @Override
    public A withCredentialName(String item) {
        this.credentialName = item;
        return (A)this;
    }

    @Override
    public String getCredentialName() {
        return this.credentialName;
    }

    @Override
    public List<String> getSubjectAltNames() {
        return this.subjectAltNames==null?new ArrayList<>():this.subjectAltNames;
    }

    @Override
    public List<String> buildSubjectAltNames() {
        return this.subjectAltNames==null?new ArrayList<>():this.subjectAltNames;
    }

    @Override
    public String buildSubjectAltNames(int index) {
        return this.subjectAltNames.get(index);
    }

    @Override
    public A withSubjectAltNames(List<String> items) {
        if (items!=null) {
            this.subjectAltNames = items;
        }
        return (A)this;
    }

    @Override
    public A withSubjectAltNames(String... items) {
        if (this.subjectAltNames==null) {
            this.subjectAltNames = new ArrayList<>();
        }
        if (items!=null) {
            this.subjectAltNames.addAll(Arrays.asList(items));
        }
        return (A)this;
    }

    @Override
    public Boolean hasSubjectAltNames() {
        return this.subjectAltNames != null;
    }

    @Override
    public A addNewSubjectAltName(String specHttp) {
        if (this.subjectAltNames == null) {
            this.subjectAltNames = new ArrayList<>();
        }
        return (A)this;
    }

    @Override
    public A addToSubjectAltName(int index, String item) {
        if (this.subjectAltNames == null) {
            this.subjectAltNames = new ArrayList<>();
        }
        this.subjectAltNames.add(index, item);
        return (A)this;
    }

    @Override
    public A setToSubjectAltName(int index, String item) {
        if (this.subjectAltNames==null) {
            this.subjectAltNames = new ArrayList<>();
        }
        if (this.subjectAltNames.size() >= index) {
            this.subjectAltNames.set(index, item);
        } else {
            this.subjectAltNames.add(item);
        }
        return (A)this;
    }

    @Override
    public A addToSubjectAltName(String... items) {
        if (this.subjectAltNames == null) {
            this.subjectAltNames = new ArrayList<>();
        }

        this.subjectAltNames.addAll(Arrays.asList(items));
        return (A)this;
    }

    @Override
    public A addAllToSubjectAltNames(Collection<String> items) {
        if (this.subjectAltNames == null) {
            this.subjectAltNames = new ArrayList<>();
        }

        this.subjectAltNames.addAll(items);
        return (A)this;
    }

    @Override
    public A removeFromSubjectAltName(String... items) {
        if (this.subjectAltNames == null) {
            this.subjectAltNames = new ArrayList<>();
        }
        for (String item : items) {
            this.subjectAltNames.remove(item);
        }
        return (A)this;
    }

    @Override
    public A removeAllFromSubjectAltNames(Collection<String> items) {
        if (this.subjectAltNames == null) {
            this.subjectAltNames = new ArrayList<>();
        }
        for (String item : items) {
            this.subjectAltNames.remove(item);
        }
        return (A)this;
    }

    @Override
    public A withMinProtocolVersion(String item) {
        this.minProtocolVersion = item;
        return (A)this;
    }

    @Override
    public String getMinProtocolVersion() {
        return this.minProtocolVersion;
    }

    @Override
    public A withMaxProtocolVersion(String item) {
        this.maxProtocolVersion = item;
        return (A)this;

    }

    @Override
    public String getMaxProtocolVersion() {
        return this.maxProtocolVersion;
    }

    @Override
    public A withCipherSuites(String item) {
        this.cipherSuites = item;
        return (A)this;

    }

    @Override
    public String getCipherSuites() {
        return this.cipherSuites;
    }
}
