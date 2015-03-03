/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under the terms of the CPAL v1.0 license,
 * a copy of which has been included with this distribution in the LICENSE.md file.
 */

package org.mule.modules.buenosaires.strategy;


import org.mule.api.annotations.components.Configuration;
import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.param.Default;

/**
 * Configuration type Strategy
 *
 * @author MuleSoft, Inc.
 */
@Configuration(configElementName = "config-type", friendlyName = "Configuration type strategy")
public class ConnectorConnectionStrategy
{
	
	public ConnectorConnectionStrategy(){
		client = "hola";
	}

    /**
     * Configurable
     */
    @Configurable
    @Default("value")
    private String myStrategyProperty;
    
    private String client;
    
    /**
     * Set strategy property
     *
     * @param myStrategyProperty my strategy property
     */
    public void setMyStrategyProperty(String myStrategyProperty) {
        this.myStrategyProperty = myStrategyProperty;
    }

    /**
    /**
     * Get property
     */
    public String getMyStrategyProperty() {
        return this.myStrategyProperty;
    }

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

}