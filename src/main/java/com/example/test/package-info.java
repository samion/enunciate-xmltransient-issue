@XmlSchema(namespace = "http://example.com/test",
           xmlns = { @XmlNs(prefix = "test", namespaceURI = "http://example.com/test") },
           elementFormDefault = XmlNsForm.QUALIFIED,
           attributeFormDefault = XmlNsForm.UNSET)
/**
 * Example
 */
package com.example.test;
import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;

