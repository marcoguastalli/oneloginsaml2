/**
 * CompanySettings.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.scene7.www.ipsapi.xsd._2016_01_14_beta;

/**
 * CompanySettings bean class
 */

public class CompanySettings
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = CompanySettings
                Namespace URI = http://www.scene7.com/IpsApi/xsd/2016-01-14-beta
                Namespace Prefix = ns1
                */

    /**
     * field for OverwriteMode
     */

    protected java.lang.String localOverwriteMode;
    /**
     * field for RetainPublishState
     */

    protected boolean localRetainPublishState;
    /**
     * field for DefaultSourceProfile
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.Asset localDefaultSourceProfile;
    /**
     * field for DefaultDisplayProfile
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.Asset localDefaultDisplayProfile;
    /**
     * field for IptcExifMappingXslt
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.Asset localIptcExifMappingXslt;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localIptcExifMappingXsltTracker = false;
    /**
     * field for XmpMappingXslt
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.Asset localXmpMappingXslt;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localXmpMappingXsltTracker = false;
    /**
     * field for DiskSpaceWarningMin
     */

    protected int localDiskSpaceWarningMin;
    /**
     * field for EmailTrashCleanupWarning
     */

    protected boolean localEmailTrashCleanupWarning;
    /**
     * field for FileExtOpt
     */

    protected java.lang.String localFileExtOpt;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localFileExtOptTracker = false;

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getOverwriteMode() {
        return this.localOverwriteMode;
    }

    /**
     * Auto generated setter method
     *
     * @param param OverwriteMode
     */
    public void setOverwriteMode(java.lang.String param) {

        this.localOverwriteMode = param;

    }

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getRetainPublishState() {
        return this.localRetainPublishState;
    }

    /**
     * Auto generated setter method
     *
     * @param param RetainPublishState
     */
    public void setRetainPublishState(boolean param) {

        this.localRetainPublishState = param;

    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.Asset
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.Asset getDefaultSourceProfile() {
        return this.localDefaultSourceProfile;
    }

    /**
     * Auto generated setter method
     *
     * @param param DefaultSourceProfile
     */
    public void setDefaultSourceProfile(com.scene7.www.ipsapi.xsd._2016_01_14_beta.Asset param) {

        this.localDefaultSourceProfile = param;

    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.Asset
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.Asset getDefaultDisplayProfile() {
        return this.localDefaultDisplayProfile;
    }

    /**
     * Auto generated setter method
     *
     * @param param DefaultDisplayProfile
     */
    public void setDefaultDisplayProfile(com.scene7.www.ipsapi.xsd._2016_01_14_beta.Asset param) {

        this.localDefaultDisplayProfile = param;

    }

    public boolean isIptcExifMappingXsltSpecified() {
        return this.localIptcExifMappingXsltTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.Asset
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.Asset getIptcExifMappingXslt() {
        return this.localIptcExifMappingXslt;
    }

    /**
     * Auto generated setter method
     *
     * @param param IptcExifMappingXslt
     */
    public void setIptcExifMappingXslt(com.scene7.www.ipsapi.xsd._2016_01_14_beta.Asset param) {
        this.localIptcExifMappingXsltTracker = param != null;

        this.localIptcExifMappingXslt = param;

    }

    public boolean isXmpMappingXsltSpecified() {
        return this.localXmpMappingXsltTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.Asset
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.Asset getXmpMappingXslt() {
        return this.localXmpMappingXslt;
    }

    /**
     * Auto generated setter method
     *
     * @param param XmpMappingXslt
     */
    public void setXmpMappingXslt(com.scene7.www.ipsapi.xsd._2016_01_14_beta.Asset param) {
        this.localXmpMappingXsltTracker = param != null;

        this.localXmpMappingXslt = param;

    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getDiskSpaceWarningMin() {
        return this.localDiskSpaceWarningMin;
    }

    /**
     * Auto generated setter method
     *
     * @param param DiskSpaceWarningMin
     */
    public void setDiskSpaceWarningMin(int param) {

        this.localDiskSpaceWarningMin = param;

    }

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getEmailTrashCleanupWarning() {
        return this.localEmailTrashCleanupWarning;
    }

    /**
     * Auto generated setter method
     *
     * @param param EmailTrashCleanupWarning
     */
    public void setEmailTrashCleanupWarning(boolean param) {

        this.localEmailTrashCleanupWarning = param;

    }

    public boolean isFileExtOptSpecified() {
        return this.localFileExtOptTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getFileExtOpt() {
        return this.localFileExtOpt;
    }

    /**
     * Auto generated setter method
     *
     * @param param FileExtOpt
     */
    public void setFileExtOpt(java.lang.String param) {
        this.localFileExtOptTracker = param != null;

        this.localFileExtOpt = param;

    }

    /**
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
            final javax.xml.namespace.QName parentQName,
            final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException {

        org.apache.axiom.om.OMDataSource dataSource =
                new org.apache.axis2.databinding.ADBDataSource(this, parentQName);
        return factory.createOMElement(dataSource, parentQName);

    }

    public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
            javax.xml.stream.XMLStreamWriter xmlWriter,
            boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException {

        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);

        if (serializeType) {

            java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta");
            if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        namespacePrefix + ":CompanySettings",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "CompanySettings",
                        xmlWriter);
            }

        }

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "overwriteMode", xmlWriter);

        if (this.localOverwriteMode == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("overwriteMode cannot be null!!");

        } else {

            xmlWriter.writeCharacters(this.localOverwriteMode);

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "retainPublishState", xmlWriter);

        if (false) {

            throw new org.apache.axis2.databinding.ADBException("retainPublishState cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localRetainPublishState));
        }

        xmlWriter.writeEndElement();

        if (this.localDefaultSourceProfile == null) {
            throw new org.apache.axis2.databinding.ADBException("defaultSourceProfile cannot be null!!");
        }
        this.localDefaultSourceProfile
                .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "defaultSourceProfile"),
                        xmlWriter);

        if (this.localDefaultDisplayProfile == null) {
            throw new org.apache.axis2.databinding.ADBException("defaultDisplayProfile cannot be null!!");
        }
        this.localDefaultDisplayProfile
                .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "defaultDisplayProfile"),
                        xmlWriter);
        if (this.localIptcExifMappingXsltTracker) {
            if (this.localIptcExifMappingXslt == null) {
                throw new org.apache.axis2.databinding.ADBException("iptcExifMappingXslt cannot be null!!");
            }
            this.localIptcExifMappingXslt
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "iptcExifMappingXslt"),
                            xmlWriter);
        }
        if (this.localXmpMappingXsltTracker) {
            if (this.localXmpMappingXslt == null) {
                throw new org.apache.axis2.databinding.ADBException("xmpMappingXslt cannot be null!!");
            }
            this.localXmpMappingXslt
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "xmpMappingXslt"),
                            xmlWriter);
        }
        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "diskSpaceWarningMin", xmlWriter);

        if (this.localDiskSpaceWarningMin == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("diskSpaceWarningMin cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localDiskSpaceWarningMin));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "emailTrashCleanupWarning", xmlWriter);

        if (false) {

            throw new org.apache.axis2.databinding.ADBException("emailTrashCleanupWarning cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localEmailTrashCleanupWarning));
        }

        xmlWriter.writeEndElement();
        if (this.localFileExtOptTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "fileExtOpt", xmlWriter);

            if (this.localFileExtOpt == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("fileExtOpt cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localFileExtOpt);

            }

            xmlWriter.writeEndElement();
        }
        xmlWriter.writeEndElement();

    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
            javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
        if (writerPrefix != null) {
            xmlWriter.writeStartElement(namespace, localPart);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix, java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        if (xmlWriter.getPrefix(namespace) == null) {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
        xmlWriter.writeAttribute(namespace, attName, attValue);
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace, java.lang.String attName,
            java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
            javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }
        java.lang.String attributeValue;
        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(namespace, attName, attributeValue);
        }
    }

    /**
     * method to handle Qnames
     */

    private void writeQName(javax.xml.namespace.QName qname,
            javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();
        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
            javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }
                namespaceURI = qnames[i].getNamespaceURI();
                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);
                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                }
            }
            xmlWriter.writeCharacters(stringToWrite.toString());
        }

    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
            throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);
        if (prefix == null) {
            prefix = generatePrefix(namespace);
            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);
                if (uri == null || uri.length() == 0) {
                    break;
                }
                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
        return prefix;
    }

    /**
     * databinding method to get an XML representation of this object
     */
    public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {

        java.util.ArrayList elementList = new java.util.ArrayList();
        java.util.ArrayList attribList = new java.util.ArrayList();

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "overwriteMode"));

        if (this.localOverwriteMode != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localOverwriteMode));
        } else {
            throw new org.apache.axis2.databinding.ADBException("overwriteMode cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "retainPublishState"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localRetainPublishState));

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "defaultSourceProfile"));

        if (this.localDefaultSourceProfile == null) {
            throw new org.apache.axis2.databinding.ADBException("defaultSourceProfile cannot be null!!");
        }
        elementList.add(this.localDefaultSourceProfile);

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "defaultDisplayProfile"));

        if (this.localDefaultDisplayProfile == null) {
            throw new org.apache.axis2.databinding.ADBException("defaultDisplayProfile cannot be null!!");
        }
        elementList.add(this.localDefaultDisplayProfile);
        if (this.localIptcExifMappingXsltTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "iptcExifMappingXslt"));

            if (this.localIptcExifMappingXslt == null) {
                throw new org.apache.axis2.databinding.ADBException("iptcExifMappingXslt cannot be null!!");
            }
            elementList.add(this.localIptcExifMappingXslt);
        }
        if (this.localXmpMappingXsltTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "xmpMappingXslt"));

            if (this.localXmpMappingXslt == null) {
                throw new org.apache.axis2.databinding.ADBException("xmpMappingXslt cannot be null!!");
            }
            elementList.add(this.localXmpMappingXslt);
        }
        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "diskSpaceWarningMin"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localDiskSpaceWarningMin));

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "emailTrashCleanupWarning"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localEmailTrashCleanupWarning));
        if (this.localFileExtOptTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "fileExtOpt"));

            if (this.localFileExtOpt != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFileExtOpt));
            } else {
                throw new org.apache.axis2.databinding.ADBException("fileExtOpt cannot be null!!");
            }
        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());

    }

    /**
     * Factory class that keeps the parse method
     */
    public static class Factory {

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         * If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         * If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static CompanySettings parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            CompanySettings object =
                    new CompanySettings();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";
            try {

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");
                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;
                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0, fullTypeName.indexOf(":"));
                        }
                        nsPrefix = nsPrefix == null ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":") + 1);

                        if (!"CompanySettings".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (CompanySettings) com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExtensionMapper.getTypeObject(
                                    nsUri, type, reader);
                        }

                    }

                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "overwriteMode").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "overwriteMode" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setOverwriteMode(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "retainPublishState").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "retainPublishState" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setRetainPublishState(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "defaultSourceProfile").equals(reader.getName())) {

                    object.setDefaultSourceProfile(com.scene7.www.ipsapi.xsd._2016_01_14_beta.Asset.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "defaultDisplayProfile").equals(reader.getName())) {

                    object.setDefaultDisplayProfile(com.scene7.www.ipsapi.xsd._2016_01_14_beta.Asset.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "iptcExifMappingXslt").equals(reader.getName())) {

                    object.setIptcExifMappingXslt(com.scene7.www.ipsapi.xsd._2016_01_14_beta.Asset.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "xmpMappingXslt").equals(reader.getName())) {

                    object.setXmpMappingXslt(com.scene7.www.ipsapi.xsd._2016_01_14_beta.Asset.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "diskSpaceWarningMin").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "diskSpaceWarningMin" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDiskSpaceWarningMin(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "emailTrashCleanupWarning").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "emailTrashCleanupWarning" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setEmailTrashCleanupWarning(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "fileExtOpt").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "fileExtOpt" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFileExtOpt(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement())
                    // A start element we are not expecting indicates a trailing invalid property
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());

            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

    }//end of factory class

}
           
    