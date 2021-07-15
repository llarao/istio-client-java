package com.istio.model.destinationrule;

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
 * @Classname TrafficPolicy
 * @Description TODO
 * @Date 2020/10/6 0006 10:07
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
public class TrafficPolicy implements KubernetesResource {
    /**
     * 负载均衡策略,支持 ROUND_ROBIN(轮循)\LEAST_CONN(最小连接数)\RANDOM(随机)\PASSTHROUGH(不做负载)
     */
    private LoadBalancer loadBalancer;

    /**
     * 连接池配置
     */
    private ConnectionPool connectionPool;

    /**
     * 熔断配置
     */
    private OutlierDetection outlierDetection;


    /**
     * 端口特殊配置(支持为端口配置trafficPolicy中支持的能力)
     */
    private List<PortLevelSetting> portLevelSettings;

}
