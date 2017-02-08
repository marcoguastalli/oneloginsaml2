/**
 * AuthHeader.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.scene7.www.ipsapi.xsd._2016_01_14_beta;

/**
 * AuthHeader bean class
 */

public class AuthHeader
        implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
            "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
            "authHeader",
            "ns1");

    /**
     * field for User
     */

    protected java.lang.String localUser;

    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localUserTracker = false;
    /**
     * field for Password
     */

    protected java.lang.String localPassword;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localPasswordTracker = false;
    /**
     * field for AccessToken
     */

    protected java.lang.String localAccessToken;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localAccessTokenTracker = false;
    /**
     * field for SamlResponse
     */

    protected java.lang.String localSamlResponse;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localSamlResponseTracker = false;
    /**
     * field for Locale
     */

    protected java.lang.String localLocale;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localLocaleTracker = false;
    /**
     * field for AppName
     */

    protected java.lang.String localAppName;
    /**
     * field for AppVersion
     */

    protected java.lang.String localAppVersion;
    /**
     * field for GzipResponse
     */

    protected boolean localGzipResponse;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localGzipResponseTracker = false;
    /**
     * field for FaultHttpStatusCode
     */

    protected int localFaultHttpStatusCode;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localFaultHttpStatusCodeTracker = false;
    /**
     * field for ExtraAttributes
     * This was an Attribute!
     * This was an Array!
     */

    protected org.apache.axiom.om.OMAttribute[] localExtraAttributes;

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    public boolean isUserSpecified() {
        return this.localUserTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUser() {
        return this.localUser;
    }

    /**
     * Auto generated setter method
     *
     * @param param User
     */
    public void setUser(java.lang.String param) {
        this.localUserTracker = param != null;

        this.localUser = param;

    }

    public boolean isPasswordSpecified() {
        return this.localPasswordTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getPassword() {
        return this.localPassword;
    }

    /**
     * Auto generated setter method
     *
     * @param param Password
     */
    public void setPassword(java.lang.String param) {
        this.localPasswordTracker = param != null;

        this.localPassword = param;

    }

    public boolean isAccessTokenSpecified() {
        return this.localAccessTokenTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAccessToken() {
        return this.localAccessToken;
    }

    /**
     * Auto generated setter method
     *
     * @param param AccessToken
     */
    public void setAccessToken(java.lang.String param) {
        this.localAccessTokenTracker = param != null;

        this.localAccessToken = param;

    }

    public boolean isSamlResponseSpecified() {
        return this.localSamlResponseTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSamlResponse() {
        return this.localSamlResponse;
    }

    /**
     * Auto generated setter method
     *
     * @param param SamlResponse
     */
    public void setSamlResponse(java.lang.String param) {
        this.localSamlResponseTracker = param != null;

        this.localSamlResponse = param;

    }

    public boolean isLocaleSpecified() {
        return this.localLocaleTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getLocale() {
        return this.localLocale;
    }

    /**
     * Auto generated setter method
     *
     * @param param Locale
     */
    public void setLocale(java.lang.String param) {
        this.localLocaleTracker = param != null;

        this.localLocale = param;

    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAppName() {
        return this.localAppName;
    }

    /**
     * Auto generated setter method
     *
     * @param param AppName
     */
    public void setAppName(java.lang.String param) {

        this.localAppName = param;

    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getAppVersion() {
        return this.localAppVersion;
    }

    /**
     * Auto generated setter method
     *
     * @param param AppVersion
     */
    public void setAppVersion(java.lang.String param) {

        this.localAppVersion = param;

    }

    public boolean isGzipResponseSpecified() {
        return this.localGzipResponseTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getGzipResponse() {
        return this.localGzipResponse;
    }

    /**
     * Auto generated setter method
     *
     * @param param GzipResponse
     */
    public void setGzipResponse(boolean param) {

        // setting primitive attribute tracker to true
        this.localGzipResponseTracker =
                true;

        this.localGzipResponse = param;

    }

    public boolean isFaultHttpStatusCodeSpecified() {
        return this.localFaultHttpStatusCodeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getFaultHttpStatusCode() {
        return this.localFaultHttpStatusCode;
    }

    /**
     * Auto generated setter method
     *
     * @param param FaultHttpStatusCode
     */
    public void setFaultHttpStatusCode(int param) {

        // setting primitive attribute tracker to true
        this.localFaultHttpStatusCodeTracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localFaultHttpStatusCode = param;

    }

    /**
     * Auto generated getter method
     *
     * @return org.apache.axiom.om.OMAttribute[]
     */
    public org.apache.axiom.om.OMAttribute[] getExtraAttributes() {
        return this.localExtraAttributes;
    }

    /**
     * Auto generated setter method
     *
     * @param param ExtraAttributes
     */
    public void setExtraAttributes(org.apache.axiom.om.OMAttribute[] param) {

        validateExtraAttributes(param);

        this.localExtraAttributes = param;
    }

    /**
     * validate the array for ExtraAttributes
     */
    protected void validateExtraAttributes(org.apache.axiom.om.OMAttribute[] param) {

        if ((param != null) && (param.length > 1)) {
            throw new java.lang.RuntimeException();
        }

        if ((param != null) && (param.length < 1)) {
            throw new java.lang.RuntimeException();
        }

    }

    /**
     * Auto generated add method for the array for convenience
     *
     * @param param org.apache.axiom.om.OMAttribute
     */
    public void addExtraAttributes(org.apache.axiom.om.OMAttribute param) {
        if (this.localExtraAttributes == null) {
            this.localExtraAttributes = new org.apache.axiom.om.OMAttribute[] {};
        }

        java.util.List list =
                org.apache.axis2.databinding.utils.ConverterUtil.toList(this.localExtraAttributes);
        list.add(param);
        this.localExtraAttributes =
                (org.apache.axiom.om.OMAttribute[]) list.toArray(
                        new org.apache.axiom.om.OMAttribute[list.size()]);

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
                        namespacePrefix + ":authHeader",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "authHeader",
                        xmlWriter);
            }

        }

        if (this.localExtraAttributes != null) {
            for (int i = 0; i < this.localExtraAttributes.length; i++) {
                writeAttribute(this.localExtraAttributes[i].getNamespace().getName(),
                        this.localExtraAttributes[i].getLocalName(),
                        this.localExtraAttributes[i].getAttributeValue(), xmlWriter);
            }
        }
        if (this.localUserTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "user", xmlWriter);

            if (this.localUser == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("user cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localUser);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localPasswordTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "password", xmlWriter);

            if (this.localPassword == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("password cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localPassword);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localAccessTokenTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "accessToken", xmlWriter);

            if (this.localAccessToken == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("accessToken cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localAccessToken);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localSamlResponseTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "samlResponse", xmlWriter);

            if (this.localSamlResponse == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("samlResponse cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localSamlResponse);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localLocaleTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "locale", xmlWriter);

            if (this.localLocale == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("locale cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localLocale);

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "appName", xmlWriter);

        if (this.localAppName == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("appName cannot be null!!");

        } else {

            xmlWriter.writeCharacters(this.localAppName);

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "appVersion", xmlWriter);

        if (this.localAppVersion == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("appVersion cannot be null!!");

        } else {

            xmlWriter.writeCharacters(this.localAppVersion);

        }

        xmlWriter.writeEndElement();
        if (this.localGzipResponseTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "gzipResponse", xmlWriter);

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("gzipResponse cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localGzipResponse));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localFaultHttpStatusCodeTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "faultHttpStatusCode", xmlWriter);

            if (this.localFaultHttpStatusCode == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("faultHttpStatusCode cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFaultHttpStatusCode));
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

        if (this.localUserTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "user"));

            if (this.localUser != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localUser));
            } else {
                throw new org.apache.axis2.databinding.ADBException("user cannot be null!!");
            }
        }
        if (this.localPasswordTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "password"));

            if (this.localPassword != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localPassword));
            } else {
                throw new org.apache.axis2.databinding.ADBException("password cannot be null!!");
            }
        }
        if (this.localAccessTokenTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "accessToken"));

            if (this.localAccessToken != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localAccessToken));
            } else {
                throw new org.apache.axis2.databinding.ADBException("accessToken cannot be null!!");
            }
        }
        if (this.localSamlResponseTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "samlResponse"));

            if (this.localSamlResponse != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localSamlResponse));
            } else {
                throw new org.apache.axis2.databinding.ADBException("samlResponse cannot be null!!");
            }
        }
        if (this.localLocaleTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "locale"));

            if (this.localLocale != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localLocale));
            } else {
                throw new org.apache.axis2.databinding.ADBException("locale cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "appName"));

        if (this.localAppName != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localAppName));
        } else {
            throw new org.apache.axis2.databinding.ADBException("appName cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "appVersion"));

        if (this.localAppVersion != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localAppVersion));
        } else {
            throw new org.apache.axis2.databinding.ADBException("appVersion cannot be null!!");
        }
        if (this.localGzipResponseTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "gzipResponse"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localGzipResponse));
        }
        if (this.localFaultHttpStatusCodeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "faultHttpStatusCode"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFaultHttpStatusCode));
        }
        for (int i = 0; i < this.localExtraAttributes.length; i++) {
            attribList.add(org.apache.axis2.databinding.utils.Constants.OM_ATTRIBUTE_KEY);
            attribList.add(this.localExtraAttributes[i]);
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
        public static AuthHeader parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            AuthHeader object =
                    new AuthHeader();

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

                        if (!"authHeader".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (AuthHeader) com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExtensionMapper.getTypeObject(
                                    nsUri, type, reader);
                        }

                    }

                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                // now run through all any or extra attributes
                // which were not reflected until now
                for (int i = 0; i < reader.getAttributeCount(); i++) {
                    if (!handledAttributes.contains(reader.getAttributeLocalName(i))) {
                        // this is an anyAttribute and we create
                        // an OMAttribute for this
                        org.apache.axiom.om.OMFactory factory = org.apache.axiom.om.OMAbstractFactory.getOMFactory();
                        org.apache.axiom.om.OMAttribute attr =
                                factory.createOMAttribute(
                                        reader.getAttributeLocalName(i),
                                        factory.createOMNamespace(
                                                reader.getAttributeNamespace(i), reader.getAttributePrefix(i)),
                                        reader.getAttributeValue(i));

                        // and add it to the extra attributes

                        object.addExtraAttributes(attr);

                    }
                }

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "user")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "user" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setUser(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "password")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "password" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPassword(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "accessToken").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "accessToken" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAccessToken(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "samlResponse").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "samlResponse" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSamlResponse(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "locale")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "locale" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLocale(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "appName")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "appName" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAppName(
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
                        "appVersion").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "appVersion" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAppVersion(
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
                        "gzipResponse").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "gzipResponse" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setGzipResponse(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "faultHttpStatusCode").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "faultHttpStatusCode" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFaultHttpStatusCode(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setFaultHttpStatusCode(java.lang.Integer.MIN_VALUE);

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
           
    