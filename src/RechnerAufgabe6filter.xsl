<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="xml"/>

    <!-- first steps...
    <xsl:template match="/">
        <xsl:apply-templates select="/rechnungen/rechnung/austellungs-datum[jahr > 2010]"/>
    </xsl:template>
    -->


    <!-- okay so thats ho wthat works...
    <xsl:template match="/rechnungen">
        <xsl:copy>
            <xsl:for-each select="rechnung">
                <xsl:if test="austellungs-datum[jahr > 2010]">
                    <xsl:copy>
                        <xsl:copy-of select="rechnung"/>
                    </xsl:copy>
                </xsl:if>
            </xsl:for-each>
        </xsl:copy>
    </xsl:template>
    -->

    <xsl:template match="/rechnungen">
        <xsl:copy>
            <xsl:for-each select="rechnung">
                <xsl:if test="austellungs-datum[jahr > 2010]">
                    <xsl:copy>
                        <!-- punkt 1,2 & 3-->
                        <xsl:copy-of select="austellungs-datum"/>
                        <xsl:copy-of select="rechnungs-nummer"/>
                        <!-- punkt 4 -->
                        <xsl:if test="/rechnungen/rechnung[contains(anschrift-des-leistungs-empfaengers/name-leistungs-empfaenger/anrede/text(), 'Herr') or  /rechnungen/rechnung[contains(anschrift-des-leistungs-empfaengers/name-leistungs-empfaenger/anrede/text(), 'Frau')]]">
                            <xsl:copy-of select="anschrift-des-leistungs-empfaengers/name-leistungs-empfaenger"/>
                            <xsl:copy-of select="anschrift-des-leistungs-empfaengers/adresse"/>
                        </xsl:if>
                        <!-- punkt 5??? -->
                        <xsl:if test="true()">
                            <!-- how to make a attribute to an node-->
                            <xsl:copy-of select="leistung/leistung/@position"/>
                            <xsl:copy-of select="leistungen/leistung/bezeichnung"/>
                        </xsl:if>
                        <xsl:copy-of select="entgelt/gesamt-betrag"/>
                    </xsl:copy>
                </xsl:if>
            </xsl:for-each>
        </xsl:copy>

    </xsl:template>

</xsl:stylesheet>