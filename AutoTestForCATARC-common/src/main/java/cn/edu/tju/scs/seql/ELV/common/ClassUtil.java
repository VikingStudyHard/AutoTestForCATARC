package cn.edu.tju.scs.seql.ELV.common;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Vector;

public class ClassUtil {
    public static Vector<Vector<String>> getStepDesc(String xmlPath) {
        try {
            File f = new File(xmlPath);
            Scanner cin = new Scanner(new FileInputStream(f));
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(f);
            Element rootElement = doc.getDocumentElement();
            NodeList nl = rootElement.getChildNodes();
            Node childNode = null;
            for (int i = 0; i < nl.getLength(); i++) {
                childNode = nl.item(i);
                if (childNode.getNodeType() == Node.ELEMENT_NODE
                        && childNode.getNodeName() == "rows") {
                    break;
                }
            }
            NodeList rowList = childNode.getChildNodes();
            Vector<Vector<String>> idAndStep = new Vector<>();
            for (int i = 0; i < rowList.getLength(); i++) {
                Node row = rowList.item(i);
                Vector<String> vec = new Vector<>();
                if (row.getNodeType() == Node.ELEMENT_NODE
                        && row.getNodeName() == "row") {
                    NodeList rowContentList = row.getChildNodes();
                    String id = null, stepDesc = null, stepExpect = null;
                    for (int j = 0; j < rowContentList.getLength(); j++) {
                        Node rowContent = rowContentList.item(j);
                        if (rowContent.getNodeType() == Node.ELEMENT_NODE && rowContent.getNodeName() == "id") {
                            Node node = rowContent.getFirstChild();
                            if (node == null) {
                                id = "";
                            } else {
                                id = node.getNodeValue();
                            }
                        }
                        if (rowContent.getNodeType() == Node.ELEMENT_NODE && rowContent.getNodeName() == "stepDesc") {
                            Node node = rowContent.getFirstChild();
                            if (node == null) {
                                stepDesc = "";
                            } else {
                                stepDesc = node.getNodeValue().replaceAll("\\n", " ").replaceAll("<br />", "\n");
                            }
                        }
                        if (rowContent.getNodeType() == Node.ELEMENT_NODE && rowContent.getNodeName() == "stepExpect") {
                            Node node = rowContent.getFirstChild();
                            if (node == null) {
                                stepExpect = "";
                            } else {
                                stepExpect = node.getNodeValue().replaceAll("\\n", " ").replaceAll("<br />", "\n");
                            }
                        }
                    }
                    vec.add(id);
                    vec.add(stepDesc);
                    vec.add(stepExpect);
                    idAndStep.add(vec);
                }
            }
            return idAndStep;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Vector<Vector<String>> formatStep(Vector<Vector<String>> idAndStep) {
        Vector<Vector<String>> result = new Vector<>();
        for (int i = 0; i < idAndStep.size(); i++) {
            Vector<String> ele = idAndStep.get(i);
            String[] stepDescArray=ele.get(1).split("\n");
            String[] stepExpectArray = ele.get(2).split("\n");
            String step = "";
            for(int j=0;j<stepDescArray.length;j++){
                step+=stepDescArray[j]+"\n";
                step+=stepExpectArray[j]+"\n";
            }
            Vector<String> oneStep = new Vector<>();
            oneStep.add(ele.get(0));
            oneStep.add(step);
            result.add(oneStep);
        }
        return result;
    }

    public static void main(String[] args){
        Vector<Vector<String>> steps = ClassUtil.formatStep(ClassUtil.getStepDesc("E:\\project\\ELV_LIMS_Function_Test\\AutoTestForCATARC-ELV\\auto_ELV_Test_Cases.xml"));
        for (int i=0;i<steps.size();i++){
            Vector<String> ele = steps.get(i);
            System.out.println(ele.get(0));
            System.out.println(ele.get(1));
        }
    }
}
