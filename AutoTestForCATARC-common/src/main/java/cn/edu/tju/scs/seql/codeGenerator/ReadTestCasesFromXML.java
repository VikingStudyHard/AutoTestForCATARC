package cn.edu.tju.scs.seql.codeGenerator;

import java.io.File;
import java.io.FileInputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

//import junit.framework.TestCase;

public class ReadTestCasesFromXML {

    private String xmlPath = "auto_ELV_Test_Cases.xml";
    private List<TestCasePojo> testCaseList;

    public ReadTestCasesFromXML() {
        super();
        analyseXML();
    }

    public ReadTestCasesFromXML(String xmlPath) {
        super();
        this.xmlPath = xmlPath;
        analyseXML();
    }

    public void analyseXML(){
        try{
            File f = new File(this.xmlPath);//new File("ELV_test_cases.xml");
            Scanner cin = new Scanner(new FileInputStream(f));
//			while(cin.hasNext()){
//				System.out.println(cin.nextLine());
//			}
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(f);
            Element rootElement = doc.getDocumentElement();
            //NodeList nl = doc.getElementsByTagName("suite");
            NodeList nl = rootElement.getChildNodes();
            for(int i = 0;i < nl.getLength();i++){
                Node childNode = nl.item(i);
                if(childNode.getNodeType() == Node.ELEMENT_NODE
                        && childNode.getNodeName()=="fields"){
                    analyseField(childNode);
                }
                if(childNode.getNodeType() == Node.ELEMENT_NODE
                        && childNode.getNodeName() == "rows"){
                    analyseRows(childNode);
                }

            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public List<TestCasePojo> analyseRows(Node rows){
        testCaseList = new LinkedList<TestCasePojo>();
        NodeList rowList = rows.getChildNodes();
        for(int i = 0;i < rowList.getLength();i++){
            Node row = rowList.item(i);
            if(row.getNodeType() == Node.ELEMENT_NODE
                    && row.getNodeName()=="row"){
                NodeList rowContentList = row.getChildNodes();
                List<String> list = new LinkedList<String>();
                for(int j = 0;j < rowContentList.getLength();j++){
                    Node rowContent = rowContentList.item(j);
                    if(rowContent.getNodeType() == Node.ELEMENT_NODE){
                        Node node = rowContent.getFirstChild();
                        if(node == null){
                            list.add("");
                        }else{
                            list.add(node.getNodeValue());
                        }
                    }
                }
                TestCasePojo testCase = new TestCasePojo(list);
                testCaseList.add(testCase);
            }
        }
        return testCaseList;
    }

    public void analyseField(Node fieldNode){
        NodeList fields = fieldNode.getChildNodes();
        for(int index = 0;index < fields.getLength();index++){
            Node node = fields.item(index);
            if(node.getNodeType() == Node.ELEMENT_NODE){
//				System.out.println(node.getNodeName());
//				System.out.println(node.getFirstChild().getNodeValue());
            }

        }
    }


    public List<TestCasePojo> getTestCaseList() {
        return testCaseList;
    }

    public static void main(String[] args) {
        ReadTestCasesFromXML main = new ReadTestCasesFromXML();
        List<TestCasePojo> list = main.getTestCaseList();
        for(int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }

    }

}
