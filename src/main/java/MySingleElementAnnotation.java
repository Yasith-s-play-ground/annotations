public @interface MySingleElementAnnotation {

    int value();// Attribute's name should be value, otherwise we can't tell
    //this is a single element annotation even though it has a single element
}
