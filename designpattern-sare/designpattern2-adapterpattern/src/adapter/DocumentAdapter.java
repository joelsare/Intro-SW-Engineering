package adapter;

import adaptee.AdvancedDocumentReader;
import adaptee.MSWordReader;
import adaptee.PDFReader;
//import adaptee.PPTXReader;

public class DocumentAdapter implements IDocumentReader {
   AdvancedDocumentReader advancedDocumentReader;

   public DocumentAdapter(String fileName) {
      if (fileName.endsWith(".pdf")) {
         advancedDocumentReader = new PDFReader();
      } else if (fileName.endsWith(".docx")) {
         advancedDocumentReader = new MSWordReader();
      }
      // else if (fileName.endsWith(".pptx")) {
      // advancedDocumentReader = new PPTXReader();
      // }
   }

   public void read(String fileName) {
      if (fileName.endsWith(".pdf")) {
         advancedDocumentReader.readPDF(fileName);
      } else if (fileName.endsWith(".docx")) {
         advancedDocumentReader.readMSWord(fileName);
      }
      // else if (fileName.endsWith(".pptx")) {
      // advancedDocumentReader.readPPTX(fileName);
      // }
   }
}