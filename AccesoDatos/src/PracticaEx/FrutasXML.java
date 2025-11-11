package PracticaEx;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;

public class FrutasXML {
    public static void main(String[] args) {
        try {
            File ficheroXML = new File("frutas.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder docB = dbf.newDocumentBuilder();
            Document doc = docB.parse(ficheroXML);
            doc.getDocumentElement().normalize();
            NodeList lista = doc.getElementsByTagName("fruta");
            int cantidad = lista.getLength();
            System.out.println("Cantidad de frutas: " + cantidad + "\n");
            
            for (int i = 0; i < cantidad; i++) {
                Node nodo = lista.item(i);
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element fruta = (Element) nodo;

                    String nombre = fruta.getElementsByTagName("nombre").item(0).getTextContent();
                    String tipo = fruta.getElementsByTagName("tipo").item(0).getTextContent();
                    String color = fruta.getElementsByTagName("color").item(0).getTextContent();
                    String origen = fruta.getElementsByTagName("origen").item(0).getTextContent();
                    String precio = fruta.getElementsByTagName("precio").item(0).getTextContent();
                    String temporada = fruta.getElementsByTagName("temporada").item(0).getTextContent();

                    System.out.println("Fruta: " + nombre+"Tipo: " + tipo+"Color: " +color+"Origen: "+origen+"Precio: " +precio+"Temporada: "+temporada);
                  
                    NodeList nutrientes = fruta.getElementsByTagName("nutriente");
                    System.out.print("Nutrientes: ");
                    for (int j = 0; j < nutrientes.getLength(); j++) {
                        System.out.print(nutrientes.item(j).getTextContent());
                        if (j < nutrientes.getLength() - 1) System.out.print(", ");
                    }
                   
                }
            }

            
            double valor = 1.5;

            System.out.println("\nFrutas con precio mayor que " + valor + ":");
            for (int i = 0; i < cantidad; i++) {
                Element fruta = (Element) lista.item(i);
                double precio = Double.parseDouble(fruta.getElementsByTagName("precio").item(0).getTextContent());
                if (precio > valor) {
                    String nombre = fruta.getElementsByTagName("nombre").item(0).getTextContent();
                    System.out.println(nombre + precio);
                }
            }

            System.out.println("\nFrutas con precio igual a " + valor + ":");
            for (int i = 0; i < cantidad; i++) {
                Element fruta = (Element) lista.item(i);
                double precio = Double.parseDouble(fruta.getElementsByTagName("precio").item(0).getTextContent());
                if (precio == valor) {
                    String nombre = fruta.getElementsByTagName("nombre").item(0).getTextContent();
                    System.out.println(nombre + precio);
                }
            }

            System.out.println("\nFrutas con precio menor que " + valor + ":");
            for (int i = 0; i < cantidad; i++) {
                Element fruta = (Element) lista.item(i);
                double precio = Double.parseDouble(fruta.getElementsByTagName("precio").item(0).getTextContent());
                if (precio < valor) {
                    String nombre = fruta.getElementsByTagName("nombre").item(0).getTextContent();
                    System.out.println(nombre + precio );
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
