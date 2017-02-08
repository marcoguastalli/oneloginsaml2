/**
 * ImageInfo.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package com.scene7.www.ipsapi.xsd._2016_01_14_beta;

/**
 * ImageInfo bean class
 */

public class ImageInfo
        implements org.apache.axis2.databinding.ADBBean {
        /* This type was generated from the piece of schema that had
                name = ImageInfo
                Namespace URI = http://www.scene7.com/IpsApi/xsd/2016-01-14-beta
                Namespace Prefix = ns1
                */

    /**
     * field for OriginalPath
     */

    protected java.lang.String localOriginalPath;

    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localOriginalPathTracker = false;
    /**
     * field for OriginalFile
     */

    protected java.lang.String localOriginalFile;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localOriginalFileTracker = false;
    /**
     * field for OptimizedPath
     */

    protected java.lang.String localOptimizedPath;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localOptimizedPathTracker = false;
    /**
     * field for OptimizedFile
     */

    protected java.lang.String localOptimizedFile;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localOptimizedFileTracker = false;
    /**
     * field for MaskPath
     */

    protected java.lang.String localMaskPath;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localMaskPathTracker = false;
    /**
     * field for MaskFile
     */

    protected java.lang.String localMaskFile;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localMaskFileTracker = false;
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
     * field for FileSize
     */

    protected long localFileSize;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localFileSizeTracker = false;
    /**
     * field for Resolution
     */

    protected double localResolution;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localResolutionTracker = false;
    /**
     * field for Sku
     */

    protected java.lang.String localSku;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localSkuTracker = false;
    /**
     * field for Description
     */

    protected java.lang.String localDescription;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localDescriptionTracker = false;
    /**
     * field for Comments
     */

    protected java.lang.String localComments;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localCommentsTracker = false;
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
     * field for AnchorX
     */

    protected int localAnchorX;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localAnchorXTracker = false;
    /**
     * field for AnchorY
     */

    protected int localAnchorY;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localAnchorYTracker = false;
    /**
     * field for UrlModifier
     */

    protected java.lang.String localUrlModifier;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localUrlModifierTracker = false;
    /**
     * field for UrlPostApplyModifier
     */

    protected java.lang.String localUrlPostApplyModifier;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localUrlPostApplyModifierTracker = false;
    /**
     * field for ZoomTargets
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.ZoomTargetArray localZoomTargets;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localZoomTargetsTracker = false;
    /**
     * field for Masks
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.MaskArray localMasks;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localMasksTracker = false;
    /**
     * field for ImageMaps
     */

    protected com.scene7.www.ipsapi.xsd._2016_01_14_beta.ImageMapArray localImageMaps;
    /*  This tracker boolean wil be used to detect whether the user called the set method
   *   for this attribute. It will be used to determine whether to include this field
    *   in the serialized XML
    */
    protected boolean localImageMapsTracker = false;

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta")) {
            return "ns1";
        }
        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    public boolean isOriginalPathSpecified() {
        return this.localOriginalPathTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getOriginalPath() {
        return this.localOriginalPath;
    }

    /**
     * Auto generated setter method
     *
     * @param param OriginalPath
     */
    public void setOriginalPath(java.lang.String param) {
        this.localOriginalPathTracker = param != null;

        this.localOriginalPath = param;

    }

    public boolean isOriginalFileSpecified() {
        return this.localOriginalFileTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getOriginalFile() {
        return this.localOriginalFile;
    }

    /**
     * Auto generated setter method
     *
     * @param param OriginalFile
     */
    public void setOriginalFile(java.lang.String param) {
        this.localOriginalFileTracker = param != null;

        this.localOriginalFile = param;

    }

    public boolean isOptimizedPathSpecified() {
        return this.localOptimizedPathTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getOptimizedPath() {
        return this.localOptimizedPath;
    }

    /**
     * Auto generated setter method
     *
     * @param param OptimizedPath
     */
    public void setOptimizedPath(java.lang.String param) {
        this.localOptimizedPathTracker = param != null;

        this.localOptimizedPath = param;

    }

    public boolean isOptimizedFileSpecified() {
        return this.localOptimizedFileTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getOptimizedFile() {
        return this.localOptimizedFile;
    }

    /**
     * Auto generated setter method
     *
     * @param param OptimizedFile
     */
    public void setOptimizedFile(java.lang.String param) {
        this.localOptimizedFileTracker = param != null;

        this.localOptimizedFile = param;

    }

    public boolean isMaskPathSpecified() {
        return this.localMaskPathTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getMaskPath() {
        return this.localMaskPath;
    }

    /**
     * Auto generated setter method
     *
     * @param param MaskPath
     */
    public void setMaskPath(java.lang.String param) {
        this.localMaskPathTracker = param != null;

        this.localMaskPath = param;

    }

    public boolean isMaskFileSpecified() {
        return this.localMaskFileTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getMaskFile() {
        return this.localMaskFile;
    }

    /**
     * Auto generated setter method
     *
     * @param param MaskFile
     */
    public void setMaskFile(java.lang.String param) {
        this.localMaskFileTracker = param != null;

        this.localMaskFile = param;

    }

    public boolean isWidthSpecified() {
        return this.localWidthTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getWidth() {
        return this.localWidth;
    }

    /**
     * Auto generated setter method
     *
     * @param param Width
     */
    public void setWidth(int param) {

        // setting primitive attribute tracker to true
        this.localWidthTracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localWidth = param;

    }

    public boolean isHeightSpecified() {
        return this.localHeightTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getHeight() {
        return this.localHeight;
    }

    /**
     * Auto generated setter method
     *
     * @param param Height
     */
    public void setHeight(int param) {

        // setting primitive attribute tracker to true
        this.localHeightTracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localHeight = param;

    }

    public boolean isFileSizeSpecified() {
        return this.localFileSizeTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return long
     */
    public long getFileSize() {
        return this.localFileSize;
    }

    /**
     * Auto generated setter method
     *
     * @param param FileSize
     */
    public void setFileSize(long param) {

        // setting primitive attribute tracker to true
        this.localFileSizeTracker =
                param != java.lang.Long.MIN_VALUE;

        this.localFileSize = param;

    }

    public boolean isResolutionSpecified() {
        return this.localResolutionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return double
     */
    public double getResolution() {
        return this.localResolution;
    }

    /**
     * Auto generated setter method
     *
     * @param param Resolution
     */
    public void setResolution(double param) {

        // setting primitive attribute tracker to true
        this.localResolutionTracker =
                !java.lang.Double.isNaN(param);

        this.localResolution = param;

    }

    public boolean isSkuSpecified() {
        return this.localSkuTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getSku() {
        return this.localSku;
    }

    /**
     * Auto generated setter method
     *
     * @param param Sku
     */
    public void setSku(java.lang.String param) {
        this.localSkuTracker = param != null;

        this.localSku = param;

    }

    public boolean isDescriptionSpecified() {
        return this.localDescriptionTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getDescription() {
        return this.localDescription;
    }

    /**
     * Auto generated setter method
     *
     * @param param Description
     */
    public void setDescription(java.lang.String param) {
        this.localDescriptionTracker = param != null;

        this.localDescription = param;

    }

    public boolean isCommentsSpecified() {
        return this.localCommentsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getComments() {
        return this.localComments;
    }

    /**
     * Auto generated setter method
     *
     * @param param Comments
     */
    public void setComments(java.lang.String param) {
        this.localCommentsTracker = param != null;

        this.localComments = param;

    }

    public boolean isUserDataSpecified() {
        return this.localUserDataTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUserData() {
        return this.localUserData;
    }

    /**
     * Auto generated setter method
     *
     * @param param UserData
     */
    public void setUserData(java.lang.String param) {
        this.localUserDataTracker = param != null;

        this.localUserData = param;

    }

    public boolean isAnchorXSpecified() {
        return this.localAnchorXTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getAnchorX() {
        return this.localAnchorX;
    }

    /**
     * Auto generated setter method
     *
     * @param param AnchorX
     */
    public void setAnchorX(int param) {

        // setting primitive attribute tracker to true
        this.localAnchorXTracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localAnchorX = param;

    }

    public boolean isAnchorYSpecified() {
        return this.localAnchorYTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return int
     */
    public int getAnchorY() {
        return this.localAnchorY;
    }

    /**
     * Auto generated setter method
     *
     * @param param AnchorY
     */
    public void setAnchorY(int param) {

        // setting primitive attribute tracker to true
        this.localAnchorYTracker =
                param != java.lang.Integer.MIN_VALUE;

        this.localAnchorY = param;

    }

    public boolean isUrlModifierSpecified() {
        return this.localUrlModifierTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUrlModifier() {
        return this.localUrlModifier;
    }

    /**
     * Auto generated setter method
     *
     * @param param UrlModifier
     */
    public void setUrlModifier(java.lang.String param) {
        this.localUrlModifierTracker = param != null;

        this.localUrlModifier = param;

    }

    public boolean isUrlPostApplyModifierSpecified() {
        return this.localUrlPostApplyModifierTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return java.lang.String
     */
    public java.lang.String getUrlPostApplyModifier() {
        return this.localUrlPostApplyModifier;
    }

    /**
     * Auto generated setter method
     *
     * @param param UrlPostApplyModifier
     */
    public void setUrlPostApplyModifier(java.lang.String param) {
        this.localUrlPostApplyModifierTracker = param != null;

        this.localUrlPostApplyModifier = param;

    }

    public boolean isZoomTargetsSpecified() {
        return this.localZoomTargetsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.ZoomTargetArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.ZoomTargetArray getZoomTargets() {
        return this.localZoomTargets;
    }

    /**
     * Auto generated setter method
     *
     * @param param ZoomTargets
     */
    public void setZoomTargets(com.scene7.www.ipsapi.xsd._2016_01_14_beta.ZoomTargetArray param) {
        this.localZoomTargetsTracker = param != null;

        this.localZoomTargets = param;

    }

    public boolean isMasksSpecified() {
        return this.localMasksTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.MaskArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.MaskArray getMasks() {
        return this.localMasks;
    }

    /**
     * Auto generated setter method
     *
     * @param param Masks
     */
    public void setMasks(com.scene7.www.ipsapi.xsd._2016_01_14_beta.MaskArray param) {
        this.localMasksTracker = param != null;

        this.localMasks = param;

    }

    public boolean isImageMapsSpecified() {
        return this.localImageMapsTracker;
    }

    /**
     * Auto generated getter method
     *
     * @return com.scene7.www.ipsapi.xsd._2016_01_14_beta.ImageMapArray
     */
    public com.scene7.www.ipsapi.xsd._2016_01_14_beta.ImageMapArray getImageMaps() {
        return this.localImageMaps;
    }

    /**
     * Auto generated setter method
     *
     * @param param ImageMaps
     */
    public void setImageMaps(com.scene7.www.ipsapi.xsd._2016_01_14_beta.ImageMapArray param) {
        this.localImageMapsTracker = param != null;

        this.localImageMaps = param;

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
                        namespacePrefix + ":ImageInfo",
                        xmlWriter);
            } else {
                writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance", "type",
                        "ImageInfo",
                        xmlWriter);
            }

        }
        if (this.localOriginalPathTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "originalPath", xmlWriter);

            if (this.localOriginalPath == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("originalPath cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localOriginalPath);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localOriginalFileTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "originalFile", xmlWriter);

            if (this.localOriginalFile == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("originalFile cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localOriginalFile);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localOptimizedPathTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "optimizedPath", xmlWriter);

            if (this.localOptimizedPath == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("optimizedPath cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localOptimizedPath);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localOptimizedFileTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "optimizedFile", xmlWriter);

            if (this.localOptimizedFile == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("optimizedFile cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localOptimizedFile);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localMaskPathTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "maskPath", xmlWriter);

            if (this.localMaskPath == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("maskPath cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localMaskPath);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localMaskFileTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "maskFile", xmlWriter);

            if (this.localMaskFile == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("maskFile cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localMaskFile);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localWidthTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "width", xmlWriter);

            if (this.localWidth == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("width cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localWidth));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localHeightTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "height", xmlWriter);

            if (this.localHeight == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("height cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localHeight));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localFileSizeTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "fileSize", xmlWriter);

            if (this.localFileSize == java.lang.Long.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("fileSize cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFileSize));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localResolutionTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "resolution", xmlWriter);

            if (java.lang.Double.isNaN(this.localResolution)) {

                throw new org.apache.axis2.databinding.ADBException("resolution cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localResolution));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localSkuTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "sku", xmlWriter);

            if (this.localSku == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("sku cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localSku);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localDescriptionTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "description", xmlWriter);

            if (this.localDescription == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("description cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localDescription);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localCommentsTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "comments", xmlWriter);

            if (this.localComments == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("comments cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localComments);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localUserDataTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "userData", xmlWriter);

            if (this.localUserData == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("userData cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localUserData);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localAnchorXTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "anchorX", xmlWriter);

            if (this.localAnchorX == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("anchorX cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localAnchorX));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localAnchorYTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "anchorY", xmlWriter);

            if (this.localAnchorY == java.lang.Integer.MIN_VALUE) {

                throw new org.apache.axis2.databinding.ADBException("anchorY cannot be null!!");

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localAnchorY));
            }

            xmlWriter.writeEndElement();
        }
        if (this.localUrlModifierTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "urlModifier", xmlWriter);

            if (this.localUrlModifier == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("urlModifier cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localUrlModifier);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localUrlPostApplyModifierTracker) {
            namespace = "http://www.scene7.com/IpsApi/xsd/2016-01-14-beta";
            writeStartElement(null, namespace, "urlPostApplyModifier", xmlWriter);

            if (this.localUrlPostApplyModifier == null) {
                // write the nil attribute

                throw new org.apache.axis2.databinding.ADBException("urlPostApplyModifier cannot be null!!");

            } else {

                xmlWriter.writeCharacters(this.localUrlPostApplyModifier);

            }

            xmlWriter.writeEndElement();
        }
        if (this.localZoomTargetsTracker) {
            if (this.localZoomTargets == null) {
                throw new org.apache.axis2.databinding.ADBException("zoomTargets cannot be null!!");
            }
            this.localZoomTargets
                    .serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "zoomTargets"),
                            xmlWriter);
        }
        if (this.localMasksTracker) {
            if (this.localMasks == null) {
                throw new org.apache.axis2.databinding.ADBException("masks cannot be null!!");
            }
            this.localMasks.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "masks"),
                    xmlWriter);
        }
        if (this.localImageMapsTracker) {
            if (this.localImageMaps == null) {
                throw new org.apache.axis2.databinding.ADBException("imageMaps cannot be null!!");
            }
            this.localImageMaps.serialize(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "imageMaps"),
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

        if (this.localOriginalPathTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "originalPath"));

            if (this.localOriginalPath != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localOriginalPath));
            } else {
                throw new org.apache.axis2.databinding.ADBException("originalPath cannot be null!!");
            }
        }
        if (this.localOriginalFileTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "originalFile"));

            if (this.localOriginalFile != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localOriginalFile));
            } else {
                throw new org.apache.axis2.databinding.ADBException("originalFile cannot be null!!");
            }
        }
        if (this.localOptimizedPathTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "optimizedPath"));

            if (this.localOptimizedPath != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localOptimizedPath));
            } else {
                throw new org.apache.axis2.databinding.ADBException("optimizedPath cannot be null!!");
            }
        }
        if (this.localOptimizedFileTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "optimizedFile"));

            if (this.localOptimizedFile != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localOptimizedFile));
            } else {
                throw new org.apache.axis2.databinding.ADBException("optimizedFile cannot be null!!");
            }
        }
        if (this.localMaskPathTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "maskPath"));

            if (this.localMaskPath != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localMaskPath));
            } else {
                throw new org.apache.axis2.databinding.ADBException("maskPath cannot be null!!");
            }
        }
        if (this.localMaskFileTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "maskFile"));

            if (this.localMaskFile != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localMaskFile));
            } else {
                throw new org.apache.axis2.databinding.ADBException("maskFile cannot be null!!");
            }
        }
        if (this.localWidthTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "width"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localWidth));
        }
        if (this.localHeightTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "height"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localHeight));
        }
        if (this.localFileSizeTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "fileSize"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localFileSize));
        }
        if (this.localResolutionTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "resolution"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localResolution));
        }
        if (this.localSkuTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "sku"));

            if (this.localSku != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localSku));
            } else {
                throw new org.apache.axis2.databinding.ADBException("sku cannot be null!!");
            }
        }
        if (this.localDescriptionTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "description"));

            if (this.localDescription != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localDescription));
            } else {
                throw new org.apache.axis2.databinding.ADBException("description cannot be null!!");
            }
        }
        if (this.localCommentsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "comments"));

            if (this.localComments != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localComments));
            } else {
                throw new org.apache.axis2.databinding.ADBException("comments cannot be null!!");
            }
        }
        if (this.localUserDataTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "userData"));

            if (this.localUserData != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localUserData));
            } else {
                throw new org.apache.axis2.databinding.ADBException("userData cannot be null!!");
            }
        }
        if (this.localAnchorXTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "anchorX"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localAnchorX));
        }
        if (this.localAnchorYTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "anchorY"));

            elementList.add(
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localAnchorY));
        }
        if (this.localUrlModifierTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "urlModifier"));

            if (this.localUrlModifier != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localUrlModifier));
            } else {
                throw new org.apache.axis2.databinding.ADBException("urlModifier cannot be null!!");
            }
        }
        if (this.localUrlPostApplyModifierTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "urlPostApplyModifier"));

            if (this.localUrlPostApplyModifier != null) {
                elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(this.localUrlPostApplyModifier));
            } else {
                throw new org.apache.axis2.databinding.ADBException("urlPostApplyModifier cannot be null!!");
            }
        }
        if (this.localZoomTargetsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "zoomTargets"));

            if (this.localZoomTargets == null) {
                throw new org.apache.axis2.databinding.ADBException("zoomTargets cannot be null!!");
            }
            elementList.add(this.localZoomTargets);
        }
        if (this.localMasksTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "masks"));

            if (this.localMasks == null) {
                throw new org.apache.axis2.databinding.ADBException("masks cannot be null!!");
            }
            elementList.add(this.localMasks);
        }
        if (this.localImageMapsTracker) {
            elementList.add(new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                    "imageMaps"));

            if (this.localImageMaps == null) {
                throw new org.apache.axis2.databinding.ADBException("imageMaps cannot be null!!");
            }
            elementList.add(this.localImageMaps);
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
        public static ImageInfo parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            ImageInfo object =
                    new ImageInfo();

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

                        if (!"ImageInfo".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                            return (ImageInfo) com.scene7.www.ipsapi.xsd._2016_01_14_beta.ExtensionMapper.getTypeObject(
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
                        "originalPath").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "originalPath" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setOriginalPath(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "originalFile").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "originalFile" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setOriginalFile(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "optimizedPath").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "optimizedPath" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setOptimizedPath(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "optimizedFile").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "optimizedFile" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setOptimizedFile(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "maskPath")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "maskPath" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMaskPath(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "maskFile")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "maskFile" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setMaskFile(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "fileSize")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "fileSize" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFileSize(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setFileSize(java.lang.Long.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "resolution").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "resolution" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setResolution(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setResolution(java.lang.Double.NaN);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "sku")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "sku" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSku(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "description").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "description" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDescription(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "comments")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "comments" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setComments(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

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

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "anchorX")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "anchorX" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAnchorX(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setAnchorX(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "anchorY")
                        .equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "anchorY" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setAnchorY(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                    object.setAnchorY(java.lang.Integer.MIN_VALUE);

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "urlModifier").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "urlModifier" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setUrlModifier(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "urlPostApplyModifier").equals(reader.getName())) {

                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance", "nil");
                    if ("true".equals(nillableValue) || "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException("The element: " + "urlPostApplyModifier" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setUrlPostApplyModifier(
                            org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "zoomTargets").equals(reader.getName())) {

                    object.setZoomTargets(com.scene7.www.ipsapi.xsd._2016_01_14_beta.ZoomTargetArray.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta", "masks")
                        .equals(reader.getName())) {

                    object.setMasks(com.scene7.www.ipsapi.xsd._2016_01_14_beta.MaskArray.Factory.parse(reader));

                    reader.next();

                }  // End of if for expected property start element

                else {

                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.scene7.com/IpsApi/xsd/2016-01-14-beta",
                        "imageMaps").equals(reader.getName())) {

                    object.setImageMaps(com.scene7.www.ipsapi.xsd._2016_01_14_beta.ImageMapArray.Factory.parse(reader));

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
           
    