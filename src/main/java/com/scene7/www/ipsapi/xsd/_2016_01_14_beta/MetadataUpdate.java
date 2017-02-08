/**
 * MetadataUpdate.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.scene7.www.ipsapi.xsd._2016_01_14_beta;

/**
 * MetadataUpdate bean class
 */

public class MetadataUpdate
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = MetadataUpdate
                Namespace URI = http://www.scene7.com/IpsApi/xsd/2016-01-14-beta
                Namespace Prefix = ns1
                */

    /**
     * field for FieldHandle
     */

    protected java.lang.String localFieldHandle;
    /**
     * field for Value
     */

    protected java.lang.String localValue;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localValueTracker = false;
    /**
     * field for BoolVal
     */

    protected boolean localBoolVal;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localBoolValTracker = false;
    /**
     * field for LongVal
     */

    protected long localLongVal;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localLongValTracker = false;
    /**
     * field for DoubleVal
     */

    protected double localDoubleVal;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localDoubleValTracker = false;
    /**
     * field for DateVal
     */

    protected java.util.Calendar localDateVal;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localDateValTracker = false;
    /**
     * field for AddTagValueArray
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray localAddTagValueArray;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localAddTagValueArrayTracker = false;
    /**
     * field for SetTagValueArray
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray localSetTagValueArray;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localSetTagValueArrayTracker = false;
    /**
     * field for DeleteTagValueArray
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray localDeleteTagValueArray;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localDeleteTagValueArrayTracker = false;

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
    public java.lang.String getFieldHandle() {
        return this.localFieldHandle;
    }

    /**
     * Auto generated setter method
     *
     * @param param FieldHandle
     */
    public void setFieldHandle(java.lang.String param) {

        this.localFieldHandle = param;

    }

    public boolean isValueSpecified() {
        return this.localValueTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getValue() {
        return this.localValue;
    }

    /**
     * Auto generated setter method
     *
     * @param param Value
     */
    public void setValue(java.lang.String param) {
        this.localValueTracker = param != null;

        this.localValue = param;

    }

    public boolean isBoolValSpecified() {
        return this.localBoolValTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return boolean
     */
    public boolean getBoolVal() {
        return this.localBoolVal;
    }

    /**
     * Auto generated setter method
     *
     * @param param BoolVal
     */
    public void setBoolVal(boolean param) {

        // setting primitive attribute tracker to true
        this.localBoolValTracker =
                true;

        this.localBoolVal = param;

    }

    public boolean isLongValSpecified() {
        return this.localLongValTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return long
     */
    public long getLongVal() {
        return this.localLongVal;
    }

    /**
     * Auto generated setter method
     *
     * @param param LongVal
     */
    public void setLongVal(long param) {

        // setting primitive attribute tracker to true
        this.localLongValTracker =
                param != java.lang.Long.MIN_VALUE;

        this.localLongVal = param;

    }

    public boolean isDoubleValSpecified() {
        return this.localDoubleValTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return double
     */
    public double getDoubleVal() {
        return this.localDoubleVal;
    }

    /**
     * Auto generated setter method
     *
     * @param param DoubleVal
     */
    public void setDoubleVal(double param) {

        // setting primitive attribute tracker to true
        this.localDoubleValTracker =
                !java.lang.Double.isNaN(param);

        this.localDoubleVal = param;

    }

    public boolean isDateValSpecified() {
        return this.localDateValTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getDateVal() {
        return this.localDateVal;
    }

    /**
     * Auto generated setter method
     *
     * @param param DateVal
     */
    public void setDateVal(java.util.Calendar param) {
        this.localDateValTracker = param != null;

        this.localDateVal = param;

    }

    public boolean isAddTagValueArraySpecified() {
        return this.localAddTagValueArrayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray getAddTagValueArray() {
        return this.localAddTagValueArray;
    }

    /**
     * Auto generated setter method
     *
     * @param param AddTagValueArray
     */
    public void setAddTagValueArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray param) {
        this.localAddTagValueArrayTracker = param != null;

        this.localAddTagValueArray = param;

    }

    public boolean isSetTagValueArraySpecified() {
        return this.localSetTagValueArrayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray getSetTagValueArray() {
        return this.localSetTagValueArray;
    }

    /**
     * Auto generated setter method
     *
     * @param param SetTagValueArray
     */
    public void setSetTagValueArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray param) {
        this.localSetTagValueArrayTracker = param != null;

        this.localSetTagValueArray = param;

    }

    public boolean isDeleteTagValueArraySpecified() {
        return this.localDeleteTagValueArrayTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray getDeleteTagValueArray() {
        return this.localDeleteTagValueArray;
    }

    /**
     * Auto generated setter method
     *
     * @param param DeleteTagValueArray
     */
    public void setDeleteTagValueArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray param) {
        this.localDeleteTagValueArrayTracker = param != null;

        this.localDeleteTagValueArray = param;

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
                        namespacePrefix + ":MetadataUpdate",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "MetadataUpdate",
                        xmlWriter);
            }

        }

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "fieldHandle", xmlWriter);

        if (this.localFieldHandle == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("fieldHandle cannot be null!!");

        } else {

            xmlWriter.writeCharacters(this.localFieldHandle);

        }

        xmlWriter.writeEndElement();
        if (this.localValueTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "value", xmlWriter);

            if (this.localValue == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("value cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localValue);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localBoolValTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "boolVal", xmlWriter);

            if (false) {

                throw new org.apache.axis2.databinding.ADBException("boolVal cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localBoolVal));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localLongValTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "longVal", xmlWriter);

            if (this.localLongVal == java.lang.Long.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("longVal cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localLongVal));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localDoubleValTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "doubleVal", xmlWriter);

            if (java.lang.Double.isNaN(this.localDoubleVal)) {

                throw new org.apache.axis2.databinding.ADBException("doubleVal cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localDoubleVal));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localDateValTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "dateVal", xmlWriter);

            if (this.localDateVal == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("dateVal cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localDateVal));

            }

            xmlWriter.writeEndElement();
        }
        if (this.localAddTagValueArrayTracker) {
            if (this.localAddTagValueArray == null) {
                throw new org.apache.axis2.databinding.ADBException("addTagValueArray cannot be null!!");
            }
            this.localAddTagValueArray
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "addTagValueArray"),
                            xmlWriter);
        }
        if (this.localSetTagValueArrayTracker) {
            if (this.localSetTagValueArray == null) {
                throw new org.apache.axis2.databinding.ADBException("setTagValueArray cannot be null!!");
            }
            this.localSetTagValueArray
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "setTagValueArray"),
                            xmlWriter);
        }
        if (this.localDeleteTagValueArrayTracker) {
            if (this.localDeleteTagValueArray == null) {
                throw new org.apache.axis2.databinding.ADBException("deleteTagValueArray cannot be null!!");
            }
            this.localDeleteTagValueArray
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "deleteTagValueArray"),
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
                "fieldHandle"));

        if (this.localFieldHandle != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFieldHandle));
        } else {
            throw new org.apache.axis2.databinding.ADBException("fieldHandle cannot be null!!");
        }
        if (this.localValueTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "value"));

            if (this.localValue != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localValue));
            } else {
                throw new org.apache.axis2.databinding.ADBException("value cannot be null!!");
            }
        }
        if (this.localBoolValTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "boolVal"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localBoolVal));
        }
        if (this.localLongValTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "longVal"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localLongVal));
        }
        if (this.localDoubleValTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "doubleVal"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localDoubleVal));
        }
        if (this.localDateValTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "dateVal"));

            if (this.localDateVal != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localDateVal));
            } else {
                throw new org.apache.axis2.databinding.ADBException("dateVal cannot be null!!");
            }
        }
        if (this.localAddTagValueArrayTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "addTagValueArray"));

            if (this.localAddTagValueArray == null) {
                throw new org.apache.axis2.databinding.ADBException("addTagValueArray cannot be null!!");
            }
            elementList.add(this.localAddTagValueArray);
        }
        if (this.localSetTagValueArrayTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "setTagValueArray"));

            if (this.localSetTagValueArray == null) {
                throw new org.apache.axis2.databinding.ADBException("setTagValueArray cannot be null!!");
            }
            elementList.add(this.localSetTagValueArray);
        }
        if (this.localDeleteTagValueArrayTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "deleteTagValueArray"));

            if (this.localDeleteTagValueArray == null) {
                throw new org.apache.axis2.databinding.ADBException("deleteTagValueArray cannot be null!!");
            }
            elementList.add(this.localDeleteTagValueArray);
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
        public static MetadataUpdate parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            MetadataUpdate object =
                    new MetadataUpdate();

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

                        if (!"MetadataUpdate".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (MetadataUpdate) com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExtensionMapper.getTypeObject(
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
                        "fieldHandle").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "fieldHandle" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFieldHandle(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "value")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "value" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setValue(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "boolVal")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "boolVal" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setBoolVal(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "longVal")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "longVal" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setLongVal(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setLongVal(java.lang.Long.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "doubleVal").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "doubleVal" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDoubleVal(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setDoubleVal(java.lang.Double.NaN);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "dateVal")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "dateVal" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDateVal(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "addTagValueArray").equals(reader.getName())) {

                    object.setAddTagValueArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "setTagValueArray").equals(reader.getName())) {

                    object.setSetTagValueArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "deleteTagValueArray").equals(reader.getName())) {

                    object.setDeleteTagValueArray(com.scene7.www.ipsapi.xsd._2016_01_14_beta.StringArray.Factory.parse(reader));

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
           
    