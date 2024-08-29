/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfName;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Achinthya Dulshan
 */
public class PdfGenerate {
    
    public static void main(String[] args) {
        try {
            String fileName = "D:\\Projects\\COST Project\\MedicalCenterManagementSystem\\src\\pdfs\\test.pdf";
            
            Document doc = new Document(PageSize.A4);

            PdfWriter.getInstance(doc,new FileOutputStream(fileName));
            float twoCol = 285f;
            float twoCol150 = twoCol+150f;
            float twoColumnWidth[]={twoCol150,twoCol};
            doc.open();
            
            
            Paragraph para = new Paragraph("Hello World!");
            doc.add(para);
            doc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PdfGenerate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(PdfGenerate.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("done");
    }
}
