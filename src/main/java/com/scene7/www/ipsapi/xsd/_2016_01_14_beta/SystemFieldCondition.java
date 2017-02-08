/**
 * SystemFieldCondition.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.scene7.www.ipsapi.xsd._2016_01_14_beta;

/**
 * SystemFieldCondition bean class
 */

public class SystemFieldCondition
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = SystemFieldCondition
                Namespace URI = http://www.scene7.com/IpsApi/xsd/2016-01-14-beta
                Namespace Prefix = ns1
                */

    /**
     * field for Field
     */

    protected java.lang.String localField;
    /**
     * field for Op
     */

    protected java.lang.String localOp;
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
     * field for MinLong
     */

    protected long localMinLong;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localMinLongTracker = false;
    /**
     * field for MaxLong
     */

    protected long localMaxLong;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localMaxLongTracker = false;
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
     * field for MinDouble
     */

    protected double localMinDouble;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localMinDoubleTracker = false;
    /**
     * field for MaxDouble
     */

    protected double localMaxDouble;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localMaxDoubleTracker = false;
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
     * field for MinDate
     */

    protected java.util.Calendar localMinDate;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localMinDateTracker = false;
    /**
     * field for MaxDate
     */

    protected java.util.Calendar localMaxDate;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localMaxDateTracker = false;

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
    public java.lang.String getField() {
        return this.localField;
    }

    /**
     * Auto generated setter method
     *
     * @param param Field
     */
    public void setField(java.lang.String param) {

        this.localField = param;

    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getOp() {
        return this.localOp;
    }

    /**
     * Auto generated setter method
     *
     * @param param Op
     */
    public void setOp(java.lang.String param) {

        this.localOp = param;

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

    public boolean isMinLongSpecified() {
        return this.localMinLongTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return long
     */
    public long getMinLong() {
        return this.localMinLong;
    }

    /**
     * Auto generated setter method
     *
     * @param param MinLong
     */
    public void setMinLong(long param) {

        // setting primitive attribute tracker to true
        this.localMinLongTracker =
                param != java.lang.Long.MIN_VALUE;

        this.localMinLong = param;

    }

    public boolean isMaxLongSpecified() {
        return this.localMaxLongTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return long
     */
    public long getMaxLong() {
        return this.localMaxLong;
    }

    /**
     * Auto generated setter method
     *
     * @param param MaxLong
     */
    public void setMaxLong(long param) {

        // setting primitive attribute tracker to true
        this.localMaxLongTracker =
                param != java.lang.Long.MIN_VALUE;

        this.localMaxLong = param;

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

    public boolean isMinDoubleSpecified() {
        return this.localMinDoubleTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return double
     */
    public double getMinDouble() {
        return this.localMinDouble;
    }

    /**
     * Auto generated setter method
     *
     * @param param MinDouble
     */
    public void setMinDouble(double param) {

        // setting primitive attribute tracker to true
        this.localMinDoubleTracker =
                !java.lang.Double.isNaN(param);

        this.localMinDouble = param;

    }

    public boolean isMaxDoubleSpecified() {
        return this.localMaxDoubleTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return double
     */
    public double getMaxDouble() {
        return this.localMaxDouble;
    }

    /**
     * Auto generated setter method
     *
     * @param param MaxDouble
     */
    public void setMaxDouble(double param) {

        // setting primitive attribute tracker to true
        this.localMaxDoubleTracker =
                !java.lang.Double.isNaN(param);

        this.localMaxDouble = param;

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

    public boolean isMinDateSpecified() {
        return this.localMinDateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getMinDate() {
        return this.localMinDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param MinDate
     */
    public void setMinDate(java.util.Calendar param) {
        this.localMinDateTracker = param != null;

        this.localMinDate = param;

    }

    public boolean isMaxDateSpecified() {
        return this.localMaxDateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getMaxDate() {
        return this.localMaxDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param MaxDate
     */
    public void setMaxDate(java.util.Calendar param) {
        this.localMaxDateTracker = param != null;

        this.localMaxDate = param;

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
                        namespacePrefix + ":SystemFieldCondition",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "SystemFieldCondition",
                        xmlWriter);
            }

        }

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "field", xmlWriter);

        if (this.localField == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("field cannot be null!!");

        } else {

            xmlWriter.writeCharacters(this.localField);

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "op", xmlWriter);

        if (this.localOp == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("op cannot be null!!");

        } else {

            xmlWriter.writeCharacters(this.localOp);

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
        if (this.localMinLongTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "minLong", xmlWriter);

            if (this.localMinLong == java.lang.Long.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("minLong cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localMinLong));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localMaxLongTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "maxLong", xmlWriter);

            if (this.localMaxLong == java.lang.Long.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("maxLong cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localMaxLong));
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
        if (this.localMinDoubleTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "minDouble", xmlWriter);

            if (java.lang.Double.isNaN(this.localMinDouble)) {

                throw new org.apache.axis2.databinding.ADBException("minDouble cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localMinDouble));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localMaxDoubleTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "maxDouble", xmlWriter);

            if (java.lang.Double.isNaN(this.localMaxDouble)) {

                throw new org.apache.axis2.databinding.ADBException("maxDouble cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localMaxDouble));
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
        if (this.localMinDateTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "minDate", xmlWriter);

            if (this.localMinDate == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("minDate cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localMinDate));

            }

            xmlWriter.writeEndElement();
        }
        if (this.localMaxDateTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "maxDate", xmlWriter);

            if (this.localMaxDate == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("maxDate cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localMaxDate));

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
                "field"));

        if (this.localField != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localField));
        } else {
            throw new org.apache.axis2.databinding.ADBException("field cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "op"));

        if (this.localOp != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localOp));
        } else {
            throw new org.apache.axis2.databinding.ADBException("op cannot be null!!");
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
        if (this.localMinLongTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "minLong"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localMinLong));
        }
        if (this.localMaxLongTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "maxLong"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localMaxLong));
        }
        if (this.localDoubleValTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "doubleVal"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localDoubleVal));
        }
        if (this.localMinDoubleTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "minDouble"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localMinDouble));
        }
        if (this.localMaxDoubleTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "maxDouble"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localMaxDouble));
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
        if (this.localMinDateTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "minDate"));

            if (this.localMinDate != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localMinDate));
            } else {
                throw new org.apache.axis2.databinding.ADBException("minDate cannot be null!!");
            }
        }
        if (this.localMaxDateTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "maxDate"));

            if (this.localMaxDate != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localMaxDate));
            } else {
                throw new org.apache.axis2.databinding.ADBException("maxDate cannot be null!!");
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
        public static SystemFieldCondition parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            SystemFieldCondition object =
                    new SystemFieldCondition();

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

                        if (!"SystemFieldCondition".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (SystemFieldCondition) com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExtensionMapper.getTypeObject(
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "field")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "field" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setField(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "op")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "op" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setOp(
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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "minLong")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "minLong" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMinLong(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setMinLong(java.lang.Long.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "maxLong")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "maxLong" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMaxLong(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setMaxLong(java.lang.Long.MIN_VALUE);

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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "minDouble").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "minDouble" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMinDouble(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setMinDouble(java.lang.Double.NaN);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "maxDouble").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "maxDouble" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMaxDouble(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setMaxDouble(java.lang.Double.NaN);

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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "minDate")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "minDate" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMinDate(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "maxDate")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "maxDate" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMaxDate(
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
           
    