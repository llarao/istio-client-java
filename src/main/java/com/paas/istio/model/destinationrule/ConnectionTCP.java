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
public class ConnectionTCP implements KubernetesResource {
    /**
     * 最大等待连接数
     */
    private Integer maxConnections;

    /**
     * 超时时间
     */
    private Integer connecTimeout;

    /**
     * 存活性检查探测配置
     */
    private TcpKeepalive tcpKeepalive;

}
