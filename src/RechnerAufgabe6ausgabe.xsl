<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="text"/>

<xsl:template match="/rechnungen">
<!-- how do i format text??-->
<xsl:for-each select="rechnung">
<xsl:if test="gesamt-betrag &lt; 1000">
<xsl:apply-templates select="name-leistungs-empfaenger/anrede/text()"/><xsl:text> </xsl:text><xsl:apply-templates select="name-leistungs-empfaenger/nachname/text()"/>.
Danke für die Zahlung von <xsl:apply-templates select="gesamt-betrag/text()"/> für die Rechnung vom <xsl:apply-templates select="austellungs-datum/monat"/>.<xsl:apply-templates select="austellungs-datum/tag"/>.<xsl:apply-templates select="austellungs-datum/jahr"/> .
Ich hoffe die <xsl:value-of select="count(bezeichnung)"/> Einzelposten sind zu Ihrer Zufriedenheit geliefert worden.

</xsl:if>
</xsl:for-each>
</xsl:template>

</xsl:stylesheet>