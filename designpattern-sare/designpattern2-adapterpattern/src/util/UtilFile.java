package util;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

public class UtilFile {

   @Test
   public void testReadPDF() {
      System.out.println(readPDF("mypdf.pdf"));
   }

   public static String readPDF(String filePath) {
      String result = null;

      try (PDDocument document = PDDocument.load(new File(filePath))) {
         document.getClass();
         if (!document.isEncrypted()) {
            PDFTextStripperByArea stripper = new PDFTextStripperByArea();
            stripper.setSortByPosition(true);
            PDFTextStripper tStripper = new PDFTextStripper();
            result = tStripper.getText(document);
            // String lines[] = result.split("\\r?\\n");
            // for (String line : lines) {
            // System.out.println(line);
            // }
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
      return result;
   }

   @Test
   public void testReadDoc() {
      System.out.println(readDOC("mymsword.docx"));
   }

   public static String readDOC(String filePath) {
      String result = null;
      try {
         FileInputStream fis = new FileInputStream(filePath);
         XWPFDocument xdoc = new XWPFDocument(OPCPackage.open(fis));
         XWPFWordExtractor extractor = new XWPFWordExtractor(xdoc);
         result = extractor.getText();
         extractor.close();
      } catch (Exception ex) {
         ex.printStackTrace();
      }
      return result;
   }

   public void readDocFile() {
      File docFile = null;
      WordExtractor docExtractor = null;
      try {
         docFile = new File("mymsword.doc");
         FileInputStream fis = new FileInputStream(docFile.getAbsolutePath());
         HWPFDocument doc = new HWPFDocument(fis);
         docExtractor = new WordExtractor(doc);
      } catch (Exception exep) {
         System.out.println(exep.getMessage());
      }

      String[] docArray = docExtractor.getParagraphText();
      for (int i = 0; i < docArray.length; i++) {
         if (docArray[i] != null)
            System.out.println("Line " + i + " : " + docArray[i]);
      }
   }
}
