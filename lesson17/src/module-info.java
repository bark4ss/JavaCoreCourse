module lesson17 {
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.annotation;
    opens jaxbmarshall.model to jakarta.xml.bind;
    exports jaxbmarshall.util;
    exports jsonmarshalling.model;
}
