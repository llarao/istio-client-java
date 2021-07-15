package com.istio.model.serviceentry;

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
import java.util.Map;

/**
 * @Classname VirtualService
 * @Description TODO
 * @Date 2020/10/17 0017 10:14
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
public class ServiceEntryEndpoint implements KubernetesResource {
    /**
     * 必填字段,标识网络后端地址
     */
    private List<String> address;

    /**
     * 端口
     */
    private Map<String, Integer> ports;

    /**
     * 后端的标签
     */
    private Map<String, String> labels;

    /**
     * istio1.1版本后的新增配置,支持相同network的应用可以直接互相访问
     */
    private String network;

    /**
     * 亲和性路由
     */
    private String locality;

    /**
     * 权重
     */
    private Integer weight;


}
