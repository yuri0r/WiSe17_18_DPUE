import rechnerAufgabe4.jaxb.*;

import javax.xml.bind.*;
import java.io.File;

public class rechnerAufgabe4 {

    public static void main(String[] args){

        JAXBContext context = null;
        Unmarshaller unmarshaller = null;
        Rechnungen rechnungen= null;
        String text1;
        String text2;
        String text3;
        String name1;
        String nettoBetrag;
        String waehrung;
        String telefon;
        String name2;
        String zahlungsArt;

        try {
            context = JAXBContext.newInstance("rechnerAufgabe4.jaxb");
            unmarshaller = context.createUnmarshaller();
            rechnungen = (Rechnungen) JAXBIntrospector.getValue(unmarshaller.unmarshal(new File("src/RechnerAufgabe4.xml")));

        } catch (JAXBException e) {
            e.printStackTrace();
        }


        for (Rechnung rechnung: rechnungen.getRechnung()) {

            name1 = rechnung.getAnschriftDesLeistungsEmpfaengers().getNameLeistungsEmpfaenger().getVorname() +
                    " " +
                    rechnung.getAnschriftDesLeistungsEmpfaengers().getNameLeistungsEmpfaenger().getNachname();

            name2 = rechnung.getAnschriftDesLeistendenUnternehmers().getNameUnternehmen();
            nettoBetrag = rechnung.getEntgelt().getNettoBetrag().toString();
            waehrung = rechnung.getVerwendeteWaehrung();

            Bankverbindung bank = rechnung.getBezahlMoeglichkeiten().getBankverbindung();

            zahlungsArt = bank.getBank() + bank.getBic() + bank.getBlz() + bank.getKontoNr();

            text1 = String.format(
                    "%s\n" +
                            "Bitte zahlen Sie endlich den geforderten Betrag\n" +
                            "von %s %s auf das Konto\n" +
                            "%s ein.\n"
                            ,name1,nettoBetrag,waehrung,zahlungsArt);

            if (rechnung.getAnschriftDesLeistendenUnternehmers().getTelefonNummer() == null) {
                telefon = "";
                text2 = "";
            } else {
                telefon = rechnung.getAnschriftDesLeistendenUnternehmers().getTelefonNummer().toString();
            }
            text2 = String.format(
                    "Falls Sie trotzdem noch unverschämt genug sind\n" +
                            "und Fragen haben, dann können Sie mich jederzeit\n" +
                            "unter %s erreichen.\n"
                           ,telefon);


            text3 = String.format(
                    "Hochachtungsvoll\n" +
                            "%s",name2);



            System.out.println( text1 + text2 + text3 + " \n");
        }
    }
}
