# ePedigree
ePedigree (electronic pedigree) is a Model-View-Controller (MVC) application architecture based on Java Standard Edition (JSE) 7 and Java Enterprise Edition (JEE) 6. It was part of a 2013-14 graduate research project to examine the pharmaceutical industry and supply chain application architectures that might comply to the United States Drug Quality and Security Act of 2013 (DQSA) Title II: Drug Supply Chain Security - https://www.congress.gov/bill/113th-congress/house-bill/3204 by moving from a basic ePedgree application to an EPCIS application.


To that end, there are two versions of the ePedigree application: stand-alone and client-server. The stand-alone (SA) version is contained in the EPedigree_SA folder and it is based on JSE 7, the Abstract Window Toolkit (AWT), and java serialization for data persistence. The client-server (CS) version is contained in the EPedigree_CS folder and it is based on JSE 7 concurrency, sockets, and Spring. It creates an ePedigree email server and email client for sending ePedigree documents. In addition, SA and CS versions were developed with the Eclipse IDE.  

