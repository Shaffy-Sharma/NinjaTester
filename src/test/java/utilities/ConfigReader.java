package utilities;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class ConfigReader {
    private static Properties properties = new Properties();

    public static void readConfig() throws Throwable {

        InputStream fis;
        fis = ConfigReader.class.getClassLoader().getResourceAsStream("config/config.properties");
        properties = new Properties();
        if (fis == null) {
            throw new FileNotFoundException("Property file not found in the classpath");
        }
        try {
            properties.load(fis);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//        public String getPropertyKey(String key) throws IOException {
//        prop.load(ConfigReader.class.getClassLoader().getResourceAsStream("configuration.properties"));
//        String kvalue = prop.getProperty(key);
//        return kvalue;
//    }

    // Get a property from config file
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }

    // Set a property in the properties object
    public static void setProperty(String key, String value) {
        properties.setProperty(key, value);
    }


    // Browser Type
    public static String getBrowserType() {
        String browser = properties.getProperty("browser");
        LoggerLoad.info("Get Browser Type from Properties");
        if (browser != null)
            return browser;
        else
            throw new RuntimeException("Browser Not Specified in Config.Properties file");
    }

    public static void setBrowserType(String browser) {
        System.out.println("----------------------------Setting browser type to: " + browser);
        properties.setProperty("browser", browser);
    }

    public static String baseUrl() {
        String url = getProperty("baseurl");
        if (url != null) return url;
        throw new RuntimeException("baseurl not specified in config.properties");
    }

    public static String getexcelfilepath() {
        String excelfilelpath = properties.getProperty("excelFilePath");
        if (excelfilelpath != null)
            return excelfilelpath;
        else
            throw new RuntimeException("Excel file path not specified in the Configuration.properties file.");
    }

    // Base URL
//    public static String applicationUrl() {
//        String url = properties.getProperty("baseurl");
//        if (url != null)
//            return url;
//        else
//            throw new RuntimeException("url not specified in the Config.properties file");
//    }
//
//    // HomePage URL
//    public static String homePage() {
//        String homePageurl = properties.getProperty("homepageurl");
//        if (homePageurl != null)
//            return homePageurl;
//        else
//            throw new RuntimeException("HomePageurl not specified in the Config.properties file");
//    }
//
//    // Signin URL
//    public static String loginPage() {
//        String loginurlFP = properties.getProperty("loginurl");
//        if (loginurlFP != null)
//            return loginurlFP;
//        else
//            throw new RuntimeException("login not specified in the Config.properties file");
//    }
//
//    // Registration URL
//    public static String registerPageURL() {
//        String registerurl = properties.getProperty("registerpageurl");
//        if (registerurl != null)
//            return registerurl;
//        else
//            throw new RuntimeException("registerpageurl not specified in the Config.properties file");
//    }
//
//
//    // Array
//    public static String arrayPageURL() {
//        String arrayPageurl = properties.getProperty("Arraypage");
//        if (arrayPageurl != null)
//            return arrayPageurl;
//        else
//            throw new RuntimeException("Array Page url not specified in the Configuration.properties file.");
//    }
//
//    // Array - Tryeditor
//    public static String tryEditorURL() {
//        String tryeditorurl = properties.getProperty("tryeditorurl");
//        if (tryeditorurl != null)
//            return tryeditorurl;
//        else
//            throw new RuntimeException("tryeditorurl not specified in the Configuration.properties file.");
//    }
//
//    public static String geturl(String pagename) {
//        String url = properties.getProperty(pagename);
//        if (url != null)
//            return url;
//        else
//            throw new RuntimeException(pagename + " url not specified in the Configuration.properties file.");
//    }
//
//    // Linked list
//    public static String getLinkedListUrl() {
//        String linkedlisturl = properties.getProperty("linkedlisturl");
//        if (linkedlisturl != null)
//            return linkedlisturl;
//        else
//            throw new RuntimeException("linked list url not specified in the Configuration.properties file.");
//    }
//
//    // Stack
//    public static String getStackUrl() {
//        String stackurl = properties.getProperty("stackurl");
//        if (stackurl != null)
//            return stackurl;
//        else
//            throw new RuntimeException("stack url not specified in the Configuration.properties file.");
//    }
//
//    public static String tryURL(String pagename) {
//        String url = properties.getProperty(pagename);
//        if (url != null)
//            return url;
//        else
//            throw new RuntimeException(pagename + "url not specified in the Configuration.properties file.");
//    }
//
//    // Queue
//    public static String getQueueUrl() {
//        String queueurl = properties.getProperty("queueurl");
//        if (queueurl != null)
//            return queueurl;
//        else
//            throw new RuntimeException("queue url is not specified in the Configuration.properties file.");
//    }
//
//    public static String getQPracQuesUrl() {
//        String qpracquesurl = properties.getProperty("qpracquesurl");
//        if (qpracquesurl != null)
//            return qpracquesurl;
//        else
//            throw new RuntimeException(
//                    "Queue Practice Questions url is not specified in the Configuration.properties file.");
//    }
//
//    public static String getImpOfQPythonUrl() {
//        String impofqpythonurl = properties.getProperty("impofqpythonurl");
//        if (impofqpythonurl != null)
//            return impofqpythonurl;
//        else
//            throw new RuntimeException(
//                    "Implementation of Queue in Python url is not specified in the Configuration.properties file.");
//    }
//
//    public static String getEditorUrl() {
//        String editorurl = properties.getProperty("editorurl");
//        if (editorurl != null)
//            return editorurl;
//        else
//            throw new RuntimeException("Editor url is not specified in the Configuration.properties file.");
//    }
//
//    public static String getImpCollDQUrl() {
//        String impcolldqurl = properties.getProperty("impcolldqurl");
//        if (impcolldqurl != null)
//            return impcolldqurl;
//        else
//            throw new RuntimeException(
//                    "Implementation using collections deque url is not specified in the Configuration.properties file.");
//    }
//
//    public static String getImpUsingArrayUrl() {
//        String impusingarray = properties.getProperty("impusingarrayurl");
//        if (impusingarray != null)
//            return impusingarray;
//        else
//            throw new RuntimeException(
//                    "Implementation using array url is not specified in the Configuration.properties file.");
//    }
//
//    // Graph
//    public static String getGraphUrl() {
//        String graphurl = properties.getProperty("graphurl");
//        if (graphurl != null)
//            return graphurl;
//        else
//            throw new RuntimeException("graph url is not specified in the Configuration.properties file.");
//    }
//
//    public static String getGraphGraphUrl() {
//        String graphgraphurl = properties.getProperty("graphgraphurl");
//        if (graphgraphurl != null)
//            return graphgraphurl;
//        else
//            throw new RuntimeException("graphgraph url is not specified in the Configuration.properties file.");
//    }
//
//    public static String getGraphRepresentationsUrl() {
//        String graphrepresentationsurl = properties.getProperty("graphrepresentationsurl");
//        if (graphrepresentationsurl != null)
//            return graphrepresentationsurl;
//        else
//            throw new RuntimeException(
//                    "graphrepresentations url is not specified in the Configuration.properties file.");
//    }
//
//
}