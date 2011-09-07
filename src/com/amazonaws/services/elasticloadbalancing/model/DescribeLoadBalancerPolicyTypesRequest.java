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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#describeLoadBalancerPolicyTypes(DescribeLoadBalancerPolicyTypesRequest) DescribeLoadBalancerPolicyTypes operation}.
 * 
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#describeLoadBalancerPolicyTypes(DescribeLoadBalancerPolicyTypesRequest)
 */
public class DescribeLoadBalancerPolicyTypesRequest extends AmazonWebServiceRequest {

    private java.util.List<String> policyTypeNames;

    /**
     * Returns the value of the PolicyTypeNames property for this object.
     *
     * @return The value of the PolicyTypeNames property for this object.
     */
    public java.util.List<String> getPolicyTypeNames() {
        if (policyTypeNames == null) {
            policyTypeNames = new java.util.ArrayList<String>();
        }
        return policyTypeNames;
    }
    
    /**
     * Sets the value of the PolicyTypeNames property for this object.
     *
     * @param policyTypeNames The new value for the PolicyTypeNames property for this object.
     */
    public void setPolicyTypeNames(java.util.Collection<String> policyTypeNames) {
        java.util.List<String> policyTypeNamesCopy = new java.util.ArrayList<String>();
        if (policyTypeNames != null) {
            policyTypeNamesCopy.addAll(policyTypeNames);
        }
        this.policyTypeNames = policyTypeNamesCopy;
    }
    
    /**
     * Sets the value of the PolicyTypeNames property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyTypeNames The new value for the PolicyTypeNames property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeLoadBalancerPolicyTypesRequest withPolicyTypeNames(String... policyTypeNames) {
        for (String value : policyTypeNames) {
            getPolicyTypeNames().add(value);
        }
        return this;
    }
    
    /**
     * Sets the value of the PolicyTypeNames property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param policyTypeNames The new value for the PolicyTypeNames property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeLoadBalancerPolicyTypesRequest withPolicyTypeNames(java.util.Collection<String> policyTypeNames) {
        java.util.List<String> policyTypeNamesCopy = new java.util.ArrayList<String>();
        if (policyTypeNames != null) {
            policyTypeNamesCopy.addAll(policyTypeNames);
        }
        this.policyTypeNames = policyTypeNamesCopy;

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
        sb.append("PolicyTypeNames: " + policyTypeNames + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    