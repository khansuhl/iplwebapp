import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class AddImageAbsolutePosition {

	public static void main(String[] args) throws DocumentException, MalformedURLException, IOException {
		Document document = new Document();
		PdfWriter.getInstance(document, new FileOutputStream("/home/bridgeit/Downloads/sample1.pdf"));
		document.open();
		Image img = Image.getInstance("/home/bridgeit/Downloads/edit.gif");
		img.setAbsolutePosition(100, 500);
		document.add(new Paragraph("Sample 1: This is simple image demo."));
		document.add(img);
		document.close();
		System.out.println("Done");
	}
}
