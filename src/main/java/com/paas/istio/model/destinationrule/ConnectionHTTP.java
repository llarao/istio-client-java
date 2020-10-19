package com.paas.istio.model.destinationrule;

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

/**
 * 版本一暂不接入TCP流量管理
 * @Classname ConnectionTCP
 * @Description TODO
 * @Date 2020/10/6 0006 10:23
 * @Create by llarao
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "apiVersion",
        "kind",
        "metadata",
})
@JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@ToString
@EqualsAndHashCode
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConnectionHTTP implements KubernetesResource {
    /**
     * 最大等待http请求数,默认1024,只支持http/1.1的服务.http/2协议的请求会在到来时立即复用连接不需要等待
     */
    private Integer http1MaxPendingRequests;

    /**
     * 最大http请求数,默认是1024,支持持http/2的服务
     */
    private Integer http2MaxRequests;

    /**
     * 每个连接的最大请求数,如果不配置默认不限制,如果配置了1,则表示每个连接只处理一个请求,也就是禁用了keep-alive
     */
    private Integer maxRequestsPerConnection;

    /**
     * 最大重试次数,默认为3
     */
    private Integer maxRetries;

    /**
     * 空闲时间关闭连接
     */
    private String idleTimeout;
}
