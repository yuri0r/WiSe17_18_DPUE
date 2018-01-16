<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="text"/>
    <xsl:template match="/rechnungen">
        <!-- how do i format text??-->
        <xsl:for-each select="rechnung">
            <xsl:if test="gesamt-betrag &lt; 1000 and name-leistungs-empfaenger">
                <xsl:apply-templates select="name-leistungs-empfaenger/anrede/text()"/>
                <xsl:text> </xsl:text>
                <xsl:apply-templates select="name-leistungs-empfaenger/nachname/text()"/>
                <xsl:text>.</xsl:text>
                <xsl:text>&#xa;Danke für die Zahlung von </xsl:text>
                <xsl:apply-templates select="gesamt-betrag/text()"/>
                <xsl:text> für die Rechnung vom </xsl:text>
                <xsl:apply-templates select="austellungs-datum/tag"/>
                <xsl:text>.</xsl:text>
                <xsl:apply-templates select="austellungs-datum/monat"/>
                <xsl:text>.</xsl:text>
                <xsl:apply-templates select="austellungs-datum/jahr"/>
                <xsl:text>.&#xa;</xsl:text>
                <xsl:text>Ich hoffe die </xsl:text>
                <xsl:value-of select="count(leistung)"/>
                <xsl:text> Einzelposten sind zu Ihrer Zufriedenheit geliefert worden.&#xa;&#xa;</xsl:text>
            </xsl:if>
        </xsl:for-each>
    </xsl:template>
</xsl:stylesheet>