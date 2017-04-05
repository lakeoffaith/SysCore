package com.ijoy.interceptor;


import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.saaj.SAAJInInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.NodeList;

public class LoginInterceptor extends AbstractPhaseInterceptor<SoapMessage> {
	private SAAJInInterceptor saa=new SAAJInInterceptor();
	public LoginInterceptor() {
		super(Phase.PRE_PROTOCOL);
		getAfter().add(SAAJInInterceptor.class.getName());
		
	}
	public void handleMessage(SoapMessage message) throws Fault {
		SOAPMessage soapMsg=message.getContent(SOAPMessage.class);
		if(soapMsg==null){
			saa.handleMessage(message);
			soapMsg=message.getContent(SOAPMessage.class);
		}
		SOAPHeader head=null;
		try {
			head=soapMsg.getSOAPHeader();
		} catch (SOAPException e) {
			
			e.printStackTrace();
		}
		if(head==null){
			return;
		}
		
		NodeList nodes = head.getElementsByTagName("tns:spId");
		  NodeList nodepass = head.getElementsByTagName("tns:spPassword");
		  if (nodes.item(0).getTextContent().indexOf("wang") != -1) {
		   if (nodepass.item(0).getTextContent().equals("can")) {
		    System.out.println("认证成功");
		   }
		  } else {
		   SOAPException soapExc = new SOAPException("认证错误");
		   throw new Fault(soapExc);
		  }
	}
}
