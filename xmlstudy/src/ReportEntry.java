import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReportEntry {

	public static void main(String[] args) {
		String str1 = "INPUT";
		String str2 = "ERROR";
		String val = null;
		int u=0;
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(new File("Report.xml"));
			document.getDocumentElement().normalize();
			System.out.println("Root element: "+ document.getDocumentElement().getNodeName());
			if (document.hasChildNodes())   
			{  
			printNodeList(document.getChildNodes());  
			}  
			}   
			catch (Exception e)  
			{  
			System.out.println(e.getMessage());  
			}  
//			Node reportEntry = document.getElementsByTagName("TranslationReport");
		//	System.out.println("ReportEntry Section: " + reportEntry.getAttribute("TranslationReport"));
//			for (int i = 1; i < reportEntryList.getLength(); i++) {
//				Node reportentry = reportEntryList.item(i);
//				if (reportentry.getNodeType() == Node.ELEMENT_NODE) {
//					Element reportEntryElement = (Element) reportentry;
//					System.out.println("ReportEntry Section: " + reportEntryElement.getAttribute("Section"));
//					NodeList reportEntryDetails = reportentry.getChildNodes();
//					for (int j = 1; j < reportEntryDetails.getLength(); j++) {
//						Node detail = reportEntryDetails.item(j);
//						if (detail.getNodeType() == Node.ELEMENT_NODE) {
//							Element detailElement = (Element) detail;
//							System.out.println(
//									"     " + detailElement.getTagName() + ": " + detailElement.getAttribute("value"));
//							list.add(detailElement.getAttribute("value"));
//							
//						}
//					}
//					if(u==0)
//					{
//						first(list);
//						list.clear();
//					}
//					if(u==1)
//					{
//						first2(list);
//						list.clear();
//					}
//					if(u==2)
//					{
//						first3(list);
//						list.clear();
//					}
//					if(u==3)
//					{
//						first3(list);
//						list.clear();
//					}}
//				u++;
//
//			}
//			
//		} catch (ParserConfigurationException e) {
//			e.printStackTrace();
//		} catch (SAXException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	}

//	private static void first3(ArrayList<String> l) {
//		// TODO Auto-generated method stub
//		System.out.println("\nThere is an error in the input at "+l.get(2) +"th line "+l.get(4)+"nd position and the Block Name is "+l.get(3));
//		System.out.println("More details:\nType of the error : " + l.get(1)+"\n");
//
//	}
//
//	private static void first2(ArrayList<String> l) {
//		// TODO Auto-generated method stub
//		System.out.println("\nThere is an error in the input at "+l.get(2) +"th line and the Block Name is "+l.get(3));
//		System.out.println("More details:\nType of the error : " + l.get(1)+"\n");
//         }
//
//	private static void first(ArrayList l) {
//		// TODO Auto-generated method stub
//		System.out.println("\nThere is an error in the input at "+l.get(2) +"th line "+l.get(4)+"nd position and the Block Name is "+l.get(3));
//		System.out.println("More details:\nType of the error : " + l.get(1)+"\nError spotted :  "+l.get(5)+"\n");
//
//	}

private static void printNodeList(NodeList nodeList)  
{  
	ArrayList<String> list = new ArrayList<String>();
for (int count = 0; count < nodeList.getLength(); count++)   
{  
Node elemNode = nodeList.item(count);
System.out.println(elemNode.getTextContent());

//if (elemNode.getNodeType() == Node.ELEMENT_NODE)   
//{  
//// get node name and value  
//System.out.println("\nNode Name =" + elemNode.getNodeName());  
//
////System.out.println("Node Content =" + elemNode.getTextContent());
//
////list.add(elemNode.getTextContent());
//}  
}
//ArrayList<String> list1 = new ArrayList<String>();
//int num=0;
//
//     System.out.println(list.get(0));
     //System.out.println("33333333333333333333333333333333333333333");
    // break;     


//	if(list.get(i).equals("Report Entry")) {
//		System.out.println(num++);
//         list1.add(i);
//	}
    // Print all elements of ArrayList
   // System.out.println(list);
   
//}

}}

   //list.add();
//if (elemNode.hasAttributes())  
//{  
//NamedNodeMap nodeMap = elemNode.getAttributes();  
//for (int i = 0; i < nodeMap.getLength(); i++)   
//{  
//Node node = nodeMap.item(i);  
//System.out.println("attr name : " + node.getNodeName());  
//System.out.println("attr value : " + node.getNodeValue());  
//}  
//}  
//if (elemNode.hasChildNodes())   
//{  
////recursive call if the node has child nodes  
//printNodeList(elemNode.getChildNodes());  
//}  
//System.out.println("Node Name =" + elemNode.getNodeName()+ " [CLOSE]");  
//}  

