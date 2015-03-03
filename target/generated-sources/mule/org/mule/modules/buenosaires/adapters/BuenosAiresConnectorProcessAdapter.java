
package org.mule.modules.buenosaires.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.modules.buenosaires.BuenosAiresConnector;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * A <code>BuenosAiresConnectorProcessAdapter</code> is a wrapper around {@link BuenosAiresConnector } that enables custom processing strategies.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.0-M1-SNAPSHOT", date = "2015-03-03T12:04:30-03:00", comments = "Build UNNAMED.2382.137073f")
public class BuenosAiresConnectorProcessAdapter
    extends BuenosAiresConnectorLifecycleInjectionAdapter
    implements ProcessAdapter<BuenosAiresConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, BuenosAiresConnectorCapabilitiesAdapter> getProcessTemplate() {
        final BuenosAiresConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,BuenosAiresConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, BuenosAiresConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, BuenosAiresConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
