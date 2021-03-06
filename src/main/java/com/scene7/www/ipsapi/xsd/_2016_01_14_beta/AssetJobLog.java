/**
 * AssetJobLog.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.scene7.www.ipsapi.xsd._2016_01_14_beta;

/**
 * AssetJobLog bean class
 */

public class AssetJobLog
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = AssetJobLog
                Namespace URI = http://www.scene7.com/IpsApi/xsd/2016-01-14-beta
                Namespace Prefix = ns1
                */

    /**
     * field for JobHandle
     */

    protected java.lang.String localJobHandle;
    /**
     * field for JobName
     */

    protected java.lang.String localJobName;
    /**
     * field for LogMessage
     */

    protected java.lang.String localLogMessage;
    /**
     * field for LogType
     */

    protected java.lang.String localLogType;
    /**
     * field for SubmitUserEmail
     */

    protected java.lang.String localSubmitUserEmail;
    /**
     * field for LogDate
     */

    protected java.util.Calendar localLogDate;
    /**
     * field for AuxArray
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.JobLogDetailAuxArray localAuxArray;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localAuxArrayTracker = false;

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
    public java.lang.String getJobHandle() {
        return this.localJobHandle;
    }

    /**
     * Auto generated setter method
     *
     * @param param JobHandle
     */
    public void setJobHandle(java.lang.String param) {

        this.localJobHandle = param;

    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getJobName() {
        return this.localJobName;
    }

    /**
     * Auto generated setter method
     *
     * @param param JobName
     */
    public void setJobName(java.lang.String param) {

        this.localJobName = param;

    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getLogMessage() {
        return this.localLogMessage;
    }

    /**
     * Auto generated setter method
     *
     * @param param LogMessage
     */
    public void setLogMessage(java.lang.String param) {

        this.localLogMessage = param;

    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getLogType() {
        return this.localLogType;
    }

    /**
     * Auto generated setter method
     *
     * @param param LogType
     */
    public void setLogType(java.lang.String param) {

        this.localLogType = param;

    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSubmitUserEmail() {
        return this.localSubmitUserEmail;
    }

    /**
     * Auto generated setter method
     *
     * @param param SubmitUserEmail
     */
    public void setSubmitUserEmail(java.lang.String param) {

        this.localSubmitUserEmail = param;

    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getLogDate() {
        return this.localLogDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param LogDate
     */
    public void setLogDate(java.util.Calendar param) {

        this.localLogDate = param;

    }

    public boolean isAuxArraySpecified() {
        return this.localAuxArrayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.JobLogDetailAuxArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.JobLogDetailAuxArray getAuxArray() {
        return this.localAuxArray;
    }

    /**
     * Auto generated setter method
     *
     * @param param AuxArray
     */
    public void setAuxArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.JobLogDetailAuxArray param) {
        this.localAuxArrayTracker = param != null;

        this.localAuxArray = param;

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
                        namespacePrefix + ":AssetJobLog",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "AssetJobLog",
                        xmlWriter);
            }

        }

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "jobHandle", xmlWriter);

        if (this.localJobHandle == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("jobHandle cannot be null!!");

        } else {

            xmlWriter.writeCharacters(this.localJobHandle);

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "jobName", xmlWriter);

        if (this.localJobName == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("jobName cannot be null!!");

        } else {

            xmlWriter.writeCharacters(this.localJobName);

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "logMessage", xmlWriter);

        if (this.localLogMessage == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("logMessage cannot be null!!");

        } else {

            xmlWriter.writeCharacters(this.localLogMessage);

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "logType", xmlWriter);

        if (this.localLogType == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("logType cannot be null!!");

        } else {

            xmlWriter.writeCharacters(this.localLogType);

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "submitUserEmail", xmlWriter);

        if (this.localSubmitUserEmail == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("submitUserEmail cannot be null!!");

        } else {

            xmlWriter.writeCharacters(this.localSubmitUserEmail);

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "logDate", xmlWriter);

        if (this.localLogDate == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("logDate cannot be null!!");

        } else {

            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localLogDate));

        }

        xmlWriter.writeEndElement();
        if (this.localAuxArrayTracker) {
            if (this.localAuxArray == null) {
                throw new org.apache.axis2.databinding.ADBException("auxArray cannot be null!!");
            }
            this.localAuxArray.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "auxArray"),
                    xmlWriter);
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
                "jobHandle"));

        if (this.localJobHandle != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localJobHandle));
        } else {
            throw new org.apache.axis2.databinding.ADBException("jobHandle cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "jobName"));

        if (this.localJobName != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localJobName));
        } else {
            throw new org.apache.axis2.databinding.ADBException("jobName cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "logMessage"));

        if (this.localLogMessage != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localLogMessage));
        } else {
            throw new org.apache.axis2.databinding.ADBException("logMessage cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "logType"));

        if (this.localLogType != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localLogType));
        } else {
            throw new org.apache.axis2.databinding.ADBException("logType cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "submitUserEmail"));

        if (this.localSubmitUserEmail != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localSubmitUserEmail));
        } else {
            throw new org.apache.axis2.databinding.ADBException("submitUserEmail cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "logDate"));

        if (this.localLogDate != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localLogDate));
        } else {
            throw new org.apache.axis2.databinding.ADBException("logDate cannot be null!!");
        }
        if (this.localAuxArrayTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "auxArray"));

            if (this.localAuxArray == null) {
                throw new org.apache.axis2.databinding.ADBException("auxArray cannot be null!!");
            }
            elementList.add(this.localAuxArray);
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
        public static AssetJobLog parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            AssetJobLog object =
                    new AssetJobLog();

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

                        if (!"AssetJobLog".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (AssetJobLog) com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExtensionMapper.getTypeObject(
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
                        "jobHandle").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "jobHandle" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setJobHandle(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "jobName")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "jobName" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setJobName(
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
                        "logMessage").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "logMessage" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLogMessage(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "logType")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "logType" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLogType(
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
                        "submitUserEmail").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "submitUserEmail" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSubmitUserEmail(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "logDate")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "logDate" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLogDate(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "auxArray")
                        .equals(reader.getName())) {

                    object.setAuxArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.JobLogDetailAuxArray.Factory.parse(reader));

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
           
    