import rechnerAufgabe4.jaxb.*;

import javax.xml.bind.*;
import java.io.File;

public class rechnerAufgabe4 {

    public static void main(String[] args) {

        JAXBContext context = null;
        Unmarshaller unmarshaller = null;
        Rechnungen rechnungen = null;

        Bankverbindung bank;
        NameLeistungsEmpfaenger leistungsEmpfaenger;
        AnschriftDesLeistendenUnternehmers unternehmen;

        String anrede;
        String kontaktText;
        String abgruesung;
        String nameLeistungsEmpfaenger;
        String nameLeistungsBringer;
        String nettoBetrag;
        String waehrung;
        String telefon;
        boolean telefonVorhanden;
        String zahlungsArt;
        String komma = ", ";


        try {
            context = JAXBContext.newInstance("rechnerAufgabe4.jaxb");
            unmarshaller = context.createUnmarshaller();
            rechnungen = (Rechnungen) JAXBIntrospector.getValue(unmarshaller.unmarshal(
                    new File("src/RechnerAufgabe4.xml")));

        } catch (JAXBException e) {
            e.printStackTrace();
            System.exit(1);
        }


        for (Rechnung rechnung : rechnungen.getRechnung()) {

            //variablen pro rechnung initialisieren*********************************************************************
            bank = rechnung.getBezahlMoeglichkeiten().getBankverbindung();
            leistungsEmpfaenger = rechnung.getAnschriftDesLeistungsEmpfaengers().getNameLeistungsEmpfaenger();
            unternehmen = rechnung.getAnschriftDesLeistendenUnternehmers();

            nameLeistungsEmpfaenger = leistungsEmpfaenger.getVorname() + " " + leistungsEmpfaenger.getNachname();
            nameLeistungsBringer = unternehmen.getNameUnternehmen();
            nettoBetrag = rechnung.getEntgelt().getNettoBetrag().toString();
            waehrung = rechnung.getVerwendeteWaehrung();
            bank = rechnung.getBezahlMoeglichkeiten().getBankverbindung();
            zahlungsArt = bank.getBank() + komma +
                    bank.getBic() + komma +
                    bank.getBlz() + komma +
                    bank.getKontoNr();

            if (rechnung.getAnschriftDesLeistendenUnternehmers().getTelefonNummer() == null) {
                telefon = "";
                telefonVorhanden = false;
            } else {
                telefon = rechnung.getAnschriftDesLeistendenUnternehmers().getTelefonNummer().toString();
                telefonVorhanden = true;
            }

            //textErzeugung*********************************************************************************************
            anrede = String.format(
                    "%s\n" +
                            "Bitte zahlen Sie endlich den geforderten Betrag\n" +
                            "von %s %s auf das Konto\n" +
                            "%s ein.\n"
                    , nameLeistungsEmpfaenger, nettoBetrag, waehrung, zahlungsArt);



            kontaktText = String.format(
                    "Falls Sie trotzdem noch unverschämt genug sind\n" +
                            "und Fragen haben, dann können Sie mich jederzeit\n" +
                            "unter %s erreichen.\n"
                    , telefon);


            abgruesung = String.format(
                    "Hochachtungsvoll\n" +
                            "%s", nameLeistungsBringer);

            if (telefonVorhanden){
                System.out.println(anrede + kontaktText + abgruesung + " \n");
            } else {
                System.out.println(anrede + abgruesung + " \n");
            }
        }
    }
}
