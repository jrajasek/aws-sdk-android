/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticloadbalancing.model;

/**
 * <p>
 * The Listener data type.
 * </p>
 */
public class Listener {

    /**
     * Specifies the LoadBalancer transport protocol to use for routing - TCP
     * or HTTP. This property cannot be modified for the life of the
     * LoadBalancer.
     */
    private String protocol;

    /**
     * Specifies the external LoadBalancer port number. This property cannot
     * be modified for the life of the LoadBalancer.
     */
    private Integer loadBalancerPort;

    private String instanceProtocol;

    /**
     * Specifies the TCP port on which the instance server is listening. This
     * property cannot be modified for the life of the LoadBalancer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     */
    private Integer instancePort;

    /**
     * The ID of the SSL certificate chain to use. For more information on
     * SSL certificates, see <a
     * ervices.com/IAM/latest/UserGuide/index.html?ManagingCredentials.html">
     * Managing Keys and Certificates </a> in the AWS Identity and Access
     * Management documentation.
     */
    private String sSLCertificateId;

    /**
     * Default constructor for a new Listener object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public Listener() {}
    
    /**
     * Constructs a new Listener object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param protocol Specifies the LoadBalancer transport protocol to use
     * for routing - TCP or HTTP. This property cannot be modified for the
     * life of the LoadBalancer.
     * @param loadBalancerPort Specifies the external LoadBalancer port
     * number. This property cannot be modified for the life of the
     * LoadBalancer.
     * @param instancePort Specifies the TCP port on which the instance
     * server is listening. This property cannot be modified for the life of
     * the LoadBalancer.
     */
    public Listener(String protocol, Integer loadBalancerPort, Integer instancePort) {
        this.protocol = protocol;
        this.loadBalancerPort = loadBalancerPort;
        this.instancePort = instancePort;
    }
    
    /**
     * Specifies the LoadBalancer transport protocol to use for routing - TCP
     * or HTTP. This property cannot be modified for the life of the
     * LoadBalancer.
     *
     * @return Specifies the LoadBalancer transport protocol to use for routing - TCP
     *         or HTTP. This property cannot be modified for the life of the
     *         LoadBalancer.
     */
    public String getProtocol() {
        return protocol;
    }
    
    /**
     * Specifies the LoadBalancer transport protocol to use for routing - TCP
     * or HTTP. This property cannot be modified for the life of the
     * LoadBalancer.
     *
     * @param protocol Specifies the LoadBalancer transport protocol to use for routing - TCP
     *         or HTTP. This property cannot be modified for the life of the
     *         LoadBalancer.
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }
    
    /**
     * Specifies the LoadBalancer transport protocol to use for routing - TCP
     * or HTTP. This property cannot be modified for the life of the
     * LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param protocol Specifies the LoadBalancer transport protocol to use for routing - TCP
     *         or HTTP. This property cannot be modified for the life of the
     *         LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Listener withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    
    
    /**
     * Specifies the external LoadBalancer port number. This property cannot
     * be modified for the life of the LoadBalancer.
     *
     * @return Specifies the external LoadBalancer port number. This property cannot
     *         be modified for the life of the LoadBalancer.
     */
    public Integer getLoadBalancerPort() {
        return loadBalancerPort;
    }
    
    /**
     * Specifies the external LoadBalancer port number. This property cannot
     * be modified for the life of the LoadBalancer.
     *
     * @param loadBalancerPort Specifies the external LoadBalancer port number. This property cannot
     *         be modified for the life of the LoadBalancer.
     */
    public void setLoadBalancerPort(Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
    }
    
    /**
     * Specifies the external LoadBalancer port number. This property cannot
     * be modified for the life of the LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerPort Specifies the external LoadBalancer port number. This property cannot
     *         be modified for the life of the LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Listener withLoadBalancerPort(Integer loadBalancerPort) {
        this.loadBalancerPort = loadBalancerPort;
        return this;
    }
    
    
    /**
     * Returns the value of the InstanceProtocol property for this object.
     *
     * @return The value of the InstanceProtocol property for this object.
     */
    public String getInstanceProtocol() {
        return instanceProtocol;
    }
    
    /**
     * Sets the value of the InstanceProtocol property for this object.
     *
     * @param instanceProtocol The new value for the InstanceProtocol property for this object.
     */
    public void setInstanceProtocol(String instanceProtocol) {
        this.instanceProtocol = instanceProtocol;
    }
    
    /**
     * Sets the value of the InstanceProtocol property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceProtocol The new value for the InstanceProtocol property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Listener withInstanceProtocol(String instanceProtocol) {
        this.instanceProtocol = instanceProtocol;
        return this;
    }
    
    
    /**
     * Specifies the TCP port on which the instance server is listening. This
     * property cannot be modified for the life of the LoadBalancer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @return Specifies the TCP port on which the instance server is listening. This
     *         property cannot be modified for the life of the LoadBalancer.
     */
    public Integer getInstancePort() {
        return instancePort;
    }
    
    /**
     * Specifies the TCP port on which the instance server is listening. This
     * property cannot be modified for the life of the LoadBalancer.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @param instancePort Specifies the TCP port on which the instance server is listening. This
     *         property cannot be modified for the life of the LoadBalancer.
     */
    public void setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
    }
    
    /**
     * Specifies the TCP port on which the instance server is listening. This
     * property cannot be modified for the life of the LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 65535<br/>
     *
     * @param instancePort Specifies the TCP port on which the instance server is listening. This
     *         property cannot be modified for the life of the LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Listener withInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
        return this;
    }
    
    
    /**
     * The ID of the SSL certificate chain to use. For more information on
     * SSL certificates, see <a
     * ervices.com/IAM/latest/UserGuide/index.html?ManagingCredentials.html">
     * Managing Keys and Certificates </a> in the AWS Identity and Access
     * Management documentation.
     *
     * @return The ID of the SSL certificate chain to use. For more information on
     *         SSL certificates, see <a
     *         ervices.com/IAM/latest/UserGuide/index.html?ManagingCredentials.html">
     *         Managing Keys and Certificates </a> in the AWS Identity and Access
     *         Management documentation.
     */
    public String getSSLCertificateId() {
        return sSLCertificateId;
    }
    
    /**
     * The ID of the SSL certificate chain to use. For more information on
     * SSL certificates, see <a
     * ervices.com/IAM/latest/UserGuide/index.html?ManagingCredentials.html">
     * Managing Keys and Certificates </a> in the AWS Identity and Access
     * Management documentation.
     *
     * @param sSLCertificateId The ID of the SSL certificate chain to use. For more information on
     *         SSL certificates, see <a
     *         ervices.com/IAM/latest/UserGuide/index.html?ManagingCredentials.html">
     *         Managing Keys and Certificates </a> in the AWS Identity and Access
     *         Management documentation.
     */
    public void setSSLCertificateId(String sSLCertificateId) {
        this.sSLCertificateId = sSLCertificateId;
    }
    
    /**
     * The ID of the SSL certificate chain to use. For more information on
     * SSL certificates, see <a
     * ervices.com/IAM/latest/UserGuide/index.html?ManagingCredentials.html">
     * Managing Keys and Certificates </a> in the AWS Identity and Access
     * Management documentation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sSLCertificateId The ID of the SSL certificate chain to use. For more information on
     *         SSL certificates, see <a
     *         ervices.com/IAM/latest/UserGuide/index.html?ManagingCredentials.html">
     *         Managing Keys and Certificates </a> in the AWS Identity and Access
     *         Management documentation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Listener withSSLCertificateId(String sSLCertificateId) {
        this.sSLCertificateId = sSLCertificateId;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append("Protocol: " + protocol + ", ");
        sb.append("LoadBalancerPort: " + loadBalancerPort + ", ");
        sb.append("InstanceProtocol: " + instanceProtocol + ", ");
        sb.append("InstancePort: " + instancePort + ", ");
        sb.append("SSLCertificateId: " + sSLCertificateId + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    