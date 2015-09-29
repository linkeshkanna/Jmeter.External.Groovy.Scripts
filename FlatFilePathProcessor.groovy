import org.apache.commons.io.FilenameUtils;
import org.apache.jmeter.services.FileServer;

String subDirectory = args[0];
String testPlanFile = FileServer.getFileServer().getBaseDir().replace('\\', '/');
//String testPlanFileDir = FilenameUtils.getFullPathNoEndSeparator(testPlanFile).replace('\\', '/');

vars.put("testPlanFileDir", testPlanFile);

File folder = new File(testPlanFile + "/" + subDirectory + "/");
File[] listOfFiles = folder.listFiles();
int counter = 1;
for (File file : listOfFiles) {
    if (file.isFile()) {        
        vars.put(subDirectory + "_" + counter, testPlanFile + "/" + subDirectory + "/" + file.getName());
		vars.put("FileNames" + "_" + counter, file.getName());
    }
    counter++;
}