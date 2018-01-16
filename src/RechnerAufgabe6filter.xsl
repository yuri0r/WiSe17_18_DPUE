<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="xml"/>
    <xsl:template match="/rechnungen">
        <xsl:copy>
            <xsl:for-each select="rechnung">
                <xsl:if test="austellungs-datum[jahr > 2010]">
                    <xsl:copy>
                        <!-- punkt 1,2 & 3-->
                        <xsl:copy-of select="austellungs-datum"/>
                        <xsl:copy-of select="rechnungs-nummer"/>
                        <xsl:if test="anschrift-des-leistungs-empfaengers/name-leistungs-empfaenger[contains(anrede,'Herr') or contains(anrede,'Frau')]">
                            <xsl:copy-of select="anschrift-des-leistungs-empfaengers/name-leistungs-empfaenger"/>
                            <xsl:copy-of select="anschrift-des-leistungs-empfaengers/adresse"/>
                        </xsl:if>
                        <!-- punkt 4 -->
                        <xsl:for-each select="leistungen/leistung">
                            <xsl:copy>
                                <xsl:element name="position">
                                    <xsl:value-of select="position()"/>
                                </xsl:element>
                                <xsl:copy-of select="bezeichnung"/>
                            </xsl:copy>
                        </xsl:for-each>
                        <xsl:copy-of select="entgelt/gesamt-betrag"/>
                    </xsl:copy>
                </xsl:if>
            </xsl:for-each>
        </xsl:copy>
    </xsl:template>
</xsl:stylesheet>