/**
 * ZoomTarget.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.scene7.www.ipsapi.xsd._2016_01_14_beta;

/**
 *  ZoomTarget bean class
 */
@SuppressWarnings({ "unchecked", "unused" })

public class ZoomTarget
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = ZoomTarget
                Namespace URI = http://www.scene7.com/IpsApi/xsd/2016-01-14-beta
                Namespace Prefix = ns1
                */

    /**
     * field for ZoomTargetHandle
     */

    protected java.lang.String localZoomTargetHandle;

    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localZoomTargetHandleTracker = false;
    /**
     * field for Name
     */

    protected java.lang.String localName;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localNameTracker = false;
    /**
     * field for XPosition
     */

    protected int localXPosition;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localXPositionTracker = false;
    /**
     * field for YPosition
     */

    protected int localYPosition;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localYPositionTracker = false;
    /**
     * field for Width
     */

    protected int localWidth;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localWidthTracker = false;
    /**
     * field for Height
     */

    protected int localHeight;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localHeightTracker = false;
    /**
     * field for UserData
     */

    protected java.lang.String localUserData;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localUserDataTracker = false;
    /**
     * field for Position
     */

    protected int localPosition;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localPositionTracker = false;
    /**
     * field for LastModified
     */

    protected java.util.Calendar localLastModified;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localLastModifiedTracker = false;

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    public boolean isZoomTargetHandleSpecified() {
        return localZoomTargetHandleTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getZoomTargetHandle() {
        return localZoomTargetHandle;
    }

    /**
     * Auto generated setter method
     * @param param ZoomTargetHandle
     */
    public void setZoomTargetHandle(java.lang.String param) {
        localZoomTargetHandleTracker = param != null;

        this.localZoomTargetHandle = param;

    }

    public boolean isNameSpecified() {
        return localNameTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getName() {
        return localName;
    }

    /**
     * Auto generated setter method
     * @param param Name
     */
    public void setName(java.lang.String param) {
        localNameTracker = param != null;

        this.localName = param;

    }

    public boolean isXPositionSpecified() {
        return localXPositionTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getXPosition() {
        return localXPosition;
    }

    /**
     * Auto generated setter method
     * @param param XPosition
     */
    public void setXPosition(int param) {

        // setting primitive attribute tracker to true
        localXPositionTracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localXPosition = param;

    }

    public boolean isYPositionSpecified() {
        return localYPositionTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getYPosition() {
        return localYPosition;
    }

    /**
     * Auto generated setter method
     * @param param YPosition
     */
    public void setYPosition(int param) {

        // setting primitive attribute tracker to true
        localYPositionTracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localYPosition = param;

    }

    public boolean isWidthSpecified() {
        return localWidthTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getWidth() {
        return localWidth;
    }

    /**
     * Auto generated setter method
     * @param param Width
     */
    public void setWidth(int param) {

        // setting primitive attribute tracker to true
        localWidthTracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localWidth = param;

    }

    public boolean isHeightSpecified() {
        return localHeightTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getHeight() {
        return localHeight;
    }

    /**
     * Auto generated setter method
     * @param param Height
     */
    public void setHeight(int param) {

        // setting primitive attribute tracker to true
        localHeightTracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localHeight = param;

    }

    public boolean isUserDataSpecified() {
        return localUserDataTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getUserData() {
        return localUserData;
    }

    /**
     * Auto generated setter method
     * @param param UserData
     */
    public void setUserData(java.lang.String param) {
        localUserDataTracker = param != null;

        this.localUserData = param;

    }

    public boolean isPositionSpecified() {
        return localPositionTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getPosition() {
        return localPosition;
    }

    /**
     * Auto generated setter method
     * @param param Position
     */
    public void setPosition(int param) {

        // setting primitive attribute tracker to true
        localPositionTracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localPosition = param;

    }

    public boolean isLastModifiedSpecified() {
        return localLastModifiedTracker;
    }

    /**
     * Auto generated getter method
     * @return java.util.Calendar
     */
    public java.util.Calendar getLastModified() {
        return localLastModified;
    }

    /**
     * Auto generated setter method
     * @param param LastModified
     */
    public void setLastModified(java.util.Calendar param) {
        localLastModifiedTracker = param != null;

        this.localLastModified = param;

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
                        namespacePrefix + ":ZoomTarget",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "ZoomTarget",
                        xmlWriter);
            }

        }
        if (localZoomTargetHandleTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "zoomTargetHandle", xmlWriter);

            if (localZoomTargetHandle == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("zoomTargetHandle cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localZoomTargetHandle);

            }

            xmlWriter.writeEndElement();
        }
        if (localNameTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "name", xmlWriter);

            if (localName == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("name cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localName);

            }

            xmlWriter.writeEndElement();
        }
        if (localXPositionTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "xPosition", xmlWriter);

            if (localXPosition == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("xPosition cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localXPosition));
            }

            xmlWriter.writeEndElement();
        }
        if (localYPositionTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "yPosition", xmlWriter);

            if (localYPosition == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("yPosition cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localYPosition));
            }

            xmlWriter.writeEndElement();
        }
        if (localWidthTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "width", xmlWriter);

            if (localWidth == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("width cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWidth));
            }

            xmlWriter.writeEndElement();
        }
        if (localHeightTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "height", xmlWriter);

            if (localHeight == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("height cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHeight));
            }

            xmlWriter.writeEndElement();
        }
        if (localUserDataTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "userData", xmlWriter);

            if (localUserData == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("userData cannot be null!!");

            } else {

                xmlWriter.writeCharacters(localUserData);

            }

            xmlWriter.writeEndElement();
        }
        if (localPositionTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "position", xmlWriter);

            if (localPosition == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("position cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPosition));
            }

            xmlWriter.writeEndElement();
        }
        if (localLastModifiedTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "lastModified", xmlWriter);

            if (localLastModified == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("lastModified cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastModified));

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

        if (localZoomTargetHandleTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "zoomTargetHandle"));

            if (localZoomTargetHandle != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localZoomTargetHandle));
            } else {
                throw new org.apache.axis2.databinding.ADBException("zoomTargetHandle cannot be null!!");
            }
        }
        if (localNameTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "name"));

            if (localName != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localName));
            } else {
                throw new org.apache.axis2.databinding.ADBException("name cannot be null!!");
            }
        }
        if (localXPositionTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "xPosition"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localXPosition));
        }
        if (localYPositionTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "yPosition"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localYPosition));
        }
        if (localWidthTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "width"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWidth));
        }
        if (localHeightTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "height"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localHeight));
        }
        if (localUserDataTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "userData"));

            if (localUserData != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localUserData));
            } else {
                throw new org.apache.axis2.databinding.ADBException("userData cannot be null!!");
            }
        }
        if (localPositionTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "position"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localPosition));
        }
        if (localLastModifiedTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "lastModified"));

            if (localLastModified != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localLastModified));
            } else {
                throw new org.apache.axis2.databinding.ADBException("lastModified cannot be null!!");
            }
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
        public static ZoomTarget parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            ZoomTarget object =
                    new ZoomTarget();

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

                        if (!"ZoomTarget".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (ZoomTarget) com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExtensionMapper.getTypeObject(
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
                        "zoomTargetHandle").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "zoomTargetHandle" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setZoomTargetHandle(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "name")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "name" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setName(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "xPosition").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "xPosition" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setXPosition(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setXPosition(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "yPosition").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "yPosition" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setYPosition(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setYPosition(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "width")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "width" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setWidth(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setWidth(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "height")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "height" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setHeight(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setHeight(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "userData")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "userData" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setUserData(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "position")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "position" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPosition(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setPosition(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "lastModified").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "lastModified" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLastModified(
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
           
    