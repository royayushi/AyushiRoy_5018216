package FactoryMethod_P2;

public class FactoryMethodTest {
    public static void main(String[] args) {
        // Creating a factory for each document type
        DocumentFactory wordFactory = new WordDocumentFactory();
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        DocumentFactory excelFactory = new ExcelDocumentFactory();

        // Creating and opening documents using the factories
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();
        
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();
        
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
    }
}
