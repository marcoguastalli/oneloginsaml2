/**
 * MPEvent.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.scene7.www.ipsapi.xsd._2016_01_14_beta;

/**
 * MPEvent bean class
 */

public class MPEvent
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = MPEvent
                Namespace URI = http://www.scene7.com/IpsApi/xsd/2016-01-14-beta
                Namespace Prefix = ns1
                */

    /**
     * field for EventType
     */

    protected java.lang.String localEventType;
    /**
     * field for CreateDate
     */

    protected java.util.Calendar localCreateDate;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localCreateDateTracker = false;
    /**
     * field for IpsUser
     */

    protected java.lang.String localIpsUser;
    /**
     * field for CompanyId
     */

    protected int localCompanyId;
    /**
     * field for CompanyName
     */

    protected java.lang.String localCompanyName;
    /**
     * field for JobName
     */

    protected java.lang.String localJobName;
    /**
     * field for JobDescription
     */

    protected java.lang.String localJobDescription;
    /**
     * field for String1
     */

    protected java.lang.String localString1;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localString1Tracker = false;
    /**
     * field for String2
     */

    protected java.lang.String localString2;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localString2Tracker = false;
    /**
     * field for String3
     */

    protected java.lang.String localString3;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localString3Tracker = false;
    /**
     * field for String4
     */

    protected java.lang.String localString4;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localString4Tracker = false;
    /**
     * field for String5
     */

    protected java.lang.String localString5;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localString5Tracker = false;
    /**
     * field for Int1
     */

    protected int localInt1;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localInt1Tracker = false;
    /**
     * field for Int2
     */

    protected int localInt2;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localInt2Tracker = false;
    /**
     * field for Int3
     */

    protected int localInt3;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localInt3Tracker = false;
    /**
     * field for Int4
     */

    protected int localInt4;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localInt4Tracker = false;
    /**
     * field for Int5
     */

    protected int localInt5;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localInt5Tracker = false;
    /**
     * field for Float1
     */

    protected double localFloat1;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localFloat1Tracker = false;
    /**
     * field for Float2
     */

    protected double localFloat2;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localFloat2Tracker = false;
    /**
     * field for Float3
     */

    protected double localFloat3;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localFloat3Tracker = false;
    /**
     * field for Time1
     */

    protected java.util.Calendar localTime1;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localTime1Tracker = false;

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
    public java.lang.String getEventType() {
        return this.localEventType;
    }

    /**
     * Auto generated setter method
     *
     * @param param EventType
     */
    public void setEventType(java.lang.String param) {

        this.localEventType = param;

    }

    public boolean isCreateDateSpecified() {
        return this.localCreateDateTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getCreateDate() {
        return this.localCreateDate;
    }

    /**
     * Auto generated setter method
     *
     * @param param CreateDate
     */
    public void setCreateDate(java.util.Calendar param) {
        this.localCreateDateTracker = param != null;

        this.localCreateDate = param;

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

        this.localIpsUser = param;

    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getCompanyId() {
        return this.localCompanyId;
    }

    /**
     * Auto generated setter method
     *
     * @param param CompanyId
     */
    public void setCompanyId(int param) {

        this.localCompanyId = param;

    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getCompanyName() {
        return this.localCompanyName;
    }

    /**
     * Auto generated setter method
     *
     * @param param CompanyName
     */
    public void setCompanyName(java.lang.String param) {

        this.localCompanyName = param;

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
    public java.lang.String getJobDescription() {
        return this.localJobDescription;
    }

    /**
     * Auto generated setter method
     *
     * @param param JobDescription
     */
    public void setJobDescription(java.lang.String param) {

        this.localJobDescription = param;

    }

    public boolean isString1Specified() {
        return this.localString1Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getString1() {
        return this.localString1;
    }

    /**
     * Auto generated setter method
     *
     * @param param String1
     */
    public void setString1(java.lang.String param) {
        this.localString1Tracker = param != null;

        this.localString1 = param;

    }

    public boolean isString2Specified() {
        return this.localString2Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getString2() {
        return this.localString2;
    }

    /**
     * Auto generated setter method
     *
     * @param param String2
     */
    public void setString2(java.lang.String param) {
        this.localString2Tracker = param != null;

        this.localString2 = param;

    }

    public boolean isString3Specified() {
        return this.localString3Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getString3() {
        return this.localString3;
    }

    /**
     * Auto generated setter method
     *
     * @param param String3
     */
    public void setString3(java.lang.String param) {
        this.localString3Tracker = param != null;

        this.localString3 = param;

    }

    public boolean isString4Specified() {
        return this.localString4Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getString4() {
        return this.localString4;
    }

    /**
     * Auto generated setter method
     *
     * @param param String4
     */
    public void setString4(java.lang.String param) {
        this.localString4Tracker = param != null;

        this.localString4 = param;

    }

    public boolean isString5Specified() {
        return this.localString5Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getString5() {
        return this.localString5;
    }

    /**
     * Auto generated setter method
     *
     * @param param String5
     */
    public void setString5(java.lang.String param) {
        this.localString5Tracker = param != null;

        this.localString5 = param;

    }

    public boolean isInt1Specified() {
        return this.localInt1Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getInt1() {
        return this.localInt1;
    }

    /**
     * Auto generated setter method
     *
     * @param param Int1
     */
    public void setInt1(int param) {

        // setting primitive attribute tracker to true
        this.localInt1Tracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localInt1 = param;

    }

    public boolean isInt2Specified() {
        return this.localInt2Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getInt2() {
        return this.localInt2;
    }

    /**
     * Auto generated setter method
     *
     * @param param Int2
     */
    public void setInt2(int param) {

        // setting primitive attribute tracker to true
        this.localInt2Tracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localInt2 = param;

    }

    public boolean isInt3Specified() {
        return this.localInt3Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getInt3() {
        return this.localInt3;
    }

    /**
     * Auto generated setter method
     *
     * @param param Int3
     */
    public void setInt3(int param) {

        // setting primitive attribute tracker to true
        this.localInt3Tracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localInt3 = param;

    }

    public boolean isInt4Specified() {
        return this.localInt4Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getInt4() {
        return this.localInt4;
    }

    /**
     * Auto generated setter method
     *
     * @param param Int4
     */
    public void setInt4(int param) {

        // setting primitive attribute tracker to true
        this.localInt4Tracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localInt4 = param;

    }

    public boolean isInt5Specified() {
        return this.localInt5Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getInt5() {
        return this.localInt5;
    }

    /**
     * Auto generated setter method
     *
     * @param param Int5
     */
    public void setInt5(int param) {

        // setting primitive attribute tracker to true
        this.localInt5Tracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localInt5 = param;

    }

    public boolean isFloat1Specified() {
        return this.localFloat1Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return double
     */
    public double getFloat1() {
        return this.localFloat1;
    }

    /**
     * Auto generated setter method
     *
     * @param param Float1
     */
    public void setFloat1(double param) {

        // setting primitive attribute tracker to true
        this.localFloat1Tracker =
                !java.lang.Double.isNaN(param);

        this.localFloat1 = param;

    }

    public boolean isFloat2Specified() {
        return this.localFloat2Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return double
     */
    public double getFloat2() {
        return this.localFloat2;
    }

    /**
     * Auto generated setter method
     *
     * @param param Float2
     */
    public void setFloat2(double param) {

        // setting primitive attribute tracker to true
        this.localFloat2Tracker =
                !java.lang.Double.isNaN(param);

        this.localFloat2 = param;

    }

    public boolean isFloat3Specified() {
        return this.localFloat3Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return double
     */
    public double getFloat3() {
        return this.localFloat3;
    }

    /**
     * Auto generated setter method
     *
     * @param param Float3
     */
    public void setFloat3(double param) {

        // setting primitive attribute tracker to true
        this.localFloat3Tracker =
                !java.lang.Double.isNaN(param);

        this.localFloat3 = param;

    }

    public boolean isTime1Specified() {
        return this.localTime1Tracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.util.Calendar
     */
    public java.util.Calendar getTime1() {
        return this.localTime1;
    }

    /**
     * Auto generated setter method
     *
     * @param param Time1
     */
    public void setTime1(java.util.Calendar param) {
        this.localTime1Tracker = param != null;

        this.localTime1 = param;

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
                        namespacePrefix + ":MPEvent",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "MPEvent",
                        xmlWriter);
            }

        }

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "eventType", xmlWriter);

        if (this.localEventType == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("eventType cannot be null!!");

        } else {

            xmlWriter.writeCharacters(this.localEventType);

        }

        xmlWriter.writeEndElement();
        if (this.localCreateDateTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "createDate", xmlWriter);

            if (this.localCreateDate == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("createDate cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localCreateDate));

            }

            xmlWriter.writeEndElement();
        }
        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "ipsUser", xmlWriter);

        if (this.localIpsUser == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("ipsUser cannot be null!!");

        } else {

            xmlWriter.writeCharacters(this.localIpsUser);

        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "companyId", xmlWriter);

        if (this.localCompanyId == java.lang.Integer.MIN_VALUE) {

            throw new org.apache.axis2.databinding.ADBException("companyId cannot be null!!");

        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localCompanyId));
        }

        xmlWriter.writeEndElement();

        namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
        writeStartElement(null, namespace, "companyName", xmlWriter);

        if (this.localCompanyName == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("companyName cannot be null!!");

        } else {

            xmlWriter.writeCharacters(this.localCompanyName);

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
        writeStartElement(null, namespace, "jobDescription", xmlWriter);

        if (this.localJobDescription == null) {
            // write the nil attribute

            throw new org.apache.axis2.databinding.ADBException("jobDescription cannot be null!!");

        } else {

            xmlWriter.writeCharacters(this.localJobDescription);

        }

        xmlWriter.writeEndElement();
        if (this.localString1Tracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "string1", xmlWriter);

            if (this.localString1 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("string1 cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localString1);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localString2Tracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "string2", xmlWriter);

            if (this.localString2 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("string2 cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localString2);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localString3Tracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "string3", xmlWriter);

            if (this.localString3 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("string3 cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localString3);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localString4Tracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "string4", xmlWriter);

            if (this.localString4 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("string4 cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localString4);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localString5Tracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "string5", xmlWriter);

            if (this.localString5 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("string5 cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localString5);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localInt1Tracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "int1", xmlWriter);

            if (this.localInt1 == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("int1 cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localInt1));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localInt2Tracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "int2", xmlWriter);

            if (this.localInt2 == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("int2 cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localInt2));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localInt3Tracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "int3", xmlWriter);

            if (this.localInt3 == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("int3 cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localInt3));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localInt4Tracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "int4", xmlWriter);

            if (this.localInt4 == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("int4 cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localInt4));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localInt5Tracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "int5", xmlWriter);

            if (this.localInt5 == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("int5 cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localInt5));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localFloat1Tracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "float1", xmlWriter);

            if (java.lang.Double.isNaN(this.localFloat1)) {

                throw new org.apache.axis2.databinding.ADBException("float1 cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFloat1));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localFloat2Tracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "float2", xmlWriter);

            if (java.lang.Double.isNaN(this.localFloat2)) {

                throw new org.apache.axis2.databinding.ADBException("float2 cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFloat2));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localFloat3Tracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "float3", xmlWriter);

            if (java.lang.Double.isNaN(this.localFloat3)) {

                throw new org.apache.axis2.databinding.ADBException("float3 cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFloat3));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localTime1Tracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "time1", xmlWriter);

            if (this.localTime1 == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("time1 cannot be null!!");

            } else {

                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localTime1));

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
                "eventType"));

        if (this.localEventType != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localEventType));
        } else {
            throw new org.apache.axis2.databinding.ADBException("eventType cannot be null!!");
        }
        if (this.localCreateDateTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "createDate"));

            if (this.localCreateDate != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localCreateDate));
            } else {
                throw new org.apache.axis2.databinding.ADBException("createDate cannot be null!!");
            }
        }
        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "ipsUser"));

        if (this.localIpsUser != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localIpsUser));
        } else {
            throw new org.apache.axis2.databinding.ADBException("ipsUser cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "companyId"));

        elementList.add(
                org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localCompanyId));

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "companyName"));

        if (this.localCompanyName != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localCompanyName));
        } else {
            throw new org.apache.axis2.databinding.ADBException("companyName cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "jobName"));

        if (this.localJobName != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localJobName));
        } else {
            throw new org.apache.axis2.databinding.ADBException("jobName cannot be null!!");
        }

        elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                "jobDescription"));

        if (this.localJobDescription != null) {
            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localJobDescription));
        } else {
            throw new org.apache.axis2.databinding.ADBException("jobDescription cannot be null!!");
        }
        if (this.localString1Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "string1"));

            if (this.localString1 != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localString1));
            } else {
                throw new org.apache.axis2.databinding.ADBException("string1 cannot be null!!");
            }
        }
        if (this.localString2Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "string2"));

            if (this.localString2 != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localString2));
            } else {
                throw new org.apache.axis2.databinding.ADBException("string2 cannot be null!!");
            }
        }
        if (this.localString3Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "string3"));

            if (this.localString3 != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localString3));
            } else {
                throw new org.apache.axis2.databinding.ADBException("string3 cannot be null!!");
            }
        }
        if (this.localString4Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "string4"));

            if (this.localString4 != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localString4));
            } else {
                throw new org.apache.axis2.databinding.ADBException("string4 cannot be null!!");
            }
        }
        if (this.localString5Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "string5"));

            if (this.localString5 != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localString5));
            } else {
                throw new org.apache.axis2.databinding.ADBException("string5 cannot be null!!");
            }
        }
        if (this.localInt1Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "int1"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localInt1));
        }
        if (this.localInt2Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "int2"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localInt2));
        }
        if (this.localInt3Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "int3"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localInt3));
        }
        if (this.localInt4Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "int4"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localInt4));
        }
        if (this.localInt5Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "int5"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localInt5));
        }
        if (this.localFloat1Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "float1"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFloat1));
        }
        if (this.localFloat2Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "float2"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFloat2));
        }
        if (this.localFloat3Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "float3"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFloat3));
        }
        if (this.localTime1Tracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "time1"));

            if (this.localTime1 != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localTime1));
            } else {
                throw new org.apache.axis2.databinding.ADBException("time1 cannot be null!!");
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
        public static MPEvent parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            MPEvent object =
                    new MPEvent();

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

                        if (!"MPEvent".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (MPEvent) com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExtensionMapper.getTypeObject(
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
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "createDate").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "createDate" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCreateDate(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));

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
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "companyId").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "companyId" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCompanyId(
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
                        "companyName").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "companyName" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCompanyName(
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
                    // A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "string1")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "string1" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setString1(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "string2")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "string2" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setString2(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "string3")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "string3" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setString3(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "string4")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "string4" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setString4(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "string5")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "string5" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setString5(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "int1")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "int1" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setInt1(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setInt1(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "int2")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "int2" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setInt2(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setInt2(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "int3")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "int3" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setInt3(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setInt3(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "int4")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "int4" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setInt4(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setInt4(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "int5")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "int5" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setInt5(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setInt5(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "float1")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "float1" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFloat1(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setFloat1(java.lang.Double.NaN);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "float2")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "float2" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFloat2(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setFloat2(java.lang.Double.NaN);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "float3")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "float3" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFloat3(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setFloat3(java.lang.Double.NaN);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "time1")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "time1" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTime1(
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
           
    