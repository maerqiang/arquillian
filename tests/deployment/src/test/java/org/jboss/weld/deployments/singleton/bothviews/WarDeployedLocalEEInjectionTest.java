package org.jboss.weld.deployments.singleton.bothviews;

import org.jboss.arquillian.api.Deployment;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.weld.deployments.beans.LocalI;
import org.jboss.weld.deployments.beans.RemoteI;
import org.jboss.weld.deployments.beans.singleton.BothViewsSingletonEJB;

public class WarDeployedLocalEEInjectionTest extends LocalEEInjectionTest
{

   @Deployment
   public static JavaArchive assemble()
   {
      return createCDIArchive(LocalEEInjectionTest.class, BothViewsSingletonEJB.class, RemoteI.class, LocalI.class);
   }

}
