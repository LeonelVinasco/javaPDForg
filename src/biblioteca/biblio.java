package biblioteca;

import java.io.File;
import java.io.IOException; 
import org.apache.pdfbox.pdmodel.PDDocument;

import org.apache.pdfbox.pdmodel.PDDocument;
	import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
	import org.apache.pdfbox.pdmodel.PDDocumentInformation;
	import org.apache.pdfbox.pdmodel.common.PDMetadata;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.xmpbox.XMPMetadata;
	import org.apache.xmpbox.schema.AdobePDFSchema;
	import org.apache.xmpbox.schema.DublinCoreSchema;
	import org.apache.xmpbox.schema.XMPBasicSchema;
	import org.apache.xmpbox.xml.XmpSerializer;

	import java.io.ByteArrayOutputStream;
	import java.io.File;
	import java.io.IOException;
	import java.util.GregorianCalendar;
	import javax.xml.transform.TransformerException;


public class biblio {

	public static void main(String[] args) throws InvalidPasswordException, IOException{
		
		
		//la carpeta por defecto de los archivos en linux es la carpeta del proyecto
		File file = new File("Eclvs08-00.pdf");
		PDDocument document = PDDocument.load(file);
		
		//Probando la lectura del archivo pdf
		PDDocument document2 = new PDDocument();
		document2=document;
		document2.save("hola2.pdf");
		document2.close();
	   
	     
	      
		

	}

}
