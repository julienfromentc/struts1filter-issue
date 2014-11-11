struts1filter-issue
===================

Sample application to reproduce [issue 1](https://github.com/rgielen/struts1filter/issues/1) when [this filter](https://github.com/rgielen/struts1filter/tree/develop) is used.

The ParamWrapperFilter in already in the project (copied as is). Futhermore, I have also included a `ParamWrapperFilterOld` class that removes the `getParameterNames` override (as it was in the original filter). Simply change to web.xml file to swith between filters.

To reproduce the issue navigate to the application (ie http://localhost:8080/sample), enter anything in the form and press submit; you should get the following error:
````
java.lang.NullPointerException
  java.lang.Class.isAssignableFrom(Native Method)
  org.apache.struts.util.RequestUtils.rationalizeMultipleFileProperty(RequestUtils.java:506)
  org.apache.struts.util.RequestUtils.populate(RequestUtils.java:459)
  org.apache.struts.chain.commands.servlet.PopulateActionForm.populate(PopulateActionForm.java:50)
  org.apache.struts.chain.commands.AbstractPopulateActionForm.execute(AbstractPopulateActionForm.java:60)
  org.apache.struts.chain.commands.ActionCommandBase.execute(ActionCommandBase.java:51)
  org.apache.commons.chain.impl.ChainBase.execute(ChainBase.java:191)
  org.apache.commons.chain.generic.LookupCommand.execute(LookupCommand.java:305)
  org.apache.commons.chain.impl.ChainBase.execute(ChainBase.java:191)
  org.apache.struts.chain.ComposableRequestProcessor.process(ComposableRequestProcessor.java:283)
  org.apache.struts.action.ActionServlet.process(ActionServlet.java:1913)
  org.apache.struts.action.ActionServlet.doPost(ActionServlet.java:462)
  javax.servlet.http.HttpServlet.service(HttpServlet.java:641)
  javax.servlet.http.HttpServlet.service(HttpServlet.java:722)
  org.apache.struts.chain.commands.servlet.PerformForward.handleAsForward(PerformForward.java:113)
  org.apache.struts.chain.commands.servlet.PerformForward.perform(PerformForward.java:96)
  org.apache.struts.chain.commands.AbstractPerformForward.execute(AbstractPerformForward.java:54)
  org.apache.struts.chain.commands.ActionCommandBase.execute(ActionCommandBase.java:51)
  org.apache.commons.chain.impl.ChainBase.execute(ChainBase.java:191)
  org.apache.commons.chain.generic.LookupCommand.execute(LookupCommand.java:305)
  org.apache.commons.chain.impl.ChainBase.execute(ChainBase.java:191)
  org.apache.struts.chain.ComposableRequestProcessor.process(ComposableRequestProcessor.java:283)
  org.apache.struts.action.ActionServlet.process(ActionServlet.java:1913)
  org.apache.struts.action.ActionServlet.doPost(ActionServlet.java:462)
  javax.servlet.http.HttpServlet.service(HttpServlet.java:641)
  javax.servlet.http.HttpServlet.service(HttpServlet.java:722)
  org.apache.struts.chain.commands.servlet.PerformForward.handleAsForward(PerformForward.java:113)
  org.apache.struts.chain.commands.servlet.PerformForward.perform(PerformForward.java:96)
  org.apache.struts.chain.commands.AbstractPerformForward.execute(AbstractPerformForward.java:54)
  org.apache.struts.chain.commands.ActionCommandBase.execute(ActionCommandBase.java:51)
  org.apache.commons.chain.impl.ChainBase.execute(ChainBase.java:191)
  org.apache.commons.chain.generic.LookupCommand.execute(LookupCommand.java:305)
  org.apache.commons.chain.impl.ChainBase.execute(ChainBase.java:191)
  org.apache.struts.chain.ComposableRequestProcessor.process(ComposableRequestProcessor.java:283)
  org.apache.struts.action.ActionServlet.process(ActionServlet.java:1913)
  org.apache.struts.action.ActionServlet.doPost(ActionServlet.java:462)
  javax.servlet.http.HttpServlet.service(HttpServlet.java:641)
  javax.servlet.http.HttpServlet.service(HttpServlet.java:722)
  de.rgielen.struts1.filter.ParamWrapperFilter.doFilter(ParamWrapperFilter.java:73)
````

Running the application:
===================
This sample application expects to have a Apache Tomcat 7.0.X installation located at C:/tomcat in order to compile.
The application can be run with ecipse, with a Tomcat 7 server


TODO:
===================
  - Remove compile time dependency on local Tomcat jars
  - migrate the project to be built with maven (remove jars from repo)



