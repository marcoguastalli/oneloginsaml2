/**
 * AuthHeader.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.scene7.www.ipsapi.xsd;

/**
 *  AuthHeader bean class
 */
@SuppressWarnings({ "unchecked", "unused" })

public class AuthHeader
        implements org.apache.axis2.databinding.ADBBean {

    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName(
            "http://www.scene7.com/IpsApi/xsd",
            "authHeader",
            "ns2");

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
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localAppNameTracker = false;
    /**
     * field for AppVersion
     */

    protected java.lang.String localAppVersion;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localAppVersionTracker = false;
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
        if (namespace.equals("http://www.scene7.com/IpsApi/xsd")) {
            return "ns2";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    public boolean isUserSpecified() {
        return localUserTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getUser() {
        return localUser;
    }

    /**
     * Auto generated setter method
     * @param param User
     */
    public void setUser(java.lang.String param) {
        localUserTracker = param != null;

        this.localUser = param;

    }

    public boolean isPasswordSpecified() {
        return localPasswordTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPassword() {
        return localPassword;
    }

    /**
     * Auto generated setter method
     * @param param Password
     */
    public void setPassword(java.lang.String param) {
        localPasswordTracker = param != null;

        this.localPassword = param;

    }

    public boolean isAccessTokenSpecified() {
        return localAccessTokenTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getAccessToken() {
        return localAccessToken;
    }

    /**
     * Auto generated setter method
     * @param param AccessToken
     */
    public void setAccessToken(java.lang.String param) {
        localAccessTokenTracker = param != null;

        this.localAccessToken = param;

    }

    public boolean isLocaleSpecified() {
        return localLocaleTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getLocale() {
        return localLocale;
    }

    /**
     * Auto generated setter method
     * @param param Locale
     */
    public void setLocale(java.lang.String param) {
        localLocaleTracker = param != null;

        this.localLocale = param;

    }

    public boolean isAppNameSpecified() {
        return localAppNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getAppName() {
        return localAppName;
    }

    /**
     * Auto generated setter method
     * @param param AppName
     */
    public void setAppName(java.lang.String param) {
        localAppNameTracker = param != null;

        this.localAppName = param;

    }

    public boolean isAppVersionSpecified() {
        return localAppVersionTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getAppVersion() {
        return localAppVersion;
    }

    /**
     * Auto generated setter method
     * @param param AppVersion
     */
    public void setAppVersion(java.lang.String param) {
        localAppVersionTracker = param != null;

        this.localAppVersion = param;

    }

    public boolean isGzipResponseSpecified() {
        return localGzipResponseTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getGzipResponse() {
        return localGzipResponse;
    }

    /**
     * Auto generated setter method
     * @param param GzipResponse
     */
    public void setGzipResponse(boolean param) {

        // setting primitive attribute tracker to true
        localGzipResponseTracker =
                true;

        this.localGzipResponse = param;

    }

    public boolean isFaultHttpStatusCodeSpecified() {
        return localFaultHttpStatusCodeTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getFaultHttpStatusCode() {
        return localFaultHttpStatusCode;
    }

    /**
     * Auto generated setter method
     * @param param FaultHttpStatusCode
     */
    public void setFaultHttpStatusCode(int param) {

        // setting primitive attribute tracker to true
        localFaultHttpStatusCodeTracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localFaultHttpStatusCode = param;

    }

    /**
     * Auto generated getter method
     * @return org.apache.axiom.om.OMAttribute[]
     */
    public org.apache.axiom.om.OMAttribute[] getExtraAttributes() {
        return localExtraAttributes;
    }

    /**
     * Auto generated setter method
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
     * @param param org.apache.axiom.om.OMAttribute
     */
    public void addExtraAttributes(org.apache.axiom.om.OMAttribute param) {
        if (localExtraAttributes == null) {
            localExtraAttributes = new org.apache.axiom.om.OMAttribute[] {};
        }

        java.util.List list =
                org.apache.axis2.databinding.utils.ConverterUtil.toList(localExtraAttributes);
        list.add(param);
        this.localExtraAttributes =
                (org.apache.axiom.om.OMAttribute[]) list.toArray(
                        new org.apache.axiom.om.OMAttribute[list.size()]);

    }

    /**
     *
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

            java.lang.String namespacePrefix = registerPrefix(xmlWriter, "http://www.scene7.com/IpsApi/xsd");
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

        if (localExtraAttributes != null) {
            for (int i = 0; i < localExtraAttributes.length; i++) {
                writeAttribute(localExtraAttributes[i].getNamespace().getName(),
                        localExtraAttributes[i].getLocalName(),
                        localExtraAttributes[i].getAttributeValue(), xmlWriter);
            }
        }
        if (localUserTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd";
            writeStartElement(null, namespace, "user", xmlWriter);

            if (localUser == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("user cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localUser);

            }

            xmlWriter.writeEndElement();
        }
        if (localPasswordTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd";
            writeStartElement(null, namespace, "password", xmlWriter);

            if (localPassword == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("password cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localPassword);

            }

            xmlWriter.writeEndElement();
        }
        if (localAccessTokenTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd";
            writeStartElement(null, namespace, "accessToken", xmlWriter);

            if (localAccessToken == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("accessToken cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localAccessToken);

            }

            xmlWriter.writeEndElement();
        }
        if (localLocaleTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd";
            writeStartElement(null, namespace, "locale", xmlWriter);

            if (localLocale == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("locale cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localLocale);

            }

            xmlWriter.writeEndElement();
        }
        if (localAppNameTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd";
            writeStartElement(null, namespace, "appName", xmlWriter);

            if (localAppName == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("appName cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localAppName);

            }

            xmlWriter.writeEndElement();
        }
        if (localAppVersionTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd";
            writeStartElement(null, namespace, "appVersion", xmlWriter);

            if (localAppVersion == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("appVersion cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localAppVersion);

            }

            xmlWriter.writeEndElement();
        }
        if (localGzipResponseTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd";
            writeStartElement(null, namespace, "gzipResponse", xmlWriter);

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("gzipResponse cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGzipResponse));
            }

            xmlWriter.writeEndElement();
        }
        if (localFaultHttpStatusCodeTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd";
            writeStartElement(null, namespace, "faultHttpStatusCode", xmlWriter);

            if (localFaultHttpStatusCode == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("faultHttpStatusCode cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFaultHttpStatusCode));
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
     *  method to handle Qnames
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
     *
     */
    public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
            throws org.apache.axis2.databinding.ADBException {

        java.util.ArrayList elementList = new java.util.ArrayList();
        java.util.ArrayList attribList = new java.util.ArrayList();

        if (localUserTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd",
                    "user"));

            if (localUser != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUser));
            } else {
                throw new org.apache.axis2.databinding.ADBException("user cannot be null!!");
            }
        }
        if (localPasswordTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd",
                    "password"));

            if (localPassword != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPassword));
            } else {
                throw new org.apache.axis2.databinding.ADBException("password cannot be null!!");
            }
        }
        if (localAccessTokenTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd",
                    "accessToken"));

            if (localAccessToken != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAccessToken));
            } else {
                throw new org.apache.axis2.databinding.ADBException("accessToken cannot be null!!");
            }
        }
        if (localLocaleTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd",
                    "locale"));

            if (localLocale != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLocale));
            } else {
                throw new org.apache.axis2.databinding.ADBException("locale cannot be null!!");
            }
        }
        if (localAppNameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd",
                    "appName"));

            if (localAppName != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAppName));
            } else {
                throw new org.apache.axis2.databinding.ADBException("appName cannot be null!!");
            }
        }
        if (localAppVersionTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd",
                    "appVersion"));

            if (localAppVersion != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAppVersion));
            } else {
                throw new org.apache.axis2.databinding.ADBException("appVersion cannot be null!!");
            }
        }
        if (localGzipResponseTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd",
                    "gzipResponse"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localGzipResponse));
        }
        if (localFaultHttpStatusCodeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd",
                    "faultHttpStatusCode"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFaultHttpStatusCode));
        }
        for (int i = 0; i < localExtraAttributes.length; i++) {
            attribList.add(org.apache.axis2.databinding.utils.Constants.OM_ATTRIBUTE_KEY);
            attribList.add(localExtraAttributes[i]);
        }

        return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());

    }

    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
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

                while (!reader.isEndElement()) {
                    if (reader.isStartElement()) {

                        if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd", "user")
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

                        else if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd", "password")
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

                        else if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd", "accessToken")
                                .equals(reader.getName())) {

                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException("The element: " + "accessToken" + "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setAccessToken(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                            reader.next();

                        }  // End of if for expected property start element

                        else if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd", "locale")
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

                        else if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd", "appName")
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

                        else if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd", "appVersion")
                                .equals(reader.getName())) {

                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException("The element: " + "appVersion" + "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setAppVersion(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                            reader.next();

                        }  // End of if for expected property start element

                        else if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd",
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

                        else if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd",
                                "faultHttpStatusCode").equals(reader.getName())) {

                            nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                            if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                                throw new org.apache.axis2.databinding.ADBException(
                                        "The element: " + "faultHttpStatusCode" + "  cannot be null");
                            }

                            java.lang.String content = reader.getElementText();

                            object.setFaultHttpStatusCode(
                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                            reader.next();

                        }  // End of if for expected property start element

                        else {
                            // A start element we are not expecting indicates an invalid parameter was passed
                            throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                        }

                    } else {
                        reader.next();
                    }
                }  // end of while loop

            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

    }//end of factory class

}
           
    