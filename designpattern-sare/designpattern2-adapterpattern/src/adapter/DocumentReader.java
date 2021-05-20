package adapter;

import util.UtilMsg;

public class DocumentReader implements IDocumentReader {
   DocumentAdapter documentAdapter;

   public void read(String fileName) {
      // built-in support to read text files
      if (fileName.endsWith(".txt")) {
         System.out.println("Reading text file: " + fileName);
      }
      // documentAdapter is providing support to read other file formats
      else if (fileName.endsWith(".pdf") || fileName.endsWith(".docx")
      // || fileName.endsWith(".pptx")
      ) {
         documentAdapter = new DocumentAdapter(fileName);
         documentAdapter.read(fileName);
      } else {
         System.out.println("Invalid file: " + fileName);
         UtilMsg.doShowMessageBox("Invalid file: " + fileName);
      }
   }
}