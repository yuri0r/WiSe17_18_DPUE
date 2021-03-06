import rechnerAufgabe4.jaxb.*;

import javax.xml.bind.*;
import java.io.File;

public class rechnerAufgabe4 {

    public static void main(String[] args) {
        try {


            JAXBContext context = JAXBContext.newInstance("rechnerAufgabe4.jaxb");
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Rechnungen rechnungen = (Rechnungen) JAXBIntrospector.getValue(unmarshaller.unmarshal(
                    new File("src/RechnerAufgabe4.xml")));

            Bankverbindung bank;
            NameLeistungsEmpfaenger leistungsEmpfaenger;
            AnschriftDesLeistendenUnternehmers unternehmen;

            String angruesung;
            String kontaktText;
            String abgruesung;
            String nameLeistungsEmpfaenger;
            String nameLeistungsBringer;
            String nettoBetrag;
            String waehrung;
            String telefon;
            boolean telefonVorhanden;
            String zahlungsArt;

            for (Rechnung rechnung : rechnungen.getRechnung()) {

                //variablen pro rechnung initialisieren*****************************************************************
                bank = rechnung.getBezahlMoeglichkeiten().getBankverbindung();
                leistungsEmpfaenger = rechnung.getAnschriftDesLeistungsEmpfaengers().getNameLeistungsEmpfaenger();
                unternehmen = rechnung.getAnschriftDesLeistendenUnternehmers();

                nameLeistungsEmpfaenger = leistungsEmpfaenger.getAnrede() + " " + leistungsEmpfaenger.getVorname() +
                        " " + leistungsEmpfaenger.getNachname();
                nameLeistungsBringer = unternehmen.getNameUnternehmen();
                nettoBetrag = rechnung.getEntgelt().getNettoBetrag().toString();
                waehrung = rechnung.getVerwendeteWaehrung();
                bank = rechnung.getBezahlMoeglichkeiten().getBankverbindung();
                zahlungsArt = createZahlungsart(bank);

                if (rechnung.getAnschriftDesLeistendenUnternehmers().getTelefonNummer() == null) {
                    telefon = "";
                    telefonVorhanden = false;
                } else {
                    telefon = rechnung.getAnschriftDesLeistendenUnternehmers().getTelefonNummer().toString();
                    telefonVorhanden = true;
                }

                //textErzeugung*****************************************************************************************
                angruesung = String.format(
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

                //textausgabe*******************************************************************************************
                if (telefonVorhanden) {
                    System.out.println(angruesung + kontaktText + abgruesung + " \n");
                } else {
                    System.out.println(angruesung + abgruesung + " \n");
                }

            }
        } catch (Exception e) {
            System.out.println("something went wrong error msg: ");
            System.out.println(e.getMessage());
        }
    }

    private static String createZahlungsart(Bankverbindung bank) {

        StringBuffer buffer = new StringBuffer();

        if (bank.getBank() != null) buffer.append(bank.getBank() + ", ");
        if (bank.getKontoNr() != null) buffer.append(bank.getKontoNr() + ", ");
        if (bank.getBic() != null) buffer.append(bank.getBic() + ", ");
        if (bank.getBlz() != null) buffer.append(bank.getBlz() + ", ");
        if (bank.getIban() != null) buffer.append(bank.getIban() + ", ");


        if (buffer != null) {
            buffer.deleteCharAt(buffer.length() - 2);
            return buffer.toString().trim();
        } else {
            return "";
        }
    }

}
