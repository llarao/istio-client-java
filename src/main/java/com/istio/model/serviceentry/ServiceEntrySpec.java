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
public class ServiceEntrySpec implements KubernetesResource {

    /**
     * 必填字段,标识与ServiceEntry关联的主机名 ,可以是一个DNS域名
     */
    private List<String> hosts;

    /**
     * 与服务关联的IP地址
     */
    private List<String> addresses;

    /**
     * 与外部服务关联的端口,是一个必选字段
     */
    private List<ServiceEntryPort> ports;

    /**
     * 设置服务在网格内部还是外部,可以取MESH_EXTERNAL\MESH_INTERNAL两种模式
     */
    private String location;

    private String resolution;

    private List<String> subjectAltNames;

    private List<ServiceEntryEndpoint> endpoints;

    /**
     * 标识该服务是否能被其他命名空间可见,只支持"."或"*" ,"."代表只有当前命名空间下可见.
     */
    private String exportTo;
}
