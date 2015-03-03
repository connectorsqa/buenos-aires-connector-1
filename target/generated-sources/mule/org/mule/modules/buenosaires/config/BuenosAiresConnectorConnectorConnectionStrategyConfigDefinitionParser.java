
package org.mule.modules.buenosaires.config;

import javax.annotation.Generated;
import org.mule.config.MuleManifest;
import org.mule.modules.buenosaires.adapters.BuenosAiresConnectorConnectorConnectionStrategyBasicAdapter;
import org.mule.modules.buenosaires.strategy.ConnectorConnectionStrategy;
import org.mule.security.oauth.config.AbstractDevkitBasedDefinitionParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.parsing.BeanDefinitionParsingException;
import org.springframework.beans.factory.parsing.Location;
import org.springframework.beans.factory.parsing.Problem;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0-M1-SNAPSHOT", date = "2015-03-03T12:04:30-03:00", comments = "Build UNNAMED.2382.137073f")
public class BuenosAiresConnectorConnectorConnectionStrategyConfigDefinitionParser
    extends AbstractDevkitBasedDefinitionParser
{

    private static Logger logger = LoggerFactory.getLogger(BuenosAiresConnectorConnectorConnectionStrategyConfigDefinitionParser.class);

    public BeanDefinition parse(Element element, ParserContext parserContext) {
        parseConfigName(element);
        BeanDefinitionBuilder builder = getBeanDefinitionBuilder(parserContext);
        builder.setScope(BeanDefinition.SCOPE_SINGLETON);
        parseProperty(builder, element, "myProperty", "myProperty");
        setInitMethodIfNeeded(builder, BuenosAiresConnectorConnectorConnectionStrategyBasicAdapter.class);
        setDestroyMethodIfNeeded(builder, BuenosAiresConnectorConnectorConnectionStrategyBasicAdapter.class);
        BeanDefinitionBuilder basicStrategyBuilder = BeanDefinitionBuilder.rootBeanDefinition(ConnectorConnectionStrategy.class.getName());
        parseProperty(basicStrategyBuilder, element, "myStrategyProperty", "myStrategyProperty");
        builder.addPropertyValue("connectionStrategy", basicStrategyBuilder.getBeanDefinition());
        BeanDefinition definition = builder.getBeanDefinition();
        setNoRecurseOnDefinition(definition);
        return definition;
    }

    private BeanDefinitionBuilder getBeanDefinitionBuilder(ParserContext parserContext) {
        try {
            return BeanDefinitionBuilder.rootBeanDefinition(BuenosAiresConnectorConnectorConnectionStrategyBasicAdapter.class.getName());
        } catch (NoClassDefFoundError noClassDefFoundError) {
            String muleVersion = "";
            try {
                muleVersion = MuleManifest.getProductVersion();
            } catch (Exception _x) {
                logger.error("Problem while reading mule version");
            }
            logger.error(("Cannot launch the mule app, the configuration [config-type] within the connector [buenos-aires] is not supported in mule "+ muleVersion));
            throw new BeanDefinitionParsingException(new Problem(("Cannot launch the mule app, the configuration [config-type] within the connector [buenos-aires] is not supported in mule "+ muleVersion), new Location(parserContext.getReaderContext().getResource()), null, noClassDefFoundError));
        }
    }

}
