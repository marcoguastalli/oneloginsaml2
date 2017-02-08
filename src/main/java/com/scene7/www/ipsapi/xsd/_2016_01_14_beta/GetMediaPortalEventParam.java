/**
 * GetMediaPortalEventParam.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.scene7.www.ipsapi.xsd._2016_01_14_beta;

/**
 * GetMediaPortalEventParam bean class
 */

public class GetMediaPortalEventParam
        implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
            "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
            "getMediaPortalEventParam",
            "ns1");

    /**
     * field for EventType
     */

    protected java.lang.String localEventType;

    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localEventTypeTracker = false;
    /**
     * field for IpsUser
     */

    protected java.lang.String localIpsUser;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localIpsUserTracker = false;
    /**
     * field for CompanyHandle
     */

    protected java.lang.String localCompanyHandle;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localCompanyHandleTracker = false;
    /**
     * field for JobName
     */

    protected java.lang.String localJobName;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localJobNameTracker = false;
    /**
     * field for JobDescription
     */

    protected java.lang.String localJobDescription;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localJobDescriptionTracker = false;
    /**
     * field for BeforeDate
     */

    protected java.util.Calendar localBeforeDate;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localBeforeDateTracker = false;
    /**
     * field for AfterDate
     */

    protected java.util.Calendar localAfterDate;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localAfterDateTracker = false;

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    public boolean isEventTypeSpecified() {
        return this.localEventTypeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getEventType() {
        return this.localEventType;
    }

    /**
     * Auto generated setter method
     *
     * @param param EventType
     */
    public void setEventType(java.lang.String param) {
        this.localEventTypeTracker = param != null;

        this.localEventType = param;

    }

    public boolean isIpsUserSpecified() {
        return this.localIpsUserTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getIpsUser() {
        return this.localIpsUser;
    }

    /**
     * Auto generated setter method
     *
     * @param param IpsUser
     */
    public void setIpsUser(java.lang.String param) {
        this.localIpsUserTracker = param != null;

        this.localIpsUser = param;

    }

    public boolean isCompanyHandleSpecified() {
        return this.localCompanyHandleTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCompanyHandle() {
        return this.localCompanyHandle;
    }

    /**
     * Auto generated setter method
     *
     * @param param CompanyHandle
     */
    public void setCompanyHandle(java.lang.String param) {
        this.localCompanyHandleTracker = param != null;

        this.localCompanyHandle = param;

    }

    public boolean isJobNameSpecified() {
        return this.localJobNameTracker;
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
        this.localJobNameTracker = param != null;

        this.localJobName = param;

    }

    public boolean isJobDescriptionSpecified() {
        return this.localJobDescriptionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getJobDescription() {
        return this.localJobDescription;
    }

    /**
     * Auto generated setter method
     *
     * @param param JobDescription
     */
    public void setJobDescription(java.lang.String param) {
        this.localJobDescriptionTracker = param != null;

        this.localJobDescription = param;

    }

    public boolean isBeforeDateSpecified() {
        return this.localBeforeDateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getBeforeDate() {
        return this.localBeforeDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param BeforeDate
     */
    public void setBeforeDate(java.util.Calendar param) {
        this.localBeforeDateTracker = param != null;

        this.localBeforeDate = param;

    }

    public boolean isAfterDateSpecified() {
        return this.localAfterDateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getAfterDate() {
        return this.localAfterDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param AfterDate
     */
    public void setAfterDate(java.util.Calendar param) {
        this.localAfterDateTracker = param != null;

        this.localAfterDate = param;

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
                new org.apache.axis2.databinding.ADBDataSource(this, MY_QNAME);
        return factory.createOMElement(dataSource, MY_QNAME);

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
                        namespacePrefix + ":getMediaPortalEventParam",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "getMediaPortalEventParam",
                        xmlWriter);
            }

        }
        if (this.localEventTypeTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "eventType", xmlWriter);

            if (this.localEventType == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("eventType cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localEventType);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localIpsUserTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "ipsUser", xmlWriter);

            if (this.localIpsUser == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("ipsUser cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localIpsUser);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localCompanyHandleTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "companyHandle", xmlWriter);

            if (this.localCompanyHandle == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("companyHandle cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localCompanyHandle);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localJobNameTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "jobName", xmlWriter);

            if (this.localJobName == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("jobName cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localJobName);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localJobDescriptionTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "jobDescription", xmlWriter);

            if (this.localJobDescription == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("jobDescription cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localJobDescription);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localBeforeDateTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "beforeDate", xmlWriter);

            if (this.localBeforeDate == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("beforeDate cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localBeforeDate));

            }

            xmlWriter.writeEndElement();
        }
        if (this.localAfterDateTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "afterDate", xmlWriter);

            if (this.localAfterDate == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("afterDate cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localAfterDate));

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

        if (this.localEventTypeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "eventType"));

            if (this.localEventType != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localEventType));
            } else {
                throw new org.apache.axis2.databinding.ADBException("eventType cannot be null!!");
            }
        }
        if (this.localIpsUserTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "ipsUser"));

            if (this.localIpsUser != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localIpsUser));
            } else {
                throw new org.apache.axis2.databinding.ADBException("ipsUser cannot be null!!");
            }
        }
        if (this.localCompanyHandleTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "companyHandle"));

            if (this.localCompanyHandle != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localCompanyHandle));
            } else {
                throw new org.apache.axis2.databinding.ADBException("companyHandle cannot be null!!");
            }
        }
        if (this.localJobNameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "jobName"));

            if (this.localJobName != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localJobName));
            } else {
                throw new org.apache.axis2.databinding.ADBException("jobName cannot be null!!");
            }
        }
        if (this.localJobDescriptionTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "jobDescription"));

            if (this.localJobDescription != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localJobDescription));
            } else {
                throw new org.apache.axis2.databinding.ADBException("jobDescription cannot be null!!");
            }
        }
        if (this.localBeforeDateTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "beforeDate"));

            if (this.localBeforeDate != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localBeforeDate));
            } else {
                throw new org.apache.axis2.databinding.ADBException("beforeDate cannot be null!!");
            }
        }
        if (this.localAfterDateTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "afterDate"));

            if (this.localAfterDate != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localAfterDate));
            } else {
                throw new org.apache.axis2.databinding.ADBException("afterDate cannot be null!!");
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
        public static GetMediaPortalEventParam parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            GetMediaPortalEventParam object =
                    new GetMediaPortalEventParam();

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

                        if (!"getMediaPortalEventParam".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (GetMediaPortalEventParam) com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExtensionMapper.getTypeObject(
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
                        "eventType").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "eventType" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setEventType(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "ipsUser")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "ipsUser" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setIpsUser(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "companyHandle").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "companyHandle" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCompanyHandle(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

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

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "jobDescription").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "jobDescription" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setJobDescription(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "beforeDate").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "beforeDate" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setBeforeDate(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "afterDate").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "afterDate" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAfterDate(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

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
           
    