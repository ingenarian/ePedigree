# ePedigree
ePedigree (electronic pedigree) is a Model-View-Controller (MVC) application architecture based on Java Standard Edition (JSE) 7 and Java Enterprise Edition (JEE) 6. It was part of a 2013-14 graduate research project to examine the pharmaceutical industry and supply chain application architectures that might comply to the United States Drug Quality and Security Act of 2013 (DQSA) Title II: Drug Supply Chain Security - https://www.congress.gov/bill/113th-congress/house-bill/3204. Please note that DQSA does not mandate the use of the EPCGlobal standard (defacto). Therefore, this application architecture is a loose implementation of the DQSA (Federal law), California ePedigree Law - http://www.pharmacy.ca.gov/laws_regs/e_pedigree_laws_summary.pdf, and EPCGlobal specifications.

Furthermore, ePedigree is a sub-system of a larger intelligent sensor and telemetry application. ePedigree development will continue with JaDE/WaDE frameworks based on IEEE-FIPA compliant smart agent specifications and Niagara and Sendona frameworks for building automation systems [warehouses & facilities], intelligent transportation systems (ITS), and smart cities.

To that end, there are four versions of the ePedigree application: stand-alone, client-server, jax-ws, and jax-rs. The stand-alone (SA) version is contained in the EPedigree_SA folder and it is based on JSE 7, the Abstract Window Toolkit (AWT), and java serialization for data persistence. The client-server (CS) version is contained in the EPedigree_CS folder and it is based on JSE 7 concurrency, sockets, and Spring. It creates an ePedigree email server and email client for sending ePedigree documents. In addition, SA and CS versions were developed with the Eclipse IDE

The jax-ws (WS) version is contained in the EPedigree_WS folder and it is based on JEE 6 SOAP, Servlet API (JSP), and Tomcat (TomEE) etc. The jax-rs (RS) version is in the EPedigree_RS (Restful Server) and EPedigree_RSC (Restful client) folders. It is uses Spring, Hibernate, and GlassFish to name a few. Furthermore versions CS, WS, and RS utilize MySQL database server for data persistence. Next version of ePedigree (WorkFlow Engine Agents) will use Object Storage Services via S3 and Swift APIs etc. Furthermore, WS and RS versions were developed with Netbeans IDE. 

The EPedigree.jar file is the run-time implementation of the SA version. The EPCIS.war file is the run-time implementation of the RS and RSC versions. Please note that the EPCIS logic is located in WEB-INF folder. The index.jsp was a test page. In addition, I have included several Portable Network Graphic (png) files containing screen-shots of different aspects of the ePedigree application achitecture (SA, CS, WS, and RS) in action.  

For more information, read the following reference material:

Application Description - EPedigree 1.0.0.pdf

Business & Interface Processing - Service Layer Design.pdf

E-Pedigree 1.0.0 Release Notes.pdf

Thomas Ishmael E-Pedigree 1.0.0 Design Document.pdf

Ishmael-Ingenarian OOSE (object-oriented software engineering)Principles.png

Ishmael-Ingenarian UML-Java.png

