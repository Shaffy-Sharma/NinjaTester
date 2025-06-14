package utilities;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class ConfigReader {
	private static Properties properties;
    private final static String propertyFilePath = ".\\config\\config.properties";
    private static Properties prop = new Properties();
	private String username;
	private String password;
	
    public String getusername() throws IOException {
    	prop.load(ConfigReader.class.getClassLoader().getResourceAsStream("configuration.properties"));
    	username = prop.getProperty("username");
    	return username;
    }
    	
    public String getpassword() throws IOException {
    	prop.load(ConfigReader.class.getClassLoader().getResourceAsStream("configuration.properties"));
    	password = prop.getProperty("password");
    	return password;
    }
    	
    public static void readConfig() throws Throwable {

        InputStream fis;
        fis = ConfigReader.class.getClassLoader().getResourceAsStream(propertyFilePath);
        properties = new Properties();
        if (fis == null) {
            throw new FileNotFoundException("Property file '" + propertyFilePath + "' not found in the classpath");
        }
        try {
            properties.load(fis);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // Browser Type
    public static String browserType() {
        String browser = properties.getProperty("browser");
        LoggerLoad.info("Get Browser Type from Properties");
        if (browser != null)
            return browser;
        else
            throw new RuntimeException("Browser Not Specified in Config.Properties file");
    }

    // Base URL
    public static String applicationUrl() {
        String url = properties.getProperty("baseurl");
        if (url != null)
            return url;
        else
            throw new RuntimeException("url not specified in the Config.properties file");
    }

    // HomePage URL
    public static String homePage() {
        String homePageurl = properties.getProperty("homepageurl");
        if (homePageurl != null)
            return homePageurl;
        else
            throw new RuntimeException("HomePageurl not specified in the Config.properties file");
    }

    // Signin URL
    public static String loginPage() {
        String loginurl = properties.getProperty("loginurl");
        if (loginurl != null)
            return loginurl;
        else
            throw new RuntimeException("login not specified in the Config.properties file");
    }

    // Registration URL
    public static String registerPageURL() {
        String registerurl = properties.getProperty("registerpageurl");
        if (registerurl != null)
            return registerurl;
        else
            throw new RuntimeException("registerpageurl not specified in the Config.properties file");
    }

    public static String getexcelfilepath() {
        String excelfilelpath = properties.getProperty("excelFilePath");
        if (excelfilelpath != null)
            return excelfilelpath;
        else
            throw new RuntimeException("Excel file path not specified in the Configuration.properties file.");
    }

    // Array
    public static String arrayPageURL() {
        String arrayPageurl = properties.getProperty("Arraypage");
        if (arrayPageurl != null)
            return arrayPageurl;
        else
            throw new RuntimeException("Array Page url not specified in the Configuration.properties file.");
    }

    // Array - Tryeditor
    public static String tryEditorURL() {
        String tryeditorurl = properties.getProperty("tryeditorurl");
        if (tryeditorurl != null)
            return tryeditorurl;
        else
            throw new RuntimeException("tryeditorurl not specified in the Configuration.properties file.");
    }

    public static String geturl(String pagename) {
        String url = properties.getProperty(pagename);
        if (url != null)
            return url;
        else
            throw new RuntimeException(pagename + " url not specified in the Configuration.properties file.");
    }

    // Linked list
    public static String getLinkedListUrl() {
        String linkedlisturl = properties.getProperty("linkedlisturl");
        if (linkedlisturl != null)
            return linkedlisturl;
        else
            throw new RuntimeException("linked list url not specified in the Configuration.properties file.");
    }

    // Stack
    public static String getStackUrl() {
        String stackurl = properties.getProperty("stackurl");
        if (stackurl != null)
            return stackurl;
        else
            throw new RuntimeException("stack url not specified in the Configuration.properties file.");
    }

    public static String tryURL(String pagename) {
        String url = properties.getProperty(pagename);
        if (url != null)
            return url;
        else
            throw new RuntimeException(pagename + "url not specified in the Configuration.properties file.");
    }

    // Queue
    public static String getQueueUrl() {
        String queueurl = properties.getProperty("queueurl");
        if (queueurl != null)
            return queueurl;
        else
            throw new RuntimeException("queue url is not specified in the Configuration.properties file.");
    }

    public static String getQPracQuesUrl() {
        String qpracquesurl = properties.getProperty("qpracquesurl");
        if (qpracquesurl != null)
            return qpracquesurl;
        else
            throw new RuntimeException(
                    "Queue Practice Questions url is not specified in the Configuration.properties file.");
    }

    public static String getImpOfQPythonUrl() {
        String impofqpythonurl = properties.getProperty("impofqpythonurl");
        if (impofqpythonurl != null)
            return impofqpythonurl;
        else
            throw new RuntimeException(
                    "Implementation of Queue in Python url is not specified in the Configuration.properties file.");
    }

    public static String getEditorUrl() {
        String editorurl = properties.getProperty("editorurl");
        if (editorurl != null)
            return editorurl;
        else
            throw new RuntimeException("Editor url is not specified in the Configuration.properties file.");
    }

    public static String getImpCollDQUrl() {
        String impcolldqurl = properties.getProperty("impcolldqurl");
        if (impcolldqurl != null)
            return impcolldqurl;
        else
            throw new RuntimeException(
                    "Implementation using collections deque url is not specified in the Configuration.properties file.");
    }

    public static String getImpUsingArrayUrl() {
        String impusingarray = properties.getProperty("impusingarrayurl");
        if (impusingarray != null)
            return impusingarray;
        else
            throw new RuntimeException(
                    "Implementation using array url is not specified in the Configuration.properties file.");
    }

    // Graph
    public static String getGraphUrl() {
        String graphurl = properties.getProperty("graphurl");
        if (graphurl != null)
            return graphurl;
        else
            throw new RuntimeException("graph url is not specified in the Configuration.properties file.");
    }

    public static String getGraphGraphUrl() {
        String graphgraphurl = properties.getProperty("graphgraphurl");
        if (graphgraphurl != null)
            return graphgraphurl;
        else
            throw new RuntimeException("graphgraph url is not specified in the Configuration.properties file.");
    }

    public static String getGraphRepresentationsUrl() {
        String graphrepresentationsurl = properties.getProperty("graphrepresentationsurl");
        if (graphrepresentationsurl != null)
            return graphrepresentationsurl;
        else
            throw new RuntimeException(
                    "graphrepresentations url is not specified in the Configuration.properties file.");
    }


    public static void setBrowserType(String browser) {
        System.out.println("----------------------------Setting browser type to: " + browser);
        properties.setProperty("browser", browser);
    }

    // Tree
    public static String getTreeUrl() {
        String treeUrl = properties.getProperty("tree");
        if (treeUrl != null && !treeUrl.trim().isEmpty())
            return treeUrl.trim();
        else
            throw new RuntimeException("Tree url not specified in the Configuration.properties file.");
    }

    public static String getOverviewOfTreesUrl(){
        String overviewOfTreeUrl = properties.getProperty("overviewOfTrees");
        if(overviewOfTreeUrl!=null && !overviewOfTreeUrl.trim().isEmpty())
            return overviewOfTreeUrl.trim();
        else
            throw new RuntimeException("OverviewOfTrees url not specified in the Configuration.properties file.");
    }

    public static String getTerminologiesUrl(){
        String terminologiesUrl = properties.getProperty("terminologies");
        if(terminologiesUrl!=null && !terminologiesUrl.trim().isEmpty())
            return terminologiesUrl.trim();
        else
            throw new RuntimeException("Terminologies url not specified in the Configuration.properties file.");
    }

    public static String getTypesOfTreesUrl(){
        String typesOfTreesUrl = properties.getProperty("typesOfTrees");
        if(typesOfTreesUrl!=null && !typesOfTreesUrl.trim().isEmpty())
            return typesOfTreesUrl.trim();
        else
            throw new RuntimeException("Types Of Trees url not specified in the Configuration.properties file.");
    }

    public static String getTreeTraversalsUrl(){
        String treeTraversalsUrl = properties.getProperty("treeTraversals");
        if(treeTraversalsUrl!=null && !treeTraversalsUrl.trim().isEmpty())
            return treeTraversalsUrl.trim();
        else
            throw new RuntimeException("Tree Traversals url not specified in the Configuration.properties file.");
    }

    public static String getTraversalsIllustrationUrl(){
        String traversalsIllustrationUrl = properties.getProperty("traversalsIllustration");
        if(traversalsIllustrationUrl!=null && !traversalsIllustrationUrl.trim().isEmpty())
            return traversalsIllustrationUrl.trim();
        else
            throw new RuntimeException("Traversals Illustration url not specified in the Configuration.properties file.");
    }

    public static String getBinaryTreesUrl(){
        String binaryTreesUrl = properties.getProperty("binaryTrees");
        if(binaryTreesUrl!=null && !binaryTreesUrl.trim().isEmpty())
            return binaryTreesUrl.trim();
        else
            throw new RuntimeException("Binary trees url not specified in the Configuration.properties file.");
    }

    public static String getTypesOfBinaryTreesUrl(){
        String typesOfBinaryTreesUrl = properties.getProperty("typesOfBinaryTrees");
        if(typesOfBinaryTreesUrl!=null && !typesOfBinaryTreesUrl.trim().isEmpty())
            return typesOfBinaryTreesUrl.trim();
        else
            throw new RuntimeException("Types of binary trees url not specified in the Configuration.properties file.");
    }

    public static String getImplementationInPythonUrl(){
        String implementationInPythonUrl = properties.getProperty("implementationInPython");
        if(implementationInPythonUrl!=null && !implementationInPythonUrl.trim().isEmpty())
            return implementationInPythonUrl.trim();
        else
            throw new RuntimeException("Types Of binary trees url not specified in the Configuration.properties file.");
    }

    public static String getBinaryTreeTraversalsUrl(){
        String binaryTreeTraversalsUrl = properties.getProperty("binaryTreeTraversals");
        if(binaryTreeTraversalsUrl!=null && !binaryTreeTraversalsUrl.trim().isEmpty())
            return binaryTreeTraversalsUrl.trim();
        else
            throw new RuntimeException("Binary tree traversals url not specified in the Configuration.properties file.");
    }

    public static String getImplementationOfBinaryTreesUrl(){
        String implementationOfBinaryTreesUrl = properties.getProperty("implementationOfBinaryTrees");
        if(implementationOfBinaryTreesUrl!=null && !implementationOfBinaryTreesUrl.trim().isEmpty())
            return implementationOfBinaryTreesUrl.trim();
        else
            throw new RuntimeException("Implementation of binary trees url not specified in the Configuration.properties file.");
    }

    public static String getApplicationsOfBinaryTreesUrl(){
        String applicationsOfBinaryTreesUrl = properties.getProperty("applicationsOfBinaryTrees");
        if(applicationsOfBinaryTreesUrl!=null && !applicationsOfBinaryTreesUrl.trim().isEmpty())
            return applicationsOfBinaryTreesUrl.trim();
        else
            throw new RuntimeException("Applications of binary trees url not specified in the Configuration.properties file.");
    }

    public static String getBinarySearchTreesUrl(){
        String binarySearchTreesUrl = properties.getProperty("binarySearchTrees");
        if(binarySearchTreesUrl!=null && !binarySearchTreesUrl.trim().isEmpty())
            return binarySearchTreesUrl.trim();
        else
            throw new RuntimeException("Binary search trees url not specified in the Configuration.properties file.");
    }

    public static String getImplementationOfBSTUrl(){
        String implementationOfBSTUrl = properties.getProperty("implementationOfBST");
        if(implementationOfBSTUrl!=null && !implementationOfBSTUrl.trim().isEmpty())
            return implementationOfBSTUrl.trim();
        else
            throw new RuntimeException("Implementation of BST url not specified in the Configuration.properties file.");
    }
}

