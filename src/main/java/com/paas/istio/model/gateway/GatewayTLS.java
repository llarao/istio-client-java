package com.paas.istio.model.gateway;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.fabric8.kubernetes.api.model.KubernetesResource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.List;

/**
 * @Classname GatewaySpec
 * @Description TODO
 * @Date 2020/10/9 0009 9:56
 * @Create by llarao
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "apiVersion",
        "kind",
        "metadata",
        "spec",
        "status"
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Data
public class GatewayTLS implements KubernetesResource {

    /**
     * 是否要做重定向,当该配置启动时 负载均衡器会为所有的HTTP连接都发送一个301的重定向,要求使用HTTPS
     */
    private Boolean httpsRedirect;

    /**
     * 使用的TLS模式,支持PASSTHROUGH\SIMPLE\MUTUAL\AUTO_PASSTHROUGH四种模式
     */
    private String mode;

    /**
     * 服务端证书的路径,当使用SIMPLE\MUTUAL模式时必须指定
     */
    private String serverCertificate;


    /**
     * 服务端私钥路径,当使用SIMPLE\MUTUAL模式时必须指定
     */
    private String privateKey;

    /**
     * CA证书路径当使用MUTUAL模式时必须指定
     */
    private List<String> caCertificates;

    /**
     * istio1.1之后的特性,用于唯一标识服务端证书和密钥
     */
    private String credentialName;

    /**
     * SAN列表,允许一个证书指定多个域名
     */
    private List<String> subjectAltNames;

    /**
     * TLS最小协议版本
     */
    private String minProtocolVersion;

    /**
     * TLS最大协议版本
     */
    private String maxProtocolVersion;

    /**
     * 指定的加密套件,默认使用Envoy支持的加密套件
     */
    private String cipherSuites;



    
}
